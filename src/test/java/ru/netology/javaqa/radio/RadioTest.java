package ru.netology.javaqa.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.setToNextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.setToPrevStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setToMaxNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setToMinPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Volume volume = new Volume();

        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Volume volume = new Volume();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Volume volume = new Volume();

        volume.setCurrentVolume(-10);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(32);

        volume.increaseVolume();

        int expected = 33;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeIf100() {
        Volume volume = new Volume();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeFromBelow0() {
        Volume volume = new Volume();
        volume.setCurrentVolume(-2);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Volume volume = new Volume();
        volume.setCurrentVolume(87);

        volume.decreaseVolume();

        int expected = 86;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIf100() {
        Volume volume = new Volume();
        volume.setCurrentVolume(100);

        volume.decreaseVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeIfAbove100() {
        Volume volume = new Volume();
        volume.setCurrentVolume(101);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
