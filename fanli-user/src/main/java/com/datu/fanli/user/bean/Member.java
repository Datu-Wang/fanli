package com.datu.fanli.user.bean;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.member_level_id
     *
     * @mbg.generated
     */
    private Long memberLevelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.birthday
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.personalized_signature
     *
     * @mbg.generated
     */
    private String personalizedSignature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.source_type
     *
     * @mbg.generated
     */
    private Integer sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.integration
     *
     * @mbg.generated
     */
    private Integer integration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.growth
     *
     * @mbg.generated
     */
    private Integer growth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.luckey_count
     *
     * @mbg.generated
     */
    private Integer luckeyCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member.history_integration
     *
     * @mbg.generated
     */
    private Integer historyIntegration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    public Member(Long id, Long memberLevelId, String username, String password, String nickname, String phone, Integer status, Date createTime, String icon, Integer gender, Date birthday, String city, String job, String personalizedSignature, Integer sourceType, Integer integration, Integer growth, Integer luckeyCount, Integer historyIntegration) {
        this.id = id;
        this.memberLevelId = memberLevelId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.status = status;
        this.createTime = createTime;
        this.icon = icon;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.job = job;
        this.personalizedSignature = personalizedSignature;
        this.sourceType = sourceType;
        this.integration = integration;
        this.growth = growth;
        this.luckeyCount = luckeyCount;
        this.historyIntegration = historyIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    public Member() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.id
     *
     * @return the value of ums_member.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.id
     *
     * @param id the value for ums_member.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.member_level_id
     *
     * @return the value of ums_member.member_level_id
     *
     * @mbg.generated
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.member_level_id
     *
     * @param memberLevelId the value for ums_member.member_level_id
     *
     * @mbg.generated
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.username
     *
     * @return the value of ums_member.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.username
     *
     * @param username the value for ums_member.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.password
     *
     * @return the value of ums_member.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.password
     *
     * @param password the value for ums_member.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.nickname
     *
     * @return the value of ums_member.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.nickname
     *
     * @param nickname the value for ums_member.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.phone
     *
     * @return the value of ums_member.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.phone
     *
     * @param phone the value for ums_member.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.status
     *
     * @return the value of ums_member.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.status
     *
     * @param status the value for ums_member.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.create_time
     *
     * @return the value of ums_member.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.create_time
     *
     * @param createTime the value for ums_member.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.icon
     *
     * @return the value of ums_member.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.icon
     *
     * @param icon the value for ums_member.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.gender
     *
     * @return the value of ums_member.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.gender
     *
     * @param gender the value for ums_member.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.birthday
     *
     * @return the value of ums_member.birthday
     *
     * @mbg.generated
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.birthday
     *
     * @param birthday the value for ums_member.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.city
     *
     * @return the value of ums_member.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.city
     *
     * @param city the value for ums_member.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.job
     *
     * @return the value of ums_member.job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.job
     *
     * @param job the value for ums_member.job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.personalized_signature
     *
     * @return the value of ums_member.personalized_signature
     *
     * @mbg.generated
     */
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.personalized_signature
     *
     * @param personalizedSignature the value for ums_member.personalized_signature
     *
     * @mbg.generated
     */
    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.source_type
     *
     * @return the value of ums_member.source_type
     *
     * @mbg.generated
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.source_type
     *
     * @param sourceType the value for ums_member.source_type
     *
     * @mbg.generated
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.integration
     *
     * @return the value of ums_member.integration
     *
     * @mbg.generated
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.integration
     *
     * @param integration the value for ums_member.integration
     *
     * @mbg.generated
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.growth
     *
     * @return the value of ums_member.growth
     *
     * @mbg.generated
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.growth
     *
     * @param growth the value for ums_member.growth
     *
     * @mbg.generated
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.luckey_count
     *
     * @return the value of ums_member.luckey_count
     *
     * @mbg.generated
     */
    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.luckey_count
     *
     * @param luckeyCount the value for ums_member.luckey_count
     *
     * @mbg.generated
     */
    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member.history_integration
     *
     * @return the value of ums_member.history_integration
     *
     * @mbg.generated
     */
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member.history_integration
     *
     * @param historyIntegration the value for ums_member.history_integration
     *
     * @mbg.generated
     */
    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append("]");
        return sb.toString();
    }
}