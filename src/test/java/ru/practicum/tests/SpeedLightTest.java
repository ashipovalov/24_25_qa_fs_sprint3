package ru.practicum.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.practicum.SpeedLight;

public class SpeedLightTest {

    @Test
    public void checkLightGreen() {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals("green", speedLight.showLight(59));

    }

    @Test
    public void checkLightYellow() {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals("yellow", speedLight.showLight(79));
    }

    @Test
    public void checkLightRed() {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals("red", speedLight.showLight(99));

    }

}
