package DZ.DZ4;

public class Algoritm {
    
    class Point2D {
        int x, y;
    
        public void setX(int x) {
            this.x = x;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    
        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        public int getX() {
            return x;
        }
    
        public int getY() {
            return y;
        }
    
        @Override
        public String toString() {
            return String.format("x: %d  y: %d", x, y);
        }
    
        @Override
        public boolean equals(Object obj) {
            Point2D t = (Point2D) obj;
            return this.x == t.x && this.y == t.y;
        }
    }

   

    public static void print(int[][] area) {
        for (int[] row : area) {
            for (int element : row) {
                System.out.format("%5d", element);
            }
            System.out.println();
        }
    }





}
