package pe.castillo.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.castillo.order.model.ProductDTO;

@FeignClient(name = "product-service")
public interface IProductFeignClient {

    @GetMapping("/api/product/{product_id}")
    ProductDTO findProduct(@PathVariable int product_id);

}
