
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
            Console.Write($"{mmm[i]}, ");
        else
            Console.WriteLine($"{mmm[i]}");
    }
}
string[] ChangeArray(string [] mas)
{
    Random rnd = new Random();
    int size = rnd.Next(1,3);
    Console.WriteLine(size);
    string[] newarr = new string[size];
    for (int i = 0; i < mas.Length; i++)
    {
        int k=size;
        newarr[k] = mas[i];
        k++;
    }
return newarr;
}

string[] array = FillArray(5);
PrstringArray(array);
string [] newarray = ChangeArray(array);
PrstringArray(newarray);

