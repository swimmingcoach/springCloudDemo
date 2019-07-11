package cn.zealot.clientfeign.controller;

import cn.zealot.clientfeign.model.User;
import cn.zealot.clientfeign.service.IFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private IFeignClientService feignClientService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String id){
        return feignClientService.hello(id);
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User hello(@RequestParam String name, @RequestParam Integer age) {
        return feignClientService.hello(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return feignClientService.hello(user);
    }
}
