package net.inheritance;

public class Animal {
    static int animalsAtThePark = 0;

    public Animal(){
        animalsAtThePark++;
    }
    public void drink(){
        System.out.println("Drinking");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void returnHome(){
        animalsAtThePark--;
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Woof! Woof!!");
    }
}

class Husky extends Dog{
    public void sniff(){
        System.out.println("Sniff sniff");
    }
}

class Pitbull extends Dog{
    public void sit(){
        System.out.println("sits and waits patiently... ");
    }
}

class Cat extends Animal{
    public void purr(){
        System.out.println("purr purrr!!");
    }
}

class WildCat extends Cat{
    public void scratch(){
        System.out.println("scratch...");
    }
}

class Lion extends Cat{
    public void roar(){
        System.out.println("ROAR!!!...");
    }
}