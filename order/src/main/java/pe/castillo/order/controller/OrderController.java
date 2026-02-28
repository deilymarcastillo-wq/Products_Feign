package pe.castillo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.castillo.order.feign.IProductFeignClient;
import pe.castillo.order.feign.IUserFeignClient;
import pe.castillo.order.model.*;
import pe.castillo.order.service.IOrderService;

import java.util.List;
//server.port=8082
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IUserFeignClient userFeign;

    @Autowired
    private IProductFeignClient productFeign;

    @GetMapping
    public List<Order> listOfOrders(){
        return orderService.findAll();
    }

    @GetMapping("/{order_id}")
    public Order findOrder(@PathVariable int order_id){
        return orderService.findById(order_id);
    }

    @GetMapping("/full/{order_id}")
    public OrderResponseDTO findOrderwithUser(@PathVariable int order_id){

        Order order = orderService.findById(order_id);
        UserDTO usr = userFeign.findUser(order.getUser_id());

        ProductDTO product = productFeign.findProduct(order.getProduct_id());

        //OrderUserDTO res = new OrderUserDTO(ordr.getOrder_id(),ordr.getDescription(),ordr.getCreateDate(),usr);
        return new OrderResponseDTO(order.getOrder_id(),product,usr);
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }


}
