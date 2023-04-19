package com.piotrFigura.orderservice.service;

import com.piotrFigura.orderservice.dto.OrderLineItemsDto;
import com.piotrFigura.orderservice.dto.OrderRequest;
import com.piotrFigura.orderservice.model.Order;
import com.piotrFigura.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(orderLineItemsDto -> mapToDto(orderLineItemsDto))
    }

    private OrderLineItems mapToDto(final OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());

    }
}
