
try
{
    Console.Write ("Введите первое целое число ");
    int a = Convert.ToInt32 (Console.ReadLine());
    Console.Write ("Введите второе целое число ");
    int b = Convert.ToInt32 (Console.ReadLine());
    // Console.WriteLine("Квадрат этого числа равен "+x*x);
    if (a == b*b)
    {
    Console.WriteLine("Первое число является квадратом второго");
    }
    else if (b == a*a)
    {
    Console.WriteLine("Второе число является квадратом первого");
    }
    else
    Console.WriteLine("Числа не являются квадратами друг друга");
    }
catch
{
    Console.WriteLine("Какая то фигня");
}