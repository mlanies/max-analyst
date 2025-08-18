package defpackage;

/* loaded from: classes.dex */
public final class uu0 implements xze {
    public final int a;
    public final oy5 b;
    public final dt4 c = new dt4();
    public oy5 d;
    public xze e;
    public long f;

    public uu0(int i, int i2, oy5 oy5Var) {
        this.a = i2;
        this.b = oy5Var;
    }

    @Override // defpackage.xze
    public final int a(l24 l24Var, int i, boolean z) {
        xze xzeVar = this.e;
        int i2 = maf.a;
        return xzeVar.e(l24Var, i, z);
    }

    @Override // defpackage.xze
    public final void b(long j, int i, int i2, int i3, vze vzeVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        xze xzeVar = this.e;
        int i4 = maf.a;
        xzeVar.b(j, i, i2, i3, vzeVar);
    }

    @Override // defpackage.xze
    public final void c(int i, yaf yafVar) {
        xze xzeVar = this.e;
        int i2 = maf.a;
        xzeVar.c(i, yafVar);
    }

    @Override // defpackage.xze
    public final void d(oy5 oy5Var) {
        oy5 oy5Var2 = this.b;
        if (oy5Var2 != null) {
            oy5Var = oy5Var.d(oy5Var2);
        }
        this.d = oy5Var;
        xze xzeVar = this.e;
        int i = maf.a;
        xzeVar.d(oy5Var);
    }
}
