package com.company;
import java.util.Scanner;
public class Array {
    public int n;
    static public int[] x;

    Array(int n) throws Exception
    {
        if (n < 0) throw new Exception(new String(" Количество элементов <= 0 "));
        this.n = n;
        this.x = new int[this.n];
    }

    public static void bubbleSort(int[] array)
    {
        boolean sorted = false;
        int temp;
        while(!sorted)
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static int binarySearch(int arr[], int elementToSearch)
    {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while(firstIndex <= lastIndex)
        {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch)
            {
                return middleIndex;
            }

            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    void randInput(int min, int max)
    {
        for (int i = 0; i < n; i++)
        {
            x[i] = (int) (Math.random() * ++max) + min;
        }
    }

    void randInputinterval(int min, int max)
    {
        for (int i = 0; i < n; i++)
        {
            x[i] = (int) (Math.random() * max) + min;
        }
    }

    void consolInput()
    {
        java.lang.System.out.println("Введите" + n + "Чисел");
        Scanner in = new Scanner(java.lang.System.in);
        for (int i = 0; i < n; i++)
        {
            x[i] = in.nextInt();
        }
    }
    void consolOuput()
    {
        java.lang.System.out.println("Массив Чисел");
        for (int i = 0; i < n; i++)
        {
            java.lang.System.out.print(" " + x[i]);
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < n - 1 ;i ++ )
        {
            if (Array.x[i] > Array.x[n-1]) k++;
        }
        System.out.println("Количество чисел массива больше последнего числа в массиве: " + k );

        System.out.println("Элементы в обратном порядке");
        for (int i = n - 1; i >= 0; i--)
        {
            System.out.print( " " + x[i]);
        }

        bubbleSort(Array.x);

        System.out.println();
        java.lang.System.out.println("Отсортированный массив: ");
        for (int i = 0; i < n; i++)
        {
            java.lang.System.out.print(" " + x[i]);
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число : ");
        int m = input.nextInt();

        if (binarySearch(Array.x,m) != -1)
        {
            System.out.println("Число: " + m + " входит");
        } else
        {
            System.out.println("Число: " + m + " не входит");
        };

    }

    int findIndexNumber(int a)
    {
        for (int i = 0; i < n; i++)
        {
            if (x[i] == a) return i;
        }
        return -1;
    }


    static void Write()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива : ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив:");

        for (int i = 0; i < size; i++)
        {
            array[i] = input.nextInt();
        }


        System.out.print ("Заполненный массив\n");
        for (int i = 0; i < size; i++)
        {
            System.out.print (" " + array[i]);
        }

        int k = 0;
        for (int i = 0; i <size -1 ;i ++ )
        {
            if (array[i] > array[size-1]) k++;
        }
        System.out.println("\nКоличество чисел массива больше последнего числа в массиве: " + k );

        System.out.println("Элементы в обратном порядке");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print( " " + array[i]);
        }

        bubbleSort(array);
        System.out.println();
        java.lang.System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++)
        {
            java.lang.System.out.print(" " + array[i]);
        }
        System.out.println();

        System.out.println("Введите число : ");
        int m = input.nextInt();

        if (binarySearch(array,m) != -1)
        {
            System.out.println("Число: " + m + " входит");
        } else
        {
            System.out.println("Число: " + m + " не входит");
        };
    }
}