package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex4 {
    static public void Run(){
        final Logger Logger = LogManager.getLogger(Ex4.class);
        Logger.info("Старт функции класса Ex4");

        System.out.println("Задана последовательность из N вещественных чисел. " +
                "Определить, сколько среди них чисел меньших К, равных К и больших К");

        String Str = ReadFile.Run(2);
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
