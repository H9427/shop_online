package com.example.shop_online.query;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * author：H
 * Date：2023/11/30 14:10
 */
@Data
public class OrderPreQuery {
    @Schema(description = "商品主键id")
    @NotNull(message = "主键不能为空")
    private Integer id;
    @Schema(description = "商品属性")
    private String attrsText;
    @Schema(description = "地址id")
    private Integer addressId;
    @Schema(description = "购买商品数量")
    @NotNull(message = "商品购买数量不能为空")
    private Integer count;
    @Schema(description = "用户id")
    private Integer userId;
}