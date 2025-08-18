package defpackage;

/* loaded from: classes.dex */
public abstract class nt0 {
    public static final bdb a;
    public static final ThreadLocal b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        a = zEquals ? tse.a : null;
        b = new ThreadLocal();
    }
}
