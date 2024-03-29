package org.figureHandGames;

import org.handGames.RockPaperScissorsPlay;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RPSPlayTest {

    @Test
    void showFigureForRPS() {
        RPSPlay play = new RPSPlay();
        String resultRock = play.showFigureForRPS("камень");
        String resultScissors = play.showFigureForRPS("ножницы");
        String resultPaper = play.showFigureForRPS("бумага");
        String[] extended = {"Ничья🤝", "Ты победил🏆", "Ты проиграл☹️"};
        assertTrue(Arrays.asList(extended).contains(resultRock));
        assertTrue(Arrays.asList(extended).contains(resultScissors));
        assertTrue(Arrays.asList(extended).contains(resultPaper));
    }

    @Test
    void rockOutcome() {
        RPSPlay play = new RPSPlay();
        assert Objects.equals(play.rockOutcome("камень"), "Ничья🤝");
        assert Objects.equals(play.rockOutcome("ножницы"), "Ты победил🏆");
        assert Objects.equals(play.rockOutcome("бумага"), "Ты проиграл☹️");
    }

    @Test
    void scissorsOutcome() {
        RPSPlay play = new RPSPlay();
        assert Objects.equals(play.scissorsOutcome("ножницы"), "Ничья🤝");
        assert Objects.equals(play.scissorsOutcome("бумага"), "Ты победил🏆");
        assert Objects.equals(play.scissorsOutcome("камень"), "Ты проиграл☹️");
    }

    @Test
    void paperOutcome() {
        RPSPlay play = new RPSPlay();
        assert Objects.equals(play.paperOutcome("бумага"), "Ничья🤝");
        assert Objects.equals(play.paperOutcome("камень"), "Ты победил🏆");
        assert Objects.equals(play.paperOutcome("ножницы"), "Ты проиграл☹️");
    }
}