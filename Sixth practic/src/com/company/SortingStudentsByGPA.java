package com.company;

public class SortingStudentsByGPA implements Comparator
{
    public void QuickSort(int[] mass, int low, int high)
    {
        if (mass.length == 0)
        {
            return;
        }

        if (low >= high)
        {
            return;
        }
        
        int middle = low + (high - low) / 2;
        int a = mass[middle];
        
        int i = low, j = high;
        while (i <= j)
        {
            while (mass[i] > a)
            {
                i++;
            }

            while (mass[j] < a)
            {
                j--;
            }

            if (i <= j)
            {
                int temp = mass[i];
                mass[i] = mass[j];
                mass[j] = temp;
                i++;
                j--;
            }

            if (low < j)
            {
                QuickSort(mass, low, j);
            }

            if (high > i)
            {
                QuickSort(mass, i, high);
            }
        }
    }
}
