package com.spectrobyte.spring_cloud_skeleton.zoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class App
{
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args)
  {
    logger.info("Running application.");
    SpringApplication.run(App.class, args);
  }
}
