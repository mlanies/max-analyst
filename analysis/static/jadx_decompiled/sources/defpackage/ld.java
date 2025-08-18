package defpackage;

/* loaded from: classes.dex */
public final class ld {
    public static final ld b = new ld();
    public static final int c;
    public static final int d;
    public final ok4 a = new ok4(3);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
