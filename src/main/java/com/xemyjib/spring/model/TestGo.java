package com.xemyjib.spring.model;

import com.xemyjib.spring.TestI;

import static com.xemyjib.spring.Utils.print;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class TestGo implements TestI {

    public TestGo() {
        print(this.getClass(), ">> constructor TestGo <<");
    }

    public void go() {
        print(this.getClass(), "method TestGo");
    }
}
