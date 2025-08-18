package defpackage;

/* loaded from: classes.dex */
public final class qdf implements py9 {
    public hw1 a;
    public boolean b;

    @Override // defpackage.py9
    public final void a(Object obj) {
        c54.p("SourceStreamRequirementObserver can be updated from main thread only", kq0.t());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == zEquals) {
            return;
        }
        this.b = zEquals;
        hw1 hw1Var = this.a;
        if (hw1Var != null) {
            if (zEquals) {
                hw1Var.o();
            } else {
                hw1Var.a();
            }
        }
    }

    @Override // defpackage.py9
    public final void onError(Throwable th) {
    }
}
