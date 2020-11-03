package com.pz.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_pz"
                , r -> r.path("/sports").uri("http://news.baidu.com/sports"))
                .build();

        return routes.build();
    }
}
