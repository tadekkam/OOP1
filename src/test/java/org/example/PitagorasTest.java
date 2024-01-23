package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PitagorasTest {

    @Test
    void isRightTriangle() {
        Assertions.assertEquals(true,Pitagoras.isRightTriangle(3,4,5));
    }

    @Test
    void isRightTriangleError() {
        Assertions.assertEquals(false,Pitagoras.isRightTriangle(0,4,5));
    }


}