// Задача 18: Напишите программу, которая по заданному номеру четверти, показывает диапазон возможных координат точек в этой четверти (x и y).;
// int CheckKoordinat(int chetvert)
//     {
//         if (chetvert==1) Console.WriteLine("Значение лежит в координатах:x>0 ; y>0");
//         else if (chetvert==4) Console.WriteLine("Значение лежит в координатах:x>0 ; y<0");
//         else if (chetvert==3) Console.WriteLine("Значение лежит в координатах:x<0 ; y<0");
//         else if (chetvert==2) Console.WriteLine("Значение лежит в координатах:x<0 ; y>0");
//         else Console.WriteLine("Надо вводить номер четверти от 1 до 4");
//         return chetvert;
//     }
//     try
//     {
//         Console.Write("Введите номер четверти: ");
//         int chetvert = Convert.ToInt32 (Console.ReadLine());
//         int rez = CheckKoordinat(chetvert);
//     }
//     catch
//     {
//         Console.WriteLine("Надо было вводить целые числа");
//    }

string CheckChetvert(int chet)
{
string res;
if (chet == 1) res= "x > 0, y > 0";
else if (chet == 2) res="x < 0, y > 0";
else if (chet == 3) res= "x < 0, y < 0";
else if (chet == 4) res="x > 0, y < 0";
else res = "incorrect number";
return res;
}

try
{
Console.Write ("enter number from 1 to 4 ");
int chet = Convert.ToInt32 (Console.ReadLine());
string rez = CheckChetvert(chet);
Console.WriteLine (rez);
}
catch
{
Console.WriteLine("Надо было вводить именно целые числа");
}

// string whatCoord(int num)
// {
// switch(num)
// {
// case 1:
// {
// return "x > 0, y > 0";
// }
// case 2:
// {
// return "x < 0, y > 0";
// }
// case 3:
// {
// return "x < 0, y < 0";
// }
// case 4:
// {
// return "x > 0, y < 0";
// }
// default:
// {
// return "Нет такой четверти!";
// }
// }
// }
// try {
// Console.WriteLine("Введите номер четверти ");
// int quarter = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine(whatCoord(quarter));
// }
// catch
// {
// Console.WriteLine("Нужно ввести целое число");
// }
