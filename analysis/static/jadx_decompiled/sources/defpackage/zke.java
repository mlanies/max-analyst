package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zke implements b99 {
    public final o45 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final ContextScope h;
    public final String i;
    public final khe j;

    public zke(o45 o45Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, kke kkeVar, je7 je7Var7) {
        this.a = o45Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        new khe(new dr(je7Var3, je7Var4, 10));
        this.g = je7Var7;
        this.h = j1e.a(((w9a) kkeVar).b().limitedParallelism(2, "cloud-pushes").plus(new qj(o45Var)));
        this.i = zke.class.getName();
        this.j = new khe(new xid(28));
    }

    public final ale a() {
        return (ale) this.b.getValue();
    }
}
