package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class qf7 {
    public final mz6 a;
    public final je7 b;
    public final q0e c;
    public final w7c d;
    public final ContextScope e;
    public final aj9 f;

    public qf7(av0 av0Var, mz6 mz6Var, je7 je7Var, kke kkeVar) {
        this.a = mz6Var;
        this.b = je7Var;
        q0e q0eVarA = r0e.a(new g4f(new wv7(10)));
        this.c = q0eVarA;
        this.d = new w7c(q0eVarA);
        this.e = j1e.a(((w9a) kkeVar).a());
        this.f = bj9.a();
        av0Var.d(this);
    }

    public static final void a(qf7 qf7Var, long j) {
        CharSequence charSequenceG = ((ld2) ((lr2) qf7Var.b.getValue())).g(j);
        if (charSequenceG == null) {
            charSequenceG = "";
        }
        ns2 ns2Var = new ns2(charSequenceG, j);
        q0e q0eVar = qf7Var.c;
        g4f g4fVar = (g4f) q0eVar.getValue();
        wv7 wv7Var = new wv7(g4fVar.a.h());
        wv7 wv7Var2 = g4fVar.a;
        int iH = wv7Var2.h();
        for (int i = 0; i < iH; i++) {
            wv7Var.f(wv7Var2.e(i), wv7Var2.i(i));
        }
        wv7Var.f(j, ns2Var);
        q0eVar.m(null, new g4f(wv7Var));
    }

    public static final void b(qf7 qf7Var, long j) {
        q0e q0eVar = qf7Var.c;
        g4f g4fVar = (g4f) q0eVar.getValue();
        wv7 wv7Var = new wv7(g4fVar.a.h());
        wv7 wv7Var2 = g4fVar.a;
        int iH = wv7Var2.h();
        for (int i = 0; i < iH; i++) {
            wv7Var.f(wv7Var2.e(i), wv7Var2.i(i));
        }
        wv7Var.g(j);
        q0eVar.m(null, new g4f(wv7Var));
    }

    @uae
    public final void onEvent(f4f f4fVar) {
        j47.T(this.e, null, null, new pf7(this, f4fVar, null), 3);
    }
}
