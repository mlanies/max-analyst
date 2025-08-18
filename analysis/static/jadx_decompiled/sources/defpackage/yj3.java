package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class yj3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public yj3(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final void a(long j) {
        hm9.n(yj3.class.getName(), "add, id = " + j);
        el3 el3Var = (el3) this.a.getValue();
        ol3 ol3Var = ol3.a;
        el3Var.getClass();
        el3Var.c(j, new f9(ol3Var, 22, null));
        k4a k4aVar = (k4a) ((pk) this.c.getValue());
        k4a.w(k4aVar, new sq3(4, ((p7b) k4aVar.y()).a.o(), j, null, null, null, null));
        ((ike) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        ((av0) this.d.getValue()).c(new ps3(j));
    }
}
