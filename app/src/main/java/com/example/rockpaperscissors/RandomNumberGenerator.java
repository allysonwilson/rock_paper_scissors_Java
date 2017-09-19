package com.example.rockpaperscissors;

import java.util.Random;

/**
 * Created by allysonwilson on 9/19/17.
 */

public class RandomNumberGenerator {
    public int generateNumber(int upperLimit){
        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;
    }

}
