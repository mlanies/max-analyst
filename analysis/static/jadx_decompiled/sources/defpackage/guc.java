package defpackage;

/* loaded from: classes.dex */
public abstract class guc {
    public static final boolean a;

    static {
        boolean zEquals = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                zEquals = "true".equals(property);
            }
        } catch (Throwable th) {
            c37.B(th);
        }
        a = zEquals;
    }
}
