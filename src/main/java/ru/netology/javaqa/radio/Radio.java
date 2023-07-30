package ru.netology.javaqa.radio;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
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
}
