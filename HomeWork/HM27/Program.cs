// Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12

int SummaNum(int N)
{
    int sum=0;
    int i=1;
    while (i>0)
    {
    sum=sum+N%10;
    N=N/10;
    i++;
    }
    return sum;
}

try
    {
    Console.Write ("Введите целое число a = ");
    int a = Convert.ToInt32 (Console.ReadLine());
    Console.WriteLine($"{SummaNum(a)}");
    }
catch (System.Exception)
    {

    Console.WriteLine("Надо было вводить именно целое число!");
    }