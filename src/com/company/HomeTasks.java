package com.company;

import java.util.Scanner;

public class HomeTasks {


    public static void main(String[] args) {

        //6.Ввести с консоли n целых чисел. На консоль вывести:
        //6.1. Четные и нечетные числа.
        //6.2. Наибольшее и наименьшее число.
        //6.3. Числа, которые делятся на 3 или на 9.
        //6.4. Числа, которые делятся на 5 и на 7.
        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
        //цифр.
        //6.6. «Счастливые» числа.


        System.out.println("Сколько чисел вы хотите ввести: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int[] myArray = new int[amount];


        for (int i = 0; i < amount; i++) {
            System.out.println("Введите целое число: ");
            myArray[i] = scan.nextInt();

        }
        for (int i = 0; i < amount; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println(myArray[i] + " - четное число; ");
            } else System.out.println(myArray[i] + " - нечетное число; ");
        }
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < myArray[0]) {
                min = myArray[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= myArray[0]) {
                max = myArray[i];
            }

        }
        System.out.println("Максимальное значение: " + max);

        for (int i = 0; i < amount; i++) {
            if (myArray[i] % 3 == 0 || (myArray[i] % 9 == 0)) {
                System.out.println(myArray[i] + " - делится на 3 или на 9; ");
            } else System.out.print("");
        }

        for (int i = 0; i < amount; i++) {
            if (myArray[i] % 5 == 0 && (myArray[i] % 7 == 0)) {
                System.out.println(myArray[i] + " - делится на 5 и на 7; ");
            } else System.out.print("");
        }

        String[] num = new String[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            num[i] = String.valueOf(myArray[i]);
            if (num[i].length() == 3) {
                String numbers = num[i];
                if (numbers.charAt(0) != numbers.charAt(1) && numbers.charAt(0) != numbers.charAt(2) &&
                        numbers.charAt(1) != numbers.charAt(2))
                    System.out.println("Трехзначное число в котором нет одинаковых цифр: " + num[i]);
            }

                if (num[i].length() == 6) {
//                    String firstPart = num.substring(0, 2);
                }
            }



        //5. Ввести целые числа как аргументы командной строки,
        // подсчитать их суммы (произведения) и вывести результат на консоль.
/*        int number1, number2;
        System.out.println("Please enter first number: ");
        Scanner scan1 = new Scanner(System.in);
        number1 = scan1.nextInt();
        System.out.println("Please enter first number: ");
        Scanner scan2 = new Scanner(System.in);
        number2 = scan2.nextInt();
        int sum = number1+number2;
        System.out.println("Summ of numbers = " + sum);
        System.out.println("Product of numbers = " + number1*number2);*/

//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.\

/*        String password = "qwerty";

        String str;
        do {
            System.out.println("Please enter your password: ");
            Scanner scan = new Scanner(System.in);
            str = scan.nextLine();
            if (!str.equals(password))
                System.out.println("Password is incorrect.");
        } while(!str.equals(password));
            System.out.println("Welcome to the system.");*/


        //3. Вывести заданное количество случайных чисел
        // с переходом и без перехода на новую строку.
/*       int a=1;
       int b=2;
       int c=3;
       int d=4;
       int e=5;

      System.out.println(a + "" + b + "" + c + "" + d + "" + e);
       System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);*/


        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

/*        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Argument[" + i + "]: " + args[i]);
        }*/


        // 1. Приветствовать любого пользователя посе ввода им имени в консоль.
/*
        System.out.println("Hi, please enter your name: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Hi, " + str);
*/


    }


}




