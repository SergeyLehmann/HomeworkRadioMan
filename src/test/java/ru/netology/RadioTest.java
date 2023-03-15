package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ShouldIncreaseVolume() {
        Radio increase = new Radio();
        increase.volume = 7;
        increase.increaseVolume();

        int expected = 8;
        int actual = increase.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseChannel() {
        Radio increaseChannel = new Radio();
        increaseChannel.channel = 0;
        increaseChannel.increaseChannel();

        int expected = 1;
        int actual = increaseChannel.channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio decreaseVolume = new Radio();
        decreaseVolume.volume = 1;
        decreaseVolume.decreaseVolume();

        int expected = 0;
        int actual = decreaseVolume.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldStayZeroIfMinimal() {
        Radio Volume = new Radio();
        Volume.volume = 0;
        Volume.decreaseVolume();

        int expected = 0;
        int actual = Volume.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldStayMaximumIfCurrentMax() {
        Radio Volume = new Radio();
        Volume.volume = 10;
        Volume.increaseVolume();

        int expected = 10;
        int actual = Volume.volume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldDecreaseChannel() {
        Radio decreaseChannel = new Radio();
        decreaseChannel.channel = 1;
        decreaseChannel.decreaseChannel();

        int expected = 0;
        int actual = decreaseChannel.channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseChannelIfZero() {
        Radio decreaseChannelifZero = new Radio();
        decreaseChannelifZero.channel = 0;
        decreaseChannelifZero.decreaseChannel();

        int expected = 9;
        int actual = decreaseChannelifZero.channel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCycleChannelIfMax() {
        Radio radio = new Radio();
        radio.channel = 9;
        radio.increaseChannel();

        int expected = 0;
        int actual = radio.channel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.getCurrentChannel();

        int expected = 5;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldStayTheSameIfLessThenZero() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.getCurrentChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldStayYheSameIfMoreThenMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.getCurrentChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
}

