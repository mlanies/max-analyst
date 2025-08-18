package defpackage;

/* loaded from: classes.dex */
public final class ec4 {
    public final n64 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;

    public ec4(n64 n64Var, int i, int i2, int i3, int i4) {
        a("bufferForPlaybackMs", i3, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
        a("minBufferMs", i, i3, "bufferForPlaybackMs");
        a("minBufferMs", i, i4, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i2, i, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.a = n64Var;
        this.b = maf.D(i);
        this.c = maf.D(i2);
        this.d = maf.D(i3);
        this.e = maf.D(i4);
        this.f = -1;
        this.j = 13107200;
        this.g = false;
        this.h = maf.D(0);
        this.i = false;
    }

    public static void a(String str, int i, int i2, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        np8.c(sb.toString(), z);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            n64 n64Var = this.a;
            synchronized (n64Var) {
                if (n64Var.b) {
                    n64Var.c(0);
                }
            }
        }
    }
}
