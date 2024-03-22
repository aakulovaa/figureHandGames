package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String figureUser = scanner.nextLine();
        Play play = new RockPaperScissorsPlay();
        play.generateShowFigure(figureUser);
        //Player player = new Player();
        HardPlay hardPlay = new PlayAdapter(play);
        //player.playGame(hardPlay);
        //System.out.println(figureUser);
       // hardPlay.generateShowFigure(figureUser);
    }
}
