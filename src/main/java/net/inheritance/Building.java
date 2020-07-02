package net.inheritance;

public class Building {
    public void details(){
        System.out.println("Details about building");
    }
}

class House extends Building{
    public void buy(){
        System.out.println("Buying house");
    }
}

class Apartment extends Building{
    public void rent(){
        System.out.println("Renting Apartment");
    }
}

class TownHome extends House{
    public void view(){
        System.out.println("view town home");
    }
}
class Villa extends House{
    public void viewVineYard(){
        System.out.println("Viewing vineyard at Villa");
    }
}

class Unit extends Apartment{
    public void useGym(){
        System.out.println("using gym at the apartment");
    }
}

class Complex extends Apartment{
    public void doMaintenance(){
        System.out.println("Doing maintenance on complex");
    }
}
