package org.handGames;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("Введите фигуру");
        RockPaperScissorsPlay play = new RockPaperScissorsPlay();
        Player player = new Player();
        //player.playGame(play);
        VanTuTsumPlay vanTuTsumPlay = new VanTuTsumPlay();
        Play secondPlay = new PlayAdapter(vanTuTsumPlay);
        player.playGame(secondPlay);
    }
}
