package com.galid.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class, excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
