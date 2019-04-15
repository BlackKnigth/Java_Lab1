package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Ex3 {
    static public void Run(){
        final Logger Logger = LogManager.getLogger(Ex3.class);
        Logger.info("Старт функции класса Ex3");

        System.out.println("Составить программу, которая запрашивает пароль " +
                "(например, четырехзначное число) до тех пор, пока он не будет " +
                "правильно введен или пока количество попыток не привысит n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("While(0) или For(1)?");
        int Ch = scanner.nextInt();
        int num = 0;
        switch (Ch)
        {
            case 0:
                System.out.println("Введите верный пароль:");

                String WhileCurPass = scanner.next();
                String whilePass;
                do {
                    System.out.println("Введите пароль:");
                    whilePass = scanner.next();
                    if (WhileCurPass.equals((whilePass)))
                        System.out.println("Вы ввели правильный пароль.\n");
                    else
                        System.out.println("Вы ввели неправильный пароль.\n");
                } while (!WhileCurPass.equals(whilePass) && ++num < 3);
                break;

            case 1:
                System.out.println("Введите верный пароль:");

                String forCurPass = scanner.next();
                String forPass;

                for (;num < 3;num++) {
                    System.out.println("Введите пароль:");
                    forPass = scanner.next();
                    if (forCurPass.equals((forPass))) {
                        System.out.println("Вы ввели правильный пароль.\n");
                        break;
                    } else
                        System.out.println("Вы ввели неправильный пароль.\n");
                }
                break;
        }
        if (num == 3)
            System.out.println("Кончилось количество попыток.\n");
        //scanner.close();
    }
}
