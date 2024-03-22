package org.example;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    String figureUser = scanner.nextLine();
    public void playGame(Play play){
        play.generateShowFigure(figureUser);
    }
}
