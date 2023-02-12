package DZ.DZ4.New;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DZ4new {
        public static void main(String[] args) {
            int[][] arrayMap = new int[9][10];

            List<Point2D> filled = new LinkedList<>();
            /*добавляем координаты зараженных областей*/
            filled.add(new Point2D(1,1));
            filled.add(new Point2D(1,2));
            filled.add(new Point2D(1,3));
            filled.add(new Point2D(2,3));
            filled.add(new Point2D(3,3));
            filled.add(new Point2D(3,4));
            filled.add(new Point2D(3,5));
            filled.add(new Point2D(4,3));
            filled.add(new Point2D(4,6));
            filled.add(new Point2D(5,3));
            filled.add(new Point2D(5,6));
            filled.add(new Point2D(6,3));
            filled.add(new Point2D(6,6));
            filled.add(new Point2D(7,1));
            filled.add(new Point2D(7,2));
            filled.add(new Point2D(7,3));
            filled.add(new Point2D(7,6));
            filled.add(new Point2D(7,7));
            block(arrayMap, filled);
            List<Point2D> startList = LinkedList<>();
            startList.add(new Point2D(4, 2));
            var c=startPos(arrayMap, filled);
            filled.add(new Point2D(1, 7));
            filled.add(new Point2D(8, 9));
            var end=endPos(arrayMap, filled);
            print(arrayMap);
    }

    public static void block(int[][] area, List<Point2D> filled) {
        for (Point2D point : filled) {
            area[point.x][point.y] = -1;
        }
    }

    public static void startPos(int[][] area, List<Point2D> filled) {
        for (Point2D point : filled) {
            area[point.x][point.y] = 1;
        }
    }
    public static void endPos(int[][] area, List<Point2D> filled) {
        for (Point2D point : filled) {
            area[point.x][point.y] = -2;
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


    private static class Point2D {
        private int x;
        private int y;
 
        Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
        int getX() {
            return x;
        }
 
        int getY() {
            return y;
        }
 
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point2D point = (Point2D) o;
            return x == point.x &&
                    y == point.y;
        }
 
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
 
        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}