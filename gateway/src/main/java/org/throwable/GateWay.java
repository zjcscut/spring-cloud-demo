package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 14:30
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GateWay {

    public static void main(String[] args) {
        SpringApplication.run(GateWay.class, args);
    }
}
