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
double[] Average(int[,] mas)
{
    double []res = new double[mas.GetLength(1)];
    
    for (int i = 0; i < mas.GetLength(1); i++)
    {
        double sum=0;
        for (int j = 0; j < mas.GetLength(0); j++)
        {
            sum=sum+mas[j,i];
            
        }
        res[i]=sum/mas.GetLength(0);
    }
    return res;
}

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
double[] average=Average(newArray);
for (int i = 0; i < average.Length; i++)
{
    Console.WriteLine($"Среднее арифметическое {i} столбца = {average[i]:F1}");
}