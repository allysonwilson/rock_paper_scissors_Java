package com.example.rockpaperscissors;

import java.util.Random;

/**
 * Created by allysonwilson on 9/19/17.
 */

public class RockPaperScissors {

    public String compareStrings(String player, String computer){



        if ( player.equals(computer) ) {
            return "It's a tie!";
        }
        else if (player.equals("Rock") && computer.equals("Scissors")) {
            return "Rock wins!";
        }

        return "Something broke - Didn't return early";
    }


//    Random random = new Random();





}
