import java.math.BigInteger;
import java.security.SecureRandom;


/*


 */

/**
 * Created by @author AlNat on 01.10.2016.
 * Licensed by Apache License, Version 2.0
 */
class RSA {

    private BigInteger n, d, e;

    /**
     * Создаем с уже имеющимеся n и e
     */
    RSA(BigInteger N, BigInteger E) {
        n = N;
        e = E;
    }

    /**
     * Создаем числа рандомно
     */
    RSA(int bits) {

        // Создаем p и q рандомно, используя длинну в битах
        SecureRandom r = new SecureRandom(); // Секретный рандом
        BigInteger p = new BigInteger(bits / 2, 100, r); // Длинна - bits/2
        BigInteger q = new BigInteger(bits / 2, 100, r); // r - random

        // Делаем остальные числа по формулам
        n = p.multiply(q); // N = P * Q
        BigInteger fi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); // Fi(n) - функция Эйлера = (p - 1) * (q - 1)
        e = new BigInteger("27644437"); // Либо любое другое простое число
        d = e.modInverse(fi); // D обратно мультипликативно E по Fi(n) =>  D * E = 1 (mod Fi(n))
    }

    /**
     * Шифрует сообщение
     */
    BigInteger encrypt(BigInteger message) {
        // modPow => massage^e mod n
        return message.modPow(e, n);
    }


    /**
     * Расшифровывает сообщение
     */
    BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }


    /**
     * Получение n
     */
    BigInteger getN() {
        return n;
    }

    /**
     * Получение e
     */
    BigInteger getE() {
        return e;
    }


}