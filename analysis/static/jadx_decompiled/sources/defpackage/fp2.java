package defpackage;

/* loaded from: classes.dex */
public final class fp2 implements gp2 {
    public final long a;
    public final long b;
    public final String c;

    public fp2(int i, long j, long j2, String str) {
        j = (i & 1) != 0 ? 0L : j;
        j2 = (i & 2) != 0 ? 0L : j2;
        str = (i & 4) != 0 ? null : str;
        this.a = j;
        this.b = j2;
        this.c = str;
    }
}
