package defpackage;

import android.app.Application;

/* loaded from: classes2.dex */
public final class jrd implements f4b {
    public final Application a;
    public final o45 b;
    public final n65 c;
    public final je7 d;
    public final n4b e;
    public final String f = jrd.class.getName();
    public final fic g = new fic(new lwa(28, this));

    public jrd(Application application, o45 o45Var, n65 n65Var, je7 je7Var, n4b n4bVar) {
        this.a = application;
        this.b = o45Var;
        this.c = n65Var;
        this.d = je7Var;
        this.e = n4bVar;
    }

    @Override // defpackage.f4b
    public final void a(dkf dkfVar) {
        hm9.n(this.f, "Single player handler. Free player");
        dkfVar.N0();
        dkfVar.M0(null);
    }

    @Override // defpackage.f4b
    public final dkf get() {
        String str = this.f;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("Single player handler. Player exist: ", this.g.a()), null);
        }
        return (dkf) this.g.getValue();
    }
}
