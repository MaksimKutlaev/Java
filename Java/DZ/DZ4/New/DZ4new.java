package DZ.DZ4.New;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class DZ4new {
    public static void main(String[] args) {
    
        var mg = new MapGenerator();
        System.out.println(new MapPrinter().MapGenerator(mg.getMap()));

        var c = new Point2D(4, 2);
        var lee = new WaveAlgorithm(mg.getMap());
        lee.Stepbystep(c);

        System.out.println(new MapPrinter().rawData(mg.getMap()));

        mg.map[c.x][c.y] = -2;
        System.out.println();
        System.out.println();
        System.out.println(new MapPrinter().mapColor(mg.map));
            
    }



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

    class MapGenerator {
        int[][] map;

        public MapGenerator(){
            int [][] map = new int[9][10];

            map [1][1]=-1;
            map [1][2]=-1;
            map [1][3]=-1;
            map [2][4]=-1;
            map [3][3]=-1;
            map [3][4]=-1;
            map [3][5]=-1;
            map [4][3]=-1;
            map [4][6]=-1;
            map [5][3]=-1;
            map [5][6]=-1;
            map [6][3]=-1;
            map [6][6]=-1;
            map [7][1]=-1;
            map [7][2]=-1;
            map [7][3]=-1;
            map [7][6]=-1;
            map [7][7]=-1;

        }
        
        public int[][] getMap() {
            return map;
        }

        public void setCat(Point2D pos) {
            map[pos.x][pos.y] = 1;
        }

        public void setExit(Point2D pos) {
            map[pos.x][pos.y] = -2;
        }
    }

    class MapPrinter{

        public static void print(int[][] area) {
            for (int[] row : area) {
                for (int element : row) {
                    System.out.format("%5d", element);
                }
                System.out.println();
            }
        }
    }

    class WaveAlgorithm{
    int[][] map;

        public WaveAlgorithm(int[][] map) {
            this.map = map;
        }

        public void Stepbystep(Point2D startPoint) {
            Queue<Point2D> queue = new LinkedList<Point2D>();
            queue.add(startPoint);
            map[startPoint.x][startPoint.y] = 1;
    
            while (queue.size() != 0) {
                Point2D p = queue.remove();
    
                if (map[p.x - 1][p.y] == 0) {
                    queue.add(new Point2D(p.x - 1, p.y));
                    map[p.x - 1][p.y] = map[p.x][p.y] + 1;
                }
                if (map[p.x][p.y - 1] == 0) {
                    queue.add(new Point2D(p.x, p.y - 1));
                    map[p.x][p.y - 1] = map[p.x][p.y] + 1;
                }
                if (map[p.x + 1][p.y] == 0) {
                    queue.add(new Point2D(p.x + 1, p.y));
                    map[p.x + 1][p.y] = map[p.x][p.y] + 1;
                }
                if (map[p.x][p.y + 1] == 0) {
                    queue.add(new Point2D(p.x, p.y + 1));
                    map[p.x][p.y + 1] = map[p.x][p.y] + 1;
                }
            }
        }


    }


}