public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle:");
        int height = 10;

        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
