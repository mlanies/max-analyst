package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class yl0 implements lp8 {
    public final long a;
    public final ek2 b;
    public final kke c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final ContextScope g;
    public final q0e h;
    public final w7c i;
    public final q0e j;
    public final w7c k;
    public final AtomicLong l;
    public final AtomicBoolean m;

    public yl0(long j, ek2 ek2Var, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = j;
        this.b = ek2Var;
        this.c = kkeVar;
        this.d = je7Var3;
        this.e = je7Var2;
        this.f = je7Var;
        w9a w9aVar = (w9a) kkeVar;
        ContextScope contextScopeA = j1e.a(w9aVar.b());
        this.g = contextScopeA;
        q0e q0eVarA = r0e.a(nz4.a);
        this.h = q0eVarA;
        this.i = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.j = q0eVarA2;
        q0e q0eVarA3 = r0e.a(null);
        this.k = new w7c(q0eVarA3);
        this.l = new AtomicLong(0L);
        this.m = new AtomicBoolean(false);
        j47.T(contextScopeA, null, null, new sl0(je7Var, this, je7Var4, null), 3);
        od2.L(od2.F(new zn5(new ac(od2.x(od2.u(q0eVarA2, 200L)), 4, this), new vw(2, q0eVarA3, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), w9aVar.b()), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(defpackage.yl0 r15, java.lang.String r16, long r17, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.f(yl0, java.lang.String, long, kotlin.coroutines.Continuation):java.io.Serializable");
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
        return (this.l.get() == -1 && this.m.get()) ? false : true;
    }

    @Override // defpackage.lp8
    public final w7c d() {
        return this.i;
    }

    @Override // defpackage.lp8
    public final void e() {
        if (this.m.compareAndSet(false, true)) {
            j47.T(this.g, null, null, new wl0(this, null), 3).invokeOnCompletion(new l(15, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.ArrayList r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ul0
            if (r0 == 0) goto L13
            r0 = r9
            ul0 r0 = (defpackage.ul0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ul0 r0 = new ul0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r9)
            goto L73
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.od2.a0(r9)
            kke r9 = r7.c
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.a()
            if (r9 != 0) goto L3e
            lx3 r9 = r0.b
        L3e:
            kotlinx.coroutines.internal.ContextScope r9 = defpackage.j1e.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r8.next()
            tl0 r5 = new tl0
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zf4 r4 = defpackage.j47.h(r9, r6, r5, r4)
            r2.add(r4)
            goto L51
        L6a:
            r0.Y = r3
            java.lang.Object r9 = defpackage.pag.c(r2, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = defpackage.x53.e0(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl0.g(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
