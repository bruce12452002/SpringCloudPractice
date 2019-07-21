package service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import scp.ApiBean;

@FeignClient("PROVIDER1")
public interface MyService {
    @GetMapping("/testGet")
    ApiBean get();

    @GetMapping("/testHystrix/{id}")
    ApiBean get(@PathVariable("id") Integer id);
}
