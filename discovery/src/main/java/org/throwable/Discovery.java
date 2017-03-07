package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 11:47
 */
@SpringBootApplication
@EnableEurekaServer
public class Discovery {

    public static void main(String[] args){
        SpringApplication.run(Discovery.class,args);
    }
}
