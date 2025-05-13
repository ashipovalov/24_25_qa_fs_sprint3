package ru.practicum.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.practicum.SpeedLight;

@RunWith(Parameterized.class)
public class SpeedLightTest {

    private final String expectedColour;
    private final int speed;

    public SpeedLightTest(String expectedColour, int speed) {
        this.expectedColour = expectedColour;
        this.speed = speed;
    }

    @Parameterized.Parameters(name = "expected light = {0}, speed = {1}")
    public static Object[] data() {
        return new Object[][]{
                {"green", 59},
                {"yellow", 79},
                {"red", 99},
                {"green", -1}

        };
    }


    @Test
    public void checkLight() {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals(expectedColour, speedLight.showLight(speed));
    }

}
