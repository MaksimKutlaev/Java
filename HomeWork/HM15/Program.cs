Console.WriteLine("Введите номер дня недели");
int n=Convert.ToInt32(Console.ReadLine());
if(n<6) 
    {
    Console.WriteLine("Не является выходным");
    }
else if(n>5 && n<8)
    {
    Console.WriteLine("Выходной");
    }
else
    { 
    Console.Write("Неверное число");
    }