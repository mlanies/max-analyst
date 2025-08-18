package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class ph6 {
    public final xze a;
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
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public oh6 m = new oh6();
    public oh6 n = new oh6();
    public boolean k = false;
    public boolean o = false;

    public ph6(xze xzeVar, boolean z, boolean z2) {
        this.a = xzeVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new s02(0, 0, 3, bArr);
        oh6 oh6Var = this.n;
        oh6Var.b = false;
        oh6Var.a = false;
    }
}
