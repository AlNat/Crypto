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
    RSA(BigInteger newn, BigInteger newe) {
        n = newn;
        e = newe;
    }

    /**
     * Создаем числа рандомно
     */
    RSA(int bits) {

        // Создаем p и q рандомно, используя длинну в битах
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bits / 2, 100, r);
        BigInteger q = new BigInteger(bits / 2, 100, r);

        // Делаем остальное по формулам
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e = new BigInteger("3");
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
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