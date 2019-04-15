package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex1 {
    static public void Run(){

        final Logger Logger = LogManager.getLogger(Ex1.class);
        Logger.info("Старт функции класса Ex1");

        System.out.println("Задание: Даны три числа, определить является ли сумма каких либо двух из них " +
                "положительным числом.\n");
        try {
            String Str = ReadFile.Run(1);
            int[] MassInt = new int[3];
            int i = 0;
            for (String retval : Str.split(" ", 3)) {
                MassInt[i] = Integer.parseInt(retval);
                i++;
            }
            Logger.info("Считанные из файла значения: " + MassInt[0] + ", " + MassInt[1] + ", " + MassInt[2]);
            if ((MassInt[0] + MassInt[1]) > 0) {
                System.out.println("Положительная сумма " + MassInt[0] + " + " +
                        MassInt[1] + ";\n");
            } else if ((MassInt[1] + MassInt[2]) > 0) {
                System.out.println("Положительная сумма " + MassInt[1] + " + " +
                        MassInt[2] + ";\n");
            } else if ((MassInt[2] + MassInt[0]) > 0) {
                System.out.println("Положительная сумма " + MassInt[2] + " + " +
                        MassInt[0] + ";\n");
            } else
                System.out.println("Положительная сумма отсутствует.\n");
        }
        catch (Exception e) {
            Logger.fatal();
        }
        }
        //scanner.close();
    }
}
