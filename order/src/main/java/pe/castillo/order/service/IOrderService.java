package pe.castillo.order.service;

import pe.castillo.order.model.Order;

import java.util.List;

public interface IOrderService {

    Order createOrder (Order order);

    List<Order> findAll();

    Order findById(int order_id);



}
