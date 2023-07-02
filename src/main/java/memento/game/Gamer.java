package memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits;
    private Random random;

    private static String[] fruitNames = {
            "Apple",
            "grape",
            "Banana",
            "Orange"
    };

    public Gamer(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
        this.random = new Random();
    }

    public int getMoney() {
        return money;
    }

    public String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "Gold";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        switch (dice) {
            case 1 -> {
                money += 100;
                System.out.println("+100 Money");
            }
            case 2 -> {
                money /= 2;
                System.out.println("-" + money + " Money");
            }
            case 6 -> {
                String fruit = getFruit();
                fruits.add(fruit);
                System.out.println("Get " + fruit);
            }
            default -> System.out.println("Next time");
        }
    }

    public GameMemento saveGame() {
        GameMemento memento = new GameMemento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("Gold")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreGame(GameMemento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "$" + this.money + "\nFruits: " + fruits;
    }
}
