package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

/* loaded from: classes2.dex */
public final class en7 implements gn7 {
    public final Context b;
    public final bea c;
    public final tda d;
    public final p84 e;
    public final wke f;

    public en7(Context context, bea beaVar, tda tdaVar, p84 p84Var, wke wkeVar) {
        this.b = context;
        this.c = beaVar;
        this.d = tdaVar;
        this.e = p84Var;
        this.f = wkeVar;
    }

    @Override // defpackage.gn7
    public final Notification a(long j, PendingIntent pendingIntent) {
        String string;
        this.c.c();
        bea beaVar = this.c;
        this.e.getClass();
        bu9 bu9VarH = beaVar.h("ru.oneme.app.liveLocation", true, true);
        bu9VarH.e = bu9.c(this.b.getString(c2c.tt_live_location));
        wke wkeVar = this.f;
        p82 p82Var = (p82) wkeVar.b.getValue();
        if (p82Var == null) {
            string = "";
        } else {
            e52 e52VarC = p82Var.C(j);
            if (e52VarC.M()) {
                Context context = wkeVar.a;
                int i = dpc.q;
                e52VarC.k0();
                string = context.getString(i, e52VarC.u0);
            } else {
                Context context2 = wkeVar.a;
                int i2 = dpc.p;
                e52VarC.k0();
                string = context2.getString(i2, e52VarC.u0);
            }
        }
        bu9VarH.f = bu9.c(string);
        bu9VarH.k = 0;
        this.d.getClass();
        bu9VarH.F.icon = gpc.n0;
        bu9VarH.g(0);
        bu9VarH.p(null);
        bu9VarH.i(16, false);
        bu9VarH.b.add(new nt9(0, this.b.getString(c2c.tt_worker_cancel), pendingIntent));
        this.c.getClass();
        bu9VarH.g = oag.p(this.b, 10, null);
        bu9VarH.v = "service";
        return bu9VarH.b();
    }
}
