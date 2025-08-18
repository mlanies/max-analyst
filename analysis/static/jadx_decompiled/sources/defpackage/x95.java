package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class x95 {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;
    public final Long d;

    public x95(kke kkeVar, av0 av0Var, long j, o92 o92Var, je7 je7Var) {
        int i;
        w7c w7cVarM;
        this.a = av0Var;
        this.c = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
        int iOrdinal = o92Var.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        iy2 iy2Var = (iy2) je7Var.getValue();
        iy2Var.getClass();
        int iS = au1.s(i);
        if (iS == 0) {
            w7cVarM = ((jz2) iy2Var).m(j);
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            w7cVarM = ((jz2) iy2Var).n(j);
        }
        e52 e52Var = (e52) w7cVarM.a.getValue();
        this.d = e52Var != null ? Long.valueOf(e52Var.a) : null;
    }

    @uae
    public final void onEvent(xfc xfcVar) {
        Long l = this.d;
        if (l == null) {
            return;
        }
        if (xfcVar.b != l.longValue()) {
            return;
        }
        j47.T(this.c, null, null, new w95(this, null), 3);
    }
}
