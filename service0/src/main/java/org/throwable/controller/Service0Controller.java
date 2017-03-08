package org.throwable.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 23:59
 */
@RestController
public class Service0Controller {

    @GetMapping(value = "/test")
    public String test(@RequestParam(name = "value") String value) {
        System.out.println("获取到请求参数为 --> " + value);
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    @GetMapping(value = "/testRest/{value}")
    public String testRest(@PathVariable(name = "value") String value) {
        System.out.println("testRest获取到请求参数为 --> " + value);
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
