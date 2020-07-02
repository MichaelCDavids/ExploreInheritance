package net.inheritance;

public class Vehicle {
    public void start(){
        System.out.println("Car started...");
    }
    public void stop(){
        System.out.println("Car ignition switched off.");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Vroom vroom..!! ");
    }
}

class Bike extends Vehicle{
    public void ride(){
        System.out.println("Riding Bike..");
    }
}

class FancyCar extends Car{
    public void showCase(){
        System.out.println("showcasing fancy car");
    }
}
class SportsCar extends Car{
    public void testDrive(){
        System.out.println("One lap around Killarney race track ");
    }
}

class DirtBike extends Bike{
    public void offRoad(){
        System.out.println("Taking dirtbike off-road");
    }
}

class RoadBike extends Bike{
    public void highSpeed(){
        System.out.println(" Road bike at higher speed");
    }
}
