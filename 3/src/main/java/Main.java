import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        RW rw = new RW();

        String path1 = "C:\\Users\\AlNat\\Source\\Studi\\inp.txt"; //args[0];
        String path2 = "C:\\Users\\AlNat\\Source\\Studi\\out.txt"; //args[1];
        String path3 = "C:\\Users\\AlNat\\Source\\Studi\\out1.txt"; //args[2];

        try {
            rw.Crypt(path1, path2);
            rw.Encrypt(path2, path3);
        } catch (IOException e) {
            //e.printStackTrace();
        }



        // Пример работы без файлов

        RSA rsa = new RSA(1024);

        String text = "Source text to crypt\n Another text \n Another texts"; // args[0]
        System.out.println("Исходный текст: " + text);

        BigInteger sourceText = new BigInteger(text.getBytes()); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt(sourceText); // Зашифровали текст
        System.out.println("Зашифрованный тест: " + cryptText);


        BigInteger decryptText = rsa.decrypt(cryptText); // Дешифровали текст
        String text2 = new String(decryptText.toByteArray()); // Привели его из числа к строке
        System.out.println("Расшифрованный текст: " + text2);

    }

}