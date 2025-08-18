package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class loa implements eh7, isc {
    public gh7 a;
    public td b;
    public boolean c;
    public Bundle o;

    public static final void a(loa loaVar, uu3 uu3Var, uu3 uu3Var2, zu3 zu3Var, av3 av3Var) {
        if (uu3Var != uu3Var2 || av3Var.b || !zu3Var.d() || uu3Var2.getView() == null) {
            return;
        }
        gh7 gh7Var = loaVar.a;
        if ((gh7Var == null ? null : gh7Var).d == fg7.X) {
            if (gh7Var == null) {
                gh7Var = null;
            }
            gh7Var.d(eg7.ON_PAUSE);
            Bundle bundle = new Bundle();
            loaVar.o = bundle;
            td tdVar = loaVar.b;
            (tdVar != null ? tdVar : null).u(bundle);
            loaVar.c = true;
        }
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        gh7 gh7Var = this.a;
        if (gh7Var == null) {
            return null;
        }
        return gh7Var;
    }

    @Override // defpackage.isc
    public final mm y() {
        td tdVar = this.b;
        if (tdVar == null) {
            tdVar = null;
        }
        return (mm) tdVar.o;
    }
}
