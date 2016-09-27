import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        RSA rsa = new RSA(1024);

        String text = "Source text to crypt"; // args[0]
        System.out.println("Исходный текст: " + text);


        BigInteger sourceText = new BigInteger(text.getBytes()); // Привели строку к массиву битов -> одному большому числу
        BigInteger cryptText = rsa.encrypt(sourceText); // Зашифровали текст
        System.out.println("Зашифрованный тест: " + cryptText);


        BigInteger decryptText = rsa.decrypt(cryptText); // Дешифровали текст
        String text2 = new String(decryptText.toByteArray()); // Привели его из числа к строке
        System.out.println("Расшифрованный текст: " + text2);

    }

}