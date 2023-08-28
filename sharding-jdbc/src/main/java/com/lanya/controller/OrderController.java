package com.lanya.controller;

import java.util.Date;

import com.alibaba.fastjson.JSON;

import com.lanya.dao.vo.OrderDTO;
import com.lanya.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多数据源测试
 *
 * @author 兰崖 shenkaixing.skx
 * @date 2023/8/7 11:18 下午
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/sharding/saveOrder")
    public String saveOrder(@RequestBody OrderDTO orderDTO) {
        orderDTO.setCreateTime(new Date());
        log.info("OrderController.saveOrder:{}", JSON.toJSONString(orderDTO));
        orderService.saveOrder(orderDTO);
        return "ok";
    }

}
