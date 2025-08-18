package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class k9c {
    public final p82 a;
    public final el3 b;
    public final ztc c;

    public k9c(p82 p82Var, el3 el3Var, ztc ztcVar) {
        this.a = p82Var;
        this.b = el3Var;
        this.c = ztcVar;
    }

    public final List a() {
        int i = 2;
        List listE = this.a.E(p82.I);
        hm9.n("k9c", "getRecentContacts:");
        return (List) new xy9(new e0a(new e0a(new ty9(qy9.j(listE), new j9c(this, 1), 1).v().n(), new gd1(13, new ye4(15)), 3), ft.b, i).i(new p4c(4), Integer.MAX_VALUE), new p4c(i)).s(10).v().n().i(new ui0(this, listE), Integer.MAX_VALUE).v().e();
    }

    public final List b() {
        int i = 2;
        int i2 = 3;
        hb3 hb3Var = new hb3(i2, new r1a[]{new e0a(new ty9(qy9.j(this.a.E(p82.I)), new j9c(this, i), 1), new p4c(i2), i2), new e0a(new ty9(new ty9(qy9.j(this.b.j(el3.r, el3.t)), new j9c(this, 6), 1), new j9c(this, 0), 1), new p4c(5), i2)});
        qx7 qx7Var = ft.b;
        return (List) new e0a(new e0a(new e0a(hb3Var.i(qx7Var, 2).v().n(), new gd1(13, u66.a), i2), qx7Var, i).s(10), new p4c(7), i2).v().e();
    }
}
