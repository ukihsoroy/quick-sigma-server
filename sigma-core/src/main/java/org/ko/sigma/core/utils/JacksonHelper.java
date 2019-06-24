package org.ko.sigma.core.utils;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public final class JacksonHelper {

    private static Logger log = LoggerFactory.getLogger(JacksonHelper.class);

    private static final ObjectMapper mapper = new ObjectMapper();

    static{
        //对象的所有字段全部列入
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);

        //取消默认转换timestamps形式
        mapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS,false);

        //忽略空Bean转json的错误
        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS,false);

        //所有的日期格式都统一为以下的样式，即yyyy-MM-dd HH:mm:ss
        mapper.setDateFormat(new SimpleDateFormat(DateTimeUtil.STANDARD_FORMAT));

        //忽略 在json字符串中存在，但是在java对象中不存在对应属性的情况。防止错误
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }


    public static <T> List<T> toList (String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, mapper.getTypeFactory().constructParametricType(List.class, clazz));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> toList (File file, Class<T> clazz) {
        try {
            return mapper.readValue(file, mapper.getTypeFactory().constructParametricType(List.class, clazz));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String parseJson (Object res) throws IOException {
        return mapper.writeValueAsString(res);
    }

    public static Map<String, String> toMap (String json)  {
        try {
            return mapper.readValue(json, new TypeReference<Map<String, String>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //对象转json字符串
    public static <T> String obj2String(T obj){
        if(obj == null){
            return null;
        }
        try {
            return obj instanceof String ? (String)obj :  mapper.writeValueAsString(obj);
        } catch (Exception e) {
            log.warn("Parse Object to String error",e);
            return null;
        }
    }

    //对象转json字符串 重载方法 格式化的json字符串 方便调试 实际开发取第一种方法
    public static <T> String obj2StringPretty(T obj){
        if(obj == null){
            return null;
        }
        try {
            return obj instanceof String ? (String)obj :  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Exception e) {
            log.warn("Parse Object to String error",e);
            return null;
        }
    }




    //json字符串转对象转
    public static <T> T string2Obj(String str, Class<T> clazz){
        if(StringUtils.isEmpty(str) || clazz == null){
            return null;
        }

        try {
            return clazz.equals(String.class)? (T)str : mapper.readValue(str,clazz);
        } catch (Exception e) {
            log.warn("Parse String to Object error",e);
            return null;
        }
    }


    //json字符串转list<T>对象  和下面的一样
    public static <T> T string2Obj(String str, TypeReference<T> typeReference){
        if(StringUtils.isEmpty(str) || typeReference == null){
            return null;
        }
        try {
            return (T)(typeReference.getType().equals(String.class)? str : mapper.readValue(str,typeReference));
        } catch (Exception e) {
            log.warn("Parse String to Object error",e);
            return null;
        }
    }

    //json字符串转list<T>对象   和上面的一样
    public static <T> T string2Obj(String str,Class<?> collectionClass,Class<?>... elementClasses){
        JavaType javaType = mapper.getTypeFactory().constructParametricType(collectionClass,elementClasses);
        try {
            return mapper.readValue(str,javaType);
        } catch (Exception e) {
            log.warn("Parse String to Object error",e);
            return null;
        }
    }


    private JacksonHelper () {}
}