package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ltd implements lp8 {
    public final long a;
    public final ek2 b;
    public final kke c;
    public final long d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final AtomicInteger h;
    public final q0e i;
    public final q0e j;
    public final w7c k;
    public final w7c l;

    public ltd(long j, ek2 ek2Var, q33 q33Var, je7 je7Var, je7 je7Var2, je7 je7Var3, kke kkeVar, je7 je7Var4) {
        this.a = j;
        this.b = ek2Var;
        this.c = kkeVar;
        this.d = ((hyc) q33Var).t();
        this.e = je7Var;
        this.f = je7Var2;
        this.g = je7Var3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.h = atomicInteger;
        q0e q0eVarA = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.i = q0eVarA;
        w9a w9aVar = (w9a) kkeVar;
        ContextScope contextScopeA = j1e.a(w9aVar.a());
        q0e q0eVarA2 = r0e.a(null);
        this.j = q0eVarA2;
        q0e q0eVarA3 = r0e.a(null);
        this.k = new w7c(q0eVarA3);
        this.l = od2.X(od2.d0(q0eVarA, new vp5((Continuation) null, this, 8)), contextScopeA, wld.a, nz4.a);
        j47.T(contextScopeA, null, null, new jtd(je7Var, this, je7Var4, null), 3);
        od2.L(od2.F(new zn5(new ap8(od2.x(od2.u(q0eVarA2, 200L)), this, 11), new v59(2, q0eVarA3, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), 5), w9aVar.b()), contextScopeA);
    }

    @Override // defpackage.lp8
    public final void a(String str) {
        this.j.setValue(str);
    }

    @Override // defpackage.lp8
    public final mn5 b() {
        return this.k;
    }

    @Override // defpackage.lp8
    public final boolean c() {
        return false;
    }

    @Override // defpackage.lp8
    public final w7c d() {
        return this.l;
    }

    @Override // defpackage.lp8
    public final void e() {
        this.i.m(null, Integer.valueOf(this.h.incrementAndGet()));
    }
}
