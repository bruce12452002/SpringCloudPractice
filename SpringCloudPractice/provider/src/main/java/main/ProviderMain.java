package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class ProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain.class, args);
    }
}
