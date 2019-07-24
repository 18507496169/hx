package com.hx.controller;

import com.hx.domain.SeoConfig;
import com.hx.domain.WebsiteConfig;
import com.hx.mapper.SeoConfigMapper;
import com.hx.mapper.WebsiteConfigMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangch on 2019/7/23 09:58
 * description:
 *
 * @since JDK 1.6
 */
@Api(tags = {"系统设置"})
@RestController
@RequestMapping("system")
public class SystemConfigController {

    @Autowired
    private SeoConfigMapper seoConfigMapper;

    @Autowired
    private WebsiteConfigMapper websiteConfigMapper;

    @ApiOperation(value = "站点配置", httpMethod = "POST", notes = "站点配置", response = Boolean.class)
    @RequestMapping(value = "webSiteConfig", method = RequestMethod.POST)
    public Boolean webSiteConfig(@ModelAttribute WebsiteConfig websiteConfig) {
        return true;
    }

    @ApiOperation(value = "站点查询", httpMethod = "GET", notes = "站点查询", response = WebsiteConfig.class)
    @RequestMapping(value = "queryWebSite", method = RequestMethod.GET)
    public WebsiteConfig queryWebSite() {
        return new WebsiteConfig();
    }

    @ApiOperation(value = "SEO配置", httpMethod = "POST", notes = "SEO配置", response = Boolean.class)
    @RequestMapping(value = "seoConfig", method = RequestMethod.POST)
    public Boolean seoConfig(@ModelAttribute SeoConfig seoConfig) {
        return true;
    }

    @ApiOperation(value = "SEO查询", httpMethod = "GET", notes = "SEO查询", response = SeoConfig.class)
    @RequestMapping(value = "querySeo", method = RequestMethod.GET)
    public SeoConfig querySeo() {
        return new SeoConfig();
    }
}
