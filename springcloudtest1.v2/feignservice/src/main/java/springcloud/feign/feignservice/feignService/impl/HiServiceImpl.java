package springcloud.feign.feignservice.feignService.impl;

import org.springframework.stereotype.Component;
import springcloud.feign.feignservice.feignService.HiService;

@Component
public class HiServiceImpl implements HiService {
    @Override
    public String sayHi(String name) {
        return "hello "+ name +", sorry error";
    }
}
