package springcloud.feign.feignservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springcloud.feign.feignservice.feignService.HiService;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value="name", defaultValue = "wx") String name){
        return hiService.sayHi(name);
    }
}
