import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        empty_string();
    }
    public static void empty_string() {
        boolean flag = true;
        System.out.println("Введите сообщение : ");
        try (Scanner scan = new Scanner(System.in)) {
            while (flag) {
                String text = scan.nextLine();
                if (text == "") {
                    System.out.println("Введите сообщение пожалуйста : ");
                } else {
                    scan.close();
                    flag = false;
                }
            }
        }
    }
}
