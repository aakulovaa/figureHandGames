package org.figureHandGames;

public class GameAdapter implements StandartGame{
    private SingaporeGame jkpPlay;
    private final String[] figure = {"камень", "птица", "вода"};

    public GameAdapter(SingaporeGame jkpPlay) {
        this.jkpPlay = jkpPlay;
    }


    @Override
    public String showFigureForRPS(String figureUser) {
        String result = figure[(int) Math.round(Math.random() + 1)];
        String outcomeOfGame = null;
        switch (figureUser) {
            case "камень":
                outcomeOfGame = rockOutcome(result);
                System.out.println(result);
                break;
            case "ножницы":
                outcomeOfGame = scissorsOutcome(result);
                System.out.println(result);
                break;
            case "бумага":
                outcomeOfGame = paperOutcome(result);
                System.out.println(result);
                break;
            default:
                outcomeOfGame = jkpPlay.showFigureForJKP(figureUser);
        }
        return outcomeOfGame;
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
