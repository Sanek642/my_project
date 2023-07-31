package ru.ctf.study.multiTable;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    static int GetOrder(int n){
        int count = 0;
        while (n >= 10){
            count += 1;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Введите размер таблицы: ");
        try {
            Scanner in = new Scanner(System.in);
            int num = abs(in.nextInt());

            System.out.printf("Размер таблицы: %d \n", num);
            if (num == 1 || num == 0){
                System.out.printf("%d", num);
            }
            else {
                //Найдем предел циклов
                int maxInt = num + 1;
                // Найдем порядок максимального числа
                int maxTableRes = (num) * (num);
                int n;
                if (num < 4){
                    n = 1;
                }
                else {
                    n = GetOrder(maxTableRes);
                }
                // Строка отступа
                String ots = ("_".repeat(n + 1) + "+").repeat(num - 1);
                int p;
                int result;
                StringBuilder strJ = new StringBuilder();
                for (int i = 1; i < maxInt; i++) {
                    for (int j = 1; j < maxInt; j++) {
                        result = i * j;
                        p = GetOrder(result);
                        if (j != num) {
                            strJ.append(" ".repeat(n - p)).append(result).append("|");
                        } else {
                            strJ.append(" ".repeat(n - p)).append(result);
                        }
                    }
                    if (i == 1) {
                        System.out.printf(" ".repeat(n) + "|" + strJ);
                    } else {
                        p = GetOrder(i);
                        System.out.printf(" ".repeat(n - p - 1) + "%d" + "|" + strJ, i);
                    }
                    strJ = new StringBuilder();
                    System.out.printf("\n%s+%s%s\n", "_".repeat(n), ots, "_".repeat(n + 1));
                }
            }
        }
         catch (Exception ex){
            System.out.println("Ввелите целое число, меньше 2 147 483 647!");
        }
    }
}
