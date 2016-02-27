/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.seguridad;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

/**
 *
 * @author davidchacon
 */
public class EncriptadorPropio {

    // 16 byte long secret key!

    private byte[] key = new byte[]{
        1, 2, 3, 4,
        5, 6, 7, 8,
        9, 10, 11, 12,
        13, 14, 15, 16
    };

    public String encrypt(String message) throws Exception {
        Cipher c = Cipher.getInstance("AES");
        SecretKeySpec k = new SecretKeySpec(key, "AES");
        c.init(Cipher.ENCRYPT_MODE, k);
        byte[] encrypted = c.doFinal(message.getBytes("UTF8"));

        return Base64.encode(encrypted).replaceAll("\r\n", "");
    }

    public String decrypt(String encrypted) throws Exception {
        byte[] rawEnc = Base64.decode(encrypted);
        Cipher c = Cipher.getInstance("AES");
        SecretKeySpec k = new SecretKeySpec(key, "AES");
        c.init(Cipher.DECRYPT_MODE, k);
        byte[] raw = c.doFinal(rawEnc);
        return new String(raw, "UTF8");
    }
    
    
    public static void main(String[] args) throws Exception {
        EncriptadorPropio e = new EncriptadorPropio();
        String ecnriptada = e.encrypt("1805");
        System.out.println("Enc "+ecnriptada);
        System.out.println("Des "+e.decrypt("FaUM66hdKPbwOHYvZtRcDA=="));
    }


}
