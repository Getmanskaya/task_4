package animal;

public abstract  class Pet {
    public String name;
    public int hunger;

    public void eat(Food food) {
        if (hunger == 0) {
            throw new AnimalCanNoLongerEatException("Животное переело");
        }
        hunger -= food.getSatiety();
    }

    public void eat(int i) {
        hunger--;
        if (hunger == 0) {
            throw new AnimalCanNoLongerEatException("Животное переело");
        }
    }
}