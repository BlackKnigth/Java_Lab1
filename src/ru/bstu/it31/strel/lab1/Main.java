package ru.bstu.it31.strel.lab1;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        do{
            System.out.println("Какое задание запустить? 0 для выхода из программы:");
            i = scanner.nextInt();
            switch(i){
                case 1:
                    Functions.checkPositive();
                    break;
                case 2:
                    Functions.toMetr();
                    break;
                case 3:
                    Functions.password();
                    break;
                case 4:
                    Functions.checkNum();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Введите № задания.\n");
                    break;
            }
        }while(i != 0);
        scanner.close();
    }
}
