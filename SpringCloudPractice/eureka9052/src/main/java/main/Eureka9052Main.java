package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka9052Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka9052Main.class, args);
    }
}
