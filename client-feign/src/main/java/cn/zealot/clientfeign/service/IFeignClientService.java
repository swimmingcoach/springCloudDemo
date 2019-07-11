package cn.zealot.clientfeign.service;

import cn.zealot.clientfeign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(value = "service-hello", fallback = IFeignClientServiceHystric.class) //这里的name对应调用服务的spring.applicatoin.name
public interface IFeignClientService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("id") String id);

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    String hello(@RequestBody User user);
}
