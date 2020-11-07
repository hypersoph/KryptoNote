package ca.yorku.kryptonote;

import org.junit.Test;

public class CipherTest
{
    @Test
    public void encryptTest() {
        Cipher cipher = new Cipher("1234");
        String strTest = "THIS IS A TEST";
        System.out.println(strTest);

        String encrypted = cipher.encrypt(strTest);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
