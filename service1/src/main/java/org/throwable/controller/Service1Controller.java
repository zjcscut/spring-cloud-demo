package org.throwable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.throwable.client.ServiceClient;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/8 0:05
 */
@RestController
public class Service1Controller {

    @Autowired
    private ServiceClient serviceClient;

    @GetMapping(value = "/test")
    public String test(@RequestParam(name = "value") String value) {
        return serviceClient.test(value);
    }

    @GetMapping(value = "/testRest")
    public String testRest(@RequestParam(name = "value") String value) {
        return serviceClient.testRest(value);
    }
}
