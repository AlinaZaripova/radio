package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    private int stationsAmount = 10;

    private int volumeAmount = 100;

    public Radio() {
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
        this.volumeAmount = volumeAmount;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0 || newCurrentRadioStation > this.stationsAmount - 1) {
            return;
        }

        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setNextRadioStation() {

        if (this.currentRadioStation == this.stationsAmount - 1) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = this.currentRadioStation + 1;
        }

    }

    public void setPrevRadioStation() {

        if (this.currentRadioStation == 0) {
            this.currentRadioStation = this.stationsAmount - 1;
        } else {
            this.currentRadioStation = this.currentRadioStation - 1;
        }

    }


    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0 || newCurrentVolume > this.volumeAmount) {
            return;
        }

        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setIncreaseVolume() {

        if (this.currentVolume == this.volumeAmount) {
            this.currentVolume = this.volumeAmount;
        } else {
            this.currentVolume = this.currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {

        if (this.currentVolume == 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = this.currentVolume - 1;
        }

    }
}


