package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bp8 extends pnf {
    public final k56 X;
    public final do8 Y;
    public final je7 Z;
    public final long b;
    public final ek2 c;
    public final Integer o;
    public final je7 s0;
    public final je7 t0;
    public Set u0;
    public vxd v0;
    public final khe w0;
    public final w7c x0;
    public final ac y0;

    public bp8(long j, ek2 ek2Var, khe kheVar, Integer num, cp8 cp8Var, k56 k56Var) {
        ko8 ko8Var = ko8.a;
        do8 do8Var = (do8) ko8Var.getAccessor().c(do8.class);
        khe kheVarD = ko8Var.getAccessor().d(kke.class);
        khe kheVarD2 = ko8Var.getAccessor().d(ds3.class);
        this.b = j;
        this.c = ek2Var;
        this.o = num;
        this.X = cp8Var;
        this.Y = do8Var;
        this.Z = kheVarD;
        this.s0 = kheVar;
        this.t0 = kheVarD2;
        this.u0 = wz4.a;
        this.w0 = new khe(new zj7(4, this));
        Continuation continuation = null;
        mn5 mn5VarF = od2.F(od2.d0(new ap8(((lp8) kheVar.getValue()).d(), this, 0), new vp5(continuation, this, 7)), ((w9a) ((kke) kheVarD.getValue())).a());
        nz4 nz4Var = nz4.a;
        w7c w7cVarX = od2.X(mn5VarF, this.a, wld.a, nz4Var);
        this.x0 = w7cVarX;
        this.y0 = od2.t(w7cVarX, ((lp8) kheVar.getValue()).b(), (mn5) k56Var.invoke(), new mk1(this, continuation, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.yn8 r9, defpackage.bp8 r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp8.q(yn8, bp8, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.util.Collection r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.uo8
            if (r0 == 0) goto L13
            r0 = r9
            uo8 r0 = (defpackage.uo8) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            uo8 r0 = new uo8
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r9)
            goto L79
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.od2.a0(r9)
            je7 r9 = r7.Z
            java.lang.Object r9 = r9.getValue()
            kke r9 = (defpackage.kke) r9
            w9a r9 = (defpackage.w9a) r9
            nx3 r9 = r9.b()
            if (r9 != 0) goto L44
            lx3 r9 = r0.b
        L44:
            kotlinx.coroutines.internal.ContextScope r9 = defpackage.j1e.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L57:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r8.next()
            to8 r5 = new to8
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zf4 r4 = defpackage.j47.h(r9, r6, r5, r4)
            r2.add(r4)
            goto L57
        L70:
            r0.Y = r3
            java.lang.Object r9 = defpackage.pag.c(r2, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = defpackage.x53.e0(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp8.r(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
