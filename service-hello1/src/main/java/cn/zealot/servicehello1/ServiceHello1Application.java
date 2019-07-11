package cn.zealot.servicehello1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ServiceHello1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHello1Application.class, args);
    }

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String id) {
        return "hello " + id + " , " + name + " , I am from port:" + port;
    }

    @RequestMapping("/hello1")
    public String hello1(@RequestParam String id) {
        return "hello1 " + id + " , " + name + " , I am from port:" + port;
    }

}
