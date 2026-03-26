package pe.castillo.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.castillo.order.model.UserDTO;

@FeignClient(name = "user-service")
public interface IUserFeignClient {
    @GetMapping("/api/user/{user_id}")
    UserDTO findUser(@PathVariable int user_id);
}
