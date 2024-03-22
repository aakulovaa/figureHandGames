package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Play play = new RockPaperScissorsPlay();
        Player player = new Player();
        HardPlay hardPlay = new PlayAdapter(play);
        player.playGame(hardPlay);
    }
}
