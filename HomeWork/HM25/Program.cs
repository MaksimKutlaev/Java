// Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

int MathNums(int a, int b)
    {
    int num=1;
    for(int i=0; i<b; i++)
    num*=a;
    return num;
    
    }

try
    {
    Console.Write ("Введите целое число a = ");
    int a = Convert.ToInt32 (Console.ReadLine());
    Console.Write ("Введите целое число b = ");
    int b = Convert.ToInt32 (Console.ReadLine());
    Console.WriteLine($"{MathNums(a,b)}");
    }
catch (System.Exception)
    {

    Console.WriteLine("Надо было вводить именно целое число!");
    }