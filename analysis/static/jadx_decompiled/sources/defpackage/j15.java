package defpackage;

import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class j15 {
    public static final khe a = new khe(new zf3(25));

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        MessageDigest messageDigest = (MessageDigest) a.getValue();
        if (messageDigest == null) {
            return str;
        }
        messageDigest.update(str.getBytes(a52.a), 0, str.length());
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toLowerCase(Locale.ROOT);
    }
}
