package ru.netology.javaqa;

public class Radio {

    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentStationNumber = minStationNumber;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        maxStationNumber = minStationNumber + size - 1;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {

        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void setNextStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber = currentStationNumber + 1;
        } else currentStationNumber = minStationNumber;
    }

    public void setPrevStationNumber() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber = currentStationNumber - 1;
        } else currentStationNumber = maxStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 0;
    }

    public void setPrevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}