import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by @author AlNat on 11.09.2016.
 * Licensed by Apache License, Version 2.0
 */
class RW {
    // Класс для работы с чтением/записью

    private List<String> readFile; // Наш файл с текстом
    private List<String> writeFile; // Файл для записи

    RW () {
        readFile = new LinkedList<>();
        writeFile = new LinkedList<>();
    }

    void Crypt (String inputFilename, String outputFilename) throws IOException {

        writeFile.clear();
        readFile.clear();
        Morze morze = new Morze();

        // Читаем
        readFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        String[] morezes = new String[readFile.toString().length()]; // Массив строковых токенов
        int i = 0;

        // Конвертим
        for (char m: readFile.toString().toCharArray()) { //
            morezes[i] = morze.GetMorze(m);
            morezes[i] += "|";
            i++;
        }
        Collections.addAll( writeFile, Arrays.toString(morezes));

        // Пишем
        Files.write(Paths.get(outputFilename), writeFile, Charset.forName("UTF-8"));


    }


    void Decrypt (String inputFilename, String outputFilename) throws IOException {

        writeFile.clear();
        readFile.clear();
        Morze morze = new Morze();

        // Читаем
        readFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        //TODO Доделать конвертацию

        for (String line: readFile) {

            String[] morezes = line.split("\\|"); // Расрпарсили строки, по правилу через regex

            // Конвертим
            //String i = line.replace("|", "");
            char[] de = new char[morezes.length];
            for (int t = 0; t < morezes.length; t++) {
                //de[t] = String.valueOf(morze.GetSymbol(morezes[t]));
                de[t] = morze.GetSymbol(morezes[t]);
            }

            Collections.addAll(writeFile, String.valueOf(de) ); // Конвертим
        }


        // Пишем
        Files.write(Paths.get(outputFilename), writeFile, Charset.forName("UTF-8"));

    }


}
