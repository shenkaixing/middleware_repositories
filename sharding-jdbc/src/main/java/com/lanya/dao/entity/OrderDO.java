package com.lanya.dao.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author EalenXie create on 2020/11/24 14:45
 */
@Data
@TableName("t_order")
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 订单ID
     */
    @TableField(value="order_id")
    private Long orderId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


}
