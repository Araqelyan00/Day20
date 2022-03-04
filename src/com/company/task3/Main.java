package com.company.task3;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        System.out.println(bird.flyable());
        System.out.println(airplane.flyable());
    }
}
