package com.example.shop_online.common.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.example.shop_online.common.constant.Constant;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * author：H
 * Date：2023/11/8 11:02
 */
@Component
public class FieldMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
//        创建时间
        strictInsertFill(metaObject, Constant.CREATE_TIME, LocalDateTime.class, LocalDateTime.now());
//        更新时间
        strictInsertFill(metaObject, Constant.UPDATE_TIME, LocalDateTime.class, LocalDateTime.now());
//        逻辑删除
        strictInsertFill(metaObject, Constant.DELETE_FLAG, Integer.class, 0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        更新时间
        strictUpdateFill(metaObject, Constant.UPDATE_TIME, LocalDateTime.class, LocalDateTime.now());

    }
}