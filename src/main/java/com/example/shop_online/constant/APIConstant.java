package com.example.shop_online.constant;

/**
 * author：H
 * Date：2023/11/11 8:14
 */
public class APIConstant {
    /**
     * 请求头 认证名称
     */
    public final static String AUTHORIZATION = "Authorization";

    /**
     * token 加密密钥
     */
    public static String JWT_SECRET = "shopApi";

    /**
     * redis 存 token 键名
     */
    public static String APP_NAME = "shopApi";

    /**
     * 默认头像
     */
    public static String DEFAULT_AVATAR = "默认头像链接";
    /**
     * APP_ID
     */
    public static String APP_ID = "wx37a3e3ca5ea2c2bb";
    /**
     * APP_SECRET
     * 密钥：f06b3c7e4c95f5d3e6798c3cd83d0937
     */
    public static String APP_SECRET = "f06b3c7e4c95f5d3e6798c3cd83d0937";
    /**
     * 微信调用api接口返回错误code
     */
    public static String WX_ERR_CODE = "errcode";
    /**
     * 微信调用api接口获取openid
     */
    public static String WX_OPENID = "openid";

    /**
     * token 过期时间 15天
     */
    public static long APP_TOKEN_EXPIRE_TIME = 15 * 24 * 3600L;

}