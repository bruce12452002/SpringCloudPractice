package controller;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomRibbonRule {
    @Bean
    public IRule myRibbonRule() {
        // return new RandomRule();
        return new CalcRibbonRule();
    }
}
