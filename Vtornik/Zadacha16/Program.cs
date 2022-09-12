void KvadratAB()
{
    Console.Write ("Введите первое целое число ");
    int a = Convert.ToInt32 (Console.ReadLine());
    Console.Write ("Введите второе целое число ");
    int b = Convert.ToInt32 (Console.ReadLine());
    if (a*a==b) Console.WriteLine ($"Число {b} квадрат числа {a}");
    else if (b*b==a) Console.WriteLine ($"Число {a} квадрат числа {b}");
    else Console.WriteLine ("Числа не являются квадратом друг друга");
}

KvadratAB();

//void Square (int num1, int num2)
//{
//if (num1*num1 == num2) Console.WriteLine ($"Число {num2} является квадратом числа {num1} ");
//else if (num2*num2 == num1) Console.WriteLine ($"Число {num1} является квадратом числа {num2} ");
//else Console.WriteLine ($"Числа {num1} и {num2} не являются квадратами друг друга ");
//}

//Console.Write("Введите первое число: ");
//int num1 = int.Parse(Console.ReadLine());
//Console.Write("Введите второе число: ");
//int num2 = int.Parse(Console.ReadLine());

//Square (num1, num2);
