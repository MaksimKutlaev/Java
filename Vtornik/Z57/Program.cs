// Задача 57: Составить частотный словарь элементов двумерного массива. Частотный словарь содержит информацию о том,
//сколько раз встречается элемент входных данных.
// Timur Islamgulov: Набор данных
// Частотный массив
// { 1, 9, 9, 0, 2, 8, 0, 9 }
// 0 встречается 2 раза
// 1 встречается 1 раз
// 2 встречается 1 раз
// 8 встречается 1 раз
// 9 встречается 3 раза
// 1, 2, 3
// 4, 6, 1
// 2, 1, 6
// 1 встречается 3 раза
// 2 встречается 2 раз
// 3 встречается 1 раз
// 4 встречается 1 раз
// 6 встречается 2 раза
/*
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
                Console.Write($"{arr[i, j]}, ");
            else if (i == arr.GetLength(0) - 1 && j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]}");
            else if (j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]},");
        }
    }
}
void PrintDicArray(int[,] arr)
{
    int[] mas1 = new int[10];
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            // if (arr[i,j] == 0) mas1[0] = mas1[0] +1;
            // if (arr[i,j] == 1) mas1[1] = mas1[1] +1;
            // if (arr[i,j] == 2) mas1[2] = mas1[2] +1;
            // if (arr[i,j] == 3) mas1[3] = mas1[3] +1;
            // if (arr[i,j] == 4) mas1[4] = mas1[4] +1;
            // if (arr[i,j] == 5) mas1[5] = mas1[5] +1;
            // if (arr[i,j] == 6) mas1[6] = mas1[6] +1;
            // if (arr[i,j] == 7) mas1[7] = mas1[7] +1;
            // if (arr[i,j] == 8) mas1[8] = mas1[8] +1;
            // if (arr[i,j] == 9) mas1[9] = mas1[9] +1;
            mas1[arr[i, j]] += 1;
        }
    }
    for (int k = 0; k < mas1.Length; k++)
    {
        if (mas1[k] != 0)
            Console.WriteLine($" {k} встречается {mas1[k]} раз ");
    }
}
int[,] arr = FillMas(3, 4);
PrintArray(arr);
Console.WriteLine();
PrintDicArray(arr);
*/
// Задача 59: Задайте двумерный массив из целых чисел. Напишите программу, которая удалит строку и столбец,
// на пересечении которых расположен наименьший элемент массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Наименьший элемент - 1, на выходе получим
// следующий массив:
// 9 4 2
// 2 2 6
// 3 4 7
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
                Console.Write($"{arr[i, j]}, ");
            else if (i == arr.GetLength(0) - 1 && j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]}");
            else if (j == arr.GetLength(1) - 1)
                Console.WriteLine($"{arr[i, j]},");
        }
    }
}
int[,] DelMin(int[,] array)
{
    
}
