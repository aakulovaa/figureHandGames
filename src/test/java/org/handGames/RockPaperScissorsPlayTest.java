package org.handGames;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsPlayTest {

    @Test
    void generateShowFigure() {
        RockPaperScissorsPlay play = new RockPaperScissorsPlay();
        String result = play.generateShowFigure("камень");
        String[] extended = {"Ничья🤝", "Ты победил🏆", "Ты проиграл☹️"};
        assertTrue(Arrays.asList(extended).contains(result));
    }
}