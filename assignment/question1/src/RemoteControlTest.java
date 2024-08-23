public class RemoteControlTest {
    public static  void main (String[] args){
        RemoteControl remoteControl = new RemoteControl(2);

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();


        LightOnCommand kichenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kichenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kichenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight,30);

        remoteControl.setCommand(0, kichenLightOn, kichenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        kichenLightDim.execute();
        kichenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();


    }
}
