package defpackage;

import android.app.Application;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class ug0 {
    public final Application a;
    public final ContextScope c;
    public final kld b = lld.b(0, 0, 0, 7);
    public final dua d = new dua(eua.f);
    public final dua e = new dua(eua.k);
    public final mg0 f = new mg0(0, this);

    public ug0(Application application, av0 av0Var, kke kkeVar) {
        this.a = application;
        this.c = j1e.a(((w9a) kkeVar).c().getImmediate());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(ut7 ut7Var) {
        j47.T(this.c, null, null, new ng0(this, null), 3);
    }

    @uae
    public final void onEvent(sva svaVar) {
        j47.T(this.c, null, null, new og0(this, null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3Var) {
        j47.T(this.c, null, null, new pg0(this, null), 3);
    }

    @uae
    public final void onEvent(c6f c6fVar) {
        j47.T(this.c, null, null, new qg0(this, null), 3);
    }
}
