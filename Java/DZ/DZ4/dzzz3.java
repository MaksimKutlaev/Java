package DZ.DZ4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class dzzz3 {
    // public class FillArea {
        public static void main(String[] args) {
            int[][] area = new int[5][5];
     
            List<Point> filled = new LinkedList<>();
            /*добавляем координаты зараженных областей*/
            filled.add(new Point(1, 4));
            filled.add(new Point(0, 0));
            filled.add(new Point(4, 4));
            init(area, filled);
     
            int step = 1;
            System.out.println("After init: ");
            print(area);
     
            do {
                step++;
                List<Point> lastField = filled;
                filled = new LinkedList<>();
                nextStep(area, lastField, filled, step);
                System.out.println("Step = " + step);
                print(area);
            } while (filled.size() != 0);
            System.out.println("Answer: " + (step - 1));
        }
     
        public static void init(int[][] area, List<Point> filled) {
            for (Point point : filled) {
                area[point.row][point.col] = 1;
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
     
        public static void nextStep(int[][] area, List<Point> lastFilled, List<Point> filled, int step) {
            for (Point point : lastFilled) {
                int row = point.getRow();
                int col = point.getCol();
                if (row > 0 && area[row - 1][col] == 0) {
                    area[row - 1][col] = step;
                    filled.add(new Point(row - 1, col));
                }
                if (col > 0 && area[row][col - 1] == 0) {
                    area[row][col - 1] = step;
                    filled.add(new Point(row, col - 1));
                }
                if (row < area.length - 1 && area[row + 1][col] == 0) {
                    area[row + 1][col] = step;
                    filled.add(new Point(row + 1, col));
                }
                if (col < area[row].length - 1 && area[row][col + 1] == 0) {
                    area[row][col + 1] = step;
                    filled.add(new Point(row, col + 1));
                }
            }
        }
     
        private static class Point {
            private int row;
            private int col;
     
            Point(int row, int col) {
                this.row = row;
                this.col = col;
            }
     
            int getRow() {
                return row;
            }
     
            int getCol() {
                return col;
            }
     
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Point point = (Point) o;
                return row == point.row &&
                        col == point.col;
            }
     
            @Override
            public int hashCode() {
                return Objects.hash(row, col);
            }
     
            @Override
            public String toString() {
                return "Point{" +
                        "row=" + row +
                        ", col=" + col +
                        '}';
            }
        }
    }
    
// }
