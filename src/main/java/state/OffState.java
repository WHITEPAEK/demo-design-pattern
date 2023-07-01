package state;

// ConcreteState
public class OffState implements LightSwitchState {

    @Override
    public void switchOn() {
        System.out.println("스위치를 켭니다.");
        LightSwitch.setSwitchState(new OnState());
    }

    @Override
    public void switchOff() {
        System.out.println("이미 꺼져 있습니다.");
    }
}
