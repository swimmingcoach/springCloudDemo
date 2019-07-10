package cn.zealot.clientfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private IFeignClientService feignClientService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String id){
        return feignClientService.hello(id);
    }
}
