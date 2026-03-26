package pe.castillo.product.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.castillo.product.model.Product;
import pe.castillo.product.service.IProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping
    public List<Product> listOfProducts(){
        return service.findAll();
    }

    @GetMapping("/{product_id}")
    public Product findProduct(@PathVariable int product_id){
        return service.findById(product_id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product p){
        return service.createProduct(p);
    }

}
