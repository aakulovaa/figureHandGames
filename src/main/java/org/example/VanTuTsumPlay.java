package org.example;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «Ван, ту, цум»
 */
public class VanTuTsumPlay implements HardPlay{
    private final String[] figure = {"птица", "камень", "пистолет", "стол", "вода"};

    /**
     * Переопределение метода для игры в "Ван-ту-цум"
     *
     * @param figureUser - название фигуры, полученной от пользователя
     */
    @Override
    public String generateShowFigure(String figureUser){
        String result = figure[(int)Math.round(Math.random()+1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ничья🤝";
                    //System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ты победил🏆";
                //System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }
                System.out.println(result);
                break;
            case "птица":
                if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ничья🤝";
                    //System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }
                System.out.println(result);
                break;
            case "пистолет":
                if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ничья🤝";
                    //System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆️");
                }else if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆️");
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }
                System.out.println(result);
                break;
            case "стол":
                if (Objects.equals(result, "стол")) {
                    outcomeOfGame = "Ничья🤝";
                    //System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }
                System.out.println(result);
                break;
            case "вода":
                if (Objects.equals(result, "вода")) {
                    outcomeOfGame = "Ничья🤝";
                    //System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                } else if (Objects.equals(result, "камень")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    outcomeOfGame = "Ты победил🏆";
                    //System.out.println(result + "\nТы победил🏆️");
                }else {
                    outcomeOfGame = "Ты проиграл☹️";
                    //System.out.println(result + "\nТы проиграл☹️");
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        return outcomeOfGame;
    }
}
