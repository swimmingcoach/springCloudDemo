package cn.zealot.clientfeign.service;

import cn.zealot.clientfeign.model.User;
import cn.zealot.clientfeign.service.IFeignClientService;
import org.springframework.stereotype.Component;

@Component
public class IFeignClientServiceHystric implements IFeignClientService {
    @Override
    public String hello(String id) {
        return "null out";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("null", 0);
    }

    @Override
    public String hello(User user) {
        return "null";
    }
}
