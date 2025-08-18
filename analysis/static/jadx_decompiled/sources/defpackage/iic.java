package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iic implements dab {
    public final Executor a;
    public final y7g b;
    public final dab c;
    public final boolean d;
    public final zv6 e;

    public iic(Executor executor, y7g y7gVar, dab dabVar, boolean z, zv6 zv6Var) {
        executor.getClass();
        this.a = executor;
        y7gVar.getClass();
        this.b = y7gVar;
        this.c = dabVar;
        zv6Var.getClass();
        this.e = zv6Var;
        this.d = z;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        this.c.a(new hic(this, fi0Var, eabVar, this.d, this.e), eabVar);
    }
}
