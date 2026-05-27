package com.techninja.module1Introduction.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;

    public void bakeCake() {

        System.out.println("Alice is baking a cake with " +frosting.getFrostingType() + " and " +syrup.getSyrupType());
    }
}
