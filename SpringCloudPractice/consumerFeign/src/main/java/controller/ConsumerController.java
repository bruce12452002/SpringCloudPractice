package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import scp.ApiBean;
import service.MyService;

import javax.annotation.Resource;

@RestController
// @Import(RestTemplate.class)
public class ConsumerController {
//    private static final String PROVIDER_URI = "http://localhost:9001";
/*    private static final String PROVIDER_URI = "http://"+ "provider1".toUpperCase(); // 網址列不分大小寫，但還是以 eureka 為準的好

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
  */

    @Resource
    private MyService myService;

    @GetMapping("/xxx")
    public ApiBean get() {
        return myService.get();
    }

    @GetMapping("/ooo/{id}")
    public ApiBean getHystrix(@PathVariable("id") Integer id) {
        return myService.get(id);
    }
}
