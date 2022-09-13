// Напишите программу, которая принимает на вход число N и выдаёт произведение чисел от 1 до N.
// 4 -> 24
//5 -> 120

int factorial(int N)
{
int result = 1;

    for (int i = 1; i <= N; i++)
    {
        result = result * i;

    }
    return result;
}
try
    {
    System.Console.Write("Введите число = ");
    int a = Convert.ToInt32(Console.ReadLine());
    System.Console.WriteLine(factorial(a));
    }
catch
    {
    System.Console.WriteLine("Введено не число, или число больше, чем может вместить int");
    }