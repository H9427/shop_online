package com.example.shop_online.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * author：H
 * Date：2023/11/12 11:53
 */
@Getter
@AllArgsConstructor
public enum DeleteFlagEnum {
    OPEN_DELETE_FLAG(1, "错误标识开启"),
    CLOSE_DELETE_FLAG(0, "错误标识不开启");
    private final Integer value;
    private final String name;
}
