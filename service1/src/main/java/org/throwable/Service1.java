package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 14:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1 {

    public static void main(String[] args){
        SpringApplication.run(Service1.class,args);
    }

    @RequestMapping(value = "/service1")
    public String service1(){
        return "service1";
    }
}
