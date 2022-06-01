package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void installCurrentStation() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(6);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 6;

        assertEquals(expect, actual);
    }
    @Test
    void installNegativeCurrentStation() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 0;

        assertEquals(expect, actual);
    }
    @Test
    void installFalseCurrentStation() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 0;

        assertEquals(expect, actual);
    }
    @Test
    void installFirstStation() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 0;

        assertEquals(expect, actual);
    }
    @Test
    void installLastStation() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(9);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 9;

        assertEquals(expect, actual);
    }

    @Test
    void firstRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void secondRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void lastRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void randomRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void firstPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void secondPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void lastPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void randomPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void installCurrentVolume() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentVolume(6);

        int actual = radio.getCurrentVolume();//station.currentRadioStation;
        int expect = 6;

        assertEquals(expect, actual);
    }
    @Test
    void installZeroCurrentVolume() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();//station.currentRadioStation;
        int expect = 0;

        assertEquals(expect, actual);
    }
    @Test
    void installTenCurrentVolume() {
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();//station.currentRadioStation;
        int expect = 10;

        assertEquals(expect, actual);
    }


    @Test
    void firstIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void secondIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void lastIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    void randomIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void firstDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void secondDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void lastDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void randomDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }
}
