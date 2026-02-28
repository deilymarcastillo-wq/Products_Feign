package pe.castillo.product.service;

import pe.castillo.product.model.Product;

import java.util.List;

public interface IProductService {

    Product createProduct(Product product);
    List<Product> findAll();
    Product findById(int product_id);

}
