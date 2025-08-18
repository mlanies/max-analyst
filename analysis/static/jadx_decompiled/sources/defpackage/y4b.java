package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public final class y4b implements f4b {
    public final Application a;
    public final o45 b;
    public final n65 c;
    public final je7 d;
    public final n4b e;
    public final String f = y4b.class.getName();
    public final xs g = new xs(0);

    public y4b(Application application, o45 o45Var, n65 n65Var, je7 je7Var, n4b n4bVar) {
        this.a = application;
        this.b = o45Var;
        this.c = n65Var;
        this.d = je7Var;
        this.e = n4bVar;
    }

    @Override // defpackage.f4b
    public final void a(dkf dkfVar) {
        String str = this.f;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Players pool. Free player, " + dkfVar, null);
        }
        dkfVar.N0();
        dkfVar.M0(null);
        this.g.add(dkfVar);
    }

    @Override // defpackage.f4b
    public final dkf get() {
        if (this.g.isEmpty()) {
            hm9.n(this.f, "Players pool. Pool is empty create new player");
            return new dkf(this.a, this.b, this.c, this.d, this.e);
        }
        dkf dkfVar = (dkf) this.g.d(r0.c - 1);
        String str = this.f;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Players pool. Pool has player, " + dkfVar, null);
        }
        return dkfVar;
    }
}
