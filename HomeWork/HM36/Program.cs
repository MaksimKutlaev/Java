// Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0

int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(-20, 21);
    }
    return mas;
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
int OddSum(int[] array)
{

  int sum=0;
  int k=0;
  for(int i=0;i<array.Length;i++)
  {
    if (array[i]%2==0) k=array[i]; sum +=k;
  }
  return sum;
}

int[] array = FillArray(4);
PrintArray(array);
int sum = OddSum(array);
Console.WriteLine($"Сумма элементов нечетных чисел = {sum}");
