package ru.netology.javaqa.radio;

// New improved Radio
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int number) {
        maxStation = number - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToNextStation() {
        int next = currentStation + 1;
        if (currentStation < maxStation) {
            setCurrentStation(next);
        } else {
            currentStation = 0;
        }
    }

    public void setToPrevStation() {
        int priv = currentStation - 1;
        if (currentStation > 0) {
            setCurrentStation(priv);
        } else {
            currentStation = 9;
        }
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
