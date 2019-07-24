package com.hx.domain;

import java.io.Serializable;

/**
 * @author
 */
public class WebsiteConfig implements Serializable {

    private static final long serialVersionUID = 1563948532672L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 站点名称
     * isNullAble:0
     */
    private String siteName;

    /**
     * 站点域名
     * isNullAble:0
     */
    private String siteDomain;

    /**
     * 邮箱
     * isNullAble:1,defaultVal:
     */
    private String email;

    /**
     * 缓存状态，1-缓存、0-不缓存
     * isNullAble:1,defaultVal:1
     */
    private Integer cookieStatus;

    /**
     * 静态首页，1-生成、0-不生成
     * isNullAble:1,defaultVal:1
     */
    private Integer staticIndexStatus;

    /**
     * 备案信息
     * isNullAble:1,defaultVal:
     */
    private String beianInfo;

    /**
     * 版本信息
     * isNullAble:1,defaultVal:
     */
    private String versionInfo;

    /**
     * 统计代码
     * isNullAble:1
     */
    private String staticCode;

    /**
     * 是否删除，1-是、0-否
     * isNullAble:1,defaultVal:0
     */
    private Integer isDeleted;

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

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCookieStatus() {
        return cookieStatus;
    }

    public void setCookieStatus(Integer cookieStatus) {
        this.cookieStatus = cookieStatus;
    }

    public Integer getStaticIndexStatus() {
        return staticIndexStatus;
    }

    public void setStaticIndexStatus(Integer staticIndexStatus) {
        this.staticIndexStatus = staticIndexStatus;
    }

    public String getBeianInfo() {
        return beianInfo;
    }

    public void setBeianInfo(String beianInfo) {
        this.beianInfo = beianInfo;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String getStaticCode() {
        return staticCode;
    }

    public void setStaticCode(String staticCode) {
        this.staticCode = staticCode;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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
