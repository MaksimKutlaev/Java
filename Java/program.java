
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        System.out.println("Bye world");
        float s=12.3f;
        System.out.println(s);
        double d=12.3;
        System.out.println(d);
        boolean f = true && false;
        System.out.println(f);
        boolean f1 = true ^ false;
        System.out.println(f1);
        var ii=123;
        System.out.println(ii);
        System.out.println(getType(ii));
        System.out.println(Integer.MAX_VALUE);
        String s1="qwer";
        s1.charAt(1);
        int s2=123;
        System.out.println(++s2);
        s2=--s2-s2--;
        System.out.println(s2++);

        System.out.println(s2);
        boolean ff=123!=234;
        System.out.println(ff);
        String ss="qwe1";
        boolean bb=ss.length()>=5 && ss.charAt(4)=='1';
        //boolean bc=ss.length()>=5 & ss.charAt(4)=='1';
        System.out.println(bb);
        int[] arr=new int[10];
        arr[3]=13;
        System.out.println(arr[3]);

        int[][]arrr= new int[2][5];
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arrr[i].length; j++){
                System.out.printf("%d",arrr[i][j]);
            }
            System.out.println();
        }
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("int a: ");
        int x=iScanner.nextInt();
        System.out.printf("double a: ");
        double y=iScanner.nextDouble();
        System.out.printf("%d+%f=%f",x,y,x+y);
        iScanner.close();
        

    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

}
