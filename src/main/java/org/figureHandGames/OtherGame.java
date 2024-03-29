package org.figureHandGames;

/**
 * Интерфейс, определяющий логику игры «камень-птица-вода»
 *
 * @author Ann Akulova
 */
public interface OtherGame {

    /**
     * Переопределение метода для игры в «камень-птица-вода»
     *
     * @param figure - название фигуры, полученной от пользователя
     * @return - возвращает исход игры
     */
    String showFigureForJKP(String figure);

    /**
     * Метод для определения исхода игры в случае выпадения камня
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения камня
     */
    String rockOutcome(String codeFigure);

    /**
     * Метод для определения исхода игры в случае выпадения птицы
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения птицы
     */
    String birdOutcome(String codeFigure);

    /**
     * Метод для определения исхода игры в случае выпадения воды
     *
     * @param codeFigure - сгенерированная фигура
     * @return - возвращает исход игры в случае выпадения воды
     */
    String waterOutcome(String codeFigure);
}
