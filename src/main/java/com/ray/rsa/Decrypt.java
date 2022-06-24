package com.ray.rsa;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Decrypt {
    public static void main(String args[])
    {
        int p, q, d, N;
        Scanner scanner = new Scanner(System.in);

        // The number to be encrypted and decrypted
        int msg;
        System.out.println("請輸入密文:");
        msg=scanner.nextByte();
        double y;

        // 1st prime number p
        System.out.println("請輸入p:");
        p=scanner.nextByte();

        // 2nd prime number q
        System.out.println("請輸入q:");
        q=scanner.nextByte();
        N = p * q;

        System.out.println("請輸入d(prKey):");
        d=scanner.nextByte();

        y = (Math.pow(msg, d)) % N;
        System.out.println("明文 : " + y);
        System.out.println("N:"+N);
    }

}


