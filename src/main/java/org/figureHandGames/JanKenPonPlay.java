package org.figureHandGames;

import java.util.Objects;

public class JanKenPonPlay implements SingaporeGame {
    private final String[] figure = {"камень", "птица", "вода"};

    /**
     * Переопределение метода для игры в «камень-ножницы-бумага»
     * @param figureUser - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
    @Override
    public String showFigureForJKP(String figureUser) {
        String result = figure[(int) Math.round(Math.random() + 1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                outcomeOfGame = rockOutcome(result);
                System.out.println(result);
                break;
            case "птица":
                outcomeOfGame = birdOutcome(result);
                System.out.println(result);
                break;
            case "вода":
                outcomeOfGame = waterOutcome(result);
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        return outcomeOfGame;
    }

    @Override
    public String rockOutcome(String figureCode) {
        String outcomeForRock = null;
        if (Objects.equals(figureCode, "камень")) {
            outcomeForRock = "Ничья🤝";
        } else if (Objects.equals(figureCode, "птица")) {
            outcomeForRock = "Ты победил🏆";
        } else {
            outcomeForRock = "Ты проиграл☹️";
        }
        return outcomeForRock;
    }

    @Override
    public String birdOutcome(String figureCode) {
        String outcomeForBird = null;
        if (Objects.equals(figureCode, "птица")) {
            outcomeForBird = "Ничья🤝";
        } else if (Objects.equals(figureCode, "вода")) {
            outcomeForBird = "Ты победил🏆";
        } else {
            outcomeForBird = "Ты проиграл☹️";
        }
        return outcomeForBird;
    }

    @Override
    public String waterOutcome(String figureCode) {
        String outcomeForWater = null;
        if (Objects.equals(figureCode, "вода")) {
            outcomeForWater = "Ничья🤝";
        } else if (Objects.equals(figureCode, "камень")) {
            outcomeForWater = "Ты победил🏆";
        } else {
            outcomeForWater = "Ты проиграл☹️";
        }
        return outcomeForWater;
    }
}
