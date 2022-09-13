// Напишите программу, которая принимает на вход число (А) и выдаёт сумму чисел от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36

int SummaFor (int N)
    {
    int sum = 0;
    for (int i=1; i<=N; i++) sum+=i;
    return sum;
    }
int SummaWhile (int N)
    {
    int sum = 0;
    int i = 1;
    while (i<=N)
        {
        sum+=i;
        i++;
        }
    return sum;
    }

try
    {
    Console.Write ("Введите целое число ");
    int a = Convert.ToInt32 (Console.ReadLine());
    Console.WriteLine($"Сумма всех натуральных чисел от 1 до {a} через цикл FOR равна {SummaFor(a)}");
    Console.WriteLine($"Сумма всех натуральных чисел от 1 до {a} через цикл WHILE равна {SummaWhile(a)}");

    }
catch (System.Exception)
    {

    Console.WriteLine("Надо было вводить именно целое число!");
    }
