package org.example;

public class Player {
    String figureUser;
    public void playGame(HardPlay hardPlay){
        hardPlay.generateShowFigure(figureUser);
    }
}
