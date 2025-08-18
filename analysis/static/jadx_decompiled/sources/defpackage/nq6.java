package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.json.HTTP;

/* loaded from: classes2.dex */
public abstract class nq6 {
    public static final byte[] a;
    public static final byte[] b;

    static {
        Charset charset = a52.a;
        a = HTTP.CRLF.getBytes(charset);
        b = "--".getBytes(charset);
    }

    public static final void a(StringBuilder sb, String str) {
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '\r') {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '\"' || cCharAt2 == '\\' || cCharAt2 == '\r') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt2);
                }
                sb.append('\"');
            }
        }
        sb.append(str);
        sb.append('\"');
    }

    public static final int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            i += cCharAt <= 127 ? 1 : cCharAt <= 2047 ? 2 : 3;
        }
        return i;
    }

    public static final void c(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                outputStream.write(cCharAt);
            } else if (cCharAt <= 2047) {
                outputStream.write((cCharAt >> 6) | 192);
                outputStream.write((cCharAt & '?') | 128);
            } else {
                outputStream.write((cCharAt >> '\f') | 224);
                outputStream.write(((cCharAt >> 6) & 63) | 128);
                outputStream.write((cCharAt & '?') | 128);
            }
        }
    }
}
