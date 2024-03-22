package org.example;

public class Player {
    String figureUser;
    public void playGame(Play play){
        play.generateShowFigure(figureUser);
    }
}
