import java.util.Arrays;

public class Sem1 {
    //Дан массив чисел, требуется получить новую выборку только чётных чисел
    //1. Уточнить ТЗ
    //2. Декомпазиция
        //2.0 Ввод числа
        //2.1 Создание массива
        //2.2 Заполнение массива
        //2.3 Получение только четных чисел
        //2.4 Печать результата
        //2.5 Получение кол-ва четных чисел
    //3. Алгоритм
    //4. Код
    //5. Тесты
    public static void main(String[] args) {
        int n=10;
        int[]array=GetMass(n);
        System.out.println(Arrays.toString(array));
        int[] EvNum=EvenNum(array);
        System.out.println(Arrays.toString(EvNum));
    }
    static int[] GetMass(int n){
        int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (n+1));
            }
        return array;
    }
    
    static int[] EvenNum(int array[]){
        int j=0;
        int []evenarray=new int[array.length];
        for (int i=0; i<array.length; i++) {
            if (array[i]%2==0){
                    evenarray[j]=array[i];
                    j++;
                }
            }
        return array;
    }
    
}


