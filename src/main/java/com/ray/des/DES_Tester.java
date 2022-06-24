package com.ray.des;

public class DES_Tester {
    public static void main(String[] args) throws Exception {
        String plaintext = "12345678";
        String key = "AB123456";//(8 Bytes)
        System.out.println("Plaintext："+ plaintext);

        //加密
        byte[] encrypt = Encrypt.encrypt(plaintext.getBytes(), key);
        System.out.println("Encrypting...");
        System.out.println("Ciphertext："+new String(encrypt));

        //解密
        byte[] decrypt = Decrypt.decrypt(encrypt, key);
        System.out.println("Decrypting...");
        System.out.print("Plaintext："+new String(decrypt));


    }
}

