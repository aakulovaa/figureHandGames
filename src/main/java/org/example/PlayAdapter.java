package org.example;

public class PlayAdapter implements HardPlay{
    private Play vanTuTsumPlay;

    public PlayAdapter(Play vanTuTsumPlay) {
        this.vanTuTsumPlay = vanTuTsumPlay;
    }
    @Override
    public String generateShowFigure(){
        return vanTuTsumPlay.generateShowFigure();
    }
}
