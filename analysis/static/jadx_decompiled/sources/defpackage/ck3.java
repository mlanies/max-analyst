package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class ck3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public ck3(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
    }

    public final void a(long j) {
        hm9.n(ck3.class.getName(), "block, id = " + j);
        el3 el3Var = (el3) this.a.getValue();
        nl3 nl3Var = nl3.a;
        el3Var.getClass();
        el3Var.c(j, new v02(18, nl3Var));
        k4a k4aVar = (k4a) ((pk) this.d.getValue());
        k4a.w(k4aVar, new sq3(1, ((p7b) k4aVar.y()).a.o(), j, null, null, null, null));
        ((p82) this.b.getValue()).j(j, i92.X);
        ((ike) this.c.getValue()).f(Collections.singletonList(new Long(j)));
        ((av0) this.e.getValue()).c(new ps3(j));
    }
}
