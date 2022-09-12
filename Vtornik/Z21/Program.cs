// Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 2D пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21
//AB=^(xb-xa)^2+(yb-ya)^2
double LengthAB(int xa, int ya, int xb, int yb)
    {
    double res;
    double resx=(xa-xb)*(xa-xb);
    double resy=(ya-yb)*(ya-yb);
    res=Math.Sqrt(resx+resy);
    Console.WriteLine(res);
    return res;
    }
try
    {
    Console.Write("Введите координаты точки ax: ");
    int xa = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки ay: ");
    int ya = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки bx: ");
    int xb = Convert.ToInt32 (Console.ReadLine());
    Console.Write("Введите координаты точки by: ");
    int yb = Convert.ToInt32 (Console.ReadLine());
    Console.WriteLine ($"Расстояние между точками = {LengthAB(xa,ya,xb,yb)}");
    }
catch
{
    Console.WriteLine("Надо вводить целые числа");
}
//  double lengthBetween(int[] firstDot, int[] scndDot, int n)
// {
// (x1 - x2) ^2
// (y1 - y2) ^ 2
// N мерное
// int sumDots = 0;
// for (int i = 0; i < n; i++ )
// {
// sumDots = sumDots + (firstDot[i] - scndDot[i]) * (firstDot[i] - scndDot[i]);
// }
// double res = Math.Sqrt(sumDots);
// return res;
// }

// Console.WriteLine("Введите размерность пространства");
// int n = Convert.ToInt32(Console.ReadLine());
// int[] firstDot = new int[n];
// int[] scndDot = new int[n];
// int i = 0;
// Console.WriteLine("Введите координаты первой точки");
// while (i < n)
// {
// firstDot[i] = Convert.ToInt32(Console.ReadLine());
// i++;
// }
// i = 0;
// Console.WriteLine("Введите координаты второй точки");
// while (i < n)
// {
// scndDot[i] = Convert.ToInt32(Console.ReadLine());
// i++;
// }

// Console.WriteLine($"Расстояние между точками = {lengthBetween(firstDot, scndDot, n)}");
