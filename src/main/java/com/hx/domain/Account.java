package com.hx.domain;

import java.io.Serializable;

/**
 * @author
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 1563948503656L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 密码
     * isNullAble:0
     */
    private String password;

    /**
     * 用户名
     * isNullAble:1
     */
    private String accountName;

    /**
     * 手机号
     * isNullAble:0
     */
    private Integer mobilePhone;

    /**
     * 邮箱账号
     * isNullAble:1,defaultVal:
     */
    private String email;

    /**
     * 联系人姓名
     * isNullAble:1,defaultVal:
     */
    private String linkName;

    /**
     * 证件号
     * isNullAble:1,defaultVal:
     */
    private String idNum;

    /**
     * QQ
     * isNullAble:1,defaultVal:
     */
    private String linkQq;

    /**
     * 账号状态，1-有效、0-无效
     * isNullAble:1,defaultVal:1
     */
    private Integer accountStatus;

    /**
     * 角色类型(1-超级管理员、2-普通账号)
     * isNullAble:1,defaultVal:1
     */
    private Integer roleType;

    /**
     * 账号所属的系统，1-管理端、2-官网web
     * isNullAble:1,defaultVal:1
     */
    private Integer belongSystem;

    /**
     * 创建时间
     * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
     */
    private String gmtCreate;

    /**
     * 修改时间
     * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
     */
    private String gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getLinkQq() {
        return linkQq;
    }

    public void setLinkQq(String linkQq) {
        this.linkQq = linkQq;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public Integer getBelongSystem() {
        return belongSystem;
    }

    public void setBelongSystem(Integer belongSystem) {
        this.belongSystem = belongSystem;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }
}
