package org.figureHandGames;

import java.util.Objects;

public class RPSPlay implements StandartGame{
    private final String[] figure = {"камень", "ножницы", "бумага"};
    @Override
    public String showFigureForRPS(String figureUser) {
        String result = figure[(int) Math.round(Math.random() + 1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                outcomeOfGame = rockOutcome(result);
                System.out.println(result);
                break;
            case "ножницы":
                outcomeOfGame = scissorsOutcome(result);
                System.out.println(result);
                break;
            case "бумага":
                outcomeOfGame = paperOutcome(result);
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        return outcomeOfGame;
    }

    @Override
    public String rockOutcome(String codeFigure) {
        String rockOutcome = null;
        if (Objects.equals(codeFigure, "камень")) {
            rockOutcome = "Ничья🤝";
        } else if (Objects.equals(codeFigure, "ножницы")) {
            rockOutcome = "Ты победил🏆";
        } else {
            rockOutcome = "Ты проиграл☹️";
        }
        return rockOutcome;
    }

    @Override
    public String scissorsOutcome(String codeFigure) {
        String scissorsOutcome = null;
        if (Objects.equals(codeFigure, "ножницы")) {
            scissorsOutcome = "Ничья🤝";
        } else if (Objects.equals(codeFigure, "бумага")) {
            scissorsOutcome = "Ты победил🏆";
        } else {
            scissorsOutcome = "Ты проиграл☹️";
        }
        return scissorsOutcome;
    }

    @Override
    public String paperOutcome(String codeFigure) {
        String paperOutcome = null;
        if (Objects.equals(codeFigure, "бумага")) {
            paperOutcome = "Ничья🤝";
        } else if (Objects.equals(codeFigure, "камень")) {
            paperOutcome = "Ты победил🏆";
        } else {
            paperOutcome = "Ты проиграл☹️";
        }
        return paperOutcome;
    }
}
