import java.io.IOException;
import java.math.BigInteger;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by @author AlNat on 01.10.2016.
 * Licensed by Apache License, Version 2.0
 */
class RW {

    private RSA rsa;
    private List<String> sourceFile; // Файл с изначальным текстом

    /**
     *  Конструктор - инициализируем массив под входные файлы и сам экземпляр RSA
     */
    RW () {
        sourceFile = new LinkedList<>();
        rsa = new RSA(1024);
    }

    /**
     * Function crypt the text by RSA
     * @param inputFilename - file path what to crypt
     * @param outputFilename - file path where crypting
     */
    void Crypt (String inputFilename, String outputFilename) throws IOException {

        sourceFile.clear(); // Очистили файлы

        // Читаем
        sourceFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл


        // Конвертим

        // Переводим текст в одну строку
        String sourceText = " ";
        for (String s: sourceFile) {
            sourceText += s;
            sourceText += "\n";
        }

        BigInteger intSourceText = new BigInteger(sourceText.getBytes(StandardCharsets.UTF_8)); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt( intSourceText ); // Шифруем


        // Пишем
        Files.write(Paths.get(outputFilename), cryptText.toString().getBytes(StandardCharsets.UTF_8)); // Пишем его в файл
        // Просто так писать BigInteger мы не можем, так что конвертим его в строку, а пишем ее байтовое представление
        // Расшифровка аналогично в обратном порядке

        // Выводим на экран N и E, можем писать в файл, но не принципиально
        System.out.println("N = " + rsa.getN());
        System.out.println("E = " + rsa.getE());

    }


    /**
     * Funtion decrypt text by RSA
     * @param inputFilename to decrypt
     * @param outputFilename where to decrypt
     */
    void Encrypt (String inputFilename, String outputFilename) throws IOException {

        sourceFile.clear(); // Чистим

        // Читаем
        byte[] b = Files.readAllBytes(Paths.get(inputFilename));
        BigInteger cryptText = new BigInteger(new String(b)); // См выше


        // Дешифруем
        BigInteger decryptText = rsa.decrypt(cryptText); // Дешифровали текст
        String text = new String(decryptText.toByteArray()); // Привели его из числа к строк


        // Пишем
        String[] tmp = text.split("\n");
        tmp[0] = tmp[0].substring(1); // Убрали пробел в начале файла
        Collections.addAll(sourceFile, tmp);
        Files.write(Paths.get(outputFilename), sourceFile, StandardCharsets.UTF_8);

    }


}
