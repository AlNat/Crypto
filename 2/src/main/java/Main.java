import java.io.IOException;

/*
    2. Составить программу для получения списка простых чисел, не превосходящих
    35 000. Список должен быть помещен в файл prime.txt (Использовать решето Эратосфена).
*/

/**
 * Created by @author AlNat on 10.09.2016.
 * Licensed by Apache License, Version 2.0
 */
public class Main {

    public static void main (String[] args) throws IOException {

        RW rw = new RW();

        String path1 = "C:\\Users\\AlNat\\Source\\Studi\\out1.txt"; //args[0];
        final int size = 40000; // Integer.valueOf(args[1]);

        rw.Calc (path1, size);

    }


}
