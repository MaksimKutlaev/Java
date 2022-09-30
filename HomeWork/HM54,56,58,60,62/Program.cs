// Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2
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

int[,] SortMaxMin(int[,] arr)
{
    for (int i = 0; i < arr.GetLength(0); i++)
    {
        int m = 0;
        while (m < arr.GetLength(1))
        {
            for (int j = 0; j < arr.GetLength(1) - 1; j++)
            {
                if (arr[i, j] < arr[i, j + 1])
                {
                    int t = arr[i, j + 1];
                    arr[i, j + 1] = arr[i, j];
                    arr[i, j] = t;
                }
            }
            m++;
        }
    }

    return arr;
}

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
int[,] sortArray = SortMaxMin(newArray);
Console.WriteLine();
PrintArray(sortArray);
*/
// Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка
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
int[] MinRow(int[,] array)
{
    int[] mas = new int[array.GetLength(0)];

    for (int i = 0; i < array.GetLength(0); i++)
    {
        int sum = 0;
        for (int j = 0; j < array.GetLength(1); j++)
        {
            sum = sum + array[i, j];
        }
        mas[i] = sum;
    }
    return mas;
}
void Result(int[] arr)
{
    int min = arr[0];
    for (int i = 0; i < arr.Length; i++)
    {
        Console.Write($" {arr[i]}");
        if (min > arr[i])
            min = arr[i];
    }
    for (int i = 0; i < arr.Length; i++)
    {
        if (min == arr[i])
        {
            Console.WriteLine($" Строка с наименьшей суммой элементов: {i}");
            return;
        }
    }
}
System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] newArray = FillMas(n, m);
PrintArray(newArray);
int[] arrRes = MinRow(newArray);
Console.WriteLine();
Result(arrRes);
*/
// Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18

int[,] FillMas(int n, int m)
{
    int[,] mas = new int[n, m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            mas[i, j] = new Random().Next(0, 10);
        }
    }

    return mas;
}
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}
int[,] MatrixPro(int[,] arrFirst, int[,] arrSecond)
{
    int[,] arrMatrix = new int[arrFirst.GetLength(0), arrSecond.GetLength(1)];
    for (int i = 0; i < arrFirst.GetLength(0); i++)
    {
        for (int j = 0; j < arrSecond.GetLength(1); j++)
        {
            for (int k = 0; k < arrFirst.GetLength(1); k++)
            {
                arrMatrix[i, j] += arrFirst[i, k] * arrSecond[k, j];
            }
        }
    }
    return arrMatrix;
}

System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
System.Console.Write("Введите количество столбцов m = ");
int m = Convert.ToInt32(Console.ReadLine());
int[,] ArrayFirst = FillMas(n, m);
int[,] ArraySecond = FillMas(n, m);
PrintArray(ArrayFirst);
Console.WriteLine();
PrintArray(ArraySecond);
int[,] ArrayThird = MatrixPro(ArrayFirst,ArraySecond);
Console.WriteLine();
PrintArray(ArrayThird);



// Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно выводить массив,
//добавляя индексы каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)
/*
int[,,] FillMas(int n)
{
    int[,,] mas = new int[n, n, n];
    int[]tempmas= new int[n*n*n];
    tempmas[0]=new Random().Next(10, 99);
    int tempIndex=0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < n; k++)
            {
                int temp = new Random().Next(10, 99);
                int mark=0;
                while (mark==0)
                {
                    mark=1;
                    for (int m = 0; m < tempmas.Length; m++)
                    {
                        if (temp==tempmas[m])
                        {
                            mark=0;
                            temp = new Random().Next(10, 99);
                            break;
                        }
                    }
                }
                mas[i, j, k] = temp;
                tempmas[tempIndex]=temp;
                tempIndex++;
                
            }
        }
    }

    return mas;
}
void Print3DArray(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(2); k++)
            {
                Console.Write($"{array[i, j, k]} ({i},{j},{k}) ");
            }
            Console.WriteLine();

        }
    }
}
System.Console.Write("Введите количество строк n = ");
int n = Convert.ToInt32(Console.ReadLine());
int[,,] newArray = FillMas(n);
Print3DArray(newArray);

*/
// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07
