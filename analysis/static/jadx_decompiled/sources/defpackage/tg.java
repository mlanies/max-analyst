package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class tg implements lg {
    public final lg a;
    public final lde b;

    public tg(l84 l84Var, y8 y8Var) {
        this.a = l84Var;
        this.b = y8Var;
    }

    @Override // defpackage.lg
    public final ph4 a(View view) {
        if (p()) {
            return this.a.a(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.lg
    public final ph4 c(View view) {
        if (p()) {
            return this.a.c(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final Interpolator d() {
        return this.a.d();
    }

    @Override // defpackage.lg
    public final ph4 e(View view) {
        if (p()) {
            return this.a.e(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final Interpolator f() {
        return this.a.f();
    }

    @Override // defpackage.lg
    public final ph4 g(View view) {
        if (p()) {
            return this.a.g(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final long h() {
        return this.a.h();
    }

    @Override // defpackage.lg
    public final ph4 i(View view) {
        if (p()) {
            return this.a.i(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final ph4 j(View view) {
        if (p()) {
            return this.a.j(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final Interpolator k() {
        return this.a.k();
    }

    @Override // defpackage.lg
    public final Interpolator l() {
        return this.a.l();
    }

    @Override // defpackage.lg
    public final ph4 m(View view) {
        if (p()) {
            return this.a.m(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    @Override // defpackage.lg
    public final Interpolator n() {
        return this.a.n();
    }

    @Override // defpackage.lg
    public final ph4 o(View view) {
        if (p()) {
            return this.a.o(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    public final boolean p() {
        return ((Boolean) this.b.get()).booleanValue();
    }
}
