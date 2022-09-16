// Задача 32: Напишите программу замена элементов массива: положительные элементы замените на соответствующие отрицательные, и наоборот.
// [-4, -8, 8, 2] -> [4, 8, -8, -2]

int[] FillArray(int size)
{
    int[] mas = new int[size];

    for (int i = 0; i < size; i++)
    {
        mas[i] = new Random().Next(-9, 10);
    }
    return mas;
}
// int[] ChangeZ(int[] mas)
// {
//     for (int i = 0; i < mas.Length; i++)
//     {
//         mas[i] *= -1;
//     }
//     return mas;
// }
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
// int[] array = FillArray(4);
// PrintArray(array);
// PrintArray(ChangeZ(array));
// Задача 33: Задайте массив. Напишите программу, которая определяет, присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, 3] -> нет
// -3; массив [6, 7, 19, 345, 3] -> да

int[] arr = FillArray(15);
string FindDigit(int[] array, int findNum){
// int[] result = new int[array.Length];
string result = "Нет";
for (int i = 0; i < array.Length; i++){
if (array[i] == findNum)
result = "Да";
}
return result;
}
PrintArray(arr);
Console.WriteLine(FindDigit(arr, 5));
