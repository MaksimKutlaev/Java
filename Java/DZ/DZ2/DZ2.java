package DZ.DZ2;

import java.io.FileReader;
import java.io.FileWriter;

// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000
public class DZ2 {
    static String readFile(String path) throws Exception{
        FileReader fr=new FileReader(path);
        int c;
        String num="";
        while ((c=fr.read())!=-1) {
            char ch=(char)c;
            num +=ch;
        } 
        fr.close();
        return num;  
    }
     static int[] writeNums(String nums) throws Exception{
        String[] Text=nums.split("\n");
        String[] word = Text[0].split(" ");
        String[] num = Text[1].split(" ");

        int a=0;
        int b=0;
        String s="a";
        if(Text[0].codePointAt(0)==s.codePointAt(0)){
            a=Integer.parseInt(word[1].strip());
            b=Integer.parseInt(num[1].strip());
        }else{
            a=Integer.parseInt(num[1].strip());
            b=Integer.parseInt(word[1].strip());
        }
        int[] numAB={a,b};
        return numAB;
     }

    static void writeFile(String path,String squart) throws Exception{
        FileWriter fw=new FileWriter(path);
        fw.write(squart);
        fw.close();
    }
    public static void main(String[] args) throws Exception{
        String nums= readFile("DZ/DZ2/input.txt");
        int[] Array=writeNums(nums);
        int a=Array[0];
        int b=Array[1];
        double sqr=Math.pow(a, b);
        String result=a+"^"+b+"="+sqr;
        writeFile("DZ/DZ2/output.txt",result);
    }
        
}
