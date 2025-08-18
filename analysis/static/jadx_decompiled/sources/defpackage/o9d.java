package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class o9d extends d8d {
    public final long b;
    public final long c;

    public o9d(l7 l7Var) {
        this.b = l7Var.b;
        this.c = l7Var.c;
    }

    @Override // defpackage.d8d
    public final void x() {
        long jD;
        String name = o9d.class.getName();
        long j = this.b;
        Long lValueOf = Long.valueOf(j);
        long j2 = this.c;
        hm9.m(name, "process, chatId = %d, botId = %d, suspend = %b", lValueOf, Long.valueOf(j2), Boolean.TRUE);
        if (g().C(j) == null) {
            return;
        }
        p82 p82VarG = g();
        p82VarG.getClass();
        p82VarG.h(j, false, new l01(true, 1));
        g().p(j);
        k4a k4aVar = (k4a) a();
        long j3 = this.b;
        if (k4aVar.o(j3)) {
            jD = ome.d(k4aVar.z(), new xee(((p7b) k4aVar.y()).a.o(), j3, true, this.c), false, 0, 12);
        } else {
            jD = 0;
        }
        t().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
        t().c(new ps3(jD, Collections.singletonList(Long.valueOf(j2))));
        t().c(new yee(j));
    }
}
