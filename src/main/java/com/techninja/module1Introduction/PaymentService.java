package com.techninja.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * Component is a stereotype annotation that is used to tell Spring Container to manage this bean
 */
@Component
public class PaymentService {

    public void pay() {
        System.out.println("Paying....");
    }

    @PostConstruct
    public void postInit() {
        System.out.println("After payment service is initialized...");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroying Payment Service Obj...");
    }
}
