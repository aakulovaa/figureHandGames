package org.example;

import java.util.Scanner;

/**
 * Класс игрока, умеющего играть в «камень-ножницы-бумага»
 */
public class Player {
    Scanner scanner = new Scanner(System.in);
    String figureUser = scanner.nextLine();

    /**
     * Метод для игры пользователя с программой
     * @param play - игра, подаваемая на вход
     */
    public void playGame(Play play){
        play.generateShowFigure(figureUser);
    }
}
