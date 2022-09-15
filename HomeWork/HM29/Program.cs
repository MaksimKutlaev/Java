//  Напишите программу, которая задаёт массив из N элементов и выводит их на экран. N - вводится с клавиатуры. Элементы тоже вводятся с клавиатуры.
// 5
// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 3
// 6, 1, 33 -> [6, 1, 33]

int[] MassiveN(int N)
{
  int[] array=new int[N];
  for(int i=0;i<N;i++)
  {
    Console.Write($"Введите значение элемета {i} = ");
    array[i]=Convert.ToInt32(Console.ReadLine());
    //Console.Write(array[i] +",");
  }
  for(int j=0; j<N; j++)
  {
  Console.Write(array[j] +",");
  }
  return array;
}
try
  {
    Console.Write("Введите размер массива = ");
    int x=Convert.ToInt32(Console.ReadLine());
    Console.WriteLine($"->[{String.Join(",",MassiveN(x))}]");
  }
catch
  {
    Console.WriteLine("Надо было вводить целое число");

  }