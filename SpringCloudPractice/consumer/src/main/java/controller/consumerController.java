package controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import scp.ApiBean;

import javax.annotation.Resource;

@RestController
@Import(RestTemplate.class)
public class consumerController {
    @Resource
    private RestTemplate restTemplate;

    //private RestTemplateBuilder rtb;

    @GetMapping("/xxx")
    public ApiBean get() {
        return restTemplate.getForObject("http://localhost:9001" + "/testGet", ApiBean.class);
    }
}
