// Найти сумму всех натуральных чисел от 1 до N. N - задается пользователем.
/*
int SumLoop(int N)
{
int sum = 0;
while (N > 0)
{
sum += N;
N--;
}
return sum;
}

int SumRec(int N)
{
if (N == 0) return 0;
return N + SumRec(N - 1);
}

Console.WriteLine(SumLoop(5));

Console.WriteLine(SumRec(5));
*/
// Задача 63: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от 1 до N.
// N = 5 -> "1, 2, 3, 4, 5"
// N = 6 -> "1, 2, 3, 4, 5, 6"
// string NaturNum(int N)
// {
// if (N == 0) return string.Empty;
// return NaturNum(N - 1)+" " ;Convert.ToString(N);
// }

// Console.WriteLine(NaturNum(5));


// Задача 65: Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N.
// M = 1; N = 5 -> "1, 2, 3, 4, 5"
// M = 4; N = 8 -> "4, 5, 6, 7, 8"
/*
string SumRec(int M, int N)
{
if (N < M) return String.Empty;
if (M == N) return Convert.ToString(M);
return Convert.ToString(M) + " " + SumRec(M + 1, N);
}

Console.WriteLine(SumRec(4, 8));
*/

// Задача 67: Напишите программу, которая будет принимать на вход число и возвращать сумму его цифр.
// 453 -> 12
// 45 -> 9
//1123 -> 3+ (112){2+(11)}{1+(1)}1+
/*
int SumNum(int num)
{
    if (num<10) return num;
    return num%10+SumNum(num/10);
}
Console.WriteLine(SumNum(1123));
*/
// Задача 69: Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
// A = 3; B = 5 -> 243 (3⁵)
// A = 2; B = 3 -> 8
// 3,5
//Pow(2,3) 2*(2,2){2*(2,1)}1(2)
int Pow(int A, int B)
{
    if (B == 1)
        return A;
    return A * Pow(A, B - 1);
}
Console.WriteLine(Pow(3, 5));
