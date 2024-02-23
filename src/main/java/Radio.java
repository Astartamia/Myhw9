public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfRadioStation = 10;

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < numberOfRadioStation) {
            if (newCurrentStation >= 0) {
                currentStation = newCurrentStation;
            }
        }
    }

    public void next() {
        if (currentStation == numberOfRadioStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numberOfRadioStation - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

