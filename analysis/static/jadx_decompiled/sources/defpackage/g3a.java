package defpackage;

/* loaded from: classes.dex */
public final class g3a implements ug7, qy1 {
    public final gh7 a;
    public final a3a b;
    public h3a c;
    public final /* synthetic */ i3a o;

    public g3a(i3a i3aVar, gh7 gh7Var, a3a a3aVar) {
        this.o = i3aVar;
        this.a = gh7Var;
        this.b = a3aVar;
        gh7Var.a(this);
    }

    @Override // defpackage.qy1
    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        h3a h3aVar = this.c;
        if (h3aVar != null) {
            h3aVar.cancel();
        }
        this.c = null;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        if (eg7Var == eg7.ON_START) {
            this.c = this.o.b(this.b);
            return;
        }
        if (eg7Var != eg7.ON_STOP) {
            if (eg7Var == eg7.ON_DESTROY) {
                cancel();
            }
        } else {
            h3a h3aVar = this.c;
            if (h3aVar != null) {
                h3aVar.cancel();
            }
        }
    }
}
