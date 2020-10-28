package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCreate (){

        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getMinStationNumber());
        assertEquals(10, radio.getMaxStationNumber());
        assertEquals(0, radio.getMinSound());
        assertEquals(100, radio.getMaxSound());
        assertEquals(0, radio.getCurrentSound());

    }

    @Test
    public void createRadio (){

        Radio radio = new Radio(3,1,9,2,99,23);


        radio.nextStation();
        assertEquals(9, radio.getStationNumber());

        //Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая
        radio.nextStation();
        assertEquals(0, radio.getStationNumber());
    
    }

    @Test
    public void setCreateRadio (){

        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setMinStationNumber(2);
        radio.setMaxStationNumber(10);
        radio.setMinSound(3);
        radio.setMaxSound(95);
        radio.setCurrentSound(30);

        assertEquals(5, radio.getCurrentStation());
        assertEquals(2, radio.getMinStationNumber());
        assertEquals(10, radio.getMaxStationNumber());
        assertEquals(3, radio.getMinSound());
        assertEquals(95, radio.getMaxSound());
        assertEquals(30, radio.getCurrentSound());

    }
    @Test
    public void variableTestRadio () {

        int station = 3;
        int minStation = 1;
        int maxStation = 11;
        int minSound = 2;
        int maxSound = 95;
        int currentSound = 44;

        Radio radio = new Radio(station,minStation,maxStation,minSound,maxSound,currentSound);

        assertEquals(3, radio.getCurrentStation());
        assertEquals(1, radio.getMinStationNumber());
        assertEquals(11, radio.getMaxStationNumber());
        assertEquals(2, radio.getMinSound());
        assertEquals(95, radio.getMaxSound());
        assertEquals(44, radio.getCurrentSound());


        radio2.setStation(3);
        assertEquals(3, radio2.getStationNumber());

    }
}