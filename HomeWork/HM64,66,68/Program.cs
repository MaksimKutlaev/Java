// Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1.
// Выполнить с помощью рекурсии.
// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

// string Nnums(int N)
// {
//     if (N == 1)
//         return Convert.ToString(N);
//     return N +" " + Nnums(N - 1);
// }
// Console.WriteLine(Nnums(8));

// Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
// Выполнить с помощью рекурсии.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

// int SumMN(int M, int N)
// {
//     if(M>=N) return M;
//     return M+SumMN(M+1,N);
// }
// Console.WriteLine(SumMN(4,8));

// **Задача 68:** Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29

int Akkerman(int m, int n)
{
    if(m==0) return n+1;
    if(n==0&&m>0) return Akkerman(m-1,1);
    if(n<0&&m>0) return Akkerman(m-1,n);
        else return Akkerman(m-1,Akkerman(m,n-1));
}
Console.WriteLine(Akkerman(2,3));
