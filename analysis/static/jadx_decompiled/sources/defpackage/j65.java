package defpackage;

import androidx.media3.transformer.ExportException;

/* loaded from: classes.dex */
public abstract class j65 extends vj0 {
    public long C0;
    public long D0;
    public wqc E0;
    public y84 F0;
    public boolean G0;
    public qy5 H0;
    public qy5 I0;
    public final g03 J0;
    public final wt K0;
    public final p54 L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;

    public j65(int i, g03 g03Var, wt wtVar) {
        super(i);
        this.J0 = g03Var;
        this.K0 = wtVar;
        this.L0 = new p54(0);
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) {
        return vj0.b(ia9.g(qy5Var.n) == this.b ? 4 : 0, 0, 0, 0);
    }

    public final boolean F() throws ExportException {
        if (this.E0 != null) {
            return true;
        }
        if (this.I0 == null) {
            if (this.F0 == null || np8.w(this.H0.n) != 1) {
                this.I0 = M(this.H0);
            } else {
                y84 y84Var = this.F0;
                y84Var.f(false);
                qy5 qy5Var = y84Var.j;
                if (qy5Var == null) {
                    return false;
                }
                this.I0 = M(qy5Var);
            }
        }
        wqc wqcVarC = this.K0.c(this.I0);
        if (wqcVarC == null) {
            return false;
        }
        this.E0 = wqcVarC;
        return true;
    }

    public abstract boolean G();

    public abstract void H(qy5 qy5Var);

    public void J(p54 p54Var) {
    }

    public void K(qy5 qy5Var) {
    }

    public qy5 L(qy5 qy5Var) {
        return qy5Var;
    }

    public qy5 M(qy5 qy5Var) {
        return qy5Var;
    }

    public final boolean N(p54 p54Var) {
        y7g y7gVar = this.c;
        y7gVar.t();
        int iY = y(y7gVar, p54Var, 0);
        if (iY == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        }
        if (iY != -4) {
            return false;
        }
        p54Var.y();
        if (p54Var.f(4)) {
            return true;
        }
        this.J0.c0(this.b, p54Var.Z);
        return true;
    }

    public final boolean O() {
        qy5 qy5Var = this.H0;
        if (qy5Var != null && !this.N0) {
            return true;
        }
        if (qy5Var == null) {
            y7g y7gVar = this.c;
            y7gVar.t();
            if (y(y7gVar, this.L0, 2) != -5) {
                return false;
            }
            qy5 qy5Var2 = (qy5) y7gVar.c;
            qy5Var2.getClass();
            qy5 qy5VarL = L(qy5Var2);
            this.H0 = qy5VarL;
            K(qy5VarL);
            this.N0 = this.K0.g(3, this.H0);
        }
        if (this.N0) {
            if (np8.w(this.H0.n) == 2 && !F()) {
                return false;
            }
            H(this.H0);
            this.N0 = false;
        }
        return true;
    }

    public abstract boolean P(p54 p54Var);

    @Override // defpackage.vj0
    public final m78 j() {
        return this.J0;
    }

    @Override // defpackage.vj0
    public final boolean m() {
        return this.G0;
    }

    @Override // defpackage.vj0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.vj0
    public final void q(boolean z, boolean z2) {
        this.J0.c0(this.b, 0L);
    }

    @Override // defpackage.vj0
    public final void u() {
        y84 y84Var = this.F0;
        if (y84Var != null) {
            y84Var.h();
        }
    }

    @Override // defpackage.vj0
    public final void v() {
        this.M0 = true;
    }

    @Override // defpackage.vj0
    public final void w() {
        this.M0 = false;
    }

    @Override // defpackage.vj0
    public final void x(qy5[] qy5VarArr, long j, long j2) {
        this.C0 = j;
        this.D0 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[Catch: ExportException -> 0x0021, TRY_LEAVE, TryCatch #0 {ExportException -> 0x0021, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:12:0x0016, B:14:0x001c, B:18:0x0025, B:28:0x0049, B:21:0x0031, B:24:0x0038, B:27:0x0040, B:31:0x004d, B:33:0x0053, B:36:0x005d, B:38:0x0061, B:41:0x0068, B:44:0x0070, B:45:0x0072, B:48:0x0080), top: B:55:0x0001 }] */
    @Override // defpackage.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r2, long r4) throws android.media.MediaCodec.CryptoException {
        /*
            r1 = this;
            r2 = 0
            boolean r3 = r1.M0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L89
            boolean r3 = r1.G0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L89
            boolean r3 = r1.O()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L11
            goto L89
        L11:
            y84 r3 = r1.F0     // Catch: androidx.media3.transformer.ExportException -> L21
            r4 = 1
            if (r3 == 0) goto L4d
        L16:
            boolean r3 = r1.F()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L24
            boolean r3 = r1.G()     // Catch: androidx.media3.transformer.ExportException -> L21
            goto L25
        L21:
            r3 = move-exception
            goto L8a
        L24:
            r3 = r2
        L25:
            y84 r5 = r1.F0     // Catch: androidx.media3.transformer.ExportException -> L21
            p54 r0 = r1.L0     // Catch: androidx.media3.transformer.ExportException -> L21
            boolean r5 = r5.e(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L31
        L2f:
            r5 = r2
            goto L49
        L31:
            boolean r5 = r1.N(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L38
            goto L2f
        L38:
            boolean r5 = r1.P(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 == 0) goto L40
        L3e:
            r5 = r4
            goto L49
        L40:
            r1.J(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            y84 r5 = r1.F0     // Catch: androidx.media3.transformer.ExportException -> L21
            r5.g(r0)     // Catch: androidx.media3.transformer.ExportException -> L21
            goto L3e
        L49:
            r3 = r3 | r5
            if (r3 != 0) goto L16
            goto L91
        L4d:
            boolean r3 = r1.F()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 == 0) goto L91
        L53:
            wqc r3 = r1.E0     // Catch: androidx.media3.transformer.ExportException -> L21
            p54 r3 = r3.d()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r3 != 0) goto L5d
        L5b:
            r3 = r2
            goto L86
        L5d:
            boolean r5 = r1.O0     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L72
            boolean r5 = r1.N(r3)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L68
            goto L5b
        L68:
            boolean r5 = r1.P(r3)     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 == 0) goto L70
            r3 = r4
            goto L86
        L70:
            r1.O0 = r4     // Catch: androidx.media3.transformer.ExportException -> L21
        L72:
            r5 = 4
            boolean r3 = r3.f(r5)     // Catch: androidx.media3.transformer.ExportException -> L21
            wqc r5 = r1.E0     // Catch: androidx.media3.transformer.ExportException -> L21
            boolean r5 = r5.f()     // Catch: androidx.media3.transformer.ExportException -> L21
            if (r5 != 0) goto L80
            goto L5b
        L80:
            r1.O0 = r2     // Catch: androidx.media3.transformer.ExportException -> L21
            r1.G0 = r3     // Catch: androidx.media3.transformer.ExportException -> L21
            r3 = r3 ^ 1
        L86:
            if (r3 == 0) goto L91
            goto L53
        L89:
            return
        L8a:
            r1.M0 = r2
            wt r1 = r1.K0
            r1.d(r3)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j65.z(long, long):void");
    }
}
