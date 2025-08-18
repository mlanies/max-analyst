package defpackage;

/* loaded from: classes.dex */
public final class s87 extends k87 {
    public final Object X;
    public final z87 b;
    public final t87 c;
    public final f03 o;

    public s87(z87 z87Var, t87 t87Var, f03 f03Var, Object obj) {
        this.b = z87Var;
        this.c = t87Var;
        this.o = f03Var;
        this.X = obj;
    }

    @Override // defpackage.k87
    public final boolean c() {
        return false;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        z87.access$continueCompleting(this.b, this.c, this.o, this.X);
    }
}
