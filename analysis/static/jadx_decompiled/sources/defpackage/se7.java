package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class se7 implements qw0 {
    public final long a;
    public final TreeSet b = new TreeSet(new ye4(7));
    public long c;

    public se7(long j) {
        this.a = j;
    }

    @Override // defpackage.qw0
    public final void a(gw0 gw0Var, ex0 ex0Var) {
        this.b.remove(ex0Var);
        this.c -= ex0Var.c;
    }

    @Override // defpackage.qw0
    public final void b(gw0 gw0Var, ex0 ex0Var) {
        this.b.add(ex0Var);
        this.c += ex0Var.c;
        e(gw0Var, 0L);
    }

    @Override // defpackage.qw0
    public final void c(gw0 gw0Var, String str, long j, long j2) {
        if (j2 != -1) {
            e(gw0Var, j2);
        }
    }

    @Override // defpackage.qw0
    public final void d(gw0 gw0Var, ex0 ex0Var, vpd vpdVar) {
        a(gw0Var, ex0Var);
        b(gw0Var, vpdVar);
    }

    public final void e(gw0 gw0Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            ex0 ex0Var = (ex0) this.b.first();
            spd spdVar = (spd) gw0Var;
            synchronized (spdVar) {
                spdVar.m(ex0Var);
            }
        }
    }
}
