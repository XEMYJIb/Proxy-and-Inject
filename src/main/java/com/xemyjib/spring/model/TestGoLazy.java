package com.xemyjib.spring.model;

import com.xemyjib.spring.TestLazyI;

import static com.xemyjib.spring.Utils.print;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class TestGoLazy implements TestLazyI {

    public TestGoLazy() {
        print(this.getClass(), "!>>constructor TestGoLazy<<!");
    }

    public void go() {
        print(this.getClass(), "method TestGoLazy");
    }
}
