package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sj4 {
    public final long a;
    public final av0 b;
    public final iy2 c;
    public final kld d = lld.b(0, 0, 0, 7);
    public final ContextScope e;

    public sj4(long j, av0 av0Var, kke kkeVar, iy2 iy2Var) {
        this.a = j;
        this.b = av0Var;
        this.c = iy2Var;
        this.e = j1e.a(((w9a) kkeVar).c().getImmediate());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(vz2 vz2Var) {
        uj3 uj3VarL;
        Iterator it = vz2Var.b.iterator();
        while (it.hasNext()) {
            e52 e52Var = (e52) ((jz2) this.c).m(((Number) it.next()).longValue()).a.getValue();
            if (e52Var != null && (uj3VarL = e52Var.l()) != null) {
                if (uj3VarL.n() == this.a) {
                    j47.T(this.e, null, null, new rj4(this, null), 3);
                    return;
                }
                return;
            }
        }
    }
}
