package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i80 {
    public final je7 a;
    public final je7 b;

    public i80(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final Object a(String str, int i, Continuation continuation) {
        String str2;
        ((ad) this.a.getValue()).f("ACTION_AUTH_GET_CODE");
        ome omeVar = (ome) ((e5a) this.b.getValue()).a.getValue();
        au auVar = new au(sla.t0, 8);
        auVar.p("phone", str);
        if (i == 1) {
            str2 = "START_AUTH";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "RESEND";
        }
        auVar.p("type", str2);
        return omeVar.e(auVar, continuation);
    }
}
