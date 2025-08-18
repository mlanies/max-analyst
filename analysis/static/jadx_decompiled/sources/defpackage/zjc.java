package defpackage;

/* loaded from: classes.dex */
public final class zjc {
    public static final zjc d = new zjc(0, false, false);
    public static final zjc e = new zjc(500, true, false);
    public static final zjc f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new zjc(100L, true, false);
        f = new zjc(0L, false, true);
    }

    public zjc(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            c54.j("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
