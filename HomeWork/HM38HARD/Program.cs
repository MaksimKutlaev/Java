// Задача HARD STAT необязательная: Задайте массив случайных целых чисел. Найдите максимальный элемент и его индекс,
// минимальный элемент и его индекс, среднее арифметическое всех элементов. Сохранить эту инфу в отдельный массив и вывести на экран с пояснениями.
// Найти медианное значение , возможно придется кое-что для этого дополнительно выполнить.

int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(100);
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
int[] Minmax(int[] mass)
{
    int maxVal = mass[0];
    int maxInd = 0;
    int minVal = mass[0];
    int minInd = 0;
    int average = 0;
    for (int i = 0; i < mass.Length; i++)
    {
        average += mass[i];
        if (mass[i] > maxVal)
        {
            maxVal = mass[i];
            maxInd = i;
        }
        if (mass[i] < minVal)
        {
            minVal = mass[i];
            minInd = i;
        }
    }
    average = average / mass.Length;
    int[] array = new int[5];
    array[0] = maxVal;
    array[1] = maxInd;
    array[2] = minVal;
    array[3] = minInd;
    array[4] = average;
    return array;
}
void BubbleSortArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
        for (int j = 0; j < array.Length - 1; j++)
            if (array[j] > array[j + 1])
            {
                int t = array[j + 1];
                array[j + 1] = array[j];
                array[j] = t;
            }
}
int GetMediana(int[] array)
{
    BubbleSortArray(array);
    PrintArray(array);
    int mediana = 0;
    if (array.Length % 2 == 0)
    {
        int index2 = array.Length / 2;
        int index1 = index2 - 1;
        mediana = (array[index1] + array[index2]) / 2;
    }
    else
    {
        mediana = array[array.Length / 2];
    }
return mediana;
}

int[] array = FillArray(8);
PrintArray(array);
int[] minmxarr = Minmax(array);
PrintArray(minmxarr);
Console.WriteLine( $"Максимальный массив {minmxarr[0]} под индексом {minmxarr[1]}, минимальный массив {minmxarr[2]} под индексом {minmxarr[3]}, среднее арифметическое {minmxarr[4]}");
Console.WriteLine($"Медианное значение = {GetMediana(array)}");
