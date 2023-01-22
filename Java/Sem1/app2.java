
import java.util.*;
import java.lang.Math;

public class app2 {
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Введите n = ");
    int n = input.nextInt();

    int[] rawData = new int[n];
    int index = 0;
    while (index < n) {
      rawData[index] = random.nextInt(10);
      index = index + 1;
    }
    index = 0;
    while (index < n) {
      System.out.print(Integer.toString(rawData[index]) + "  ");
      index = index + 1;
    }
  }
}

// дан массив чисел, нужно сформировать новую выборку из только четных чисел
// 1. Уточнять ТЗ
// 2. Декомпозиция

// 2.0 Ввод числа
// 2.1 Создание массива
// 2.2 Заполнение массива
// 2.3 Получение только четных чисел
// 2.4 Печать результата
// 2.5 Получение кол-ва четных чисел

// 3. Алгоритм
// 4. Код
// 5. Тесты
