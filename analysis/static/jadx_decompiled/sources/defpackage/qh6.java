package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class qh6 {
    public final yze a;
    public final boolean b;
    public final boolean c;
    public final s02 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public oh6 m = new oh6();
    public oh6 n = new oh6();
    public boolean k = false;
    public boolean o = false;

    public qh6(yze yzeVar, boolean z, boolean z2) {
        this.a = yzeVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new s02(0, 0, 4, bArr);
        oh6 oh6Var = this.n;
        oh6Var.b = false;
        oh6Var.a = false;
    }

    public final void a() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.b) {
            oh6 oh6Var = this.n;
            z = oh6Var.b && ((i = oh6Var.d) == 7 || i == 2);
        } else {
            z = this.s;
        }
        boolean z3 = this.r;
        int i2 = this.i;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.r = z3 | z2;
    }
}
