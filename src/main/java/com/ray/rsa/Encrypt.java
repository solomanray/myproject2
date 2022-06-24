package com.ray.rsa;

import java.math.*;
import java.util.*;

public class Encrypt {
            public static void main(String args[])
            {
                int p, q, e,N;
                Scanner scanner = new Scanner(System.in);

                // The number to be encrypted
                int msg;
                System.out.println("請輸入明文:");
                msg=scanner.nextByte();
                double x;

                // 1st prime number p
                System.out.println("請輸入p:");
                p=scanner.nextByte();

                // 2nd prime number q
                System.out.println("請輸入q:");
                q=scanner.nextByte();
                N = p * q;

                System.out.println("請輸入e(Pub_Key):");
                e=scanner.nextByte();


                x = (Math.pow(msg, e)) % N;
                System.out.println("密文 : " + x);
                System.out.println("N:"+N);
            }
        }
