package com.hx.controller;

import com.hx.domain.Account;
import com.hx.mapper.AccountMapper;
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
@Api(tags = {"用户管理"})
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @ApiOperation(value = "新增用户", httpMethod = "POST", notes = "新增用户", response = Boolean.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Boolean create(@ModelAttribute Account account) {
        return true;
    }

    @ApiOperation(value = "根据单个用户ID查询用户", httpMethod = "GET", notes = "查询用户", response = Boolean.class)
    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public Account selectById(Long accountId) {
//        return accountMapper.selectById(accountId);
        return null;
    }
}
