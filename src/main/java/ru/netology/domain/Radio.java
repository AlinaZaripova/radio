package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0 || newCurrentRadioStation > 9) {
            return;
        }

        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setNextRadioStation() {

        if (this.currentRadioStation < 9 && this.currentRadioStation >= 0) {
            this.currentRadioStation = this.currentRadioStation + 1;
        }
        if (this.currentRadioStation == 9) {
            this.currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {

        if (this.currentRadioStation > 0 && this.currentRadioStation <= 9) {
            this.currentRadioStation = this.currentRadioStation - 1;
        }
        if (this.currentRadioStation == 0) {
            this.currentRadioStation = 9;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0 || newCurrentVolume > 10) {
            return;
        }

        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setIncreaseVolume() {

        if (this.currentVolume < 10 && this.currentVolume >= 0) {
            this.currentVolume = this.currentVolume + 1;
        }
        if (this.currentVolume == 10) {
            this.currentVolume = 10;
        }
    }

    public void setDecreaseVolume() {

        if (this.currentVolume > 0 && this.currentVolume <= 10) {
            this.currentVolume = this.currentVolume - 1;
        }
        if (this.currentVolume == 0) {
            this.currentVolume = 0;
        }

    }
}
