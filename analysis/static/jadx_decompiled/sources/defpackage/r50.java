package defpackage;

import android.os.PowerManager;

/* loaded from: classes.dex */
public final class r50 implements ipb {
    public final /* synthetic */ t50 a;

    public r50(t50 t50Var) {
        this.a = t50Var;
    }

    @Override // defpackage.ipb
    public final void a() {
        t50 t50Var = this.a;
        if (t50.a(t50Var)) {
            return;
        }
        ch9 ch9Var = t50Var.a;
        uh9 uh9Var = (uh9) ch9Var;
        uh9Var.getClass();
        h30 h30Var = new h30(1, 0, 2, 1, 0);
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            a98Var.m0(h30Var, false);
        }
        jpb jpbVar = t50Var.b;
        jpbVar.getClass();
        try {
            PowerManager.WakeLock wakeLock = jpbVar.f;
            if (wakeLock != null) {
                wakeLock.acquire();
            }
        } catch (Exception e) {
            hm9.r("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
        long jLongValue = ((Number) ((uh9) ch9Var).t.a.getValue()).longValue() - 1000;
        uh9 uh9Var2 = (uh9) ch9Var;
        uh9Var2.getClass();
        j47.T(uh9Var2.h, null, null, new qh9(jLongValue, uh9Var2, null), 3);
    }

    @Override // defpackage.ipb
    public final void b() {
        t50 t50Var = this.a;
        if (t50.a(t50Var)) {
            return;
        }
        ch9 ch9Var = t50Var.a;
        uh9 uh9Var = (uh9) ch9Var;
        uh9Var.getClass();
        h30 h30Var = new h30(1, 0, 1, 1, 0);
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            a98Var.m0(h30Var, false);
        }
        t50Var.b.c();
        ((uh9) ch9Var).q();
    }
}
