package com.hx.mapper;

import com.hx.domain.Account;

/**
 * Created by huangch on 2019/7/23 19:55
 * description:
 *
 * @since JDK 1.6
 */
public interface AccountMapper {

    Account selectById(Long accountId);
}
