
Console.WriteLine("Введите целое число: ");
int n=Convert.ToInt32(Console.ReadLine());
int z=10;
while (n/z>0)
{
    z=z*10;
}
    if (z<1000)
{
    Console.WriteLine("Третьей цифры нет"); 
    return;
}

int d=n%(z/100);
int result = d/(z/1000);
Console.WriteLine(result);
