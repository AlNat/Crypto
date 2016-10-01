import java.io.IOException;

import java.math.BigInteger;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.LinkedList;
import java.util.List;
/**
 * Created by @author AlNat on 11.09.2016.
 * Licensed by Apache License, Version 2.0
 */
class RW {
    // Класс для работы с чтением/записью

    private RSA rsa;

    private List<String> sourceFile; // Файл с изначальным текстом
    private List<BigInteger> writeCryptFile; // Файл для записи шифрованного теста
    private List<String> writeEncryptFile; // Файл для записи расшифрованного текста

    /**
     *  Конструктор - инициализируем массивы под входные файлы
     */
    RW () {
        sourceFile = new LinkedList<>();
        writeCryptFile = new LinkedList<>();
        writeEncryptFile = new LinkedList<>();

        rsa = new RSA(1024);
    }

    /*
        RSA rsa = new RSA(1024);

        String text = "Source text to crypt"; // args[0]
        System.out.println("Исходный текст: " + text);


        BigInteger sourceText = new BigInteger(text.getBytes()); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt(sourceText); // Зашифровали текст
        System.out.println("Зашифрованный тест: " + cryptText);


        BigInteger decryptText = rsa.decrypt(cryptText); // Дешифровали текст
        String text2 = new String(decryptText.toByteArray()); // Привели его из числа к строке
        System.out.println("Расшифрованный текст: " + text2);


     */


    /**
     * Function crypting the UTF-8 text by RSA
     * @param inputFilename - file path what to crypt
     * @param outputFilename - file path where crypting
     */
    void Crypt (String inputFilename, String outputFilename) throws IOException {

        // Очистили файлы
        sourceFile.clear();
        writeCryptFile.clear();

        // Читаем
        sourceFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл
        boolean flag = true;

        // Конвертим
        /*
        for (String line: readFile) { // Прошли по всем линиям файла

            String out = "";

            for (int t = 0; t < line.length(); t++) { // Прошли по всем сиволам в строке
                if (flag) t++;
                out += line.charAt(t)) + "|"; // Получили код оре для кадого символа и добавили разделитель
                flag = false;
            }


            Collections.addAll(sourceFile, out); // Закинули всю строку с символами морзе и разделителями в файл для записи
        }
        */

        // Пишем
        Files.write(Paths.get(outputFilename), writeCryptFile, Charset.forName("UTF-8"));

    }


    /**
     * Funtion decrypt text by RSA
     * @param inputFilename to decrypt
     * @param outputFilename where to decrypt
     */
    void Encrypt (String inputFilename, String outputFilename) throws IOException {

        writeCryptFile.clear();
        writeEncryptFile.clear();

        // Читаем
        writeCryptFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        // Конвертим
        /*
        for (String line: readFile) { // Прошли по всем строкам

            String[] morezes = line.split("\\|"); // Разделеи строку на массив строк через |

            char[] words = new char[morezes.length]; // Массив для символов соотвествующих кодам морзе
            for (int t = 0; t < morezes.length; t++) { // Прошли все коды морзе в строке
                words[t] = morze.GetSymbol(morezes[t]); // Получили символы этих кодов
            }

            Collections.addAll(writeFile, String.valueOf(words) ); // И добавили их в файл для записи
        }
        */

        // Пишем
        Files.write(Paths.get(outputFilename), writeEncryptFile, Charset.forName("UTF-8"));

    }



}
