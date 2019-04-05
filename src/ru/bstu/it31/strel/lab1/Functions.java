package ru.bstu.it31.strel.lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Functions {
    static public String ReadFile(int numLine) {
        String line = "";

        try {
            numLine*=2;
            File File = new File("file.txt");
            FileReader Fr = new FileReader(File);
            BufferedReader reader = new BufferedReader(Fr);
            int i = 0;
            
            while (i++ != numLine) {
                line = reader.readLine();
                if(i != numLine)
                    line = "";
            }
            Fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    static public void checkPositive(){
        System.out.println("Задание: Даны три числа, определить является ли сумма каких либо двух из них " +
                "положительным числом.\n");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 3 числа:");
//        int fir = scanner.nextInt();
//        int sec = scanner.nextInt();
//        int thi = scanner.nextInt();
        String Str = ReadFile(1);
        int[] MassInt = new int[3];
        int i  = 0;
        for (String retval : Str.split(" ", 3)) {
            MassInt[i] = Integer.parseInt(retval);
            i++;
        }
        if ((MassInt[0] + MassInt[1]) > 0)
        { System.out.println("Положительная сумма " + MassInt[0] + " + " +
                MassInt[1] +";\n"); }
        else if ((MassInt[1] + MassInt[2]) > 0)
        { System.out.println("Положительная сумма " + MassInt[1] + " + " +
                MassInt[2] +";\n"); }
        else if ((MassInt[2] + MassInt[0]) > 0)
        { System.out.println("Положительная сумма " + MassInt[2] + " + " +
                MassInt[0] +";\n"); }
        else
            System.out.println("Положительная сумма отсутствует.\n");
        //scanner.close();
    }

    static public void toMetr(){
        System.out.println("Задание: Написать программу, которая бы по заданному" +
                "номеру единицы измерения (1 — дециметр, 2 — километр, 3 — метр, " +
                "4 —миллиметр, 5 — сантиметр) и длине отрезка L выдавала бы " +
                "соответствующее значение длины отрезка в метрах.\n");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите единицы измерения (1-4) или 0 для выхода:");
            int Unit = scanner.nextInt();
            if (Unit == 0) { //scanner.close();
                return; }

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

    static public void password(){
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

    static public void checkNum(){
        System.out.println("Задана последовательность из N вещественных чисел. " +
                "Определить, сколько среди них чисел меньших К, равных К и больших К");

        String Str = ReadFile(2);
        String[] MasStr = Str.split(" ", 3);
        int[] MassInt = new int[Integer.parseInt(MasStr[1])]; //
        int i  = 0, Number = Integer.parseInt(MasStr[0]);
        for (String retval : MasStr[2].split(" ")) {
            MassInt[i] = Integer.parseInt(retval);
            i++;
        }
        int equal = 0, more = 0, less = 0;
        for (i = 0; i < Integer.parseInt(MasStr[1]); i++){
            if (MassInt[i] == Number)
                equal++;
            else if (MassInt[i] > Number)
                more++;
            else
                less++;
        }
        System.out.println("Чисел, больших " + Number + " - " + more + ";\n");
        System.out.println("Чисел, меньших " + Number + " - " + less + ";\n");
        System.out.println("Чисел, равных " + Number + " - " + equal + ";\n");
        //scanner.close();
    }
}
