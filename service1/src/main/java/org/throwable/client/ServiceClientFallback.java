package org.throwable.client;

import org.springframework.stereotype.Component;

/**
 * @author throwable
 * @version v1.0
 * @since 2017/3/8 10:04
 */
@Component
public class ServiceClientFallback implements ServiceClient{

    @Override
    public String test(String value) {
        return "ServiceClientFallback test response!!!!! value --> " + value;
    }

    @Override
    public String testRest( String value) {
        return "ServiceClientFallback testRest response!!!!! value --> " + value;
    }
}
