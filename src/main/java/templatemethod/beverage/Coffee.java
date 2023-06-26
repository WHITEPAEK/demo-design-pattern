package templatemethod.beverage;

public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("커피를 내립니다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가합니다.");
    }

}
