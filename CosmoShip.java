import java.util.ArrayList;

/*
Космическая одиссея ч.2
*/

public class CosmoShip {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        /*
        First method
        Human hm1 = (Human) astronauts.get(0);
        pilot(hm1);
        Human hm2 = (Human) astronauts.get(1);
        pilot(hm2);
        Dog dg = (Dog) astronauts.get(2);
        createDirection(dg);
        Cat ct = (Cat) astronauts.get(3);
        research(ct);
         */

        //Second method
        for (Astronaut astronaut : astronauts){
            if (astronaut instanceof Human){
                pilot((Human) astronaut);
            }
            else if (astronaut instanceof Dog){
                createDirection((Dog) astronaut);
            }
            else if (astronaut instanceof Cat){
                research((Cat) astronaut);
            }
        }
    }

    public static void pilot(Human human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
