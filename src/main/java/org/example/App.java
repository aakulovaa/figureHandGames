package org.example;


public class App
{
    public static void main( String[] args )
    {
        RockPaperScissorsPlay play = new RockPaperScissorsPlay();
        Player player = new Player();
        player.playGame(play);
        VanTuTsumPlay vanTuTsumPlay = new VanTuTsumPlay();
        Play secondPlay = new PlayAdapter(vanTuTsumPlay);
        player.playGame(secondPlay);
    }
}
