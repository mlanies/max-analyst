package defpackage;

import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final /* synthetic */ class sb3 implements ug7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        switch (this.a) {
            case 0:
                if (eg7Var == eg7.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = tb3.a.a((yb3) this.c);
                    i3a i3aVar = (i3a) this.b;
                    i3aVar.e = onBackInvokedDispatcherA;
                    i3aVar.e(i3aVar.g);
                    return;
                }
                return;
            default:
                fg7 fg7Var = eh7Var.Q().d;
                fg7 fg7Var2 = fg7.a;
                kg7 kg7Var = (kg7) this.b;
                if (fg7Var == fg7Var2) {
                    ((x77) this.c).cancel(null);
                    kg7Var.a();
                    return;
                }
                int iCompareTo = eh7Var.Q().d.compareTo(kg7Var.b);
                jl4 jl4Var = kg7Var.c;
                if (iCompareTo < 0) {
                    jl4Var.a = true;
                    return;
                } else {
                    if (jl4Var.a) {
                        if (!(!jl4Var.b)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        jl4Var.a = false;
                        jl4Var.a();
                        return;
                    }
                    return;
                }
        }
    }
}
