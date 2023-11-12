package com.example.shop_online.convert;

import com.example.shop_online.entity.UserShippingAddress;
import com.example.shop_online.vo.AddressVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * author：H
 * Date：2023/11/11 18:31
 */
@Mapper
public interface AddressConvert {
    AddressConvert INSTANCE = Mappers.getMapper(AddressConvert.class);

    UserShippingAddress convert(AddressVO addressVO);

    List<AddressVO> convertToAddressVOList(List<UserShippingAddress> addressList);

    AddressVO convertToAddressVO(UserShippingAddress userShippingAddress);

}
