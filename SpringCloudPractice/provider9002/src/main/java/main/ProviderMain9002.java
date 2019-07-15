package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain9002.class, args);
    }
}
