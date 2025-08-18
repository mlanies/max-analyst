package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class xp8 implements mp8, kq8 {
    public final ds3 a;
    public final iy2 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ContextScope f;
    public final AtomicBoolean g;
    public final q0e h;
    public final q0e i;
    public final q0e j;
    public final w7c k;
    public final kld l;

    public xp8(ds3 ds3Var, iy2 iy2Var, eo8 eo8Var, kke kkeVar, je7 je7Var, je7 je7Var2, khe kheVar) {
        this.a = ds3Var;
        this.b = iy2Var;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = kheVar;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        this.f = contextScopeA;
        this.g = new AtomicBoolean(false);
        nz4 nz4Var = nz4.a;
        this.h = r0e.a(nz4Var);
        this.i = r0e.a(nz4Var);
        q0e q0eVarA = r0e.a(nz4Var);
        this.j = q0eVarA;
        this.k = new w7c(q0eVarA);
        this.l = lld.b(0, 0, 0, 7);
        od2.L(new zn5(eo8Var.c, new op8(this, null), 5), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xp8 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.tp8
            if (r0 == 0) goto L16
            r0 = r6
            tp8 r0 = (defpackage.tp8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            tp8 r0 = new tp8
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.X
            xp8 r1 = r0.o
            defpackage.od2.a0(r6)
            goto L66
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            xp8 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L51
        L3f:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.s0 = r4
            ds3 r6 = r5.a
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L51
            goto L92
        L51:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L64
            goto L92
        L64:
            r1 = r5
            r5 = r6
        L66:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            g27 r5 = new g27
            r2 = 14
            r5.<init>(r2)
            qk5 r5 = defpackage.l6d.a0(r6, r5)
            je7 r6 = r1.e
            java.lang.Object r6 = r6.getValue()
            tya r6 = (defpackage.tya) r6
            lx3 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r1 = defpackage.j1e.a(r0)
            mb r2 = new mb
            r3 = 1
            r2.<init>(r1, r0, r6, r3)
            r1f r1 = new r1f
            r1.<init>(r5, r2)
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp8.a(xp8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[LOOP:0: B:24:0x0088->B:26:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(defpackage.xp8 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.vp8
            if (r0 == 0) goto L16
            r0 = r6
            vp8 r0 = (defpackage.vp8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            vp8 r0 = new vp8
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.X
            xp8 r1 = r0.o
            defpackage.od2.a0(r6)
            goto L71
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            xp8 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L5c
        L3f:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.s0 = r4
            iy2 r6 = r5.b
            jz2 r6 = (defpackage.jz2) r6
            p82 r6 = r6.l()
            un0 r2 = new un0
            r4 = 22
            r2.<init>(r4)
            java.util.ArrayList r6 = r6.x(r2)
            if (r6 != r1) goto L5c
            goto La2
        L5c:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.i
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L6f
            goto La2
        L6f:
            r1 = r5
            r5 = r6
        L71:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            lx3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r6 = defpackage.j1e.a(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r5, r2)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L88:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r5.next()
            up8 r3 = new up8
            r4 = 0
            r3.<init>(r2, r4, r1)
            r2 = 3
            zf4 r2 = defpackage.j47.h(r6, r4, r3, r2)
            r0.add(r2)
            goto L88
        La1:
            r1 = r0
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp8.b(xp8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public static final ArrayList c(xp8 xp8Var, List list, String str) {
        String strB;
        xp8Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            uj3 uj3Var = (uj3) obj;
            if (!eae.o0(String.valueOf(uj3Var.o()), str, false)) {
                je7 je7Var = xp8Var.d;
                if (((b0d) je7Var.getValue()).h(String.valueOf(uj3Var.d()), str) || ((strB = bre.b(uj3Var.g())) != null && ((b0d) je7Var.getValue()).h(strB, str))) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
