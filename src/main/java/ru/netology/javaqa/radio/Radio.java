package ru.netology.javaqa.radio;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToNextStation() {
        int next = currentStation + 1;
        setCurrentStation(next);
    }

    public void setToMaxNextStation() {
        currentStation = 0;
    }

    public void setToPrevStation() {
        int priv = currentStation - 1;
        setCurrentStation(priv);
    }

    public void setToMinPrevStation() {
        currentStation = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
