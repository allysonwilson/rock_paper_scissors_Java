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
            return "You win! Play again?";
        }
        else if (player.equals("Paper") && computer.equals("Rock")) {
            return "You win! Play again?";
        }

        else if (player.equals("Scissors") && computer.equals("Paper")) {
            return "You win! Play again?";
        }
        else if (computer.equals("Rock") && player.equals("Scissors")) {
            return "Too bad, play again?";
        }
        else if (computer.equals("Paper") && player.equals("Rock")) {
            return "Too bad, play again?";
        }

        else if (computer.equals("Scissors") && player.equals("Paper")) {
            return"Too bad, play again?";
        }
        return "Too bad, play again?";
    }


//    Random random = new Random();





}
