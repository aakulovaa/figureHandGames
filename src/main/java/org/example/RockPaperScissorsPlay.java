package org.example;

import java.util.Objects;

public class RockPaperScissorsPlay implements Play {
    private String[] figure = {"камень", "ножницы", "бумага"};

    @Override
    public void generateShowFigure(String figureUser) {
        String result = figure[(int) Math.round(Math.random() + 1)];
        switch (figureUser) {
            case "камень":
                if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "ножницы")) {
                    System.out.println(result + "\nТы победил🏆");
                } else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "ножницы":
                if (Objects.equals(result, "ножницы")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "бумага")) {
                    System.out.println(result + "\nТы победил🏆");
                } else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;
            case "бумага":
                if (Objects.equals(result, "бумага")) {
                    System.out.println(result + "\nНичья🤝");
                } else if (Objects.equals(result, "камень")) {
                    System.out.println(result + "\nТы победил🏆");
                } else {
                    System.out.println(result + "\nТы проиграл☹️");
                }
                break;

        }
    }
}
