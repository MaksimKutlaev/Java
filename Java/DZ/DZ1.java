package DZ;

import java.util.Scanner;

//+Написать программу вычисления n-ого треугольного числа.
// Формула: Tn=1/2n(n+1), n=1,2,3...
public class DZ1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int n = getNumber("Введите число: ");
        int t = calcTriangle(n);
        System.out.println(t);

    }
        public static int getNumber(String text) {
            System.out.print(text);
            return input.nextInt();
        }

        public static int calcTriangle(int n){
            int t=0;
            t=n*(n+1)/2;
            return t;
        }
    
}