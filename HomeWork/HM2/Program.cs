Console.Write ( "Ведите число a: " );
//int a=Convert.ToInt32(Console.ReadLine());
string aStr = Console.ReadLine();
int a = Convert.ToInt32(aStr);
Console.Write ( "Ведите число b: " );
int b=Convert.ToInt32(Console.ReadLine());

Console.WriteLine(aStr+b);
//int max=a;

if (a>b)
    {
    Console.WriteLine(a);
    }
else
Console.WriteLine(b);