package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class r12 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public r12(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var3;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public final Long a(long j, String str, a20 a20Var) {
        je7 je7Var = this.a;
        iy2 iy2Var = (iy2) je7Var.getValue();
        ((jz2) iy2Var).l().c(j, v82.b);
        if (((jz2) ((iy2) je7Var.getValue())).f(j, new q12()) == null) {
            return new Long(0L);
        }
        ((av0) this.c.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, null, null, 124));
        k4a k4aVar = (k4a) ((pk) this.b.getValue());
        return new Long(((s8g) k4aVar.e.getValue()).b(new s12(((p7b) k4aVar.y()).a.o(), str, j, a20Var, pag.u(str))));
    }
}
