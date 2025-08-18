package defpackage;

import android.animation.ValueAnimator;
import android.util.Rational;
import android.util.Size;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ejf implements ybc, ygf, uif {
    public static final /* synthetic */ bc7[] N0;
    public static final px1 O0;
    public final q0e A0;
    public gte B0;
    public volatile boolean C0;
    public final q0e D0;
    public final w7c E0;
    public volatile cdc F0;
    public final q0e G0;
    public final w7c H0;
    public float I0;
    public ValueAnimator J0;
    public bx1 K0;
    public final AtomicBoolean L0;
    public final w4d M0;
    public final je7 X;
    public ubc Y;
    public k9b Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final khe s0;
    public final ContextScope t0;
    public volatile h7b u0;
    public h8b v0;
    public zgf w0;
    public adc x0;
    public rdf y0;
    public hg7 z0;

    static {
        oi9 oi9Var = new oi9(ejf.class, "recordingJob", "getRecordingJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        N0 = new bc7[]{oi9Var};
        O0 = px1.b;
    }

    public ejf(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        xm7 xm7VarR;
        gag gagVar;
        f9g f9gVar = f9g.a;
        iba ibaVar = (iba) f9gVar.getAccessor().c(iba.class);
        khe kheVarD = f9gVar.getAccessor().d(kke.class);
        khe kheVarD2 = f9gVar.getAccessor().d(qe5.class);
        this.a = je7Var;
        this.b = je7Var3;
        this.c = je7Var2;
        this.o = kheVarD;
        this.X = kheVarD2;
        this.s0 = new khe(new gba(ibaVar, 2));
        this.t0 = j1e.a(((w9a) ((kke) kheVarD.getValue())).c().plus(f46.a()));
        this.A0 = r0e.a(new vif(new Size(0, 0), null, null));
        q0e q0eVarA = r0e.a(new xgf(false, false));
        this.D0 = q0eVarA;
        this.E0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(Boolean.FALSE);
        this.G0 = q0eVarA2;
        this.H0 = new w7c(q0eVarA2);
        yw1 yw1VarM = m();
        this.I0 = (yw1VarM == null || (xm7VarR = ((fjc) yw1VarM).b.r()) == null || (gagVar = (gag) xm7VarR.d()) == null) ? 1.0f : gagVar.c();
        this.L0 = new AtomicBoolean(false);
        this.M0 = mqd.D();
    }

    @Override // defpackage.ybc
    public final int a() {
        return 0;
    }

    @Override // defpackage.ybc
    public final boolean b() {
        return this.F0 != null;
    }

    @Override // defpackage.uif
    public final void c() {
        String name = ejf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "onFirstVideoFrameRendered", null);
        }
        zgf zgfVar = this.w0;
        if (zgfVar != null) {
            rpc rpcVar = new rpc(14, this);
            lee leeVar = zgfVar.e;
            sif sifVar = leeVar instanceof sif ? (sif) leeVar : null;
            if (sifVar != null) {
                String str = sifVar.a;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str, "captureFrame", null);
                }
                sif.g(sifVar, new khf(sifVar, 2, rpcVar), new bse(12), 2);
            }
        }
    }

    @Override // defpackage.ybc
    public final void d() {
        String name = ejf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "stopRecording videoMessage", null);
        }
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.b.d(eg7.ON_STOP);
        }
        cdc cdcVar = this.F0;
        if (cdcVar != null) {
            cdcVar.close();
        }
        this.F0 = null;
        this.C0 = false;
    }

    @Override // defpackage.ybc
    public final void e() {
        String name = ejf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "resumeRecording videoMessage", null);
        }
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.b.d(eg7.ON_RESUME);
        }
        cdc cdcVar = this.F0;
        if (cdcVar != null) {
            cdcVar.n();
        }
        this.C0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ybc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r8, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.xif
            if (r0 == 0) goto L13
            r0 = r10
            xif r0 = (defpackage.xif) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            xif r0 = new xif
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r10)
            goto L6d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.od2.a0(r10)
            je7 r10 = r7.b
            java.lang.Object r10 = r10.getValue()
            zi5 r10 = (defpackage.zi5) r10
            java.lang.String r8 = java.lang.String.valueOf(r8)
            kk5 r10 = (defpackage.kk5) r10
            java.io.File r8 = r10.n(r8)
        L44:
            q0e r9 = r7.A0
            java.lang.Object r10 = r9.getValue()
            r2 = r10
            vif r2 = (defpackage.vif) r2
            java.lang.String r4 = r8.getAbsolutePath()
            r5 = 5
            r6 = 0
            vif r2 = defpackage.vif.a(r2, r6, r4, r6, r5)
            boolean r9 = r9.c(r10, r2)
            if (r9 == 0) goto L44
            zif r9 = new zif
            r9.<init>(r7, r8, r6)
            r0.Y = r3
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = defpackage.fp3.I(r7, r9, r0)
            if (r10 != r1) goto L6d
            return r1
        L6d:
            e5f r10 = (defpackage.e5f) r10
            if (r10 == 0) goto L74
            e5f r7 = defpackage.e5f.a
            return r7
        L74:
            one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException r7 = new one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException
            r8 = 0
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.f(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.ybc
    public final Object g(xbc xbcVar) {
        String str;
        String str2;
        h7b h7bVar = this.u0;
        if (h7bVar == null || (str = ((vif) this.A0.getValue()).b) == null || (str2 = ((vif) this.A0.getValue()).c) == null) {
            return null;
        }
        Size size = ((vif) this.A0.getValue()).a;
        return new fif(str, size.getWidth(), size.getHeight(), ((wbc) xbcVar).a, str2, h7bVar);
    }

    @Override // defpackage.ybc
    public final void h() {
        String name = ejf.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "pauseRecording videoMessage", null);
        }
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.b.d(eg7.ON_PAUSE);
        }
        cdc cdcVar = this.F0;
        if (cdcVar != null) {
            cdcVar.m();
        }
        this.C0 = true;
    }

    @Override // defpackage.ybc
    public final boolean i() {
        return ((eua) this.c.getValue()).b(eua.p);
    }

    @Override // defpackage.ybc
    public final void j(cbc cbcVar) {
        this.Y = cbcVar;
    }

    public final void k(eh7 eh7Var, px1 px1Var) {
        h8b h8bVar;
        k9b k9bVar = this.Z;
        if (k9bVar != null) {
            k9bVar.f();
        }
        hg7 hg7VarC = null;
        try {
            h8bVar = this.v0;
        } catch (Throwable th) {
            hm9.p(ejf.class.getName(), "fail to bindCameraToLifecycle", th);
        }
        if (h8bVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        rdf rdfVar = this.y0;
        if (rdfVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        zgf zgfVar = this.w0;
        if (zgfVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Rational rational = new Rational(1, 1);
        int iK = h8bVar.k();
        uof uofVar = new uof();
        uofVar.a = 1;
        uofVar.b = rational;
        uofVar.c = iK;
        uofVar.d = 0;
        k9b k9bVar2 = this.Z;
        if (k9bVar2 != null) {
            s9f s9fVar = new s9f();
            s9fVar.a(h8bVar);
            s9fVar.a(rdfVar);
            s9fVar.a = uofVar;
            s9fVar.c.add(zgfVar);
            hg7VarC = k9bVar2.c(eh7Var, px1Var, s9fVar.b());
        }
        this.z0 = hg7VarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(android.util.Size r18, defpackage.g8b r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.l(android.util.Size, g8b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final yw1 m() {
        hg7 hg7Var = this.z0;
        if (hg7Var != null) {
            return hg7Var.c.C0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(android.util.Size r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ajf
            if (r0 == 0) goto L13
            r0 = r8
            ajf r0 = (defpackage.ajf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            ajf r0 = new ajf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            sif r6 = r0.Y
            sif r7 = r0.X
            ejf r0 = r0.o
            defpackage.od2.a0(r8)
            goto L64
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.od2.a0(r8)
            sif r8 = new sif
            r8.<init>(r7)
            je7 r2 = r6.o
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            bjf r4 = new bjf
            r5 = 0
            r4.<init>(r7, r5)
            r0.o = r6
            r0.X = r8
            r0.Y = r8
            r0.t0 = r3
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r0 = r6
            r6 = r8
            r8 = r7
            r7 = r6
        L64:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L88
            r6.h(r8, r3)
            java.util.concurrent.CopyOnWriteArraySet r6 = r7.Y
            tif r8 = new tif
            r8.<init>(r0)
            r6.add(r8)
            zgf r6 = new zgf
            al9 r8 = new al9
            r1 = 21
            r8.<init>(r1)
            zh6 r1 = r7.X
            r6.<init>(r1, r7, r8)
            r0.w0 = r6
            e5f r6 = defpackage.e5f.a
            return r6
        L88:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.n(android.util.Size, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
