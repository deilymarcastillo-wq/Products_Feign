package pe.castillo.product.service.impl;

import org.springframework.stereotype.Service;
import pe.castillo.product.model.Product;
import pe.castillo.product.service.IProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private List<Product> products;

    public ProductServiceImpl(){

        this.products = new ArrayList<>();
        Product product1 = new Product(1,"Chocolate","Golosina",10.0);
        Product product2 = new Product(2,"Panqueque","Golosina",10.0);
        Product product3 = new Product(3,"Chizito","Golosina",10.0);
        Product product4 = new Product(4,"Gaseosa","Bebida",10.0);
        Product product5 = new Product(5,"Arroz","Abarrote",10.0);

        this.products.addAll(Arrays.asList(product1, product2, product3, product4, product5));
    }

    @Override
    public Product createProduct(Product product) {
        this.products.add(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return this.products;
    }

    @Override
    public Product findById(int product_id) {

        for(Product pro : this.products){
            if(pro.getProduct_id() == product_id){
                return pro;
            }
        }
        return null;
    }
}
