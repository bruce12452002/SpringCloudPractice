package controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import scp.ApiBean;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Resource
    private DiscoveryClient client;

    @GetMapping("/testGet")
    public ApiBean get() {
        ApiBean ab = new ApiBean();
        ab.setId(1);
        ab.setName("xxx9002");
        return ab;
    }

    @GetMapping("/discovery")
    public DiscoveryClient discoveryTest() {
        List<String> services = client.getServices();
        System.out.println("所有服務名稱=" + services);

        // List<ServiceInstance> instances = client.getInstances("provider1".toUpperCase()); // 一定要大寫
        services.forEach(serviceName -> {
            List<ServiceInstance> instances = client.getInstances(serviceName);
            instances.forEach(s -> {
                System.out.println("host=" + s.getHost()); // 192.168.254.104
                System.out.println("instanceId=" + s.getInstanceId()); // bruceProvider1
                System.out.println("scheme=" + s.getScheme()); // null
                System.out.println("serviceId=" + s.getServiceId()); // PROVIDER1
                System.out.println("port=" + s.getPort()); //  9001
                System.out.println("uri=" + s.getUri()); // http://192.168.254.104:9001

                Map<String, String> metadata = s.getMetadata();
                metadata.forEach((k, v) -> {
                    System.out.print("key=" + k); // management.port
                    System.out.println(", value=" + v); // 9001
                });
            });
            System.out.println("------------------------------------");
        });
        return client;
    }
}
