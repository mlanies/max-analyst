package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.EOFException;

/* loaded from: classes.dex */
public class drc implements xze {
    public oy5 A;
    public oy5 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final xqc a;
    public final sr4 d;
    public final kr4 e;
    public brc f;
    public oy5 g;
    public er4 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final mx1 b = new mx1();
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public vze[] o = new vze[1000];
    public final jn c = new jn(new p4c(17));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public drc(n64 n64Var, sr4 sr4Var, kr4 kr4Var) {
        this.d = sr4Var;
        this.e = kr4Var;
        this.a = new xqc(n64Var);
    }

    public final synchronized boolean A(long j, boolean z) {
        synchronized (this) {
            this.s = 0;
            xqc xqcVar = this.a;
            xqcVar.g = (qy) xqcVar.f;
        }
        int iP = p(0);
        if (s() && j >= this.n[iP] && (j <= this.v || z)) {
            int iL = l(j, iP, this.p - this.s, true);
            if (iL == -1) {
                return false;
            }
            this.t = j;
            this.s += iL;
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
            defpackage.np8.d(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.B(int):void");
    }

    @Override // defpackage.xze
    public final int a(l24 l24Var, int i, boolean z) throws EOFException {
        xqc xqcVar = this.a;
        int iD = xqcVar.d(i);
        qy qyVar = (qy) xqcVar.h;
        vc vcVar = (vc) qyVar.o;
        int i2 = l24Var.read(vcVar.a, ((int) (xqcVar.c - qyVar.b)) + vcVar.b, iD);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139 A[Catch: all -> 0x00d8, TryCatch #1 {all -> 0x00d8, blocks: (B:69:0x00ba, B:71:0x00be, B:75:0x00d4, B:78:0x00db, B:82:0x00e3, B:87:0x011e, B:110:0x019b, B:112:0x01a4, B:89:0x0139, B:91:0x013d, B:93:0x0148, B:95:0x0161, B:99:0x016a, B:100:0x016f, B:102:0x0175, B:106:0x0183, B:108:0x0188, B:109:0x0198, B:92:0x0146), top: B:118:0x00ba }] */
    @Override // defpackage.xze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r17, int r19, int r20, int r21, defpackage.vze r22) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.b(long, int, int, int, vze):void");
    }

    @Override // defpackage.xze
    public final void c(int i, yaf yafVar) {
        while (true) {
            xqc xqcVar = this.a;
            if (i <= 0) {
                xqcVar.getClass();
                return;
            }
            int iD = xqcVar.d(i);
            qy qyVar = (qy) xqcVar.h;
            vc vcVar = (vc) qyVar.o;
            yafVar.g(((int) (xqcVar.c - qyVar.b)) + vcVar.b, vcVar.a, iD);
            i -= iD;
            long j = xqcVar.c + iD;
            xqcVar.c = j;
            qy qyVar2 = (qy) xqcVar.h;
            if (j == qyVar2.c) {
                xqcVar.h = (qy) qyVar2.X;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000b, B:8:0x0019, B:13:0x002a, B:15:0x0043, B:19:0x005e, B:81:0x0112, B:73:0x00ff, B:76:0x0107, B:18:0x005c), top: B:90:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    @Override // defpackage.xze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.oy5 r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.d(oy5):void");
    }

    public final long g(int i) {
        this.u = Math.max(this.u, n(i));
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
            ((p4c) jnVar.o).accept(sparseArray.valueAt(i6));
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

    public final void h(long j, boolean z, boolean z2) {
        long jG;
        int i;
        xqc xqcVar = this.a;
        synchronized (this) {
            try {
                int i2 = this.p;
                jG = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z2 && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int iL = l(j, i3, i2, z);
                        if (iL != -1) {
                            jG = g(iL);
                        }
                    }
                }
            } finally {
            }
        }
        xqcVar.c(jG);
    }

    public final void i() {
        long jG;
        xqc xqcVar = this.a;
        synchronized (this) {
            int i = this.p;
            jG = i == 0 ? -1L : g(i);
        }
        xqcVar.c(jG);
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        np8.d(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, n(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        jn jnVar = this.c;
        SparseArray sparseArray = (SparseArray) jnVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((p4c) jnVar.o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        jnVar.b = sparseArray.size() > 0 ? Math.min(jnVar.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[p(i6 - 1)] + this.l[r9];
    }

    public final void k(int i) {
        long j = j(i);
        xqc xqcVar = this.a;
        np8.d(j <= xqcVar.c);
        xqcVar.c = j;
        int i2 = xqcVar.b;
        if (j != 0) {
            qy qyVar = (qy) xqcVar.f;
            if (j != qyVar.b) {
                while (xqcVar.c > qyVar.c) {
                    qyVar = (qy) qyVar.X;
                }
                qy qyVar2 = (qy) qyVar.X;
                qyVar2.getClass();
                xqcVar.a(qyVar2);
                qy qyVar3 = new qy(i2, 4, qyVar.c);
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
        xqcVar.a((qy) xqcVar.f);
        qy qyVar4 = new qy(i2, 4, xqcVar.c);
        xqcVar.f = qyVar4;
        xqcVar.g = qyVar4;
        xqcVar.h = qyVar4;
    }

    public final int l(long j, int i, int i2, boolean z) {
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

    public oy5 m(oy5 oy5Var) {
        if (this.F == 0 || oy5Var.A0 == Long.MAX_VALUE) {
            return oy5Var;
        }
        my5 my5VarA = oy5Var.a();
        my5VarA.o = oy5Var.A0 + this.F;
        return my5VarA.a();
    }

    public final long n(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iP = p(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iP]);
            if ((this.m[iP] & 1) != 0) {
                break;
            }
            iP--;
            if (iP == -1) {
                iP = this.i - 1;
            }
        }
        return jMax;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int q(long j, boolean z) {
        int iP = p(this.s);
        if (s() && j >= this.n[iP]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int iL = l(j, iP, this.p - this.s, true);
            if (iL == -1) {
                return 0;
            }
            return iL;
        }
        return 0;
    }

    public final synchronized oy5 r() {
        return this.y ? null : this.B;
    }

    public final boolean s() {
        return this.s != this.p;
    }

    public final synchronized boolean t(boolean z) {
        oy5 oy5Var;
        boolean z2 = true;
        if (s()) {
            if (((zqc) this.c.s(o())).a != this.g) {
                return true;
            }
            return u(p(this.s));
        }
        if (!z && !this.w && ((oy5Var = this.B) == null || oy5Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean u(int i) {
        er4 er4Var = this.h;
        return er4Var == null || er4Var.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.b());
    }

    public final void v() throws DrmSession$DrmSessionException {
        er4 er4Var = this.h;
        if (er4Var == null || er4Var.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionD = this.h.d();
        drmSession$DrmSessionExceptionD.getClass();
        throw drmSession$DrmSessionExceptionD;
    }

    public final void w(oy5 oy5Var, imc imcVar) {
        oy5 oy5VarA;
        oy5 oy5Var2 = this.g;
        boolean z = oy5Var2 == null;
        cr4 cr4Var = z ? null : oy5Var2.z0;
        this.g = oy5Var;
        cr4 cr4Var2 = oy5Var.z0;
        sr4 sr4Var = this.d;
        if (sr4Var != null) {
            int iB = sr4Var.b(oy5Var);
            my5 my5VarA = oy5Var.a();
            my5VarA.D = iB;
            oy5VarA = my5VarA.a();
        } else {
            oy5VarA = oy5Var;
        }
        imcVar.c = oy5VarA;
        imcVar.b = this.h;
        if (sr4Var == null) {
            return;
        }
        if (z || !maf.a(cr4Var, cr4Var2)) {
            er4 er4Var = this.h;
            kr4 kr4Var = this.e;
            er4 er4VarA = sr4Var.a(kr4Var, oy5Var);
            this.h = er4VarA;
            imcVar.b = er4VarA;
            if (er4Var != null) {
                er4Var.f(kr4Var);
            }
        }
    }

    public final synchronized int x() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return s() ? this.j[p(this.s)] : this.C;
    }

    public final int y(imc imcVar, o54 o54Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        mx1 mx1Var = this.b;
        synchronized (this) {
            try {
                o54Var.X = false;
                i2 = -3;
                if (s()) {
                    oy5 oy5Var = ((zqc) this.c.s(o())).a;
                    if (!z2 && oy5Var == this.g) {
                        int iP = p(this.s);
                        if (u(iP)) {
                            o54Var.b = this.m[iP];
                            long j = this.n[iP];
                            o54Var.Y = j;
                            if (j < this.t) {
                                o54Var.a(Integer.MIN_VALUE);
                            }
                            mx1Var.a = this.l[iP];
                            mx1Var.b = this.k[iP];
                            mx1Var.c = this.o[iP];
                            i2 = -4;
                        } else {
                            o54Var.X = true;
                        }
                    }
                    w(oy5Var, imcVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        oy5 oy5Var2 = this.B;
                        if (oy5Var2 == null || (!z2 && oy5Var2 == this.g)) {
                        }
                        w(oy5Var2, imcVar);
                        i2 = -5;
                    }
                    o54Var.b = 4;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !o54Var.f(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    xqc xqcVar = this.a;
                    xqc.i((qy) xqcVar.g, o54Var, this.b, (yaf) xqcVar.e);
                } else {
                    xqc xqcVar2 = this.a;
                    xqcVar2.g = xqc.i((qy) xqcVar2.g, o54Var, this.b, (yaf) xqcVar2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void z(boolean z) {
        jn jnVar;
        SparseArray sparseArray;
        xqc xqcVar = this.a;
        xqcVar.a((qy) xqcVar.f);
        qy qyVar = (qy) xqcVar.f;
        int i = 0;
        np8.f(((vc) qyVar.o) == null);
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
            ((p4c) jnVar.o).accept(sparseArray.valueAt(i));
            i++;
        }
        jnVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }
}
