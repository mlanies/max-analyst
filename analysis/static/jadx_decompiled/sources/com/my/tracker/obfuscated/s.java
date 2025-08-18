package com.my.tracker.obfuscated;

import java.security.MessageDigest;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class s {
    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }
}
