package com.example.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allysonwilson on 9/19/17.
 */
public class RockPaperScissorsTest {

    @Test
    public void tieWhenBothSame() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Rock", "Rock");

        assertEquals("It's a tie!", result);

    }

    @Test
    public void rockBeatsScissors() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Rock", "Scissors");

        assertEquals("You win! Play again?", result);
    }

    @Test
    public void paperBeatsRock() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Paper", "Rock");

        assertEquals("You win! Play again?", result);
    }

    @Test
    public void scissorsBeatsPaper() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Scissors", "Paper");

        assertEquals("You win! Play again?", result);
    }

    public void scissorsBeatsRock() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings( "Scissors", "Rock");

        assertEquals("Too bad, play again?", result);
    }

    @Test
    public void rockBeatsPaper() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Rock" , "Paper");

        assertEquals("Too bad, play again?", result);
    }

    @Test
    public void paperBeatsScissors() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings( "Paper", "Scissors");

        assertEquals("Too bad, play again?", result);
    }
}