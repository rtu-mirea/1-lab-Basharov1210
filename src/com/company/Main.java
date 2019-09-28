package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        int n,
                num = 0;
        while (num != 3) {
            Scanner in = new Scanner(java.lang.System.in);
            java.lang.System.out.println("\n" + "Как вы хотите ввести массив");
            java.lang.System.out.println("1. Датчиком случайных чисел");
            java.lang.System.out.println("2. Ввод с клавиатуры");
            java.lang.System.out.println("3. Exit");
            java.lang.System.out.println("Выберите объект");
            num = in.nextInt();
            switch (num) {
                case 1:
                    Array1();
                    break;
                case 2:
                    Array.Write();
                    break;
                case 3:

                    return;
            }
        }
    }

    public static void Array1()
    {
        final int min = 0;
        final int max = 20;
        int n = 0;
        Scanner in = new Scanner(java.lang.System.in);
        try {
            java.lang.System.out.println(" Введите количество элементов массива ");
            n = in.nextInt();
            Array array = new Array(n);
            array.randInput(0, 20);
            array.consolOuput();
        } catch (Exception e) {
            java.lang.System.out.println(e.toString());
        }
    }

}



