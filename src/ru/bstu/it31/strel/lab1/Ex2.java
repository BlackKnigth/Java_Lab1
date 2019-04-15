package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Ex2 {
    static public void Run(){
        final Logger Logger = LogManager.getLogger(Ex2.class);
        Logger.info("Старт функции класса Ex2");

        System.out.println("Задание: Написать программу, которая бы по заданному" +
                "номеру единицы измерения (1 — дециметр, 2 — километр, 3 — метр, " +
                "4 —миллиметр, 5 — сантиметр) и длине отрезка L выдавала бы " +
                "соответствующее значение длины отрезка в метрах.\n");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите единицы измерения (1-4) или 0 для выхода:");
            int Unit = scanner.nextInt();
            if (Unit == 0) {
                scanner.close();
                return;
            }
            System.out.println("Введите длину:");
            int Len = scanner.nextInt();

            switch (Unit) {
                case 1:
                    System.out.println("Длина отрезка в метрах = " + 0.1 * Len + ";\n");
                    break;

                case 2:
                    System.out.println("Длина отрезка в метрах = " + 1000 * Len + ";\n");
                    break;
                case 3:
                    System.out.println("Длина отрезка в метрах = " + Len + ";\n");
                    break;
                case 4:
                    System.out.println("Длина отрезка в метрах = " + 0.001 * Len + ";\n");
                    break;
                default:
                    System.out.println("Введите корректную единицу измерения.\n");
                    break;
            }
        } while(true);
    }
}
