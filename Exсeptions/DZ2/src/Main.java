import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(input());

    }

    public static float input(){
        float num=0;
        boolean flag = true;
        System.out.println("Введите дробное число: ");
        try (Scanner scan=new Scanner(System.in)){
            while (flag){
                String text=scan.nextLine();
                String[] symbol =text.split("\\.");
                if (symbol.length>2||symbol.length==1||
                !symbol[0].matches("[0-9]+")||!symbol[1].matches("[0-9]+")){
                    System.out.println("Введите корректное значение: ");
                } else {
                    scan.close();
                    flag = false;
                    num=Float.parseFloat(text);
                }
            }
        }
        return num;
    }

}