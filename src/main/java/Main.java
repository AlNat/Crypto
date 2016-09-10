/**
 * Created by @author AlNat on 10.09.2016.
 * Licensed by Apache License, Version 2.0
 */

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

/*

    В текстовом файле inp.txt хранится текст, состоящий из русских букв,
    цифр, знаков препинания, пробелов (объем текста не менее 2 кБт). Необходимо
    составить две программы, первая из которых шифрует текст из файла
    inp.txt и записывает результат в файл out1.txt, а вторая расшифровывает
    текст из файла out1.txt и записывает результат в файл out2.txt.

    Вариант 3 - Азбука Морзе

*/



public class Main {

    private List<String> file; // Наш файл с екстом

    public static void main (String[] args) throws IOException {

        // Todo - Работа с консолью на прием данных

        Crypt ("C:\\Users\\AlNat\\Source\\Studi\\inp.txt","C:\\Users\\AlNat\\Source\\Studi\\out1.txt");

        Decrypt("C:\\Users\\AlNat\\Source\\Studi\\out1.txt","C:\\Users\\AlNat\\Source\\Studi\\out2.txt");

    }


    private void Crypt (String inputFilename, String outputFilename) throws IOException {

        // Читаем

        file = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        String[] tokensInFile; // Массив строковых токенов
        for (String st: file) {

        }

        // Конвертим


        // Пишем


    }


    private void Decrypt (String inputFilename, String outputFilename)  throws IOException {

        // Читаем

        file = Files.readAllLines(Paths.get(inputFilename), StandardCharsets.UTF_8); // Прочитали весь файл

        String[] tokensInFile; // Массив строковых токенов
        for (String st: file) {
            tokensInFile = st.split("|"); // Расрпарсили строки, по правилу через regex
            // Теперь в tokensInFile лежут куча текстовых токенов для конкретной строки
        }

        // Конвертим


        // Пишем


    }


}
