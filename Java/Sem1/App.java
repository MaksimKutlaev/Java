import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
// +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд
*/

public class App {
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    int len = getNumberByUser("Введите количество элементов ");
    int[] items = createArray(len);
    fillArray(items, 0, 10);
    System.out.println(print2(items));

    int evenCount = getCountEvenItems(items);
    int[] evenItems = getEvenItems(items, evenCount);
    System.out.println(print2(evenItems));
    System.out.println(Arrays.toString(items));
    System.out.println(Arrays.toString(evenItems));

  }

  // #region
  // 2.0 Ввод числа
  public static int[] createArray(int size) {
    return new int[size];
  }

  public static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }

  // 2.2 Заполнение массива
  public static void fillArray(int[] col, int min, int max) {
    int count = col.length;

    int index = 0;
    while (index < count) {
      col[index] = random.nextInt(min, max);
      index = index + 1;
    }
  }

  // 2.4 Печать результата
  public static String print(int[] data) {
    String output = "";
    int count = data.length;

    int index = 0;
    while (index < count) {
      output += data[index] + " ";
      index = index + 1;
    }
    return output;
  }

  // 2.4 Печать результата
  public static String print2(int[] data) {
    String output = "";
    int count = data.length;

    int index = 0;
    while (index < count) {
      output += data[index] + "><";
      index = index + 1;
    }
    return output;
  }

  // 2.3 Получение только четных чисел
  public static int[] getEvenItems(int[] rawData, int countEvenElements) {
    int count = rawData.length;
    int[] evenItems = createArray(countEvenElements);

    int k = 0;

    for (int i = 0; i < count; i++) {
      if (rawData[i] % 2 == 0) {
        evenItems[k] = rawData[i];
        k++;
      }
    }
    return evenItems;
  }

  // 2.5 Получение кол-ва четных чисел
  static int getCountEvenItems(int[] array) {
    int length = array.length;
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (array[i] % 2 == 0)
        count++;
    }
    return count;
  }
  // #endregion
}

// дан массив чисел, нужно сформировать новую выборку из только четных чисел
// 1. Уточнять ТЗ
// 2. Декомпозиция

// 2.0 Ввод числа
// 2.1 Создание массива
// 2.2 Заполнение массива
// 2.4 Печать результата

// 2.3 Получение только четных чисел
// 2.5 Получение кол-ва четных чисел

// 3. Алгоритм
// 4. Код
// 5. Тесты
