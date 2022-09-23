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
    
for (int i = 0; i < mas.GetLength; i++) (j)
{
    for (int j = 0; j < mas.GetLength; j++)
    {
    
    }
}
}


System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);