package state;

// ConcreteState
public class OnState implements LightSwitchState {

    @Override
    public void switchOn() {
        System.out.println("이미 켜져 있습니다.");
    }

    @Override
    public void switchOff() {
        System.out.println("스위치를 끕니다.");
        LightSwitch.setSwitchState(new OffState());
    }
}
