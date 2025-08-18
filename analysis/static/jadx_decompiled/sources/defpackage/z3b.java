package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class z3b {
    public static final /* synthetic */ bc7[] i;
    public final ch9 a;
    public final t50 b;
    public final ContextScope c;
    public final w7c f;
    public final w4d d = mqd.D();
    public final q0e e = r0e.a(null);
    public final y8 g = new y8(this);
    public final AtomicReference h = new AtomicReference(null);

    static {
        oi9 oi9Var = new oi9(z3b.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public z3b(kke kkeVar, ch9 ch9Var, t50 t50Var) {
        this.a = ch9Var;
        this.b = t50Var;
        this.c = j1e.a(((w9a) kkeVar).a());
        this.f = ((uh9) ch9Var).H;
    }

    public final void a(long j, long j2, String str, String str2, String str3, String str4) {
        Map map;
        uh9 uh9Var = (uh9) this.b.a;
        bh9 bh9VarN = uh9Var.n();
        Object obj = (bh9VarN == null || (map = bh9VarN.c) == null) ? null : map.get("MediaMetadata.Extra.MESSAGE_ID");
        Long l = obj instanceof Long ? (Long) obj : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue == j2 && uh9Var.y) {
            uh9Var.t();
            return;
        }
        if (jLongValue == j2 && uh9Var.x) {
            uh9Var.q();
        } else if (jLongValue == j2 && uh9Var.w) {
            uh9Var.r();
        } else {
            j47.T(uh9Var.h, ((w9a) uh9Var.b).b(), null, new oh9(new yg9(j, j2, str, str2, str3, str4), uh9Var, null), 2);
        }
    }

    public final void b() {
        vxd vxdVarT = j47.T(this.c, null, null, new x3b(this, null), 3);
        this.d.o1(this, i[0], vxdVarT);
    }
}
