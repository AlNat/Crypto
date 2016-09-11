import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    /**
     *  Конструктор - инициализируем массивы под входные файлы
     */
    RW () {
        readFile = new LinkedList<>();
        writeFile = new LinkedList<>();
    }

    /**
     * Function crypting the UTF-8 text
     * @param inputFilename - file path what to crypt
     * @param outputFilename - file path where crypting
     */
    void Crypt (String inputFilename, String outputFilename) throws IOException {

        // Очистили файлы
        writeFile.clear();
        readFile.clear();
        Morze morze = new Morze();

        // Читаем
        readFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        // Конвертим
        for (String line: readFile) { // Прошли по всем линиям файла

            String out = null;

            for (int t = 0; t < line.length(); t++) { // Прошли по всем сиволам в строке
                out += morze.GetMorze(line.charAt(t)) + "|"; // Получили код оре для кадого символа и добавили разделитель
            }

            Collections.addAll(writeFile, out); // Закинули всю строку с символами морзе и разделителями в файл для записи
        }

        // Пишем
        Files.write(Paths.get(outputFilename), writeFile, Charset.forName("UTF-8"));

    }


    /**
     * Funtion decrypt text
     * @param inputFilename to decrypt
     * @param outputFilename where to decrypt
     */
    void Decrypt (String inputFilename, String outputFilename) throws IOException {

        writeFile.clear();
        readFile.clear();
        Morze morze = new Morze();

        // Читаем
        readFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        // Конвертим
        for (String line: readFile) { // Прошли по всем строкам

            String[] morezes = line.split("\\|"); // Разделеи строку на массив строк через |

            char[] words = new char[morezes.length]; // Массив для символов соотвествующих кодам морзе
            for (int t = 0; t < morezes.length; t++) { // Прошли все коды морзе в строке
                words[t] = morze.GetSymbol(morezes[t]); // Получили символы этих кодов
            }

            Collections.addAll(writeFile, String.valueOf(words) ); // И добавили их в файл для записи
        }

        // Пишем
        Files.write(Paths.get(outputFilename), writeFile, Charset.forName("UTF-8"));

    }


}
