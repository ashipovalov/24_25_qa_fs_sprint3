package ru.practicum;


public class SpeedLight {

    public String showLight(int currentSpeed) {

        if (currentSpeed < 60) {
            System.out.println("А это для коммита в Идее");
            System.out.println("Демонстрация решения коммита через merge");
            return "green";
        } else if (currentSpeed < 80) {
            return "yellow";
        } else {
            System.out.println("Коммит в Идее для решения конфликта через ребейз");
            System.out.println("Для решения конфликта через ребейз");
            return "red";
        }
    }
}
