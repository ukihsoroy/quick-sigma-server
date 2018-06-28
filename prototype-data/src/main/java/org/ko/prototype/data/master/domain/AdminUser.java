package org.ko.prototype.data.master.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_admin_user")
public class AdminUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.username
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.password
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.role_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.mobile
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.email
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.full_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String fullName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.gender
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Short gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.birthday
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.avatar
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.last_login_time
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.last_login_ip
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String lastLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.delete_status
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Short deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.trace_code_i
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String traceCodeI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.trace_code_u
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String traceCodeU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.host_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.create_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.create_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.create_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.update_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.update_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin_user.update_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_admin_user
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.id
     *
     * @return the value of t_admin_user.id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.id
     *
     * @param id the value for t_admin_user.id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.username
     *
     * @return the value of t_admin_user.username
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.username
     *
     * @param username the value for t_admin_user.username
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.password
     *
     * @return the value of t_admin_user.password
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.password
     *
     * @param password the value for t_admin_user.password
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.role_id
     *
     * @return the value of t_admin_user.role_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.role_id
     *
     * @param roleId the value for t_admin_user.role_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.mobile
     *
     * @return the value of t_admin_user.mobile
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.mobile
     *
     * @param mobile the value for t_admin_user.mobile
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.email
     *
     * @return the value of t_admin_user.email
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.email
     *
     * @param email the value for t_admin_user.email
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.full_name
     *
     * @return the value of t_admin_user.full_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.full_name
     *
     * @param fullName the value for t_admin_user.full_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.gender
     *
     * @return the value of t_admin_user.gender
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Short getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.gender
     *
     * @param gender the value for t_admin_user.gender
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setGender(Short gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.birthday
     *
     * @return the value of t_admin_user.birthday
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.birthday
     *
     * @param birthday the value for t_admin_user.birthday
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.avatar
     *
     * @return the value of t_admin_user.avatar
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.avatar
     *
     * @param avatar the value for t_admin_user.avatar
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.last_login_time
     *
     * @return the value of t_admin_user.last_login_time
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.last_login_time
     *
     * @param lastLoginTime the value for t_admin_user.last_login_time
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.last_login_ip
     *
     * @return the value of t_admin_user.last_login_ip
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.last_login_ip
     *
     * @param lastLoginIp the value for t_admin_user.last_login_ip
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.delete_status
     *
     * @return the value of t_admin_user.delete_status
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Short getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.delete_status
     *
     * @param deleteStatus the value for t_admin_user.delete_status
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.trace_code_i
     *
     * @return the value of t_admin_user.trace_code_i
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getTraceCodeI() {
        return traceCodeI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.trace_code_i
     *
     * @param traceCodeI the value for t_admin_user.trace_code_i
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setTraceCodeI(String traceCodeI) {
        this.traceCodeI = traceCodeI == null ? null : traceCodeI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.trace_code_u
     *
     * @return the value of t_admin_user.trace_code_u
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getTraceCodeU() {
        return traceCodeU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.trace_code_u
     *
     * @param traceCodeU the value for t_admin_user.trace_code_u
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setTraceCodeU(String traceCodeU) {
        this.traceCodeU = traceCodeU == null ? null : traceCodeU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.host_name
     *
     * @return the value of t_admin_user.host_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.host_name
     *
     * @param hostName the value for t_admin_user.host_name
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.create_user_id
     *
     * @return the value of t_admin_user.create_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.create_user_id
     *
     * @param createUserId the value for t_admin_user.create_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.create_by
     *
     * @return the value of t_admin_user.create_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.create_by
     *
     * @param createBy the value for t_admin_user.create_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.create_date
     *
     * @return the value of t_admin_user.create_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.create_date
     *
     * @param createDate the value for t_admin_user.create_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.update_user_id
     *
     * @return the value of t_admin_user.update_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.update_user_id
     *
     * @param updateUserId the value for t_admin_user.update_user_id
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.update_by
     *
     * @return the value of t_admin_user.update_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.update_by
     *
     * @param updateBy the value for t_admin_user.update_by
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin_user.update_date
     *
     * @return the value of t_admin_user.update_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin_user.update_date
     *
     * @param updateDate the value for t_admin_user.update_date
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin_user
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", roleId=").append(roleId);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", fullName=").append(fullName);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", avatar=").append(avatar);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", traceCodeI=").append(traceCodeI);
        sb.append(", traceCodeU=").append(traceCodeU);
        sb.append(", hostName=").append(hostName);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin_user
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdminUser other = (AdminUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
            && (this.getTraceCodeI() == null ? other.getTraceCodeI() == null : this.getTraceCodeI().equals(other.getTraceCodeI()))
            && (this.getTraceCodeU() == null ? other.getTraceCodeU() == null : this.getTraceCodeU().equals(other.getTraceCodeU()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_admin_user
     *
     * @mbg.generated Thu Jun 28 21:43:01 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
        result = prime * result + ((getTraceCodeI() == null) ? 0 : getTraceCodeI().hashCode());
        result = prime * result + ((getTraceCodeU() == null) ? 0 : getTraceCodeU().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}