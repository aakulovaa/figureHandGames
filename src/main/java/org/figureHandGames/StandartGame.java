package org.figureHandGames;

/**
 * Интерфейс, определяющий логику игры «камень-ножницы-бумага»
 *
 * @author Ann Akulova
 */
public interface StandartGame {

    /**
     * Метод для игры в «камень-ножницы-бумага»
     *
     * @param figure - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
    String showFigureForRPS(String figure);

    /**
     * Метод для определения исхода игры в случае выпадения камня
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения камня
     */
    String rockOutcome(String codeFigure);

    /**
     * Метод для определения исхода игры в случае выпадения ножниц
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения ножниц
     */
    String scissorsOutcome(String codeFigure);

    /**
     * Метод для определения исхода игры в случае выпадения бумаги
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения бумаги
     */
    String paperOutcome(String codeFigure);
}
