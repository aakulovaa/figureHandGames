package org.example;

public class RockPaperScissorsPlay implements Play {
    private String[] figure = {"камень", "ножницы", "бумага"};
    @Override
    public String generateShowFigure(){
        String result = figure[(int)Math.round(Math.random()+1)];
        return result;
    }
}
