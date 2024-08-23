public class LivingRoomLight implements Light{
    private int brightness;
    @Override
    public void on() {
        brightness = 100;
        System.out.println("Living room light is ON at full brightness.");

    }

    @Override
    public void off() {
        System.out.println("Living room light is OFF.");

    }

    @Override
    public void dim(int level) {
            brightness = level;
            System.out.println("Living room light is dimmed to " + brightness + "% brightness.");
        }



    public int getBrightness(){
    return brightness;
    }
}
