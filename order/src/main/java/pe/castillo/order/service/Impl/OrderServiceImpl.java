package pe.castillo.order.service.Impl;

import org.springframework.stereotype.Service;
import pe.castillo.order.model.Order;
import pe.castillo.order.service.IOrderService;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    private List<Order> orders;

    public OrderServiceImpl(){

        orders = new ArrayList<>();
        Order order1 = new Order(1,1,1,"Compritas1", LocalDate.now());
        Order order2 = new Order(2,1,2,"Compritas2", LocalDate.now());

        this.orders.addAll(Arrays.asList(order1,order2));
    }

    @Override
    public Order createOrder(Order order) {
        this.orders.add(order);
        return order;
    }

    @Override
    public List<Order> findAll() {
        return this.orders;
    }

    @Override
    public Order findById(int order_id) {
        for(Order ordr : this.orders){
            if(ordr.getOrder_id() == order_id){
                return ordr;
            }
        }
        return null;
    }
}
