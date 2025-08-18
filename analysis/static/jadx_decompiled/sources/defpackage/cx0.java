package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class cx0 {
    public static final LinkedHashSet l;
    public final ng5 a;
    public final f40 b;
    public final s8g c;
    public final s23 d;
    public final qj3 e;
    public final ztc f;
    public final ztc g;
    public final bx0 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public volatile y0a j;
    public volatile ax0 k;

    static {
        LinkedList linkedList = new LinkedList(Arrays.asList(gx0.values()));
        linkedList.remove(gx0.a);
        l = new LinkedHashSet(linkedList);
    }

    public cx0(ng5 ng5Var, f40 f40Var, s23 s23Var, s8g s8gVar, ztc ztcVar, ztc ztcVar2, qj3 qj3Var, bx0 bx0Var) {
        this.a = ng5Var;
        this.b = f40Var;
        this.c = s8gVar;
        this.h = bx0Var;
        this.d = s23Var;
        this.e = qj3Var;
        this.f = ztcVar;
        this.g = ztcVar2;
    }

    public final void a(sd7 sd7Var) {
        try {
            this.e.accept(sd7Var);
        } catch (Throwable th) {
            hm9.p("cx0", "updateData: failed to accept disposable", th);
        }
    }

    public final void b() {
        r0a r0aVarN = c().r(this.f).n(this.g);
        sd7 sd7Var = new sd7(new yw0(this, 0), new un0(5), ft.d);
        r0aVarN.a(sd7Var);
        a(sd7Var);
    }

    public final synchronized qy9 c() {
        if (this.j != null) {
            return this.j;
        }
        qy9 qy9VarN = new rqd(new q1a(2, new l5(2, this)), new yw0(this, 6), 2).n();
        yw0 yw0Var = new yw0(this, 7);
        kj6 kj6Var = ft.e;
        this.j = new y0a(new v0a(new xy9(new oz9(qy9VarN, kj6Var, yw0Var, ft.d), kj6Var, new e5(3, this), 2)));
        return this.j;
    }
}
