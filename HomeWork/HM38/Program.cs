// Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

int[] FillArray(int size)
{
    double[] mas = new double[size];

    for (double i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(-20,49);
    }
    return mas;
}
void PrintArray(double[] mmm)
{
    Console.Write("[");
    for (double i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]}, ");
        else
            Console.WriteLine($"{mmm[i]}]");
    }
}
double Minmax(double[] array)
  {
    
    double max=array[0];
    double min=array[0];
    for(double i=0;i<array.Length;i++)
    {
      if (array[i]>max)
       max=array[i];
      if (array[i]<min)
       min=array[i];
    }
    double diff=max-min;
    return diff;
    
          
  }
//   double Difference (double max, double min);
// double diff=max-min;
//         return diff;


double[] array = FillArray(4);
PrintArray(array);
double diff = Minmax(array);
Console.WriteLine($"Разница между max и min = {diff}");

