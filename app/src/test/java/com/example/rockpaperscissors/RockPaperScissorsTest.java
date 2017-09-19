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

        assertEquals("Rock wins!", result);
    }

    @Test
    public void computerRockBeatsScissors() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("", "Rock");

        assertEquals("Rock wins!", result);
    }

    @Test
    public void scissorsBeatPaper() {
        RockPaperScissors rpsGame = new RockPaperScissors();

        String result = rpsGame.compareStrings("Scissors", "Paper");

        assertEquals("Scissors wins!", result);
    }

}