package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cea {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public cea(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final void a(long j) {
        o44 o44VarB = b();
        o44VarB.getClass();
        String str = o44.k;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j, "cancelServerChatId "), null);
        }
        o44VarB.c(new h44(j, o44VarB, (Continuation) null));
    }

    public final o44 b() {
        return (o44) this.d.getValue();
    }

    public final void c() {
        o44 o44VarB = b();
        o44VarB.getClass();
        String str = o44.k;
        ir6 ir6Var = hm9.m;
        Continuation continuation = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "notifyAllChats", null);
        }
        o44VarB.c(new g44(o44VarB, continuation, 3));
        h();
    }

    public final void d(long j) {
        o44 o44VarB = b();
        o44VarB.getClass();
        String str = o44.k;
        ir6 ir6Var = hm9.m;
        Continuation continuation = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j, "notify #"), null);
        }
        o44VarB.c(new g44(o44VarB, continuation, 1));
        h();
    }

    public final void e(gi9 gi9Var) {
        o44 o44VarB = b();
        o44VarB.getClass();
        if (!gi9Var.i()) {
            String str = o44.k;
            ir6 ir6Var = hm9.m;
            Continuation continuation = null;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "notifyLocalChats", null);
            }
            o44VarB.c(new g44(o44VarB, continuation, 2));
        }
        h();
    }

    public final void f(long j) {
        o44 o44VarB = b();
        o44VarB.getClass();
        String str = o44.k;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j, "notifyServerChatIds #"), null);
        }
        o44VarB.c(new h44(o44VarB, j, (Continuation) null));
        h();
    }

    public final void g(gi9 gi9Var) {
        o44 o44VarB = b();
        o44VarB.getClass();
        String str = o44.k;
        ir6 ir6Var = hm9.m;
        Continuation continuation = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "notifyServerChatIds ".concat(gi9.k(gi9Var, null, null, 31)), null);
        }
        if (!gi9Var.i()) {
            o44VarB.c(new m44(o44VarB, gi9Var, continuation, 0));
        }
        h();
    }

    public final void h() {
        ((and) this.c.getValue()).d();
    }
}
