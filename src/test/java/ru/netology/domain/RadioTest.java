package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "6,7",
            "9,0"
    })
    void nextRadioStation(int newCurrentRadioStation, int expect) {

        Radio radio = new Radio();

        radio.setCurrentRadioStation(newCurrentRadioStation);
        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();

        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "2,1",
            "7,6",
            "0,9"
    })
    void prevRadioStation(int newCurrentRadioStation, int expect) {

        Radio radio = new Radio();

        radio.setCurrentRadioStation(newCurrentRadioStation);
        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();

        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "6,6",
            "9,9",
            "-1,0",
            "10,0"
    })
    void currentRadioStation(int newCurrentRadioStation, int expect) {

        Radio radio = new Radio();

        radio.setCurrentRadioStation(newCurrentRadioStation);


        int actual = radio.getCurrentRadioStation();

        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "6,7",
            "10,10"
    })
    void increaseVolume(int newCurrentVolume, int expect) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.setIncreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1",
            "7,6",
            "10,9",
            "0,0"
    })
    void decreaseVolume(int newCurrentVolume, int expect) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);
        radio.setDecreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "10,10",
            "-1,0",
            "11,0"
    })
    void currentVolume(int newCurrentVolume, int expect) {

        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        assertEquals(expect, actual);
    }

}