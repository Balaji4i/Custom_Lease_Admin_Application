package fusion.um.view.backing;


import com.bea.common.security.utils.encoders.BASE64Encoder;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class EncryptPassword {
    public EncryptPassword() {
        super();
    }


    public static String getSHA1(String text) throws NoSuchAlgorithmException,
                                                     UnsupportedEncodingException {

        MessageDigest md;
        md = MessageDigest.getInstance("SHA-1");

        byte[] sha1hash = new byte[40];

        md.update(text.getBytes("utf-8"), 0, text.length());
        sha1hash = md.digest();
        return convertToHex(sha1hash);
    }

    public static String convertToHex(byte[] data) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            if (i % 4 == 0 && i != 0)
                buffer.append("");
            int x = (int)data[i];
            if (x < 0)
                x += 256;
            if (x < 16)
                buffer.append("0");
            buffer.append(Integer.toString(x, 16));
        }

        byte[] bytearray = hexStringToByteArray(buffer.toString());
        String base64encoded = new BASE64Encoder().encodeBuffer(bytearray);
        base64encoded = "{SHA-1}" + base64encoded;
        return base64encoded;

    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] =
                    (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i +
                                                                                              1),
                                                                                     16));
        }
        return data;
    }

}
