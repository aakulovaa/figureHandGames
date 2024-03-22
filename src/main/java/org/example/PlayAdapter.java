package org.example;

/**
 * Класс Адаптер игры «камень-ножницы-бумага» к игре «Ван, ту, цум»
 */
public class PlayAdapter implements Play{
    private HardPlay vanTuTsumPlay;

    public PlayAdapter(HardPlay vanTuTsumPlay) {
        this.vanTuTsumPlay = vanTuTsumPlay;
    }
    @Override
    public void generateShowFigure(String figureUser){
        vanTuTsumPlay.generateShowFigure(figureUser);
    }
}
