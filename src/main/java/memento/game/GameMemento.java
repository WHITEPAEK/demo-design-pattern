package memento.game;

import java.util.ArrayList;
import java.util.List;

public class GameMemento {

    private int money;
    private List<String> fruits;

    public GameMemento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    @Override
    public String toString() {
        return "$" + this.money + " | Fruits: " + fruits;
    }
}
