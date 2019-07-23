package com.hx.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by huangch on 2019/7/23 18:05
 * description:
 *
 * @since JDK 1.6
 */
@ApiModel(value = "账号信息")
public class Account {

    @ApiModelProperty(value = "账号名称")
    private String accountName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
