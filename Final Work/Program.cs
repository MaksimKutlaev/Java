

string[] FillArray(int size)
{
    string[] mas = new string[size];

    for (int i = 0; i < size; i++)
    {
        Console.WriteLine("Введите строку: ");
        mas[i] = Console.ReadLine();
    }
    return mas;
}

void PrstringArray(string[] mmm)
{
    for (int i = 0; i < mmm.Length; i++)
    {
        if (i != mmm.Length - 1)
            Console.Write($"{mmm[i]} ");
        else
            Console.WriteLine($"{mmm[i]}");
    }
}
string[] ChangeArray(string[] mas)
{
    int j=0;
    string[] newarr = new string[j];
    for (int i = 0; i < mas.Length; i++)
    {
        if (mas[i].Length <= 3)
        {
            Array.Resize(ref newarr, j+1);
            newarr[j] = mas[i];
            j++;
        }
    }
    return newarr;
}

string[] array = FillArray(5);
PrstringArray(array);
string[] newarray = ChangeArray(array);
PrstringArray(newarray);
