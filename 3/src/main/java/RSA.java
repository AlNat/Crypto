import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by @author AlNat on 26.09.2016.
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
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bits / 2, 100, r);
        BigInteger q = new BigInteger(bits / 2, 100, r);

        // Делаем остальные числа по формулам
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); // Fi от n
        e = new BigInteger("27644437"); // Либо любое другое простое рандомное число
        d = e.modInverse(m);
    }

    /**
     * Шифрует сообщение
     */
    BigInteger encrypt(BigInteger message) {
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