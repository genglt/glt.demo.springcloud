package springcloud.ribbon.ribbonservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springcloud.ribbon.ribbonservice.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @PostMapping("/say")
    public String say(@RequestParam String word){
        return "say "+ word;
    }
}
