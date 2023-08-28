package com.lanya.service;

import com.lanya.dao.entity.OrderDO;
import com.lanya.dao.mapper.OrderMapper;
import com.lanya.dao.vo.OrderDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 兰崖 shenkaixing.skx
 * @date 2023/8/28 5:56 下午
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void saveOrder(OrderDTO orderDTO){
        OrderDO orderDO = new OrderDO();
        BeanUtils.copyProperties(orderDTO,orderDO);
        orderMapper.insert(orderDO);
    }
}
