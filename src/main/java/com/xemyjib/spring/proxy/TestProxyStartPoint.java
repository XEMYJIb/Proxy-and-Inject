package com.xemyjib.spring.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class TestProxyStartPoint {

    @Autowired
    @Lazy
    private TestProxy testProxy;

    public void go() {
        testProxy.go();
    }

}
