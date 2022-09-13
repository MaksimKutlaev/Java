// Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5

// int SchetNum(int n)
// {
//     int n=0;
//     int i=1;
//     while (i>=0)
//     {
//         i=i/10;
//         i++;
//     }
//     return schet;
// }
// try
// {
//     Console.Write("Введите целое число ");
//     int a=Convert.ToInt32(Console.ReadLine());
//     Console.WriteLine($"Кол-во цифр в числе {a} = {SchetNum(a)}" );
// }
// catch
// {
//     Console.WriteLine("Неправильно ввели");
// }

int Digit (int N)
{

int i = 0;
while (N/((int)Math.Pow((Double)10,i))!=0) i++;
return i;
}
try
{
Console.Write ("Введите целое число ");
int a = Convert.ToInt32 (Console.ReadLine());
Console.WriteLine($"Количество цифр в числе {a} равно {Digit(a)}");
}
catch (System.Exception)
{

Console.WriteLine("Надо было вводить именно целое число!");
}