// Задайте массив из 12 элементов, заполненный случайными числами из промежутка [-9, 9]. Найдите сумму отрицательных и положительных элементов массива.
// Например, в массиве [3,9,-8,1,0,-7,2,-1,8,-3,-1,6] сумма положительных чисел равна 29, сумма отрицательных равна -20.

int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(-9, 10);
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
int[] FindSums(int[] mmm)
{
    int[] sums = new int[2];
    foreach (int item in mmm)
    {
        if (item > 0)
            sums[1] += item;
        else
            sums[0] += item;
    }
    return sums;
}

int[] array = FillArray(12);
PrintArray(array);
int[] results = FindSums(array);
Console.WriteLine($"Сумма положительныъ элементов массива равна {results[1]}");
Console.WriteLine($"Сумма отрицательных элементов массива равна {results[0]}");
