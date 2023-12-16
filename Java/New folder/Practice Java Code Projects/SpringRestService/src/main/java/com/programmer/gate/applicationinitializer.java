package com.programmer.gate;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class applicationinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                applicationconfiguration.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/rest/*"
        };
    }
}