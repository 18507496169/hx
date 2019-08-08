package com.hx.controller;

import com.hx.domain.PageVisitRecord;
import com.hx.domain.PageVisitStatistics;
import com.hx.mapper.PageVisitRecordMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangch on 2019/7/23 09:58
 * description:
 *
 * @since JDK 1.6
 */
@Api(tags = {"统计管理"})
@RestController
@RequestMapping("statistics")
public class StatisticsController {

    @Autowired
    private PageVisitRecordMapper pageVisitRecordMapper;

    @ApiOperation(value = "网站访问量统计查询", httpMethod = "GET", notes = "网站访问量统计查询", response = PageVisitStatistics.class)
    @RequestMapping(value = "pageVisit", method = RequestMethod.GET)
    public List<PageVisitStatistics> pageVisit(HttpServletRequest request) {
        //todo
        return new ArrayList<>();
    }

    @ApiOperation(value = "新增网站访问PV", httpMethod = "POST", notes = "新增网站访问PV", response = Boolean.class)
    @RequestMapping(value = "addPv", method = RequestMethod.POST)
    public Boolean addPv(@ModelAttribute PageVisitRecord pageVisitRecord, HttpServletRequest request) {
        //todo userAgent、IP生成
        return pageVisitRecordMapper.insertHxPageVisitRecord(pageVisitRecord) > 0;
    }

}
