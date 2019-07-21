package controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import scp.ApiBean;

import java.text.ParseException;

@RestController
public class TestController {
    @GetMapping("/testGet")
    public ApiBean get() {
        ApiBean ab = new ApiBean();
        ab.setId(1);
        ab.setName("xxx9001");
        return ab;
    }

    @HystrixCommand(fallbackMethod = "xxx")
    @GetMapping("/testHystrix/{id}")
    public ApiBean getXxxById(@PathVariable("id") Integer id) { // throws ParseException {
        if (id == 1) {
            ApiBean ab = new ApiBean();
            ab.setId(1);
            ab.setName("xxx9001");
            return ab;
        } else {
            throw new RuntimeException("耶！掛了");
            // throw new ParseException("xxx", -1);
        }
    }

    private ApiBean xxx(@PathVariable("id") Integer id) {
        ApiBean ab = new ApiBean();
        ab.setId(-1);
        ab.setName("沒有" + id);
        return ab;
    }
}
