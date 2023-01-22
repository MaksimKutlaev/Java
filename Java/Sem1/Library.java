import java.util.Random;
import java.util.Scanner;

public class Library {
  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  /**
   * Этот метод создаёт массив
   * 
   * @param size размер
   * @return мой массив
   */
  public static int[] createArray(int size) {
    return new int[size];
  }

  // 2.0 Ввод числа
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

}
