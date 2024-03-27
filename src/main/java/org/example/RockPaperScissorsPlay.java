package org.example;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «камень-ножницы-бумага»
 * @author Ann Akulova
 */
public class RockPaperScissorsPlay implements Play {
    private final String[] figure = {"камень", "ножницы", "бумага"};

    /**
     * Переопределение метода для игры в «камень-ножницы-бумага»
     * @param figureUser - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
    @Override
    public String generateShowFigure(String figureUser) {
        String result = figure[(int) Math.round(Math.random() + 1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "ножницы")) {
                    outcomeOfGame = "Ты победил🏆";
                } else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "ножницы":
                if (Objects.equals(result, "ножницы")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "бумага")) {
                    outcomeOfGame = "Ты победил🏆";
                } else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "бумага":
                if (Objects.equals(result, "бумага")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты победил🏆";
                } else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        return outcomeOfGame;
    }
}
