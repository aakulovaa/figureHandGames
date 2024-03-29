package org.figureHandGames;

/**
 * Класс Адаптер игры «камень-ножницы-бумага» к игре «камень-птица-вода»
 */
public class GameAdapter implements StandartGame {
    private OtherGame jkpPlay;
    private final String[] figure = {"камень", "птица", "вода"};

    public GameAdapter(OtherGame jkpPlay) {
        this.jkpPlay = jkpPlay;
    }

    /**
     * Переопределение метода для игры в «камень-птица-вода» из «камень-ножницы-бумага»
     *
     * @param figureUser - название фигуры, полученной от пользователя
     * @return
     */
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

    /**
     * Метод для определения исхода игры в случае выпадения камня
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения камня
     */
    @Override
    public String rockOutcome(String codeFigure) {
        return jkpPlay.rockOutcome(codeFigure);
    }

    /**
     * Метод для определения исхода игры в случае выпадения птицы
     *
     * @param codeFigure - сгенерированная фигура
     * @return
     */
    @Override
    public String scissorsOutcome(String codeFigure) {
        return jkpPlay.birdOutcome(codeFigure);
    }

    /**
     * Метод для определения исхода игры в случае выпадения воды
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения воды
     */
    @Override
    public String paperOutcome(String codeFigure) {
        return jkpPlay.waterOutcome(codeFigure);
    }
}
