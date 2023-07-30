package ru.ctf.study.multiTable;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.printf("Размер таблицы: %d \n", num);
        //Найдем предел циклов
        int maxInt = num + 1;
        // Найдем порядок максимального числа
        int maxTableRes = (maxInt) * (maxInt);
        int n = GetOrder(maxTableRes) ;
        // Строка отступа
        String ots = ("_".repeat(n+1) + "+").repeat(num-1);
        int p;
        int result;
        StringBuilder strJ = new StringBuilder();
        for (int i = 1; i < maxInt; i++) {
            for (int j = 1; j < maxInt; j++) {
                result = i*j;
                p = GetOrder(result);
                if (j != num){
                    strJ.append(" ".repeat(n - p)).append(result).append("|");
                }
                else {
                    strJ.append(" ".repeat(n - p)).append(result);
                }
            }
            if (i == 1) {
                System.out.printf(" ".repeat(n) + "|" + strJ ) ;
            }
            else {
                p = GetOrder(i);
                System.out.printf(" ".repeat(n-p-1) + "%d" + "|" + strJ, i);
            }
            strJ = new StringBuilder();
            System.out.printf("\n%s+%s%s\n", "_".repeat(n), ots, "_".repeat(n+1));
        }

    }
}
