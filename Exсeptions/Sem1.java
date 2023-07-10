public class Sem1 {

    public static void main(String[] args){
        int[]arr=new int[]{1,2,3,4};
        int res=test(arr);
        if (res==-1){
            System.out.println("Длинна массива меньше необходимого минимума");
        }else {
            System.out.println("Длинна массива:"+res);
        }


    }
    static int test(int[]arr){
        int minSize=4;
        if (arr.length<minSize){
            return -1;
        }
        return arr.length;
    }
}

