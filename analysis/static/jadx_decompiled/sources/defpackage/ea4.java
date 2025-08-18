package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ea4 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public ea4(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yaf(1, false);
                break;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yaf(0, false);
                break;
        }
    }

    public long a(ra4 ra4Var, int i) {
        ra4Var.h(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }

    public long b(sa4 sa4Var, int i) {
        sa4Var.h(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
