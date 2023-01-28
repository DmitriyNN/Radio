import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation1() { // Тестируем значение фактической станции
        Radio radio = new Radio(50);
        radio.setCurrentStation(34);
        int expected = 34;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverSetStation1() { // Тестируем значение станции за пределами диапазона
        Radio radio = new Radio(50);
        radio.setCurrentStation(65);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation01() { // Тестируем граничное станции = 1
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation02() { // Тестируем граничное станции = 0
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation03() { // Тестируем граничное станции = -1
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation04() { // Тестируем граничное станции = 48
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);
        int expected = 48;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation05() { // Тестируем граничное станции = 49
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLimitStation06() { // Тестируем граничное станции = 50
        Radio radio = new Radio(50);
        radio.setCurrentStation(50);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation1() { // Тестируем переключение на следующую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(42);
        radio.nextStation();
        int expected = 43;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation1() { // Тестируем граничные значения = 0, при переключении на следующую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation2() { // Тестируем граничные значения = 1, при переключении на следующую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation3() { // Тестируем граничные значения = 48, при переключении на следующую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);
        radio.nextStation();
        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation4() { // Тестируем граничные значения = 49, при переключении на следующую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() { // Тестируем переключение на предыдущую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(23);
        radio.prevStation();
        int expected = 22;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation1() { // Тестируем граничные значения = 1, при переключении на предыдущую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation02() { // Тестируем граничные значения = 0, при переключении на предыдущую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation03() { // Тестируем граничные значения = 49, при переключении на предыдущую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        radio.prevStation();
        int expected = 48;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation04() { // Тестируем граничные значения = 48, при переключении на предыдущую станцию
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);
        radio.prevStation();
        int expected = 47;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation() { // Тестируем значение фактической станции
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverSetStation() { // Тестируем значение станции за пределами диапазона
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
    public void shouldNextLimitStation01() { // Тестируем граничные значения = 0, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation02() { // Тестируем граничные значения = 1, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation03() { // Тестируем граничные значения = 8, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextLimitStation04() { // Тестируем граничные значения = 9, при переключении на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation1() { // Тестируем переключение на предыдущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLimitStation01() { // Тестируем граничные значения = 1, при переключении на предыдущую станцию
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
        radio.setCurrentVolume(64);
        int expected = 64;
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
    public void shouldSetVolume4() { // Тестируем граничные значения = 99
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume5() { // Тестируем граничные значения = 100
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume6() { // Тестируем граничные значения = 101
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // Тестируем увеличение звука
        Radio radio = new Radio();
        radio.setCurrentVolume(76);
        radio.increaseVolume();
        int expected = 77;
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
    public void shouldIncreaseLimitVolume3() { // Тестируем граничные значения = 99, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseLimitVolume4() { // Тестируем граничные значения = 100, при увеличении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // Тестируем уменьшение звука
        Radio radio = new Radio();
        radio.setCurrentVolume(87);
        radio.decreaseVolume();
        int expected = 86;
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
        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseLimitVolume4() { // Тестируем граничные значения = 100, при уменьшении звука
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
