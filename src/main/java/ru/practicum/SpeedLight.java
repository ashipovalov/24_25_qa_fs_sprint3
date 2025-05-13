package ru.practicum;


public class SpeedLight {

    public String showLight(int currentSpeed) {

        if (currentSpeed < 60) {
            System.out.println("Демонстрация решения коммита через merge");
            return "green";
        } else if (currentSpeed < 80) {
            return "yellow";
        } else {
            return "red";
        }
    }
}
