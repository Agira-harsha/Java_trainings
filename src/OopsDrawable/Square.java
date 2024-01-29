package OopsDrawable;

public class Square implements Drawable{
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public void draw() {
            System.out.println("Drawing a square with side length: " + side);
            for (int i = 0; i < side; i++) {
                for (int j = 0; j < side; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

