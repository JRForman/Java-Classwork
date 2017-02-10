package com.jrforman;

class Car {
    private boolean engine;
    private int cyclinders;
    private String name;
    private int wheels;

    public Car(int cyclinders, String name) {
        this.cyclinders = cyclinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public String getName() {
        return name;
    }

    public int getCyclinders() {
        return cyclinders;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

}

class Mustang extends Car{
    public Mustang(int cyclinders, String name) {
        super(cyclinders, name);
    }

    @Override
    public String startEngine() {
        return "Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mustang -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mustang -> brake()";
    }
}

 class Fusion extends Car{
    public Fusion(int cyclinders, String name) {
        super(cyclinders, name);
    }

    @Override
    public String startEngine() {
        return "Fusion -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Fusion -> accelerate()";
    }

    @Override
    public String brake() {
        return "Fusion -> brake()";
    }
}

 class Focus extends Car{
    public Focus(int cyclinders, String name) {
        super(cyclinders, name);
    }


}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mustang mustang = new Mustang(8, "GT");
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());

        Focus focus = new Focus(4, "SE");
        System.out.println(focus.startEngine());
        System.out.println(focus.accelerate());
        System.out.println(focus.brake());

        Fusion Fusion = new Fusion(6, "Hybrid");
        System.out.println(Fusion.startEngine());
        System.out.println(Fusion.accelerate());
        System.out.println(Fusion.brake());
    }


}
