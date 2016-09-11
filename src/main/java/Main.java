/**
 * Created by @author AlNat on 10.09.2016.
 * Licensed by Apache License, Version 2.0
 */

import java.io.IOException;

/*

    В текстовом файле inp.txt хранится текст, состоящий из русских букв,
    цифр, знаков препинания, пробелов (объем текста не менее 2 кБт). Необходимо
    составить две программы, первая из которых шифрует текст из файла
    inp.txt и записывает результат в файл out1.txt, а вторая расшифровывает
    текст из файла out1.txt и записывает результат в файл out2.txt.

    Вариант 3 - Азбука Морзе

*/

public class Main {

    public static void main (String[] args) throws IOException {

        // Todo - Работа с консолью на прием данных

        // TODO Комментариев добавить!

        RW rw = new RW();

        rw.Crypt ("C:\\Users\\AlNat\\Source\\Studi\\inp.txt","C:\\Users\\AlNat\\Source\\Studi\\out1.txt");

        rw.Decrypt("C:\\Users\\AlNat\\Source\\Studi\\out1.txt","C:\\Users\\AlNat\\Source\\Studi\\out2.txt");

    }



}
