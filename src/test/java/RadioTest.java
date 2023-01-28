import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void shouldSetStation() { // Тестируем значение фактической станции
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverSetStation1() { // Тестируем значение станции за пределами диапазона
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation1() { // Тестируем граничное станции = 1
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation2() { // Тестируем граничное станции = 0
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation3() { // Тестируем граничное станции = -1
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation4() { // Тестируем граничное станции = 8
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation5() { // Тестируем граничное станции = 9
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation6() { // Тестируем граничное станции = 10
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() { // Тестируем переключение на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation1() { // Тестируем граничные значения = 0, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation2() { // Тестируем граничные значения = 1, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation3() { // Тестируем граничные значения = 8, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation4() { // Тестируем граничные значения = 9, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() { // Тестируем переключение на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation1() { // Тестируем граничные значения = 1, при переключении на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation2() { // Тестируем граничные значения = 0, при переключении на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation3() { // Тестируем граничные значения = 9, при переключении на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation4() { // Тестируем граничные значения = 8, при переключении на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() { // Тестируем фактическую громкость звука
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() { // Тестируем граничные значения = 1
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() { // Тестируем граничные значения = 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume3() { // Тестируем граничные значения = -1
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume4() { // Тестируем граничные значения = 9
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume5() { // Тестируем граничные значения = 10
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume6() { // Тестируем граничные значения = 11
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // Тестируем увеличение звука
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume1() { // Тестируем граничные значения = 1, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume2() { // Тестируем граничные значения = 0, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume3() { // Тестируем граничные значения = 9, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume4() { // Тестируем граничные значения = 10, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // Тестируем уменьшение звука
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume1() { // Тестируем граничные значения = 1, при уменьшении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume2() { // Тестируем граничные значения = 0, при уменьшении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume3() { // Тестируем граничные значения = 9, при уменьшении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume4() { // Тестируем граничные значения = 10, при уменьшении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
