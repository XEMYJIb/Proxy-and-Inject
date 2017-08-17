package com.xemyjib.spring;

import com.xemyjib.spring.inject.TestInjectStartPoint;
import com.xemyjib.spring.proxy.TestProxyStartPoint;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author anton.demus
 * @version 1.0, 8/17/17
 */
public class Starter {

    @Configuration
    @ComponentScan(value = "com.xemyjib.spring.proxy")
    public static class ProxyConfig {

        @Bean
        public TestProxyStartPoint testStartPoint() {
            return new TestProxyStartPoint();
        }
    }

    @Configuration
    @ComponentScan(value = "com.xemyjib.spring.inject")
    public static class InjectConfig {

        @Bean
        public TestInjectStartPoint testStartPoint() {
            return new TestInjectStartPoint();
        }
    }

    @Test
    public void testProxy() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProxyConfig.class);
        TestProxyStartPoint startPoint = context.getBean(TestProxyStartPoint.class);
        startPoint.go();
    }

    @Test
    public void testInject() {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectConfig.class);
        TestInjectStartPoint startPoint = context.getBean(TestInjectStartPoint.class);
        startPoint.go();
    }
}
