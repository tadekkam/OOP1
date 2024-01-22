package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesToSecondsTest {

    @Test
    void convertMinutesToSecond10() {
        //given
        int minutes = 10;
        //when
        int second = MinutesToSeconds.convert(minutes);
        //then
        Assertions.assertEquals(600, second);
    }

    @Test
    void convertMinutesToSecondError() {
        //given
        int minutes = -10;
        //when
        int second = MinutesToSeconds.convert(minutes);
        //then
        Assertions.assertEquals(0, second);
    }

}