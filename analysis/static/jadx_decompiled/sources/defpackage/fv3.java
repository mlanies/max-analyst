package defpackage;

/* loaded from: classes2.dex */
public final class fv3 implements yu3 {
    public final String a;
    public final k56 b;
    public final k56 c;

    public fv3(String str, jr0 jr0Var, jr0 jr0Var2) {
        this.a = str;
        this.b = jr0Var;
        this.c = jr0Var2;
    }

    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        if (tpa.f(uu3Var != null ? uu3Var.getInstanceId() : null, this.a) && z) {
            this.b.invoke();
        }
    }

    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        if (!tpa.f(uu3Var2 != null ? uu3Var2.getInstanceId() : null, this.a) || z) {
            return;
        }
        this.c.invoke();
    }
}
