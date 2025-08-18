package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ps2 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ps2(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final void a(long j, long j2, Continuation continuation) {
        ((ad) this.a.getValue()).f("ACTION_MSG_UNPIN");
        k4a k4aVar = (k4a) ((pk) this.b.getValue());
        if (k4aVar.o(j)) {
            k4a.w(k4aVar, new rs2(((p7b) k4aVar.y()).a.o(), j, j2, 0, null, false, null, null, null, null, null, -1L, false, 0L));
        }
        p82 p82VarL = ((jz2) ((iy2) this.c.getValue())).l();
        Long l = new Long(j);
        p82VarL.getClass();
        p82VarL.c(l.longValue(), v82.o);
        p82VarL.h(l.longValue(), false, new un0(17));
    }
}
