package org.figureHandGames;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class GameAdapterTest {

    @Test
    void showFigureForRPS() {
        JanKenPonPlay janKenPonPlay = new JanKenPonPlay();
        GameAdapter gameAdapter = new GameAdapter(janKenPonPlay);
        String resultRock = gameAdapter.showFigureForRPS("камень");
        String resultBird = gameAdapter.showFigureForRPS("птица");
        String resultWater = gameAdapter.showFigureForRPS("вода");

        String[] extended = {"Ничья🤝", "Ты победил🏆", "Ты проиграл☹️"};

        assertTrue(Arrays.asList(extended).contains(resultRock));
        assertTrue(Arrays.asList(extended).contains(resultBird));
        assertTrue(Arrays.asList(extended).contains(resultWater));

        String resultScissors = gameAdapter.showFigureForRPS("ножницы");
        String resultPaper = gameAdapter.showFigureForRPS("бумага");

        assertTrue(Arrays.asList(extended).contains(resultRock));
        assertTrue(Arrays.asList(extended).contains(resultScissors));
        assertTrue(Arrays.asList(extended).contains(resultPaper));
    }

    @Test
    void rockOutcome() {
        JanKenPonPlay janKenPonPlay = new JanKenPonPlay();
        GameAdapter play = new GameAdapter(janKenPonPlay);
        assert Objects.equals(play.rockOutcome("камень"), "Ничья🤝");
        assert Objects.equals(play.rockOutcome("птица"), "Ты победил🏆");
        assert Objects.equals(play.rockOutcome("вода"), "Ты проиграл☹️");
    }

    @Test
    void scissorsOutcome() {
        JanKenPonPlay janKenPonPlay = new JanKenPonPlay();
        GameAdapter play = new GameAdapter(janKenPonPlay);
        assert Objects.equals(play.scissorsOutcome("птица"), "Ничья🤝");
        assert Objects.equals(play.scissorsOutcome("вода"), "Ты победил🏆");
        assert Objects.equals(play.scissorsOutcome("камень"), "Ты проиграл☹️");
    }

    @Test
    void paperOutcome() {
        JanKenPonPlay janKenPonPlay = new JanKenPonPlay();
        GameAdapter play = new GameAdapter(janKenPonPlay);
        assert Objects.equals(play.paperOutcome("вода"), "Ничья🤝");
        assert Objects.equals(play.paperOutcome("камень"), "Ты победил🏆");
        assert Objects.equals(play.paperOutcome("птица"), "Ты проиграл☹️");
    }
}