package com.hx.domain;

import java.io.Serializable;

/**
 * @author
 */
public class WebArticle implements Serializable {

    private static final long serialVersionUID = 1563948528794L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 文章分类栏目ID
     * isNullAble:0
     */
    private Long kindId;

    /**
     * 文章标题
     * isNullAble:0
     */
    private String articleTitle;

    /**
     * 文章关键词，多个用逗号分隔
     * isNullAble:1,defaultVal:
     */
    private String articleKeyWord;

    /**
     * 文章描述
     * isNullAble:1,defaultVal:
     */
    private String articleDesc;

    /**
     * 文章图片URL，多个用逗号分隔
     * isNullAble:1,defaultVal:
     */
    private String articleImg;

    /**
     * 文章内容
     * isNullAble:1
     */
    private String articleContent;

    /**
     * 文章标签
     * isNullAble:1,defaultVal:
     */
    private String articleTag;

    /**
     * 文章来源
     * isNullAble:1,defaultVal:
     */
    private String articleSource;

    /**
     * 文章作者
     * isNullAble:1,defaultVal:
     */
    private String articleAuthor;

    /**
     * 文章排序
     * isNullAble:1,defaultVal:0
     */
    private Integer articleSort;

    /**
     * 展示状态,1-展示、0-不展示
     * isNullAble:1,defaultVal:1
     */
    private Integer displayStatus;

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

    public Long getKindId() {
        return kindId;
    }

    public void setKindId(Long kindId) {
        this.kindId = kindId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleKeyWord() {
        return articleKeyWord;
    }

    public void setArticleKeyWord(String articleKeyWord) {
        this.articleKeyWord = articleKeyWord;
    }

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    public String getArticleSource() {
        return articleSource;
    }

    public void setArticleSource(String articleSource) {
        this.articleSource = articleSource;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getArticleSort() {
        return articleSort;
    }

    public void setArticleSort(Integer articleSort) {
        this.articleSort = articleSort;
    }

    public Integer getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(Integer displayStatus) {
        this.displayStatus = displayStatus;
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
