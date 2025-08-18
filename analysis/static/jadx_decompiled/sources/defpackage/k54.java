package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k54 implements dab {
    public final ja6 a;
    public final Executor b;
    public final lu6 c;
    public final ey1 d;
    public final bp4 e;
    public final boolean f;
    public final boolean g;
    public final dab h;
    public final int i;
    public final wd6 j;

    public k54(ja6 ja6Var, Executor executor, lu6 lu6Var, ey1 ey1Var, bp4 bp4Var, boolean z, boolean z2, dab dabVar, int i, wd6 wd6Var) {
        this.a = ja6Var;
        this.b = executor;
        this.c = lu6Var;
        this.d = ey1Var;
        this.e = bp4Var;
        this.f = z;
        this.g = z2;
        this.h = dabVar;
        this.i = i;
        this.j = wd6Var;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        boolean zW = f46.W();
        dab dabVar = this.h;
        ja6 ja6Var = this.a;
        if (!zW) {
            wv6 wv6Var = ((oj0) eabVar).a;
            dabVar.a((e9f.e(wv6Var.b) || xv6.c(wv6Var.b)) ? new h54(this, fi0Var, eabVar, new knb(ja6Var), this.d, this.g, this.i) : new g54(this, fi0Var, eabVar, this.g, this.i), eabVar);
            return;
        }
        f46.e("DecodeProducer#produceResults");
        try {
            wv6 wv6Var2 = ((oj0) eabVar).a;
            dabVar.a((e9f.e(wv6Var2.b) || xv6.c(wv6Var2.b)) ? new h54(this, fi0Var, eabVar, new knb(ja6Var), this.d, this.g, this.i) : new g54(this, fi0Var, eabVar, this.g, this.i), eabVar);
            f46.A();
        } catch (Throwable th) {
            f46.A();
            throw th;
        }
    }
}
