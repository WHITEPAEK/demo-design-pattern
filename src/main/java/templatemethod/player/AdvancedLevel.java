package templatemethod.player;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 할 수 없는 레벨입니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("------------------ Advanced Level ------------------");
    }
}
