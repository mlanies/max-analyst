package defpackage;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;

/* loaded from: classes.dex */
public class erc implements yze {
    public qy5 A;
    public qy5 B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final xqc a;
    public final tr4 d;
    public final lr4 e;
    public crc f;
    public qy5 g;
    public fr4 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final mx1 b = new mx1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public wze[] o = new wze[1000];
    public final jn c = new jn(new p4c(18), (byte) 0);
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public erc(n64 n64Var, tr4 tr4Var, lr4 lr4Var) {
        this.d = tr4Var;
        this.e = lr4Var;
        this.a = new xqc(n64Var, (byte) 0);
    }

    public final synchronized boolean A(long j, boolean z) {
        int iK;
        try {
            synchronized (this) {
                this.s = 0;
                xqc xqcVar = this.a;
                xqcVar.g = (qy) xqcVar.f;
            }
        } finally {
        }
        int iO = o(0);
        if (r() && j >= this.n[iO] && (j <= this.v || z)) {
            if (this.D) {
                int i = this.p - this.s;
                iK = 0;
                while (true) {
                    if (iK >= i) {
                        if (!z) {
                            i = -1;
                        }
                        iK = i;
                    } else if (this.n[iO] < j) {
                        iO++;
                        if (iO == this.i) {
                            iO = 0;
                        }
                        iK++;
                    }
                }
            } else {
                iK = k(j, iO, this.p - this.s, true);
            }
            if (iK == -1) {
                return false;
            }
            this.t = j;
            this.s += iK;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void B(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            defpackage.fm9.f(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.B(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b A[Catch: all -> 0x00da, TryCatch #1 {all -> 0x00da, blocks: (B:69:0x00bc, B:71:0x00c0, B:75:0x00d6, B:78:0x00dd, B:82:0x00e5, B:87:0x0120, B:110:0x019b, B:112:0x01a4, B:89:0x013b, B:91:0x0144, B:93:0x014d, B:95:0x0161, B:99:0x016a, B:100:0x016f, B:102:0x0175, B:106:0x0183, B:108:0x0188, B:109:0x0198, B:92:0x014b), top: B:118:0x00bc }] */
    @Override // defpackage.yze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r17, int r19, int r20, int r21, defpackage.wze r22) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.a(long, int, int, int, wze):void");
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        while (true) {
            xqc xqcVar = this.a;
            if (i <= 0) {
                xqcVar.getClass();
                return;
            }
            int iD = xqcVar.d(i);
            qy qyVar = (qy) xqcVar.h;
            wc wcVar = (wc) qyVar.o;
            wpaVar.e(((int) (xqcVar.c - qyVar.b)) + wcVar.b, wcVar.a, iD);
            i -= iD;
            long j = xqcVar.c + iD;
            xqcVar.c = j;
            qy qyVar2 = (qy) xqcVar.h;
            if (j == qyVar2.c) {
                xqcVar.h = (qy) qyVar2.X;
            }
        }
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) throws EOFException {
        xqc xqcVar = this.a;
        int iD = xqcVar.d(i);
        qy qyVar = (qy) xqcVar.h;
        wc wcVar = (wc) qyVar.o;
        int i2 = m24Var.read(wcVar.a, ((int) (xqcVar.c - qyVar.b)) + wcVar.b, iD);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = xqcVar.c + i2;
        xqcVar.c = j;
        qy qyVar2 = (qy) xqcVar.h;
        if (j != qyVar2.c) {
            return i2;
        }
        xqcVar.h = (qy) qyVar2.X;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000b, B:8:0x0019, B:13:0x002a, B:15:0x0043, B:19:0x005e, B:81:0x0114, B:73:0x0101, B:76:0x0109, B:18:0x005c), top: B:90:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    @Override // defpackage.yze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.qy5 r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erc.e(qy5):void");
    }

    public final long f(int i) {
        this.u = Math.max(this.u, m(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        while (true) {
            jn jnVar = this.c;
            SparseArray sparseArray = (SparseArray) jnVar.c;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((pj3) jnVar.o).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = jnVar.b;
            if (i8 > 0) {
                jnVar.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void g(long j, boolean z, boolean z2) {
        long jF;
        int i;
        xqc xqcVar = this.a;
        synchronized (this) {
            try {
                int i2 = this.p;
                jF = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z2 && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int iK = k(j, i3, i2, z);
                        if (iK != -1) {
                            jF = f(iK);
                        }
                    }
                }
            } finally {
            }
        }
        xqcVar.c(jF);
    }

    public final void h() {
        long jF;
        xqc xqcVar = this.a;
        synchronized (this) {
            int i = this.p;
            jF = i == 0 ? -1L : f(i);
        }
        xqcVar.c(jF);
    }

    public final long i(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        fm9.f(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, m(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        jn jnVar = this.c;
        SparseArray sparseArray = (SparseArray) jnVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((pj3) jnVar.o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        jnVar.b = sparseArray.size() > 0 ? Math.min(jnVar.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[o(i6 - 1)] + this.l[r9];
    }

    public final void j(int i) {
        long jI = i(i);
        xqc xqcVar = this.a;
        fm9.f(jI <= xqcVar.c);
        xqcVar.c = jI;
        int i2 = xqcVar.b;
        if (jI != 0) {
            qy qyVar = (qy) xqcVar.f;
            if (jI != qyVar.b) {
                while (xqcVar.c > qyVar.c) {
                    qyVar = (qy) qyVar.X;
                }
                qy qyVar2 = (qy) qyVar.X;
                qyVar2.getClass();
                xqcVar.b(qyVar2);
                qy qyVar3 = new qy(i2, 5, qyVar.c);
                qyVar.X = qyVar3;
                if (xqcVar.c == qyVar.c) {
                    qyVar = qyVar3;
                }
                xqcVar.h = qyVar;
                if (((qy) xqcVar.g) == qyVar2) {
                    xqcVar.g = qyVar3;
                    return;
                }
                return;
            }
        }
        xqcVar.b((qy) xqcVar.f);
        qy qyVar4 = new qy(i2, 5, xqcVar.c);
        xqcVar.f = qyVar4;
        xqcVar.g = qyVar4;
        xqcVar.h = qyVar4;
    }

    public final int k(long j, int i, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public qy5 l(qy5 qy5Var) {
        if (this.F == 0 || qy5Var.s == Long.MAX_VALUE) {
            return qy5Var;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.r = qy5Var.s + this.F;
        return ny5VarA.a();
    }

    public final long m(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iO]);
            if ((this.m[iO] & 1) != 0) {
                break;
            }
            iO--;
            if (iO == -1) {
                iO = this.i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.q + this.s;
    }

    public final int o(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int p(long j, boolean z) {
        int iO = o(this.s);
        if (r() && j >= this.n[iO]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int iK = k(j, iO, this.p - this.s, true);
            if (iK == -1) {
                return 0;
            }
            return iK;
        }
        return 0;
    }

    public final synchronized qy5 q() {
        return this.y ? null : this.B;
    }

    public final boolean r() {
        return this.s != this.p;
    }

    public final synchronized boolean s(boolean z) {
        qy5 qy5Var;
        boolean z2 = true;
        if (r()) {
            if (((arc) this.c.s(n())).a != this.g) {
                return true;
            }
            return t(o(this.s));
        }
        if (!z && !this.w && ((qy5Var = this.B) == null || qy5Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean t(int i) {
        fr4 fr4Var = this.h;
        return fr4Var == null || fr4Var.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.b());
    }

    public final void u() throws DrmSession$DrmSessionException {
        fr4 fr4Var = this.h;
        if (fr4Var == null || fr4Var.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionD = this.h.d();
        drmSession$DrmSessionExceptionD.getClass();
        throw drmSession$DrmSessionExceptionD;
    }

    public final void v(qy5 qy5Var, y7g y7gVar) {
        qy5 qy5VarA;
        qy5 qy5Var2 = this.g;
        boolean z = qy5Var2 == null;
        dr4 dr4Var = qy5Var2 == null ? null : qy5Var2.r;
        this.g = qy5Var;
        dr4 dr4Var2 = qy5Var.r;
        tr4 tr4Var = this.d;
        if (tr4Var != null) {
            int iD = tr4Var.d(qy5Var);
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.J = iD;
            qy5VarA = ny5VarA.a();
        } else {
            qy5VarA = qy5Var;
        }
        y7gVar.c = qy5VarA;
        y7gVar.b = this.h;
        if (tr4Var == null) {
            return;
        }
        if (z || !oaf.a(dr4Var, dr4Var2)) {
            fr4 fr4Var = this.h;
            lr4 lr4Var = this.e;
            fr4 fr4VarA = tr4Var.a(lr4Var, qy5Var);
            this.h = fr4VarA;
            y7gVar.b = fr4VarA;
            if (fr4Var != null) {
                fr4Var.f(lr4Var);
            }
        }
    }

    public final synchronized long w() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return r() ? this.j[o(this.s)] : this.C;
    }

    public final int x(y7g y7gVar, p54 p54Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        mx1 mx1Var = this.b;
        synchronized (this) {
            try {
                p54Var.Y = false;
                i2 = -3;
                if (r()) {
                    qy5 qy5Var = ((arc) this.c.s(n())).a;
                    if (!z2 && qy5Var == this.g) {
                        int iO = o(this.s);
                        if (t(iO)) {
                            p54Var.b = this.m[iO];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                p54Var.a(536870912);
                            }
                            p54Var.Z = this.n[iO];
                            mx1Var.a = this.l[iO];
                            mx1Var.b = this.k[iO];
                            mx1Var.c = this.o[iO];
                            i2 = -4;
                        } else {
                            p54Var.Y = true;
                        }
                    }
                    v(qy5Var, y7gVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        qy5 qy5Var2 = this.B;
                        if (qy5Var2 == null || (!z2 && qy5Var2 == this.g)) {
                        }
                        v(qy5Var2, y7gVar);
                        i2 = -5;
                    }
                    p54Var.b = 4;
                    p54Var.Z = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !p54Var.f(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    xqc xqcVar = this.a;
                    xqc.j((qy) xqcVar.g, p54Var, this.b, (wpa) xqcVar.e);
                } else {
                    xqc xqcVar2 = this.a;
                    xqcVar2.g = xqc.j((qy) xqcVar2.g, p54Var, this.b, (wpa) xqcVar2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void y(boolean z) {
        jn jnVar;
        SparseArray sparseArray;
        xqc xqcVar = this.a;
        xqcVar.b((qy) xqcVar.f);
        qy qyVar = (qy) xqcVar.f;
        int i = 0;
        fm9.k(((wc) qyVar.o) == null);
        qyVar.b = 0L;
        qyVar.c = xqcVar.b;
        qy qyVar2 = (qy) xqcVar.f;
        xqcVar.g = qyVar2;
        xqcVar.h = qyVar2;
        xqcVar.c = 0L;
        ((n64) xqcVar.d).d();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            jnVar = this.c;
            sparseArray = (SparseArray) jnVar.c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((pj3) jnVar.o).accept(sparseArray.valueAt(i));
            i++;
        }
        jnVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean z(int i) {
        synchronized (this) {
            this.s = 0;
            xqc xqcVar = this.a;
            xqcVar.g = (qy) xqcVar.f;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }
}
