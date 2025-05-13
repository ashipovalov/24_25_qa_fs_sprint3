package ru.practicum.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.practicum.SpeedLight;

public class SpeedLightTest {

    @Test
    public void checkLightGreen() {
        checkLight("green", 59);
    }

    @Test
    public void checkLightYellow() {
        checkLight("yellow", 79);
    }

    @Test
    public void checkLightRed() {
        checkLight("red", 99);

    }


    private static void checkLight(String color, int currentSpeed) {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals(color, speedLight.showLight(currentSpeed));
    }

}
