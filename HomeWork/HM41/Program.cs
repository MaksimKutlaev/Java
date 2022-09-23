// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

int[] FillArray(string raw)
{
    string[] arrstr = raw.Split(", ");
    int[] arrnum = new int[arrstr.Length];
    for (int i = 0; i < arrstr.Length; i++)
    {
        arrnum[i] = Convert.ToInt32(arrstr[i]);
    }
    return arrnum;
}
void PrintArray(int[] mmm)
{
    Console.Write("[");
    for (int i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]}, ");
        else
            Console.WriteLine($"{mmm[i]}]");
    }
}
int PositiveNum(int[] mass)
{
    int result = 0;
    for (int i = 0; i < mass.Length; i++)
    {
        if (mass[i] > 0)
            result++;
    }
    return result;
}
Console.WriteLine("Введите числа: ");
string raw = Console.ReadLine();
// int[]mass=FillArray(raw);
// PrintArray(mass);
Console.WriteLine($"Чисел болеше нуля {PositiveNum(FillArray(raw))}");