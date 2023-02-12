package DZ.DZ4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DZ4 {
    public static void main(String[] args){
    int [][]arrayMap=new int[9][10];

    // List<Point2D> block=new LinkedList<>();
    //    block.add(new Point2D(2,4));

    
        arrayMap [1][1]=-1;
        arrayMap [1][2]=-1;
        arrayMap [1][3]=-1;
        arrayMap [2][4]=-1;
        arrayMap [3][3]=-1;
        arrayMap [3][4]=-1;
        arrayMap [3][5]=-1;
        arrayMap [4][3]=-1;
        arrayMap [4][6]=-1;
        arrayMap [5][3]=-1;
        arrayMap [5][6]=-1;
        arrayMap [6][3]=-1;
        arrayMap [6][6]=-1;
        arrayMap [7][1]=-1;
        arrayMap [7][2]=-1;
        arrayMap [7][3]=-1;
        arrayMap [7][6]=-1;
        arrayMap [7][7]=-1;
        
    }
        public void setStart(Point2D pos){
        var startPos = arrayMap [4][2]=1;
        }
        public void setStart(Point2D pos){
        var finish1 = arrayMap [1][7]=-2;
        var finish2 = arrayMap [8][9]=-2;
        }
        //System.out.println();
        print(arrayMap);
        }

        public int[][] getMap() {
            return map;
        }

        public static void print(int[][] array) {
            for (int[] row : array) {
                for (int element : row) {
                    System.out.format("%3d", element);
                }
                System.out.println();
            }
        }
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

// class Queue{
//     int queueLength=4;
//     int items[] = new int[queueLength];
//     int front = -1;
//     int back = -1;
//     boolean isFull(){
//         if(back == queueLength - 1){
//             return true;
//         } else {
//             return false;
//         }
//   }

// }



class WaveAlgorithm {
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
}


