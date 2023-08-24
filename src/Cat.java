import java.util.Objects;

abstract class Food {
    static int getSatiety() {
        return 0;
    }
}

class AnimalCanNoLongerEat {

    public static int getFactorial(int hunger) throws AnimalCanNoLongerEatException {

        if (hunger == 0) throw new AnimalCanNoLongerEatException("Животное переело", hunger);

        return hunger;
    }
}


class AnimalCanNoLongerEatException extends Exception {
    private int hunger;
    public int getNumber() {
        return hunger;
    }
    public AnimalCanNoLongerEatException(String message, int hunger) {
        super(message);
    }
}

abstract class Pet {
    String name;
    int hunger;
    void eat(Food food) {
        hunger--;
    }
    void eat(int i) {
        hunger--;
    }

}

// Класс Кэт
public class Cat extends Pet {
    private static int countPet;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        countPet++;
    }

    public static int getCountPet() {
        return countPet;
    }

    public Cat() {
        countPet++;
    }
}

public class Pizza extends Food {
    static int howManyCheese;
    static int howManyMeat;
    public Pizza(int howManyMeat, int howManyCheese) {
        Pizza.howManyMeat = howManyMeat;
        Pizza.howManyCheese = howManyCheese;
        int hunger = 2;
    }

    public static int getSatiety() {
        return hunger;
    }

}