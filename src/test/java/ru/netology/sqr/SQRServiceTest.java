package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldSqrNumWithoutCeiling() {
        SQRService service = new SQRService();
        int lowerLimit = 10;
        int upperLimit = 99;

        int expected = 0;
        int actual = service.sqrNum(10, 99);

        assertEquals(expected, actual);

    }

}