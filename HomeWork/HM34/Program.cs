// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу,
//которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(100, 1000);
    }
    return mas;
}
void PrintArray(int[] mmm)
{
    Console.Write("[");
    for (int i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]}, ");
        else
            Console.WriteLine($"{mmm[i]}]");
    }
}
int EvenNum(int[] nums)
{
    int result = 0;
    for (int i = 0; i < nums.Length; i++)
    {
        if (nums[i] % 2 == 0)
        {
            result++;
        }
    }
    return result;
}
int[] array = FillArray(5);
PrintArray(array);
int result = EvenNum(array);
Console.WriteLine($"Кол-во четных чисел в массиве = {result}");
