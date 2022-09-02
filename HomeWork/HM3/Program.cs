Console.Write("Ведите число :");
int x=Convert.ToInt32(Console.ReadLine());
if (x==0)
    {   
    Console.WriteLine("Вы ввели ноль");
    } 
else if (x%2 == 0) 
    {
    Console.WriteLine("Число является четным");
    } 
else 
    {
    Console.WriteLine("Число является нечетным");
    }
