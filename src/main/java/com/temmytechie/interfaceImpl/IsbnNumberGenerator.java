package com.temmytechie.interfaceImpl;

import com.temmytechie.interfaceAnnotations.Thirtendigits;

import java.util.Random;

/**
 * @author TemmyTechie
 */
@Thirtendigits
public class IsbnNumberGenerator implements NumberGenerator{
    @Override
    public String generateNumber() {
        return "13-8934-"+ Math.abs(new Random().nextInt());
    }
}
