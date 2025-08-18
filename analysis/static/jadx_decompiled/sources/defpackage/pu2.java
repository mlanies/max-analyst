package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* loaded from: classes.dex */
public final class pu2 implements jl6 {
    public final ContextScope A0;
    public final q40 B0;
    public final tm3 X;
    public final a Y;
    public final je7 Z;
    public final nl6 a;
    public final kke b;
    public final ox3 c;
    public final ci0 o;
    public final je7 s0;
    public final je7 t0;
    public final AtomicBoolean u0 = new AtomicBoolean(true);
    public final AtomicBoolean v0 = new AtomicBoolean(false);
    public final dx3 w0 = new dx3();
    public final q0e x0 = r0e.a(mt2.c);
    public final nu2 y0 = new nu2(this);
    public final String z0;

    public pu2(String str, khe kheVar, nl6 nl6Var, khe kheVar2, kke kkeVar, ox3 ox3Var, et5 et5Var, tm3 tm3Var, a aVar, je7 je7Var) {
        this.a = nl6Var;
        this.b = kkeVar;
        this.c = ox3Var;
        this.o = et5Var;
        this.X = tm3Var;
        this.Y = aVar;
        this.Z = kheVar;
        this.s0 = kheVar2;
        this.t0 = je7Var;
        String strConcat = pu2.class.getName().concat(str.replace('.', '_'));
        this.z0 = strConcat;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).a().plus(ox3Var));
        this.A0 = contextScopeA;
        q40 q40Var = new q40(contextScopeA, "chats-list-job-executor#".concat(str), new ai0(7));
        this.B0 = q40Var;
        hm9.n(strConcat, "init " + this);
        od2.L(new zn5((kld) q40Var.o, new q87(q40Var, new xt2(this, null), null), 5), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e A[LOOP:1: B:51:0x0138->B:53:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202 A[LOOP:4: B:83:0x01fc->B:85:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List, xs] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.pu2 r16, defpackage.gt2 r17, kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.a(pu2, gt2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.pu2 r16, defpackage.mm3 r17, kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.b(pu2, mm3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.du2
            if (r0 == 0) goto L13
            r0 = r5
            du2 r0 = (defpackage.du2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            du2 r0 = new du2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.v0
            r5.set(r3)
            nl6 r5 = r4.a
            r5.j = r4
            q40 r5 = r4.B0
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.v0
            r5.set(r3)
            q40 r5 = r4.B0
            eu2 r0 = new eu2
            r1 = 0
            r0.<init>(r4, r1)
            defpackage.q40.o(r5, r0)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fu2
            if (r0 == 0) goto L13
            r0 = r5
            fu2 r0 = (defpackage.fu2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fu2 r0 = new fu2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.u0
            r2 = 0
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L5f
            je7 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            qd5 r5 = (defpackage.qd5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            java.util.List r5 = (java.util.List) r5
            dx3 r0 = r4.w0
            r0.addAll(r5)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f(r0)
        L5f:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (this.v0.compareAndSet(false, true)) {
            q40.o(this.B0, new gu2(this, null)).invokeOnCompletion(new l(28, this));
        }
    }

    public final void f(long j) {
        String str = this.z0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j, "loadNext: "), null);
        }
        nl6 nl6Var = this.a;
        yx4 yx4Var = nl6Var.e;
        if (yx4Var != null) {
            yx4Var.b("loadNext: " + yx4.a(j));
        }
        nl6Var.q();
        if (!nl6Var.d().i().isEmpty()) {
            if (yx4Var != null) {
                yx4Var.b("loadNext: Chunks not empty, started loading from datasources");
            }
            vk6 vk6VarO = ft.o(nl6Var.f(j));
            if (vk6VarO != null) {
                j = vk6VarO.getC();
            }
            nl6Var.j(nl6Var.b, j, false, true, false);
            nl6Var.k(nl6Var.c, j, false, true);
        } else {
            nl6Var.l(j);
        }
        if (yx4Var != null) {
            kq0.u(yx4Var, nl6Var.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ou2
            if (r0 == 0) goto L13
            r0 = r5
            ou2 r0 = (defpackage.ou2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ou2 r0 = new ou2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pu2 r4 = r0.o
            defpackage.od2.a0(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r5)
            je7 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            qd5 r5 = (defpackage.qd5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.util.List r5 = (java.util.List) r5
            dx3 r0 = r4.w0
            r0.clear()
            dx3 r4 = r4.w0
            r4.addAll(r5)
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
