package com.hx.domain;

import java.io.Serializable;

/**
 * @author
 */
public class SeoConfig implements Serializable {

    private static final long serialVersionUID = 1563948524472L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * SEO标题
     * isNullAble:0
     */
    private String seoTitle;

    /**
     * SEO关键字，多个用逗号分隔
     * isNullAble:0
     */
    private String seoKeyWord;

    /**
     * SEO描述
     * isNullAble:1,defaultVal:
     */
    private String seoDesc;

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

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoKeyWord() {
        return seoKeyWord;
    }

    public void setSeoKeyWord(String seoKeyWord) {
        this.seoKeyWord = seoKeyWord;
    }

    public String getSeoDesc() {
        return seoDesc;
    }

    public void setSeoDesc(String seoDesc) {
        this.seoDesc = seoDesc;
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
