package command;

import org.junit.jupiter.api.Test;

class CommandTests {

    @Test
    void tv_command_test() {
        RemoteControl remoteControl = new RemoteControl();
        TV tv = new TV();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }

}
