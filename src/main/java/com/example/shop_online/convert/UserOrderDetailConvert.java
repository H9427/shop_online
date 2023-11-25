package com.example.shop_online.convert;

import com.example.shop_online.entity.UserOrder;
import org.mapstruct.factory.Mappers;

/**
 * author：H
 * Date：2023/11/25 10:18
 */
@Mapper
public interface UserOrderDetailConvert {

    UserOrderDetailConvert INSTANCE = Mappers.getMapper(UserOrderDetailConvert.class);

    OrderDetailVO convertToOrderDetailVO(UserOrder userOrder);
}
