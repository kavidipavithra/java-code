public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle:");
        int radius = 10;
        int diameter = 4* radius;

        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                int x = i - radius;
                int y = j - radius;
                if (x * x + y * y <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
