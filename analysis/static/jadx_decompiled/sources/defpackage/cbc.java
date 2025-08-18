package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class cbc extends pnf implements ubc {
    public static final /* synthetic */ bc7[] G0 = {new oi9(cbc.class, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cbc.class, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;")};
    public final s35 A0;
    public final s35 B0;
    public final khe C0;
    public volatile AudioFocusRequest D0;
    public final w4d E0;
    public final w4d F0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final bac b;
    public final jac c;
    public final z01 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final q0e v0;
    public final w7c w0;
    public final w7c x0;
    public final w7c y0;
    public final mn5 z0;

    public cbc(bac bacVar, jac jacVar, je7 je7Var, khe kheVar, khe kheVar2) {
        f9g f9gVar = f9g.a;
        z01 z01Var = (z01) f9gVar.getAccessor().c(z01.class);
        khe kheVarD = f9gVar.getAccessor().d(kke.class);
        khe kheVarD2 = f9gVar.getAccessor().d(Context.class);
        khe kheVarD3 = f9gVar.getAccessor().d(lac.class);
        this.b = bacVar;
        this.c = jacVar;
        this.o = z01Var;
        this.X = kheVarD;
        this.Y = kheVarD2;
        this.Z = je7Var;
        this.s0 = kheVar;
        this.t0 = kheVar2;
        this.u0 = kheVarD3;
        q0e q0eVarA = r0e.a(null);
        this.v0 = q0eVarA;
        w7c w7cVar = new w7c(q0eVarA);
        this.w0 = w7cVar;
        w7c w7cVar2 = ((lac) kheVarD3.getValue()).e;
        this.x0 = w7cVar2;
        p70 p70Var = (p70) kheVar2.getValue();
        this.y0 = p70Var != null ? p70Var.c : null;
        this.z0 = ((am7) kheVar.getValue()).d();
        this.A0 = new s35(0);
        this.B0 = new s35(0);
        this.C0 = new khe(new lwa(12, this));
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        od2.L(od2.F(new zn5(new t03(w7cVar, 11), new mac(this, null), 5), ((w9a) ((kke) kheVarD.getValue())).a()), this.a);
        if (bacVar == bac.b) {
            od2.L(od2.F(new zn5(new t03(w7cVar2, 11), new nac(kheVar2, this, null), 5), ((w9a) ((kke) kheVarD.getValue())).a()), this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.cbc r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.vac
            if (r0 == 0) goto L13
            r0 = r6
            vac r0 = (defpackage.vac) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            vac r0 = new vac
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            cbc r5 = r0.o
            defpackage.od2.a0(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.od2.a0(r6)
            je7 r6 = r5.X
            java.lang.Object r6 = r6.getValue()
            kke r6 = (defpackage.kke) r6
            w9a r6 = (defpackage.w9a) r6
            cx7 r6 = r6.c()
            wac r2 = new wac
            r2.<init>(r5, r4)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r6 = defpackage.j47.t0(r6, r2, r0)
            if (r6 != r1) goto L53
            goto L64
        L53:
            r5.C()
            tac r6 = new tac
            r0 = 3
            r1 = 0
            r6.<init>(r0, r1, r1)
            q0e r5 = r5.v0
            r5.m(r4, r6)
            e5f r1 = defpackage.e5f.a
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.q(cbc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.cbc r6, defpackage.bac r7, long r8, byte[] r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r6.getClass()
            java.lang.String r0 = "Media for "
            boolean r1 = r11 instanceof defpackage.yac
            if (r1 == 0) goto L18
            r1 = r11
            yac r1 = (defpackage.yac) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1d
        L18:
            yac r1 = new yac
            r1.<init>(r6, r11)
        L1d:
            java.lang.Object r11 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            e5f r4 = defpackage.e5f.a
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 != r5) goto L35
            bac r7 = r1.X
            cbc r6 = r1.o
            defpackage.od2.a0(r11)     // Catch: java.lang.Throwable -> L32
            goto L6a
        L32:
            r7 = move-exception
            goto Lae
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            defpackage.od2.a0(r11)
            int r11 = r7.ordinal()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto L54
            if (r11 != r5) goto L4e
            vbc r11 = new vbc     // Catch: java.lang.Throwable -> L32
            r11.<init>(r8, r10)     // Catch: java.lang.Throwable -> L32
            goto L59
        L4e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L32
            r7.<init>()     // Catch: java.lang.Throwable -> L32
            throw r7     // Catch: java.lang.Throwable -> L32
        L54:
            wbc r11 = new wbc     // Catch: java.lang.Throwable -> L32
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L32
        L59:
            ybc r8 = r6.w()     // Catch: java.lang.Throwable -> L32
            r1.o = r6     // Catch: java.lang.Throwable -> L32
            r1.X = r7     // Catch: java.lang.Throwable -> L32
            r1.s0 = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = r8.g(r11)     // Catch: java.lang.Throwable -> L32
            if (r11 != r2) goto L6a
            goto Lcc
        L6a:
            o2 r11 = (defpackage.o2) r11     // Catch: java.lang.Throwable -> L32
            if (r11 != 0) goto L9e
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L32
            ir6 r9 = defpackage.hm9.m     // Catch: java.lang.Throwable -> L32
            if (r9 != 0) goto L7b
            goto L9c
        L7b:
            boolean r10 = r9.c()     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto L9c
            us7 r10 = defpackage.us7.s0     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = r7.name()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r11.append(r7)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = " wasn't prepared, we cannot send message"
            r11.append(r7)     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L32
            r11 = 0
            r9.d(r10, r8, r7, r11)     // Catch: java.lang.Throwable -> L32
        L9c:
            r2 = r4
            goto Lcc
        L9e:
            jac r7 = r6.c     // Catch: java.lang.Throwable -> L32
            r7.getClass()     // Catch: java.lang.Throwable -> L32
            dac r8 = new dac     // Catch: java.lang.Throwable -> L32
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L32
            s35 r7 = r7.b     // Catch: java.lang.Throwable -> L32
            defpackage.pnf.o(r7, r8)     // Catch: java.lang.Throwable -> L32
            goto L9c
        Lae:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = r7.getLocalizedMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "We couldn't send record due to "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            defpackage.hm9.p(r6, r8, r7)
            goto L9c
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.r(cbc, bac, long, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.cbc r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.s(cbc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A() {
        q0e q0eVar = this.v0;
        if (((uac) q0eVar.getValue()) instanceof rac) {
            try {
                w().e();
                lac lacVarV = v();
                ContextScope contextScope = this.a;
                if (lacVarV.a == null) {
                    lacVarV.c = System.currentTimeMillis();
                    lacVarV.a = j47.T(contextScope, null, null, new kac(lacVarV, null), 3);
                }
                u().a();
                q0eVar.m(null, new sac(true, true));
                u().c();
            } catch (RuntimeException unused) {
                C();
                q0eVar.m(null, new tac(3, false, false));
            }
        }
    }

    public final void B(boolean z) {
        byte[] bArr;
        if ((this.w0.a.getValue() instanceof sac) || (this.w0.a.getValue() instanceof rac)) {
            Long l = (Long) this.x0.a.getValue();
            long jLongValue = l != null ? l.longValue() : 0L;
            AudioFocusRequest audioFocusRequest = this.D0;
            if (audioFocusRequest != null) {
                ((AudioManager) this.C0.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            }
            if (!z) {
                this.v0.m(null, new tac(false, false));
                C();
                return;
            }
            if (jLongValue < 1000) {
                jac jacVar = this.c;
                bac bacVar = this.b;
                eqe eqeVar = new eqe(mga.g);
                jacVar.getClass();
                pnf.o(jacVar.b, new hac(bacVar, eqeVar));
                this.v0.m(null, new tac(x(), false));
                C();
                return;
            }
            w7c w7cVar = this.y0;
            if (w7cVar == null || (bArr = (byte[]) w7cVar.a.getValue()) == null) {
                bArr = new byte[0];
            }
            byte[] bArr2 = bArr;
            C();
            j47.T(this.a, xq9.a, null, new bbc(this, jLongValue, bArr2, null), 2);
            this.v0.m(null, new tac(2, x(), false));
        }
    }

    public final void C() {
        jac jacVar = this.c;
        bac bacVar = this.b;
        jacVar.getClass();
        pnf.o(jacVar.b, new eac(bacVar, false));
        w().d();
        w().j(null);
        p70 p70Var = (p70) this.t0.getValue();
        if (p70Var != null) {
            p70Var.a.clear();
            p70Var.b.setValue(null);
        }
        u().b(null);
        lac lacVarV = v();
        vxd vxdVar = lacVarV.a;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        lacVarV.a = null;
        lacVarV.b = 0L;
        lacVarV.d.setValue(null);
    }

    @Override // defpackage.pnf
    public final void p() {
        u().release();
        C();
    }

    public final void t() {
        q0e q0eVar = this.v0;
        uac uacVar = (uac) q0eVar.getValue();
        if (uacVar instanceof sac) {
            try {
                w().h();
                v().a();
                q0eVar.m(null, new rac(true));
            } catch (RuntimeException unused) {
                C();
                q0eVar.m(null, new tac(3, false, false));
                return;
            }
        }
        if (uacVar instanceof rac) {
            q0eVar.m(null, new rac(true));
        }
    }

    public final am7 u() {
        return (am7) this.s0.getValue();
    }

    public final lac v() {
        return (lac) this.u0.getValue();
    }

    public final ybc w() {
        return (ybc) this.Z.getValue();
    }

    public final boolean x() {
        uac uacVar = (uac) this.v0.getValue();
        return uacVar instanceof sac ? ((sac) uacVar).b : uacVar instanceof rac;
    }

    public final void y() {
        eqe eqeVar = new eqe(mga.f);
        jac jacVar = this.c;
        jacVar.getClass();
        pnf.o(jacVar.b, new gac(eqeVar));
        this.v0.m(null, new tac(3, false, false));
        p70 p70Var = (p70) this.t0.getValue();
        if (p70Var != null) {
            p70Var.a();
        }
        C();
    }

    public final void z() {
        q0e q0eVar = this.v0;
        if (((uac) q0eVar.getValue()) instanceof sac) {
            try {
                w().h();
                v().a();
                q0eVar.m(null, new rac(false));
            } catch (RuntimeException unused) {
                C();
                q0eVar.m(null, new tac(3, false, false));
            }
        }
    }
}
