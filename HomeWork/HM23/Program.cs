// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125

string squareTable(int n)
{
string result = $"{n} -> 1";

for (int i = 2; i <= n; i++)
{
result = result + $", {Math.Pow(i, 2)}";

}

return result;
}

try
{
System.Console.Write("Введите число ");
int n = Math.Abs(Convert.ToInt32(Console.ReadLine()));
System.Console.WriteLine(squareTable(n));


}
catch
{
System.Console.WriteLine("Вводите целочисленное значение");
}