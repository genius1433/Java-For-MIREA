package com.company;

import java.util.Arrays;

public class Main {

    public static void SortIns(int[] mass)
    {
        for (int left = 0; left < mass.length; left++)
        {
            int value = mass[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < mass[i]) {
                    mass[i + 1] = mass[i];
                } else {
                    break;
                }
            }
            mass[i + 1] = value;
        }
    }

    public static void PrintMass(int[] mass)
    {
        for(int i = 0; i < mass.length; i++)
        {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    public static int[] MergeSort(int[] array1) {
        int[] mass1 = Arrays.copyOf(array1, array1.length);
        int[] mass2 = new int[array1.length];
        int[] result = MergeSortInner(mass1, mass2, 0, array1.length);
        return result;
    }

    public static int[] MergeSortInner(int[] mass1, int[] mass2, int startIndex, int endIndex)
    {
        if (startIndex >= endIndex - 1)
        {
            return mass1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = MergeSortInner(mass1, mass2, startIndex, middle);
        int[] sorted2 = MergeSortInner(mass1, mass2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == mass1 ? mass2 : mass1;
        while (index1 < middle && index2 < endIndex)
        {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle)
        {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex)
        {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] mass1 = {4, 2, 40, 7, 100, 88, 43, 23, 74};
        int[] mass2 = {4, 2, 40, 7, 100, 88, 43, 23, 74};
        int[] mass3 = {4, 2, 40, 7, 100, 88, 43, 23, 74};

        SortIns(mass1);
        PrintMass(mass1);

        SortingStudentsByGPA obj2 = new SortingStudentsByGPA();
        obj2.QuickSort(mass2, 0, mass2.length - 1);
        PrintMass(mass2);

        PrintMass(MergeSort(mass3));
    }
}
