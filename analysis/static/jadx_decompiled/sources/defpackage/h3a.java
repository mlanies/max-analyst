package defpackage;

/* loaded from: classes.dex */
public final class h3a implements qy1 {
    public final a3a a;
    public final /* synthetic */ i3a b;

    public h3a(i3a i3aVar, a3a a3aVar) {
        this.b = i3aVar;
        this.a = a3aVar;
    }

    @Override // defpackage.qy1
    public final void cancel() {
        i3a i3aVar = this.b;
        hs hsVar = i3aVar.b;
        a3a a3aVar = this.a;
        hsVar.remove(a3aVar);
        if (tpa.f(i3aVar.c, a3aVar)) {
            a3aVar.a();
            i3aVar.c = null;
        }
        a3aVar.b.remove(this);
        k56 k56Var = a3aVar.c;
        if (k56Var != null) {
            k56Var.invoke();
        }
        a3aVar.c = null;
    }
}
