package templatemethod.player;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("매우 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("매우 높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------------------ Super Level ------------------");
    }
}
