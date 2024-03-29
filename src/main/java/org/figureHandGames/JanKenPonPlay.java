package org.figureHandGames;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «камень-птица-вода»
 *
 * @author Ann Akulova
 */
public class JanKenPonPlay implements OtherGame {
    private final String[] figure = {"камень", "птица", "вода"};

    /**
     * Переопределение метода для игры в «камень-птица-вода»
     *
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

    /**
     * Метод для определения исхода игры в случае выпадения камня
     *
     * @param figureCode - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения камня
     */
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

    /**
     * Метод для определения исхода игры в случае выпадения птицы
     *
     * @param figureCode - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения птицы
     */
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

    /**
     * Метод для определения исхода игры в случае выпадения воды
     *
     * @param figureCode - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения воды
     */
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
