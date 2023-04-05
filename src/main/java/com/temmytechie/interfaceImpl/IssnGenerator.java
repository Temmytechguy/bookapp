package com.temmytechie.interfaceImpl;

import java.util.Random;

/**
 * @author TemmyTechie
 */

public class IssnGenerator  implements NumberGenerator{
    @Override
    public String generateNumber() {
        return "8-" + Math.abs(new Random().nextInt());

    }
}
