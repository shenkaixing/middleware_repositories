package com.lanya.dao.vo;

import java.util.Date;

import lombok.Data;

/**
 * @author EalenXie create on 2020/11/24 14:45
 * OrderDTO
 */
@Data
public class OrderDTO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 创建时间
     */
    private Date createTime;

}
