package com.xemyjib.spring.proxy;

import com.xemyjib.spring.Utils;
import com.xemyjib.spring.TestI;
import com.xemyjib.spring.TestLazyI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
@Component
@Lazy
public class TestProxy {

    @Autowired
    private TestI test;

    @Autowired
    @Lazy
    private TestLazyI testLazy;

    public void go() {
        Utils.print(TestProxy.class, "No Lazy. Second Lazy annotation was skipped - " + test.getClass());
        test.go();
        System.out.println("----------");
        Utils.print(TestProxy.class, "Lazy. With second Lazy annitation - " + testLazy.getClass());
        testLazy.go();
    }

}
