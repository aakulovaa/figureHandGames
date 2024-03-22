package org.example;

import java.util.Objects;

public class VanTuTsumPlay implements HardPlay{
    private String[] figure = {"птица", "камень", "пистолет", "стол", "вода"};
    @Override
    public void generateShowFigure(String figureUser){
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


        }
    }
}
