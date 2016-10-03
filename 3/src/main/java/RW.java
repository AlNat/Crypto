import java.io.IOException;
import java.math.BigInteger;
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

    private RSA rsa;

    private List<String> sourceFile; // Файл с изначальным текстом

    /**
     *  Конструктор - инициализируем массивы под входные файлы
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

        // Очистили файлы
        sourceFile.clear();

        // Читаем
        sourceFile = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        // Конвертим

        // Переводим текст в одну строку
        String sourceText = " ";
        for (String s: sourceFile) {
            sourceText += s;
            sourceText += "\n";
        }

        BigInteger intSourceText = new BigInteger(sourceText.getBytes()); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt( intSourceText ); // Шифруем

        // Пишем
        Files.write(Paths.get(outputFilename), cryptText.toString().getBytes()); // Пишем его в файл

    }


    /**
     * Funtion decrypt text by RSA
     * @param inputFilename to decrypt
     * @param outputFilename where to decrypt
     */
    void Encrypt (String inputFilename, String outputFilename) throws IOException {

        // Читаем
        byte[] b = Files.readAllBytes(Paths.get(inputFilename));
        BigInteger cryptText = new BigInteger(new String(b));

        // Дешифруем
        BigInteger decryptText = rsa.decrypt(cryptText); // Дешифровали текст
        String text = new String(decryptText.toByteArray()); // Привели его из числа к строк

        // Пишем
        sourceFile.clear();
        String[] tmp = text.split("\n");
        Collections.addAll(sourceFile, tmp);
        Files.write(Paths.get(outputFilename), sourceFile);

    }


}
