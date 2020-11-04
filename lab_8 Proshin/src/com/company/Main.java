package com.company;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

   /*     String fileSeparator = System.getProperty("file.separator");

        String absoluteFilePath = "C:" + fileSeparator + "Users" + fileSeparator + "OneDrive" +
                fileSeparator + "Рабочий стол" + fileSeparator + "ВУЗ" + fileSeparator + "Разработка Джава" +
                fileSeparator + "Домашки" + fileSeparator + "lab_8 Proshin" + fileSeparator + "test.txt";



               C:\Users\sumip\OneDrive\Рабочий стол\ВУЗ\Разработка Джава\Домашки\lab_8 Proshin*/

        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println(file.getAbsolutePath() + " Уже создан");
        }
        else {
            System.out.println(file.getAbsolutePath() + " Уже существует");
        }

        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter fileBufferedWriter = new BufferedWriter(fileWriter);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write notes in file : ");
        String filesText = scanner.nextLine();
        fileBufferedWriter.write(filesText);
        fileBufferedWriter.write("\n");
        fileBufferedWriter.flush();

        /*OutputStream os = new FileOutputStream(new File(file.getAbsolutePath()),true);
        String filesText = scanner.nextLine();
        os.write(filesText.getBytes(),0,filesText.length());
        os.close();*/

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

    }
}
