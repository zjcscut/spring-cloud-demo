package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 13:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service0 {

    public static void main(String[] args){
        SpringApplication.run(Service0.class,args);
    }

    @RequestMapping(value = "/service0")
    public String service0(){
        return "service0";
    }
}
