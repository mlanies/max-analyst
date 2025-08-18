package defpackage;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public abstract class a52 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName(HTTP.UTF_16);
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}
