package state;

// Context
public class LightSwitch {

    private static LightSwitchState switchState;

    public LightSwitch() {
        switchState = new OffState();
    }

    public void switchOn() {
        switchState.switchOn();
    }

    public void switchOff() {
        switchState.switchOff();
    }

    public static void setSwitchState(LightSwitchState state) {
        switchState = state;
    }
}
