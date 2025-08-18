package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class jf2 {
    public final long a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public jf2(long j, av0 av0Var, kke kkeVar) {
        this.a = j;
        this.c = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    public final void a(hf2 hf2Var) {
        j47.T(this.c, null, null, new if2(this, hf2Var, null), 3);
    }

    @uae
    public final void onEvent(fn4 fn4Var) {
        a(new cf2(fn4Var.X, fn4Var.o));
    }

    @uae
    public final void onEvent(hn4 hn4Var) {
        a(new df2(hn4Var.o));
    }

    @uae
    public final void onEvent(l6f l6fVar) {
        if (l6fVar.b != this.a) {
            return;
        }
        a(new ff2(l6fVar.c));
    }

    @uae
    public final void onEvent(kz6 kz6Var) {
        if (kz6Var.b != this.a || kz6Var.Y) {
            return;
        }
        a(new bf2(kz6Var.c));
    }

    @uae
    public final void onEvent(mna mnaVar) {
        if (mnaVar.b != this.a) {
            return;
        }
        a(new bf2(mnaVar.o));
    }

    @uae
    public final void onEvent(re9 re9Var) {
        if (re9Var.b != this.a) {
            return;
        }
        a(new ef2(re9Var.X));
    }
}
