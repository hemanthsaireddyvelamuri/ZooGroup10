package edu.nwmissouri.zoo10group;

import java.util.concurrent.TimeUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ZooApp implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // Register resource handler for images
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }

    public static void main(String[] args) {
        SpringApplication.run(ZooApp.class, args);

        try {
            int hem;
            hem = 1 / 0;

            System.out.println("this is shoebill division !");
        } catch (Exception e) {
            System.out.println("Exception thrown is: " + e);
        }

    }
}
