// Задача 53: Задайте двумерный массив. Напишите программу, которая поменяет местами первую и последнюю строку массива.
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
int[,] ChangeRow(int[,] mas)
{
    int temp=0;
    for (int i = 0; i < mas.GetLength(1); i++)
    {
        temp=mas[0,i];
        mas[0,i]=mas[mas.GetLength(0)-1,i];
        mas[mas.GetLength(0)-1,i]=temp;
        //(arr[0,j],arr[arr.GetLength(0)-1,j]) = (arr[arr.GetLength(0)-1,j],arr[0,j]);
    }
    return mas;
}

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
int[,] array = ChangeRow(newArray);
Console.WriteLine();
PrintArray(array);
*/
// Задача 55: Задайте двумерный массив. Напишите программу, которая заменяет строки на столбцы. В случае, если это невозможно,
// программа должна вывести сообщение для пользователя.

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
int[,] ChangeRowColum(int[,] arr)
{
    int[,] mas = new int[arr.GetLength(0), arr.GetLength(1)];
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        for (int j = 0; j < arr.GetLength(1); j++)
        {
            mas[i, j] = arr[j, i];
        }
    }
    return mas;
}
// int [,] ChangeColRow (int [,] arr)
// {
// if (arr.GetLength (0) != arr.GetLength (1)) Console.WriteLine ("cannot change rows and columns");
// else
// {
// for (int i = 0; i < arr.GetLength (0); i++)
// {
// for (int j = i+1; j < arr.GetLength (1); j++) (arr [i, j] , arr [j, i]) = (arr [j, i] , arr [i, j]);

// }
// }
// return arr;
// }

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
int[,] array = ChangeRowColum(newArray);
Console.WriteLine();
PrintArray(array);

// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07

// int[,] Square(int m)
// {
//     int[,] mas = new int[m, m];
//     for (int i = 0; i < n; i++)
//     {
//         for (int j = 0; j < m; j++)
//         {
//             mas[i, j] = new Random().Next(10);
//         }
//     }

//     return mas;
// }
// void PrintArray(int[,] arr)
// {
//     for (int i = 0; i < arr.GetLength(0); i++)
//     {
//         for (int j = 0; j < arr.GetLength(1); j++)
//         {
//             if (j != arr.GetLength(1) - 1)
//                 Console.Write($"{arr[i, j]}, ");
//             else if (i == arr.GetLength(0) - 1 && j == arr.GetLength(1) - 1)
//                 Console.WriteLine($"{arr[i, j]}");
//             else if (j == arr.GetLength(1) - 1)
//                 Console.WriteLine($"{arr[i, j]},");
//         }
//     }
// }