package com.xemyjib.spring.inject;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class TestInjectStartPoint {

    @Autowired
    private TestInject testInject;

    public void go() {
        testInject.go();
    }

}
