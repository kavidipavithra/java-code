public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle:");
        int width = 10;
        int height = 6;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
