package org.example;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «Ван, ту, цум»
 * @author Ann Akulova
 */
public class VanTuTsumPlay implements HardPlay{
    private final String[] figure = {"птица", "камень", "пистолет", "стол", "вода"};

    /**
     * Переопределение метода для игры в "Ван-ту-цум"
     * @param figureUser - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
    @Override
    public String generateShowFigure(String figureUser){
        String result = figure[(int)Math.round(Math.random()+1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                } else if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ты победил🏆";
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "птица":
                if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ты победил🏆";
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты проиграл☹️";
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "пистолет":
                if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты победил🏆";
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                }else if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ты победил🏆";
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "стол":
                if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                } else if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ты победил🏆";
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                }
                System.out.println(result);
                break;
            case "вода":
                if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ничья🤝";
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты проиграл☹️";
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты победил🏆";
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты победил🏆";
                }else {
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
