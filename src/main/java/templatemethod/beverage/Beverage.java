package templatemethod.beverage;

public abstract class Beverage {

    // Abstract Method: 우려내기
    public abstract void brew();

    // Common: 물 끓이기
    private void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    // Abstract Method: 첨가물 추가
    public abstract void addCondiments();

    // Common: 컵에 따르기
    private void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }

    // Template Method: 음료 만들기
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        System.out.println("음료가 완성되었습니다.");
    }

}
