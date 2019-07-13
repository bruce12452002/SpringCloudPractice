package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import scp.ApiBean;

@RestController
public class TestController {
    @GetMapping("/testGet")
    public ApiBean get() {
        ApiBean ab = new ApiBean();
        ab.setId(1);
        ab.setName("xxx");
        return ab;
    }
}
