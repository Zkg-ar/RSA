

import java.math.BigInteger;
import java.security.SecureRandom;


public class RSA {
    private final static BigInteger one      = new BigInteger("1");
    private final static SecureRandom random = new SecureRandom();

    private BigInteger e;
    private BigInteger d;
    private BigInteger n;
    private BigInteger p;
    private BigInteger q;

    RSA(int N) {
        p = BigInteger.probablePrime(N, random);
        q = BigInteger.probablePrime(N, random);
        BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

        n   = p.multiply(q);

        e  = BigInteger.probablePrime(N/2, random);    
        d = e.modInverse(phi);
    }

    BigInteger encrypt(BigInteger message) {

        return message.modPow(e, n);
    }

    BigInteger decrypt(BigInteger encrypted) {

        return encrypted.modPow(d, n);
    }

    public static void main(String[] args) {
        int N = 10;
        RSA key = new RSA(N);
        System.out.println(key);


        BigInteger message = new BigInteger(N-1, random);


        BigInteger encrypt = key.encrypt(message);
        BigInteger decrypt = key.decrypt(encrypt);
        System.out.println("сообщение :" + message);
        System.out.println("зашифрованное сообщение : " + encrypt);
        System.out.println("расшифрованное сообщение: " + decrypt);
    }
}


