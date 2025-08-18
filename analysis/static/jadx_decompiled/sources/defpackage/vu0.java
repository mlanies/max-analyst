package defpackage;

/* loaded from: classes.dex */
public final class vu0 implements yze {
    public final int a;
    public final qy5 b;
    public final sk4 c = new sk4();
    public qy5 d;
    public yze e;
    public long f;

    public vu0(int i, int i2, qy5 qy5Var) {
        this.a = i2;
        this.b = qy5Var;
    }

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        yze yzeVar = this.e;
        int i4 = oaf.a;
        yzeVar.a(j, i, i2, i3, wzeVar);
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        yze yzeVar = this.e;
        int i3 = oaf.a;
        yzeVar.b(wpaVar, i, 0);
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) {
        yze yzeVar = this.e;
        int i2 = oaf.a;
        return yzeVar.d(m24Var, i, z);
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        qy5 qy5Var2 = this.b;
        if (qy5Var2 != null) {
            qy5Var = qy5Var.f(qy5Var2);
        }
        this.d = qy5Var;
        yze yzeVar = this.e;
        int i = oaf.a;
        yzeVar.e(qy5Var);
    }
}
