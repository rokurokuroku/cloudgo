package com.roku.cloudgo.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class ResourcesConfigurer implements WebMvcConfigurer {
    /**
     * 资源映射路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/products").addResourceLocations(System.getProperty("user.dir")+"/src/main/webapp/images");
    }
}
