package defpackage;

import android.util.LongSparseArray;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class jq8 extends pnf {
    public static final /* synthetic */ bc7[] K0 = {new oi9(jq8.class, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, jq8.class, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;"), new oi9(jq8.class, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;")};
    public final rn8 A0;
    public final w4d B0;
    public final w4d C0;
    public final w4d D0;
    public final LongSparseArray E0;
    public final q0e F0;
    public final w7c G0;
    public final s35 H0;
    public final khe I0;
    public final String J0;
    public final y7d X;
    public final q33 Y;
    public final kke Z;
    public final long b;
    public final long c;
    public final long o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public jq8(long j, long j2, long j3) {
        o19 o19Var = o19.a;
        y7d y7dVar = (y7d) o19Var.getAccessor().c(y7d.class);
        q33 q33Var = (q33) o19Var.getAccessor().c(q33.class);
        kke dispatchers = o19Var.getDispatchers();
        khe kheVarD = o19Var.getAccessor().d(iy2.class);
        khe kheVarD2 = o19Var.getAccessor().d(r79.class);
        khe kheVarD3 = o19Var.getAccessor().d(blb.class);
        khe kheVarD4 = o19Var.getAccessor().d(w7b.class);
        khe kheVarD5 = o19Var.getAccessor().d(mc6.class);
        khe kheVarD6 = o19Var.getAccessor().d(cc6.class);
        khe kheVarD7 = o19Var.getAccessor().d(u7b.class);
        khe kheVarD8 = o19Var.getAccessor().d(xb9.class);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = y7dVar;
        this.Y = q33Var;
        this.Z = dispatchers;
        this.s0 = kheVarD;
        this.t0 = kheVarD2;
        this.u0 = kheVarD3;
        this.v0 = kheVarD4;
        this.w0 = kheVarD5;
        this.x0 = kheVarD6;
        this.y0 = kheVarD7;
        this.z0 = kheVarD8;
        v4 v4Var = ((o29) o19Var.getAccessor().c(o29.class)).a;
        this.A0 = new rn8(j2, j, (av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
        this.B0 = mqd.D();
        this.C0 = mqd.D();
        this.D0 = mqd.D();
        this.E0 = new LongSparseArray();
        q0e q0eVarA = r0e.a(nz4.a);
        this.F0 = q0eVarA;
        this.G0 = new w7c(q0eVarA);
        this.H0 = new s35(0);
        this.I0 = new khe(new zj7(5, this));
        this.J0 = jq8.class.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.jq8 r20) {
        /*
            r0 = r20
            android.util.LongSparseArray r1 = r0.E0
            int r2 = r1.size()
            if (r2 != 0) goto Lc
            goto L7f
        Lc:
            q0e r0 = r0.F0
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()
            ol7 r4 = (defpackage.ol7) r4
            boolean r6 = r4 instanceof defpackage.jn8
            if (r6 == 0) goto L37
            r5 = r4
            jn8 r5 = (defpackage.jn8) r5
        L37:
            if (r5 == 0) goto L70
            long r5 = r5.a
            int r7 = r1.indexOfKey(r5)
            if (r7 < 0) goto L70
            jn8 r4 = (defpackage.jn8) r4
            java.lang.Object r5 = r1.get(r5)
            r16 = r5
            v5c r16 = (defpackage.v5c) r16
            long r7 = r4.a
            jn8 r5 = new jn8
            boolean r15 = r4.t0
            boolean r13 = r4.u0
            java.lang.CharSequence r9 = r4.b
            jqe r10 = r4.c
            java.lang.String r11 = r4.o
            boolean r12 = r4.X
            r19 = r1
            r20 = r2
            long r1 = r4.Y
            java.lang.CharSequence r4 = r4.Z
            r6 = r5
            r18 = r13
            r13 = r1
            r1 = r15
            r15 = r4
            r17 = r1
            r6.<init>(r7, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            r4 = r5
            goto L74
        L70:
            r19 = r1
            r20 = r2
        L74:
            r3.add(r4)
            r2 = r20
            r1 = r19
            goto L23
        L7c:
            r0.m(r5, r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.q(jq8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.jq8 r9, defpackage.e52 r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.bq8
            if (r0 == 0) goto L13
            r0 = r11
            bq8 r0 = (defpackage.bq8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            bq8 r0 = new bq8
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.o
            ti9 r9 = (defpackage.ti9) r9
            defpackage.od2.a0(r11)
            goto La7
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.o
            ti9 r9 = (defpackage.ti9) r9
            defpackage.od2.a0(r11)
            goto L95
        L44:
            e52 r10 = r0.X
            java.lang.Object r9 = r0.o
            jq8 r9 = (defpackage.jq8) r9
            defpackage.od2.a0(r11)
            goto L68
        L4e:
            defpackage.od2.a0(r11)
            je7 r11 = r9.t0
            java.lang.Object r11 = r11.getValue()
            r79 r11 = (defpackage.r79) r11
            r0.o = r9
            r0.X = r10
            r0.s0 = r6
            long r6 = r9.c
            java.lang.Object r11 = r11.a(r6, r0)
            if (r11 != r1) goto L68
            goto Lb2
        L68:
            cu8 r11 = (defpackage.cu8) r11
            boolean r2 = r9.w()
            q0e r6 = r9.F0
            r7 = 0
            if (r2 == 0) goto Lac
            if (r11 != 0) goto L76
            goto Lac
        L76:
            k92 r2 = r10.b
            int r2 = r2.c()
            k92 r8 = r10.b
            java.util.Map r8 = r8.e
            int r8 = r8.size()
            if (r2 > r8) goto L99
            r0.o = r6
            r0.X = r7
            r0.s0 = r5
            r2 = 0
            java.io.Serializable r11 = r9.u(r10, r11, r2, r0)
            if (r11 != r1) goto L94
            goto Lb2
        L94:
            r9 = r6
        L95:
            r9.setValue(r11)
            goto Laa
        L99:
            r0.o = r6
            r0.X = r7
            r0.s0 = r4
            java.io.Serializable r11 = r9.v(r10, r11, r0)
            if (r11 != r1) goto La6
            goto Lb2
        La6:
            r9 = r6
        La7:
            r9.setValue(r11)
        Laa:
            r1 = r3
            goto Lb2
        Lac:
            nz4 r9 = defpackage.nz4.a
            r6.m(r7, r9)
            goto Laa
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.r(jq8, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.jq8 r5, defpackage.e52 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.dq8
            if (r0 == 0) goto L13
            r0 = r7
            dq8 r0 = (defpackage.dq8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            dq8 r0 = new dq8
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            jq8 r5 = r0.o
            defpackage.od2.a0(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.od2.a0(r7)
            java.lang.String r7 = r5.J0
            java.lang.String r2 = "load reactions"
            defpackage.hm9.n(r7, r2)
            kke r7 = r5.Z
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            eq8 r2 = new eq8
            r2.<init>(r5, r6, r3)
            r0.o = r5
            r0.Z = r4
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L54
            goto L97
        L54:
            kx8 r7 = (defpackage.kx8) r7
            java.lang.String r6 = r5.J0
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L5d
            goto L74
        L5d:
            boolean r1 = r0.c()
            if (r1 == 0) goto L74
            us7 r1 = defpackage.us7.X
            java.util.List r2 = r7.a
            int r2 = r2.size()
            java.lang.String r4 = "reactions count: "
            java.lang.String r2 = defpackage.zr6.h(r2, r4)
            r0.d(r1, r6, r2, r3)
        L74:
            android.util.LongSparseArray r6 = r5.E0
            r6.clear()
            java.util.List r6 = r7.a
            java.util.Iterator r6 = r6.iterator()
        L7f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L95
            java.lang.Object r7 = r6.next()
            ex8 r7 = (defpackage.ex8) r7
            android.util.LongSparseArray r0 = r5.E0
            long r1 = r7.a
            v5c r7 = r7.b
            r0.put(r1, r7)
            goto L7f
        L95:
            e5f r1 = defpackage.e5f.a
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.s(jq8, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pnf
    public final void p() {
        this.E0.clear();
        rn8 rn8Var = this.A0;
        rn8Var.c.f(rn8Var);
    }

    public final e52 t() {
        return (e52) ((jz2) ((iy2) this.s0.getValue())).m(this.b).a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x00a5, B:26:0x00ad], limit reached: 102 */
    /* JADX WARN: Path cross not found for [B:26:0x00ad, B:22:0x00a5], limit reached: 102 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024d  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0193 -> B:17:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable u(defpackage.e52 r17, defpackage.cu8 r18, boolean r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.u(e52, cu8, boolean, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [kl7, r2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable v(defpackage.e52 r8, defpackage.cu8 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.v(e52, cu8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final boolean w() {
        e52 e52VarT = t();
        if (e52VarT == null || e52VarT.M() || e52VarT.I() || this.o == 0) {
            return false;
        }
        k92 k92Var = e52VarT.b;
        return k92Var.c() <= ((Number) this.I0.getValue()).intValue() && k92Var.c() > 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fq8
            if (r0 == 0) goto L13
            r0 = r7
            fq8 r0 = (defpackage.fq8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            fq8 r0 = new fq8
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jq8 r6 = r0.X
            jq8 r0 = r0.o
            defpackage.od2.a0(r7)
            goto L54
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.od2.a0(r7)
            je7 r7 = r6.u0
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            q33 r2 = r6.Y
            hyc r2 = (defpackage.hyc) r2
            long r4 = r2.t()
            r0.o = r6
            r0.X = r6
            r0.s0 = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r0 = r6
        L54:
            oab r7 = (defpackage.oab) r7
            uj3 r7 = r7.d
            wm3 r7 = defpackage.iz7.t(r7)
            je7 r1 = r0.y0
            java.lang.Object r1 = r1.getValue()
            u7b r1 = (defpackage.u7b) r1
            q33 r0 = r0.Y
            hyc r0 = (defpackage.hyc) r0
            long r2 = r0.t()
            r7b r0 = r1.b(r2)
            s7b r0 = defpackage.iz7.m(r0)
            dk2 r1 = new dk2
            r2 = 0
            r1.<init>(r7, r0, r2)
            jn8 r6 = r6.y(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jn8 y(dk2 dk2Var) {
        jqe iqeVar;
        int i = ((u7b) this.y0.getValue()).b(dk2Var.a.a).a;
        boolean z = i == 10 || i == 20 || i == 40;
        kk0 kk0Var = kk0.c;
        wm3 wm3Var = dk2Var.a;
        String strD = wm3Var.d(kk0Var);
        vm3 vm3Var = vm3.BOT;
        List list = wm3Var.u0;
        boolean zContains = list.contains(vm3Var);
        long j = wm3Var.a;
        if (zContains && list.contains(vm3.SERVICE_ACCOUNT)) {
            iqeVar = new eqe(oda.w0);
        } else if (list.contains(vm3Var)) {
            iqeVar = new eqe(oda.u);
        } else {
            w7b w7bVar = (w7b) this.v0.getValue();
            w7bVar.getClass();
            uj3 uj3VarH = ((el3) ((zxc) w7bVar.X.getValue()).a.c(el3.class)).h(j, false);
            boolean z2 = uj3VarH != null && uj3VarH.c();
            s7b s7bVar = dk2Var.b;
            iqeVar = new iqe(w7bVar.a(j, z2, s7bVar != null ? iz7.l(s7bVar) : null));
        }
        jqe jqeVar = iqeVar;
        String strA = wm3Var.a();
        String str = strA == null ? "" : strA;
        if (strD == null) {
            strD = "";
        }
        v5c v5cVar = (v5c) this.E0.get(j);
        boolean z3 = j == ((hyc) this.Y).t();
        Pattern pattern = fca.a;
        String strB = wm3Var.b();
        return new jn8(wm3Var.a, str, jqeVar, strD, z, dk2Var.c, fca.b(strB != null ? strB : "", wm3Var.c()), v5cVar, true, z3);
    }
}
