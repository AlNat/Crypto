import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by @author AlNat on 26.09.2016.
 * Licensed by Apache License, Version 2.0
 */
public class RSA {

    private BigInteger n, d, e;

    private int bitlen = 1024;

    /**
     * Create an instance that can encrypt using someone elses public key.
     */
    RSA(BigInteger newn, BigInteger newe) {
        n = newn;
        e = newe;
    }

    /**
     * Create an instance that can both encrypt and decrypt.
     */
    RSA(int bits) {
        bitlen = bits;
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bitlen / 2, 100, r);
        BigInteger q = new BigInteger(bitlen / 2, 100, r);
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q
                .subtract(BigInteger.ONE));
        e = new BigInteger("3");
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
        d = e.modInverse(m);
    }

    /**
     * Encrypt the given plaintext message.
     */
    synchronized String encrypt(String message) {
        return (new BigInteger(message.getBytes())).modPow(e, n).toString();
    }

    /**
     * Encrypt the given plaintext message.
     */
    synchronized BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    /**
     * Decrypt the given ciphertext message.
     */
    synchronized String decrypt(String message) {
        return new String((new BigInteger(message)).modPow(d, n).toByteArray());
    }

    /**
     * Decrypt the given ciphertext message.
     */
    synchronized BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }


    /**
     * Return the modulus.
     */
    synchronized BigInteger getN() {
        return n;
    }

    /**
     * Return the public key.
     */
    synchronized BigInteger getE() {
        return e;
    }


}