void Random3in2()
{
    int x = new Random().Next(100,1000);
        int x2 = x/100;
        int x3 = x%10;
        Console.WriteLine($"Сгенерировано случайное число {x} ");
        
        //Console.WriteLine($"{x2}{x3}");
        Console.WriteLine(x2*10+x3);
}
Random3in2();
Random3in2();