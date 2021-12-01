package com.company;
import java.util.Scanner;


public class Functions
{
        //Шестнадцатое задание
        public static void AmountOfMaxNumber(int max, int countMax)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            int a = in.nextInt();
            if(a != 0)
            {
                if (a > max)
                {
                    AmountOfMaxNumber(a,1);
                }
                else if (a == max)
                {
                    AmountOfMaxNumber(max,++countMax);
                }
                else
                {
                    AmountOfMaxNumber(max, countMax);
                }
            }
            else System.out.println("Amount of MaxNumbers: " + countMax);
        }

        //Семнадцатое задание
        public static int MaxInNumbers()
        {
            java.util.Scanner in = new java.util.Scanner(System.in);
            System.out.println("Введите число: ");
            int a = in.nextInt();
            if (a == 0)
            {
                return 0;
            }
            else
            {
                return Math.max(a, MaxInNumbers());
            }
        }

        //Первое задание
        public static String Triangle(int a)
        {
            int sum = 0;
            int j = 0;
            if (a == 1)
            {
                System.out.print("1");
            }
            else
            {
                for (int i = 1; sum < a; i++)
                {
                    sum += i;
                    j = i;
                }
                // Шаг рекурсии / рекурсивное условие
                System.out.print(Triangle(--a) + " " + j);
            }
            return "";
        }
}
