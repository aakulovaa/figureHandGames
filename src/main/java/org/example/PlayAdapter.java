package org.example;

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
