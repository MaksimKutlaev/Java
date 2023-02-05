package DZ.DZ4;

import java.util.LinkedList;
import java.util.List;

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
    
    arrayMap [4][2]=1;

    arrayMap [1][7]=-2;
    arrayMap [8][9 .]=-2;
    //System.out.println();
    print(arrayMap);
}

class Point2D {
    public int x,y;
   
}

public static void print(int[][] array) {
    for (int[] row : array) {
        for (int element : row) {
            System.out.format("%3d", element);
        }
        System.out.println();
    }
}

// static void getStep(int x, int y, int array){

//     int step=
// }



}

