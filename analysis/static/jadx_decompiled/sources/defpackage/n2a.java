package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class n2a {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public n2a(int i) {
        switch (i) {
            case 1:
                this.f = new int[255];
                this.g = new wpa(255);
                break;
            default:
                this.f = new int[255];
                this.g = new yaf(255);
                break;
        }
    }

    public boolean a(ra4 ra4Var, boolean z) throws ParserException, EOFException {
        boolean zQ;
        boolean zQ2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        yaf yafVar = (yaf) this.g;
        yafVar.E(27);
        try {
            zQ = ra4Var.q(yafVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zQ = false;
        }
        if (!zQ || yafVar.w() != 1332176723) {
            return false;
        }
        if (yafVar.v() != 0) {
            if (z) {
                return false;
            }
            throw ParserException.c("unsupported bit stream revision");
        }
        this.a = yafVar.v();
        this.b = yafVar.k();
        yafVar.m();
        yafVar.m();
        yafVar.m();
        int iV = yafVar.v();
        this.c = iV;
        this.d = iV + 27;
        yafVar.E(iV);
        try {
            zQ2 = ra4Var.q(yafVar.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zQ2 = false;
        }
        if (!zQ2) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int iV2 = yafVar.v();
            this.f[i] = iV2;
            this.e += iV2;
        }
        return true;
    }

    public boolean b(sa4 sa4Var, boolean z) throws androidx.media3.common.ParserException, EOFException {
        boolean zQ;
        boolean zQ2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        wpa wpaVar = (wpa) this.g;
        wpaVar.D(27);
        try {
            zQ = sa4Var.q(wpaVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zQ = false;
        }
        if (!zQ || wpaVar.w() != 1332176723) {
            return false;
        }
        if (wpaVar.u() != 0) {
            if (z) {
                return false;
            }
            throw androidx.media3.common.ParserException.c("unsupported bit stream revision");
        }
        this.a = wpaVar.u();
        this.b = wpaVar.j();
        wpaVar.l();
        wpaVar.l();
        wpaVar.l();
        int iU = wpaVar.u();
        this.c = iU;
        this.d = iU + 27;
        wpaVar.D(iU);
        try {
            zQ2 = sa4Var.q(wpaVar.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zQ2 = false;
        }
        if (!zQ2) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int iU2 = wpaVar.u();
            this.f[i] = iU2;
            this.e += iU2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9.o >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r9.g() == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(defpackage.ra4 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.o
            long r2 = r9.r()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            defpackage.np8.d(r0)
            java.lang.Object r8 = r8.g
            yaf r8 = (defpackage.yaf) r8
            r0 = 4
            r8.E(r0)
        L1a:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L29
            long r4 = r9.o
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L48
        L29:
            byte[] r4 = r8.a
            boolean r4 = r9.q(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L30
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L48
            r8.H(r1)
            long r3 = r8.w()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            r9.Y = r1
            return r2
        L44:
            r9.z(r2)
            goto L1a
        L48:
            if (r3 == 0) goto L50
            long r4 = r9.o
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L58
        L50:
            int r8 = r9.g()
            r0 = -1
            if (r8 == r0) goto L58
            goto L48
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2a.c(ra4, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r9.o >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r9.g(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.sa4 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.o
            long r2 = r9.r()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            defpackage.fm9.f(r0)
            java.lang.Object r8 = r8.g
            wpa r8 = (defpackage.wpa) r8
            r0 = 4
            r8.D(r0)
        L1a:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L29
            long r4 = r9.o
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L48
        L29:
            byte[] r4 = r8.a
            boolean r4 = r9.q(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L30
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L48
            r8.G(r1)
            long r3 = r8.w()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            r9.Y = r1
            return r2
        L44:
            r9.z(r2)
            goto L1a
        L48:
            if (r3 == 0) goto L50
            long r4 = r9.o
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L58
        L50:
            int r8 = r9.g(r2)
            r0 = -1
            if (r8 == r0) goto L58
            goto L48
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2a.d(sa4, long):boolean");
    }
}
