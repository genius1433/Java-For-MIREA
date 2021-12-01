package com.company;

import java.util.Scanner;

import static com.company.Functions.*;

//Номер в списке группы 16.
//Выполнены задачи 16, 17, 1
public class Main
{

    public static void main(String[] args)
    {
        //Шестнадцатое задание(1)
        AmountOfMaxNumber(0, 1);

        //Семнадцатое задание(2)
        System.out.println(MaxInNumbers());

        //Первое задание(3)
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a(количество подлжащих выводу чисел треугольной последовательности: ");
        int a = in.nextInt();
        Triangle(a);
    }
}
