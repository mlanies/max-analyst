package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class jd3 {
    public final int a;
    public final kd3[] b;
    public long c;

    public jd3(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new kd3[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new kd3(threadFactory);
        }
    }

    public final kd3 a() {
        int i = this.a;
        if (i == 0) {
            return ld3.g;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % i)];
    }
}
