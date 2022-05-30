package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test

    void findCurrentStation(){
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentRadioStation(6);

        int actual = radio.getCurrentRadioStation();//station.currentRadioStation;
        int expect = 6;

        assertEquals(expect, actual);
    }
    @Test
    void FirstRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void SecondRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void LastRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void firstPrevRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void SecondPrevRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void LastPrevRadioStation(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void findCurrentVolume(){
        Radio radio = new Radio();

        //station.currentRadioStation = 0;
        radio.setCurrentVolume(6);

        int actual = radio.getCurrentVolume();//station.currentRadioStation;
        int expect = 6;

        assertEquals(expect, actual);
    }
    @Test
    void FirstIncreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void SecondIncreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        assertEquals(expected, actual);
    }
    @Test
    void LastIncreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    void FirstDecreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void SecondDecreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void LastDecreaseVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
}
