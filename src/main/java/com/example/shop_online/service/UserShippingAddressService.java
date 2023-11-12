package com.example.shop_online.service;

import com.example.shop_online.entity.UserShippingAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shop_online.vo.AddressVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whb
 * @since 2023-11-09
 */
public interface UserShippingAddressService extends IService<UserShippingAddress> {
    /**
     * 添加收货地址
     *
     * @param addressVO
     * @return Integer
     */
    Integer saveShippingAddress(AddressVO addressVO);

    /**
     * 修改收货地址
     *
     * @param addressVO
     * @return Integer
     */
    Integer editShippingAddress(AddressVO addressVO);

    /**
     * 获取收货地址
     *
     * @param userId
     * @return List
     */
    List<AddressVO> getList(Integer userId);

    /**
     * 收货地址详情
     *
     * @param id
     * @return AddressVO
     */
    AddressVO getShippingAddress(Integer id);

    /**
     * 删除收货地址
     *
     * @param id
     * @return Integer
     */
    Integer deleteShippingAddress(Integer id);
}
