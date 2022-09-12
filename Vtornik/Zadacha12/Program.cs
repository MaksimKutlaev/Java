Console.Write ("Введите первое целое число ");
int a = Convert.ToInt32 (Console.ReadLine());
Console.Write ("Введите второе целое число ");
int b = Convert.ToInt32 (Console.ReadLine());
 
    if (a%b==0) Console.WriteLine($"Первое число кратно второму");
    else Console.WriteLine($"Некратно остаток {a%b}");
//void numbers(int num1, int num2)
//{
//if (num1 % num2 == 0) Console.WriteLine("Первое число кратно второму");
//else Console.WriteLine($"Первое число не кратно второму, остаток {num1 % num2}");

//}

//Console.Write("Введите первое число: ");
//int num1 = int.Parse(Console.ReadLine());
//Console.Write("Введите второе число: ");
//int num2 = int.Parse(Console.ReadLine());

//numbers(num1, num2);
//Console.WriteLine();