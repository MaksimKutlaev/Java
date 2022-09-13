// Напишите программу, которая заполняет и выводит массив из N элементов, 
// N - задается с клавиатуры, заполненный целыми случайными числами от 1 до 99.
int[] RndMassive(int N)
{
    int[] array=new int[N];
    for(int i=0;i<N;i++)
    {
        array[i]=new Random().Next(100);
    }
    return array;
}
try
    {
    System.Console.Write("Введите размер массива = ");
    int a = Convert.ToInt32(Console.ReadLine());
    System.Console.WriteLine(String.Join(",",RndMassive(a)));
    }
catch
    {
    System.Console.WriteLine("Введено не число, или число больше, чем может вместить int");
    }
