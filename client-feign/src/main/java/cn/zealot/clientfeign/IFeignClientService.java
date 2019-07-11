package cn.zealot.clientfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-hello") //这里的name对应调用服务的spring.applicatoin.name
public interface IFeignClientService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(@RequestParam("id") String id);
}
