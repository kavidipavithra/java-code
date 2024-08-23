public class LightDimCommand implements Command{
    private Light light;
    private int previousLevel;
    private int newlevel;

    public LightDimCommand(Light light,int newlevel) {
        this.light = light;
        this.newlevel = newlevel;
    }

    @Override
    public void execute() {
        previousLevel = light.getBrightness();
        light.dim(newlevel);

    }

    @Override
    public void undo() {
        light.dim(previousLevel);

    }
}
