package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

/**
 * Created by Edvard Piri on 26.03.2017.
 */
@EnableWebMvc
@ComponentScan({"com"})
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {
    @Bean
    public VelocityViewResolver viewResolver() {
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        return resolver;
    }


    @Bean
    public VelocityConfigurer velocityConfigurer() {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
        velocityConfigurer.setResourceLoaderPath("/");
        return velocityConfigurer;
    }
}
