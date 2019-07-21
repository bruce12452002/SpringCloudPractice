package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableCircuitBreaker
public class ProviderHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixMain.class, args);
    }
}
