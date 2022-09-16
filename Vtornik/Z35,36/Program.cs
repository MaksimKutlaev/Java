// Задача 35: Задайте одномерный массив из 15 случайных чисел от -100 до 100. Найдите количество элементов массива, значения которых лежат в отрезке [10,99].
// Пример для массива из 5, элементов. В своём решении сделайте для 15
// [5, 18, 123, 6, 2] -> 1
// [1, 2, 3, 6, 2] -> 0
// [10, 11, 12, 13, 14] -> 5
int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(-100, 100);
    }
    return mas;
}
void PrintArray(int[] mmm)
{
    for (int i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]}, ");
        else
            Console.WriteLine($"{mmm[i]}");
    }
}

int[] arr = FillArray(15);

PrintArray(arr);
int count = 0;

for (int i = 0; i < arr.Length; i++)
{
    if (arr[i] > 10 && arr[i] < 100)
        count++;
}
Console.WriteLine($"В массиве {count} элементов лежит в отрезке от 10 до 99");



// Задача 37: Найдите произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д. Результат запишите в новом массиве.
// [1 2 3 4 5] -> 5 8 3
// [6 7 3 6] -> 36 21

int[] FillArrayTen(int size)
{
int[] mas = new int[size];

for (int i = 0; i < size; i++)
{
mas[i] = new Random().Next(-10, 11);
}
return mas;
}
int[] pair(int[] mas)
{
int L = Convert.ToInt32(Math.Round(Convert.ToDouble(mas.Length / 2)));

int[] result = new int[L + 1];
for (int i = 0; i < mas.Length / 2; i++)
{

result[i] = mas[i] * mas[mas.Length - 1 - i];

}
result[L - 1] = mas[L];
return result;
}
System.Console.WriteLine("Введите размерность массива");
int size = Convert.ToInt32(Console.ReadLine());
int[] inputTen = FillArrayTen(size);
System.Console.WriteLine(string.Join(",", inputTen));
System.Console.WriteLine(string.Join(",", pair(inputTen)));
