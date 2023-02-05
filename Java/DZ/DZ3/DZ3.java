package DZ.DZ3;
//Дана прямоугольная карта размера MxN (N, M меньше 20)
// На карте стоит фигура в точке(Х, Y), которая может ходить на одну клеточку вправо или вниз за один ход
// Посчитать количество маршрутов, которым фигура может попасть в нижнюю правую клетку
//Комбинаторика сочетания n!/r!(n-r)!
public class DZ3 {
    
        public static double getFactorial(double f) {
            if (f <= 1) {
               return 1;
            }
            else {
               return f * getFactorial(f - 1);
            }
          }
        
        static double kombination(double n, double r){
            double res=getFactorial(n)/(getFactorial(r)*getFactorial(n-r));
            return res;
        }

        static int startN(int x, int y, int N, int M){
            int n=(M-1-x)+(N-1-y);
            return n;
        }
        static int startM(int x, int y, int M){
            int r=(M-1-x);
            return r;
        }     
public static void main(String[] args){

        int M=8;
        int N=8;
        int x=0;
        int y=0;
        double start1=startN(x, y, N, M);
        //double d=getFactorial(start1);
        //System.out.println(d);
        //System.out.println(start1);
        double start2=startM(x, y, M);
        //System.out.println(start2);
        double result=kombination(start1, start2);
        System.out.println(result);


        




    
    }
}
