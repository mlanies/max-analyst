package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m6g extends o6g {
    public final WindowInsets.Builder c;

    public m6g() {
        this.c = new WindowInsets.Builder();
    }

    @Override // defpackage.o6g
    public x6g b() {
        a();
        x6g x6gVarF = x6g.f(null, this.c.build());
        x6gVarF.a.p(this.b);
        return x6gVarF;
    }

    @Override // defpackage.o6g
    public void d(v27 v27Var) {
        this.c.setMandatorySystemGestureInsets(v27Var.d());
    }

    @Override // defpackage.o6g
    public void e(v27 v27Var) {
        this.c.setSystemGestureInsets(v27Var.d());
    }

    @Override // defpackage.o6g
    public void f(v27 v27Var) {
        this.c.setSystemWindowInsets(v27Var.d());
    }

    @Override // defpackage.o6g
    public void g(v27 v27Var) {
        this.c.setTappableElementInsets(v27Var.d());
    }

    public void i(v27 v27Var) {
        this.c.setStableInsets(v27Var.d());
    }

    public m6g(x6g x6gVar) {
        WindowInsets.Builder builder;
        super(x6gVar);
        WindowInsets windowInsetsE = x6gVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.c = builder;
    }
}
