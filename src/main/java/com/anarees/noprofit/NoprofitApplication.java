package com.anarees.noprofit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.anarees.noprofit.controllers"})
public class NoprofitApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoprofitApplication.class, args);
    }

}
