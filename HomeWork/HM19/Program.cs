// Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да
void Poliandr()
{
Console.WriteLine("Введите пятизначное число");
int x=Convert.ToInt32(Console.ReadLine());
int x1=x/10000%10;
int x2=x/1000%10;
int x4=x/10%10;
int x5=x%10;
if (x1==x5 && x2==x4)
{
    Console.WriteLine("Является полиандром");
}
else
{
    Console.WriteLine("Не является полиандром");
}
}
Poliandr();