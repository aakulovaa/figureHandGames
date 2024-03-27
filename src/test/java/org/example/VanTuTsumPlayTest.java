package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VanTuTsumPlayTest {

    @Test
    void generateShowFigure() {
        VanTuTsumPlay vanTuTsumPlay = new VanTuTsumPlay();
        String result = vanTuTsumPlay.generateShowFigure("вода");
        String[] extended = {"Ничья🤝", "Ты победил🏆", "Ты проиграл☹️"};
        assertTrue(Arrays.asList(extended).contains(result));
    }
}