package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
@EnableEurekaClient
@EnableFeignClients("service")
public class ConsumerFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain.class, args);
    }
}
