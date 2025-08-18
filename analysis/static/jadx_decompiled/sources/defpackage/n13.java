package defpackage;

/* loaded from: classes.dex */
public final class n13 {
    public final yze a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public n13(int i, int i2, long j, int i3, yze yzeVar) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        fm9.f(z);
        this.d = j;
        this.e = i3;
        this.a = yzeVar;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final z1d a(int i) {
        return new z1d(((this.d * 1) / this.e) * this.l[i], this.k[i]);
    }

    public final t1d b(long j) {
        int i = (int) (j / ((this.d * 1) / this.e));
        int iE = oaf.e(this.l, i, true, true);
        if (this.l[iE] == i) {
            z1d z1dVarA = a(iE);
            return new t1d(z1dVarA, z1dVarA);
        }
        z1d z1dVarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.k.length ? new t1d(z1dVarA2, a(i2)) : new t1d(z1dVarA2, z1dVarA2);
    }
}
