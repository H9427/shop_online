package com.example.shop_online.convert;

import com.example.shop_online.entity.UserOrder;
import com.example.shop_online.vo.OrderDetailVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * author：H
 * Date：2023/11/25 10:18
 */
@Mapper
public interface UserOrderDetailConvert {

    UserOrderDetailConvert INSTANCE = Mappers.getMapper(UserOrderDetailConvert.class);

    OrderDetailVO convertToDetailVO(UserOrder userOrder);
}
