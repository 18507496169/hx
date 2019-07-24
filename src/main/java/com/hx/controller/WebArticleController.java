package com.hx.controller;

import com.google.common.collect.Lists;
import com.hx.domain.MenuPage;
import com.hx.domain.WebArticle;
import com.hx.mapper.MenuPageMapper;
import com.hx.mapper.WebArticleMapper;
import com.hx.util.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by huangch on 2019/7/23 09:58
 * description:
 *
 * @since JDK 1.6
 */
@Api(tags = {"文章管理"})
@RestController
@RequestMapping("webArticle")
public class WebArticleController {

    @Autowired
    private WebArticleMapper webArticleMapper;

    @ApiOperation(value = "添加文章", httpMethod = "POST", notes = "添加单页", response = Boolean.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Boolean create(@ModelAttribute WebArticle webArticle) {
        return true;
    }

    @ApiOperation(value = "修改文章", httpMethod = "POST", notes = "修改文章", response = Boolean.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public Boolean update(@ModelAttribute WebArticle webArticle) {
        return true;
    }

    @ApiOperation(value = "删除文章(可批量)", httpMethod = "POST", notes = "删除文章", response = Boolean.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ids", required = true, value = "文章ID列表(字符串数组)", dataType = "array", paramType = "query")})
    public Boolean delete(@ModelAttribute @RequestParam List<Long> ids) {
        return true;
    }

    @ApiOperation(value = "文章列表查询(可查询所有)", httpMethod = "GET", notes = "单页列表查询", response = WebArticle.class)
    @RequestMapping(value = "pageQuery", method = RequestMethod.GET)
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "currentPage", required = true, value = "当前页(默认1)", dataType = "integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", required = true, value = "每页大小(默认20，若想查询所有则该字段传入-1)", dataType = "integer", paramType = "query")})
    public PageResult<WebArticle> pageQuery(@ModelAttribute @RequestParam Integer currentPage, @ModelAttribute @RequestParam Integer pageSize) {
        //todo
        return new PageResult(0, Lists.newArrayList(new WebArticle()), 20);
    }

    @ApiOperation(value = "查询文章详情", httpMethod = "GET", notes = "查询文章详情", response = WebArticle.class)
    @RequestMapping(value = "queryById", method = RequestMethod.GET)
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "id", required = true, value = "文章ID", dataType = "long", paramType = "query")})
    public WebArticle queryById(@ModelAttribute @RequestParam Long id) {
        //todo
        return new WebArticle();
    }
}