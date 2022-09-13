Console.Write ("Введите целое число ");
try
    {
        int x=Convert.ToInt32 (Console.ReadLine());
        Console.WriteLine("Квадрат этого числа равен "+x*x);
        if (x>0)
        {
            Console.WriteLine("Число положительное");
        }
        else if (x<0)  Console.WriteLine("Число отрицательное");
        else Console.WriteLine("Вы ввели ноль"); 
    }
        //выведу все числа от 0 до x
    int i = 0;
        while (i<=x) 
        {
            Console.Write (i+", "); 
            i++; 
        }
catch 
    {
    Console.WriteLine("надо было вводить именно целое число!");
    }   