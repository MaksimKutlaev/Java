// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125

string cubeTable(int n)
    {
    string result = $"{n} -> 1";

    for (int i = 2; i <= n; i++)
        {
        result = result + $", {Math.Pow(i, 3)}";
        }
    return result;
    }
try
    {
    Console.Write("Введите число ");
    int n = Math.Abs(Convert.ToInt32(Console.ReadLine()));
    Console.WriteLine(cubeTable(n));
    }
catch
    {
    Console.WriteLine("Вводите целочисленное значение");
    }