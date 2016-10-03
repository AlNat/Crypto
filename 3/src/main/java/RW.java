import java.io.IOException;
import java.math.BigInteger;
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
    private BigInteger writeCryptFile; // Файл для записи шифрованного теста

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
        String text = " ";

        for (String s: sourceFile) {
            text += s;
            text += "\n";
        }

        BigInteger sourceText = new BigInteger(text.getBytes()); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt(sourceText); // Зашифровали текст

        // Пишем
        Files.write(Paths.get(outputFilename), cryptText.toString().getBytes());

    }


    /**
     * Funtion decrypt text by RSA
     * @param inputFilename to decrypt
     * @param outputFilename where to decrypt
     */
    void Encrypt (String inputFilename, String outputFilename) throws IOException {

        // Читаем
        byte[] b = Files.readAllBytes(Paths.get(inputFilename));
        writeCryptFile = new BigInteger(new String(b));

        // Дешифруем
        BigInteger decryptText = rsa.decrypt(writeCryptFile); // Дешифровали текст
        String text2 = new String(decryptText.toByteArray()); // Привели его из числа к строк

        // Пишем
        Files.write(Paths.get(outputFilename), text2.getBytes());

    }


}
