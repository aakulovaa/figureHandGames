package org.figureHandGames;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class JanKenPonPlayTest {

    @Test
    void showFigureForJKP() {
        JanKenPonPlay play = new JanKenPonPlay();
        String resultRock = play.showFigureForJKP("камень");
        String resultBird = play.showFigureForJKP("птица");
        String resultWater = play.showFigureForJKP("вода");
        String[] extended = {"Ничья🤝", "Ты победил🏆", "Ты проиграл☹️"};
        assertTrue(Arrays.asList(extended).contains(resultRock));
        assertTrue(Arrays.asList(extended).contains(resultBird));
        assertTrue(Arrays.asList(extended).contains(resultWater));
    }

    @Test
    void rockOutcome() {
        JanKenPonPlay play = new JanKenPonPlay();
        assert Objects.equals(play.rockOutcome("камень"), "Ничья🤝");
        assert Objects.equals(play.rockOutcome("птица"), "Ты победил🏆");
        assert Objects.equals(play.rockOutcome("вода"), "Ты проиграл☹️");
    }

    @Test
    void birdOutcome() {
        JanKenPonPlay play = new JanKenPonPlay();
        assert Objects.equals(play.birdOutcome("птица"), "Ничья🤝");
        assert Objects.equals(play.birdOutcome("вода"), "Ты победил🏆");
        assert Objects.equals(play.birdOutcome("камень"), "Ты проиграл☹️");
    }

    @Test
    void waterOutcome() {
        JanKenPonPlay play = new JanKenPonPlay();
        assert Objects.equals(play.waterOutcome("вода"), "Ничья🤝");
        assert Objects.equals(play.waterOutcome("камень"), "Ты победил🏆");
        assert Objects.equals(play.waterOutcome("птица"), "Ты проиграл☹️");
    }
}