// Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

double[] FillArray(int size)
{
    double[] mas = new double[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().NextDouble()*100;
    }
    return mas;
}
void PrintArray(double[] mmm)
{
    Console.Write("[");
    for (int i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]:F2}, ");
        else
            Console.WriteLine($"{mmm[i]:F2}]");
    }
}
double DiffMinmax(double[] array)
  {
    
    double max=array[0];
    double min=array[0];
    for(int i=0;i<array.Length;i++)
    {
      if (array[i]>max)
       max=array[i];
      if (array[i]<min)
       min=array[i];
    }
    double diff=max-min;
    return diff;
    
          
}
double[] array = FillArray(4);
PrintArray(array);
double diff = DiffMinmax(array);
Console.WriteLine($"Разница между max и min = {diff:F2}");
