package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String figureUser = scanner.nextLine();
        RockPaperScissorsPlay play = new RockPaperScissorsPlay();
        Player player = new Player();
        player.playGame(play);
        VanTuTsumPlay vanTuTsumPlay = new VanTuTsumPlay();
        Play secondPlay = new PlayAdapter(vanTuTsumPlay);
        player.playGame(secondPlay);
    }
}
