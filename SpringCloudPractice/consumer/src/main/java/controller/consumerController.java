package controller;

import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import scp.ApiBean;

import javax.annotation.Resource;

@RestController
@Import(RestTemplate.class)
public class consumerController {
    private static final String PROVIDER_URI = "http://localhost:9001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/xxx")
    public ApiBean get() {
        return restTemplate.getForObject(PROVIDER_URI + "/testGet", ApiBean.class);
    }

    @GetMapping("/consumer/discovery")
    public Object discovery() {
        return restTemplate.getForObject(PROVIDER_URI + "/discovery", Object.class);
    }
}
