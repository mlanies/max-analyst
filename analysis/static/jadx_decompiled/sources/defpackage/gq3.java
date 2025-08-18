package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class gq3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public gq3(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
    }

    public final void a(long j) {
        hm9.n(gq3.class.getName(), "remove, id = " + j);
        je7 je7Var = this.a;
        el3 el3Var = (el3) je7Var.getValue();
        ol3 ol3Var = ol3.b;
        nl3 nl3Var = nl3.b;
        el3Var.getClass();
        el3Var.c(j, new f9(ol3Var, 22, nl3Var));
        ((el3) je7Var.getValue()).r(j, true);
        int i = ft4.o;
        int i2 = (int) ft4.i(z7.S(((hyc) ((q33) this.c.getValue())).n(), kt4.MILLISECONDS), kt4.SECONDS);
        w7b w7bVar = (w7b) this.d.getValue();
        r7b r7bVar = new r7b(0, i2);
        w7bVar.getClass();
        w7bVar.k(Collections.singletonMap(Long.valueOf(j), r7bVar));
        k4a k4aVar = (k4a) ((pk) this.e.getValue());
        k4a.w(k4aVar, new sq3(3, ((p7b) k4aVar.y()).a.o(), j, null, null, null, null));
        ((ike) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        el3 el3Var2 = (el3) je7Var.getValue();
        el3Var2.getClass();
        cqc.a(new dl3(0, j, 0L, el3Var2), el3Var2.m, null, new un0(27), null);
        ((av0) this.f.getValue()).c(new ps3(j));
    }
}
