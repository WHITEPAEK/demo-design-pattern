package memento.game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GameTests {

    @Test
    void game_restore_test() {
        Gamer gamer = new Gamer(100);
        GameMemento memento = gamer.saveGame();
        List<GameMemento> history = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            System.out.println("------------------------");
            System.out.println("--- [" + i + "] Game ---");
            System.out.println("[Before game]\n" + gamer + "\n");

            gamer.bet();

            int gameMoney = gamer.getMoney();
            if (gameMoney > memento.getMoney()) {
                memento = gamer.saveGame();
                System.out.println("Save game");
                history.add(memento);
            } else if (gameMoney < memento.getMoney() / 2) {
                gamer.restoreGame(memento);
                System.out.println("Restore game");
            }

            System.out.println("\n[After game]\n" + gamer);
        }

        System.out.println("\n--- History ---");
        for (int i = 0; i < history.size(); i++) {
            System.out.println("[" + i + "] " + history.get(i));
        }
        System.out.println("--- Game Memento ---");
        System.out.println(memento);
    }

}
