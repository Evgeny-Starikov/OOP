import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {


    @Test
    public void shouldGetNumber() {
        Radio number = new Radio(10);

        Assertions.assertEquals(0, number.getMinStationNumber());
        Assertions.assertEquals(9, number.getMaxStationNumber());
        Assertions.assertEquals(0, number.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumber() {
        Radio number = new Radio(10);
        number.setNextStationNumber();
        int expected = 1;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentStationNumber(9);
        number.setNextStationNumber();
        int expected = 0;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStstionNumber() {
        Radio number = new Radio(10);
        number.setCurrentStationNumber(9);
        int expected = 9;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentStationNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentStationNumber(10);
        int expected = 0;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {
        Radio number = new Radio(10);
        number.setCurrentStationNumber(5);
        number.setPrevStationNumber();
        int expected = 4;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberBelowMin() {
        Radio number = new Radio(10);
        number.setCurrentStationNumber(0);
        number.setPrevStationNumber();
        int expected = 9;
        int actual = number.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.setNextVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setNextVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setPrevVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.setPrevVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}