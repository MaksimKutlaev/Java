// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4

int[,] FillMas(int n, int m)
{
    int[,] mas = new int[n, m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            mas[i, j] = new Random().Next(10);
        }
    }

    return mas;
}

void PrintArray(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            if (j != arr.GetLength(1) - 1)
                Console.Write($"{arr[i, j]} ");
            else if (i == arr.GetLength(0) - 1 && j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]}");
            else if (j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]}");
        }
    }
}
int Average(int[,] mas)
{
    int res1 = 0;
    int res2 = 0;
    int res3 = 0;
    int res4 = 0;
    for (int i = 0; i < mas.GetLength; i++)
    {
        for (int j = 0; j < mas.GetLength; j++)
        {
            res1 = mas[0, 0] + mas[1, 0] + mas[2, 0] / 3;
            res2 = mas[0, 1] + mas[1, 1] + mas[2, 1] / 3;
            res3 = mas[0, 2] + mas[1, 2] + mas[2, 2] / 3;
            res4 = mas[0, 3] + mas[1, 3] + mas[2, 3] / 3;
        }
    }
    return res1;
    return res2;
    return res3;
    return res4;
}

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
int average1 = Convert.ToInt32(Console.ReadLine());
int average2 = Convert.ToInt32(Console.ReadLine());
int average3 = Convert.ToInt32(Console.ReadLine());
int average4 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine($"Среднее арифметическое 1 столбца = {Average(average1)}");
