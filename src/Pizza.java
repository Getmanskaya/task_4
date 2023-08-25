public class Pizza extends Food {
    private final int howManyCheese;
    private final int howManyMeat;

    public Pizza(int howManyMeat, int howManyCheese) {
       this.howManyMeat = howManyMeat;
       this.howManyCheese = howManyCheese;

    }

    public int getSatiety() {
        return howManyMeat * 2 + howManyCheese;
    }
}