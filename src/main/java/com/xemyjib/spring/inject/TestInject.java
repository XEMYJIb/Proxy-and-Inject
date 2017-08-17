package com.xemyjib.spring.inject;

import com.xemyjib.spring.Utils;
import com.xemyjib.spring.TestI;
import com.xemyjib.spring.model.TestGoLazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
@Component
public class TestInject {

    @Inject
    private TestI test;

    @Inject
    private Provider<TestGoLazy> testProvider;

    public void go() {
        Utils.print(TestInject.class, "Inject wo provider - " + test.getClass());
        test.go();
        System.out.println("----------");
        Utils.print(TestInject.class, "Inject With provider - " + testProvider.getClass());
        testProvider.get().go();
    }

}
