package com.techninja.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    PaymentService paymentService() {
        //we can add more logic here if needed
        return new PaymentService();
    }
}
