package ru.netology.javaqa;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;

    public void next() {
        if (currentStationNumber != 9) {
            currentStationNumber++;
        }
        else {
            currentStationNumber = 0;
        }

    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber--;
        }
        else {
            currentStationNumber = 9;
        }

    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }

        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}