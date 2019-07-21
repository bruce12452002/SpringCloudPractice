package service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import scp.ApiBean;

@Component
public class MyFallbackFactory implements FallbackFactory<MyService> {
    @Override
    public MyService create(Throwable throwable) {
        return new MyService() {
            @Override
            public ApiBean get() {
                return null;
            }

            @Override
            public ApiBean get(Integer id) {
                ApiBean ab = new ApiBean();
                ab.setId(-1);
                ab.setName("沒有" + id);
                return ab;
            }
        };
    }
}
