package ru.bstu.it31.strel.lab1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    static public String Run(int numLine) {
        final Logger Logger = LogManager.getLogger(Ex1.class);

        String line = "";

        try {
            Logger.info("Старт считывания из файла");
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
            Logger.info("Считывание закончено успешно");
        }
        catch (IOException e) {
            Logger.fatal("Ошибка считывания файла");
            e.printStackTrace();
        }
        return line;
    }
}
