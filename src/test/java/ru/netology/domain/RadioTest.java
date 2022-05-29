package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test

    void findMinStation(){
        Radio station = new Radio();

        station.currentRadioStation = 0;

        int actual = station.currentRadioStation;
        int expect = 0;

        assertEquals(expect, actual);
    }

}
