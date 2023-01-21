package ru.netology;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newСurrentStation) {
        if (newСurrentStation < 0) {
            return;
        }
            if (newСurrentStation > 9) {
                return;
            }
        currentStation = newСurrentStation;

    }
}
