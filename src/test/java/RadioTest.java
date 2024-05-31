import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void shouldSetStationNumber1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber3() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber4() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber5() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber6() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberAboveAcceptableValue() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(20);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumberBelowAcceptableValue() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-20);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLevel() {

        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevel1() {

        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevel2() {

        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevel3() {

        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldSetVolumeLevel5() {
//
//        Radio volume = new Radio();
//        volume.setCurrentVolume(-1);
//        int expected = 0;
//        int actual = volume.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//
    //
//    @Test
//    public void shouldSetVolumeLevel6() {
//
//        Radio volume = new Radio();
//        volume.setCurrentVolume(101);
//        int expected = 100;
//        int actual = volume.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }

    //NextStation tests
    @Test
    public void nextStation() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation3() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //PrevStation tests
    @Test
    public void prevStation() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation3() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}