package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class i7e extends pnf {
    public final g6e X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final b6e c;
    public final kke o;
    public final je7 s0;
    public final s35 t0 = new s35(0);
    public final s35 u0 = new s35(0);
    public final q0e v0;
    public final w7c w0;
    public final us x0;

    public i7e(long j, b6e b6eVar, kke kkeVar, g6e g6eVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.b = j;
        this.c = b6eVar;
        this.o = kkeVar;
        this.X = g6eVar;
        this.Y = je7Var;
        this.Z = je7Var2;
        this.s0 = je7Var3;
        q0e q0eVarA = r0e.a(xnd.c);
        this.v0 = q0eVarA;
        this.w0 = new w7c(q0eVarA);
        this.x0 = new us(0);
        od2.L(od2.F(new zn5(new j31(b6eVar.e, g6eVar.e, c7e.s0, 4), new d7e(this, null), 5), ((w9a) kkeVar).b()), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.i7e r10, java.util.List r11, defpackage.d6e r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.e7e
            if (r0 == 0) goto L16
            r0 = r13
            e7e r0 = (defpackage.e7e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            e7e r0 = new e7e
            r0.<init>(r10, r13)
        L1b:
            java.lang.Object r13 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            i7e r10 = r0.o
            defpackage.od2.a0(r13)
            goto Lc5
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            i7e r10 = r0.o
            defpackage.od2.a0(r13)
            goto L8e
        L3e:
            defpackage.od2.a0(r13)
            java.lang.Class<i7e> r13 = defpackage.i7e.class
            java.lang.String r13 = r13.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L4c
            goto L7c
        L4c:
            boolean r5 = r2.c()
            if (r5 == 0) goto L7c
            us7 r5 = defpackage.us7.X
            int r6 = r11.size()
            r12.getClass()
            d6e r7 = defpackage.g6e.k
            if (r12 != r7) goto L61
            r7 = r3
            goto L62
        L61:
            r7 = 0
        L62:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Showcase content. Sets size from sections:"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ", search in initial:"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r2.d(r5, r13, r6, r7)
        L7c:
            r12.getClass()
            d6e r13 = defpackage.g6e.k
            if (r12 != r13) goto La1
            r0.o = r10
            r0.Z = r3
            java.lang.Object r13 = r10.t(r11, r0)
            if (r13 != r1) goto L8e
            goto Lcf
        L8e:
            java.util.List r13 = (java.util.List) r13
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L99
            xnd r11 = defpackage.xnd.c
            goto Lc8
        L99:
            xnd r11 = new xnd
            wnd r12 = defpackage.wnd.b
            r11.<init>(r12, r13)
            goto Lc8
        La1:
            boolean r11 = r12.b
            if (r11 == 0) goto Lba
            q0e r11 = r10.v0
            java.lang.Object r11 = r11.getValue()
            xnd r11 = (defpackage.xnd) r11
            wnd r12 = defpackage.wnd.a
            java.util.List r13 = r11.b
            r11.getClass()
            xnd r11 = new xnd
            r11.<init>(r12, r13)
            goto Lc8
        Lba:
            r0.o = r10
            r0.Z = r4
            java.lang.Object r13 = r10.s(r12, r0)
            if (r13 != r1) goto Lc5
            goto Lcf
        Lc5:
            r11 = r13
            xnd r11 = (defpackage.xnd) r11
        Lc8:
            q0e r10 = r10.v0
            r10.setValue(r11)
            e5f r1 = defpackage.e5f.a
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.q(i7e, java.util.List, d6e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean r() {
        List list;
        g6e g6eVar = this.X;
        if (!g6eVar.a()) {
            Long l = (Long) this.c.f.get();
            if ((l != null && l.longValue() == 0) || !(!((Collection) r8.d.getValue()).isEmpty())) {
                return false;
            }
        } else if (((c6e) g6eVar.g.get()).a == 0 || (list = ((d6e) g6eVar.d.getValue()).a) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.d6e r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.f7e
            if (r0 == 0) goto L13
            r0 = r8
            f7e r0 = (defpackage.f7e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            f7e r0 = new f7e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wnd r6 = r0.o
            defpackage.od2.a0(r8)
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.od2.a0(r8)
            java.util.List r8 = r7.a
            wnd r2 = defpackage.wnd.o
            if (r8 == 0) goto L44
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L41
            goto L44
        L41:
            wnd r8 = defpackage.wnd.c
            goto L45
        L44:
            r8 = r2
        L45:
            nz4 r4 = defpackage.nz4.a
            if (r8 != r2) goto L4a
            goto L62
        L4a:
            java.util.List r7 = r7.a
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r4 = r7
        L50:
            r0.o = r8
            r0.Z = r3
            java.lang.Object r6 = r6.t(r4, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r5 = r8
            r8 = r6
            r6 = r5
        L5e:
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r8 = r6
        L62:
            xnd r6 = new xnd
            r6.<init>(r8, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.s(d6e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.util.List r39, kotlin.coroutines.Continuation r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i7e.t(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
