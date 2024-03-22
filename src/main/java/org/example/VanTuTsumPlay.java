package org.example;

import java.util.Objects;

/**
 * Класс, реализующий логику игры «Ван, ту, цум»
 */
public class VanTuTsumPlay implements HardPlay{
    private final String[] figure = {"птица", "камень", "пистолет", "стол", "вода"};

    /**
     * Переопределение метода для игры в "Ван-ту-цум"
     * @param figureUser - название фигуры, полученной от пользователя
     * @return - возвращяет название сгенерированной фигуры
     */
    @Override
    public String generateShowFigure(String figureUser){
        String result = figure[(int)Math.round(Math.random()+1)];
        switch (figureUser) {
            case "камень":
                if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "стол")) {
                System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    System.out.println(result + "\nТы проиграл☹️");
                }else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "птица":
                if (Objects.equals(result, "птица")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "вода")) {
                    System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nТы проиграл☹️");
                }else if (Objects.equals(result, "пистолет")) {
                    System.out.println(result + "\nТы проиграл☹️");
                }else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "пистолет":
                if (Objects.equals(result, "пистолет")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "птица")) {
                    System.out.println(result + "\nТы победил🏆️");
                }else if (Objects.equals(result, "стол")) {
                    System.out.println(result + "\nТы победил🏆️");
                }else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "стол":
                if (Objects.equals(result, "стол")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    System.out.println(result + "\nТы победил🏆");
                } else if (Objects.equals(result, "вода")) {
                    System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    System.out.println(result + "\nТы проиграл☹️");
                }else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "вода":
                if (Objects.equals(result, "вода")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "птица")) {
                    System.out.println(result + "\nТы проиграл☹️");
                } else if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nТы победил🏆");
                }else if (Objects.equals(result, "пистолет")) {
                    System.out.println(result + "\nТы победил🏆️");
                }else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        return result;
    }
}
