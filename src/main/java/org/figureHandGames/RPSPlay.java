package org.figureHandGames;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «камень-ножницы-бумага»
 *
 * @author Ann Akulova
 */
public class RPSPlay implements StandartGame {
    private final String[] figure = {"камень", "ножницы", "бумага"};

    /**
     * Переопределение метода для игры в «камень-ножницы-бумага»
     *
     * @param figureUser - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
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

    /**
     * Метод для определения исхода игры в случае выпадения камня
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения камня
     */
    @Override
    public String rockOutcome(String codeFigure) {
        String rockOutcome;
        if (Objects.equals(codeFigure, "камень")) {
            rockOutcome = "Ничья🤝";
        } else if (Objects.equals(codeFigure, "ножницы")) {
            rockOutcome = "Ты победил🏆";
        } else {
            rockOutcome = "Ты проиграл☹️";
        }
        return rockOutcome;
    }

    /**
     * Метод для определения исхода игры в случае выпадения ножниц
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения ножниц
     */
    @Override
    public String scissorsOutcome(String codeFigure) {
        String scissorsOutcome;
        if (Objects.equals(codeFigure, "ножницы")) {
            scissorsOutcome = "Ничья🤝";
        } else if (Objects.equals(codeFigure, "бумага")) {
            scissorsOutcome = "Ты победил🏆";
        } else {
            scissorsOutcome = "Ты проиграл☹️";
        }
        return scissorsOutcome;
    }

    /**
     * Метод для определения исхода игры в случае выпадения бумаги
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения бумаги
     */
    @Override
    public String paperOutcome(String codeFigure) {
        String paperOutcome;
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
