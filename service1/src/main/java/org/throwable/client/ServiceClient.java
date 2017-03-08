package org.throwable.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/7 20:45
 */
@FeignClient(name = "service0",fallback = ServiceClientFallback.class) //这里是service0的spring.application.name
public interface ServiceClient {

	@RequestMapping(method = RequestMethod.GET, path = "/test")
	String test(@RequestParam(name = "value") String value);

	@RequestMapping(method = RequestMethod.GET, path = "/testRest/{value}")
	String testRest(@PathVariable(name = "value") String value);
}
