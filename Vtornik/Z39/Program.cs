// Переворот массива
/*
int[] FillArray(int size)
            {
            int[] mas = new int[size];

            for (int i=0;i<size;i++) 
                {
                    mas[i]= new Random().Next(-10,11);
                }
            return mas;
            }
      void PrintArray(int[] mmm)
            {
                       for (int i=0;i<mmm.Length;i++) 
                {
                    if (i!=mmm.Length-1) Console.Write($"{mmm[i]}, ");
                    else Console.WriteLine($"{mmm[i]}");
                }
            }

      int[] Reverse1(int[] mmm)
      {
        int[] revmas = new int [mmm.Length];
        for (int i=0;i<mmm.Length; i++) revmas[i]=mmm[mmm.Length-1-i];
        return revmas;
        
      }
      
      int[] array = FillArray(10);
      PrintArray(array);
      PrintArray(Reverse1(array));
*/
// Задача 40: Напишите программу, которая принимает на вход три числа и проверяет, может ли существовать треугольник с сторонами такой длины.
// Теорема о неравенстве треугольника: каждая сторона треугольника меньше суммы двух других сторон.
// Задача 42: Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3  -> 11
// 2  -> 10
/*
void Treug(int a, int b, int c)
{
    
    if(a<b+c && b<a+c && c<a+b) Console.WriteLine("Треугольник существует");
    else Console.WriteLine("Треугольника такого нет");
}
Console.WriteLine("Введите три числа ");
int a=Convert.ToInt32 (Console.ReadLine());
int b=Convert.ToInt32 (Console.ReadLine());
int c=Convert.ToInt32 (Console.ReadLine());
Treug(a,b,c);
*/
// string Triangular (int arg1, int arg2, int arg3)
// {
//     string res = "not a triangular";
//     if (arg1 < arg2+arg3 && arg2 < arg1+arg3 && arg3 < arg1+arg2) res = "it can be a triangular";
//     return res;
// }

// Console.WriteLine ("enter three integers");
// int arg1 = Convert.ToInt32 (Console.ReadLine());
// int arg2 = Convert.ToInt32 (Console.ReadLine());
// int arg3 = Convert.ToInt32 (Console.ReadLine());
// Console.WriteLine (Triangular (arg1, arg2, arg3));


// Задача 42: Напишите программу, которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3  -> 11
// 2  -> 10

string Convert2 (int N)
{
    string result = String.Empty;
    while (N > 0)
        {
            result = N%2+result;
            N = N/2;
        }
    return result;
}

Console.WriteLine ("enter an integer");
int arg1 = Convert.ToInt32 (Console.ReadLine());
Console.WriteLine (Convert2 (arg1));











