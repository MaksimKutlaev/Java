// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53

double LengthAB(int xa, int ya, int za, int xb, int yb, int zb)
    {
    double res;
    double resx=(xa-xb)*(xa-xb);
    double resy=(ya-yb)*(ya-yb);
    double resz=(za-zb)*(za-zb);
    res=Math.Sqrt(resx+resy+resz);
    Console.WriteLine(res);
    return res;
    }
try
    {
    Console.Write("Введите координаты точки ax: ");
    int xa = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки ay: ");
    int ya = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки az: ");
    int za = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки bx: ");
    int xb = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки by: ");
    int yb = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки bz: ");
    int zb = Convert.ToInt32 (Console.ReadLine());
    Console.WriteLine ($"Расстояние между точками = {LengthAB(xa,ya,za,xb,yb,zb)}");
    }
catch
{
    Console.WriteLine("Надо вводить целые числа");
}