package org.figureHandGames;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("Введите фигуру");
        //RockPaperScissorsPlay play = new RockPaperScissorsPlay();
        //Player player = new Player();
        //player.playGame(play);
        //VanTuTsumPlay vanTuTsumPlay = new VanTuTsumPlay();
        //Play secondPlay = new PlayAdapter(vanTuTsumPlay);
        //player.playGame(secondPlay);
        RPSPlay standartPlay = new RPSPlay();
        Player player = new Player();
        player.playGame(standartPlay);
        JanKenPonPlay janKenPonPlay = new JanKenPonPlay();
        StandartGame secondPlay = new GameAdapter(janKenPonPlay);
        player.playGame(secondPlay);

    }
}
