package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    protected int volume;
    protected int channel;
    protected int maxChannel;

    protected int maxVolume = 100;
    protected int minVolume = 0;

    public Radio() {
        maxChannel = 9;
    }

    public Radio(int channelCount) {
        maxChannel = channelCount - 1;
    }

    protected int getCurrentChannel() {
        return channel;
    }

    protected void setCurrentChannel(int newChannel) {
        if (newChannel > maxChannel) {
            return;
        }
        if (newChannel < 0) {
            return;
        } else {
            channel = newChannel;
        }
    }

    public void increaseVolume() {
        boolean Volume;
        if (volume < maxVolume) {
            volume += 1;
        } else {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume -= 1;
        } else {
            volume = 0;
        }
    }

    public void increaseChannel() {
        if (channel < maxChannel) {
            channel += 1;
        } else {
            channel = 0;
        }
    }

    public void decreaseChannel() {
        if (channel > 0) {
            channel -= 1;
        } else {
            channel = maxChannel;
        }
    }
}