package org.example.app.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] configClass = {LoveCalculatorAppConfig.class};
        return configClass;
    }

    protected String[] getServletMappings() {
        String[] servletMapping = {"/"};
        return servletMapping;
    }
}
