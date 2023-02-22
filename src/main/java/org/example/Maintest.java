package org.example;

class Maintest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.max_speed = 100;
        car1.name = "hyundai";

        Car car2 = new Car();
        car2.max_speed = 150;
        car2.name = "audi";

        car1.run();
        car2.run();
    }
}
class Car{
    int max_speed;
    String name;

    void run(){
        System.out.println(name + "자동차가" + max_speed + "의 속도로 달립니다.");
    }
}