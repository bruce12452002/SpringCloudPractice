package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain extends WebSecurityConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.csrf().disable(); // 不處理 CSRF 攻擊
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
