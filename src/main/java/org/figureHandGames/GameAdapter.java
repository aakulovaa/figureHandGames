package org.figureHandGames;

public class GameAdapter implements StandartGame{
    private SingaporeGame jkpPlay;

    public GameAdapter(SingaporeGame jkpPlay) {
        this.jkpPlay = jkpPlay;
    }


    @Override
    public String showFigureForRPS(String figure) {
        return jkpPlay.showFigureForJKP(figure);
    }

    @Override
    public String rockOutcome(String codeFigure) {
        return jkpPlay.rockOutcome(codeFigure);
    }

    @Override
    public String scissorsOutcome(String codeFigure) {
        return jkpPlay.birdOutcome(codeFigure);
    }

    @Override
    public String paperOutcome(String codeFigure) {
        return jkpPlay.waterOutcome(codeFigure);
    }
}
