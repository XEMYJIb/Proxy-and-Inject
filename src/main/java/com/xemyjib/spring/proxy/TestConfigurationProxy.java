package com.xemyjib.spring.proxy;

import com.xemyjib.spring.TestI;
import com.xemyjib.spring.TestLazyI;
import com.xemyjib.spring.model.TestGo;
import com.xemyjib.spring.model.TestGoLazy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Simple spring configuration Bean
 *
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
@Configuration
public class TestConfigurationProxy {

    @Bean
    @Lazy
    public TestLazyI testLazyBean() {
        return new TestGoLazy();
    }

    @Bean
    public TestI testBean() {
        return new TestGo();
    }

}
