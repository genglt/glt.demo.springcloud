package springcloud.feign.feignservice.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client-all")
public interface HiService {
    @RequestMapping(value="/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
