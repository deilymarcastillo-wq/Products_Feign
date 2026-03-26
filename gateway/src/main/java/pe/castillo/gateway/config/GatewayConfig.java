package pe.castillo.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("order-service", r -> r.path("/api/order/**")
                        .uri("lb://ORDER-SERVICE"))
                .route("product-service", r -> r.path("/api/product/**")
                        .uri("lb://PRODUCT-SERVICE"))
                .route("user-service", r -> r.path("/api/user/**")
                        .uri("lb://USER-SERVICE"))
                .build();
    }

}
