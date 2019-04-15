package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.*;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final Logger Logger = LogManager.getLogger(Main.class);
        Logger.info("Старт приложения");
        int inputNum;

        do {
            System.out.println("Какое задание запустить? 0 для выхода из программы:");
            inputNum = scanner.nextInt();
            Logger.info(("Пользователь ввел " + inputNum));
            switch(inputNum){
                case 1:
                    Ex1.Run();
                    break;
                case 2:
                    Ex2.Run();
                    break;
                case 3:
                    Ex3.Run();
                    break;
                case 4:
                    Ex4.Run();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Введите № задания.\n");
                    break;
            }
        }while(inputNum != 0);
        scanner.close();
        Logger.info("Завешение приложения");
    }
}
