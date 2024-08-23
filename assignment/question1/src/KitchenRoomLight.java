public class KitchenRoomLight implements Light{
    private int brightness;
    @Override
    public void on() {
        brightness =100;
        System.out.println("Kitchen room light is ON at full brightness.");

    }

    @Override
    public void off() {
        System.out.println("Kitchen room light is OFF.");

    }

    @Override
    public void dim(int level) {
            brightness = level;
            System.out.println("Kitchen room light is dimmed to " + brightness + "% brightness.");

    }
    public  int getBrightness(){
        return  brightness;
    }
}
