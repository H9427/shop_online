package com.example.shop_online.service;

import com.example.shop_online.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shop_online.vo.OrderDetailVO;
import com.example.shop_online.vo.SubmitOrderVO;
import com.example.shop_online.vo.UserOrderVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whb
 * @since 2023-11-09
 */
public interface UserOrderService extends IService<UserOrder> {
    /**
     * 新增订单
     *
     * @param orderVO
     * @return Integer
     */
    Integer addGoodsOrder(UserOrderVO orderVO);

    /**
     * 获取订单详情
     *
     * @param id
     * @return OrderDetailVO
     */
    OrderDetailVO getOrderDetail(Integer id);

    /**
     * 填写订单-获取预付订单
     *
     * @param userId
     * @return SubmitOrderVO
     */
    SubmitOrderVO getPreOrderDetail(Integer userId);
}
