package com.spectrobyte.spring_cloud_skeleton.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
  @Bean
  public RouteLocator routes(RouteLocatorBuilder builder)
  {
    return builder.routes()
        .route("zoo", p -> p.path("/api/v1/zoo/**")
            .uri("lb://zoo"))
        .build();
  }
}
