package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t13 implements grc, j6d, do7, io7 {
    public j13 A0;
    public qy5 B0;
    public r13 C0;
    public long D0;
    public long E0;
    public int F0;
    public zi0 G0;
    public boolean H0;
    public final g94 X;
    public final h6d Y;
    public final jn Z;
    public final int a;
    public final int[] b;
    public final qy5[] c;
    public final boolean[] o;
    public final huc s0;
    public final vq7 t0 = new vq7("ChunkSampleStream");
    public final ar0 u0 = new ar0();
    public final ArrayList v0;
    public final List w0;
    public final erc x0;
    public final erc[] y0;
    public final qz7 z0;

    public t13(int i, int[] iArr, qy5[] qy5VarArr, g94 g94Var, h6d h6dVar, n64 n64Var, long j, tr4 tr4Var, lr4 lr4Var, huc hucVar, jn jnVar) {
        this.a = i;
        this.b = iArr;
        this.c = qy5VarArr;
        this.X = g94Var;
        this.Y = h6dVar;
        this.Z = jnVar;
        this.s0 = hucVar;
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        this.w0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y0 = new erc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        erc[] ercVarArr = new erc[i2];
        tr4Var.getClass();
        erc ercVar = new erc(n64Var, tr4Var, lr4Var);
        this.x0 = ercVar;
        int i3 = 0;
        iArr2[0] = i;
        ercVarArr[0] = ercVar;
        while (i3 < length) {
            erc ercVar2 = new erc(n64Var, null, null);
            this.y0[i3] = ercVar2;
            int i4 = i3 + 1;
            ercVarArr[i4] = ercVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.z0 = new qz7(iArr2, 6, ercVarArr);
        this.D0 = j;
        this.E0 = j;
    }

    public final int A(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.v0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((zi0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void B(r13 r13Var) {
        this.C0 = r13Var;
        erc ercVar = this.x0;
        ercVar.h();
        fr4 fr4Var = ercVar.h;
        if (fr4Var != null) {
            fr4Var.f(ercVar.e);
            ercVar.h = null;
            ercVar.g = null;
        }
        for (erc ercVar2 : this.y0) {
            ercVar2.h();
            fr4 fr4Var2 = ercVar2.h;
            if (fr4Var2 != null) {
                fr4Var2.f(ercVar2.e);
                ercVar2.h = null;
                ercVar2.g = null;
            }
        }
        this.t0.s(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f A[LOOP:1: B:64:0x0159->B:66:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187 A[LOOP:2: B:68:0x0181->B:70:0x0187, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
    @Override // defpackage.do7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b11 C(defpackage.go7 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t13.C(go7, long, long, java.io.IOException, int):b11");
    }

    public final p13 D(int i, long j) {
        int i2 = 0;
        while (true) {
            erc[] ercVarArr = this.y0;
            if (i2 >= ercVarArr.length) {
                throw new IllegalStateException();
            }
            if (this.b[i2] == i) {
                boolean[] zArr = this.o;
                fm9.k(!zArr[i2]);
                zArr[i2] = true;
                ercVarArr[i2].A(j, true);
                return new p13(this, this, ercVarArr[i2], i2);
            }
            i2++;
        }
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.t0.o();
    }

    @Override // defpackage.io7
    public final void b() {
        erc ercVar = this.x0;
        ercVar.y(true);
        fr4 fr4Var = ercVar.h;
        if (fr4Var != null) {
            fr4Var.f(ercVar.e);
            ercVar.h = null;
            ercVar.g = null;
        }
        for (erc ercVar2 : this.y0) {
            ercVar2.y(true);
            fr4 fr4Var2 = ercVar2.h;
            if (fr4Var2 != null) {
                fr4Var2.f(ercVar2.e);
                ercVar2.h = null;
                ercVar2.g = null;
            }
        }
        for (c94 c94Var : this.X.i) {
            k13 k13Var = (k13) c94Var.d;
            if (k13Var != null) {
                ((xu0) k13Var).c();
            }
        }
        r13 r13Var = this.C0;
        if (r13Var != null) {
            q14 q14Var = (q14) r13Var;
            synchronized (q14Var) {
                d4b d4bVar = (d4b) q14Var.y0.remove(this);
                if (d4bVar != null) {
                    erc ercVar3 = d4bVar.a;
                    ercVar3.y(true);
                    fr4 fr4Var3 = ercVar3.h;
                    if (fr4Var3 != null) {
                        fr4Var3.f(ercVar3.e);
                        ercVar3.h = null;
                        ercVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.grc
    public final void c() throws IOException {
        vq7 vq7Var = this.t0;
        vq7Var.c();
        this.x0.u();
        if (vq7Var.o()) {
            return;
        }
        g94 g94Var = this.X;
        BehindLiveWindowException behindLiveWindowException = g94Var.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        g94Var.a.c();
    }

    @Override // defpackage.grc
    public final boolean d() {
        return !y() && this.x0.s(this.H0);
    }

    @Override // defpackage.grc
    public final int e(long j) {
        if (y()) {
            return 0;
        }
        erc ercVar = this.x0;
        int iP = ercVar.p(j, this.H0);
        zi0 zi0Var = this.G0;
        if (zi0Var != null) {
            iP = Math.min(iP, zi0Var.d(0) - ercVar.n());
        }
        ercVar.B(iP);
        z();
        return iP;
    }

    @Override // defpackage.j6d
    public final long f() {
        if (y()) {
            return this.D0;
        }
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        return w().s0;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        if (y()) {
            return -3;
        }
        zi0 zi0Var = this.G0;
        erc ercVar = this.x0;
        if (zi0Var != null && zi0Var.d(0) <= ercVar.n()) {
            return -3;
        }
        z();
        return ercVar.x(y7gVar, p54Var, i, this.H0);
    }

    @Override // defpackage.do7
    public final void m(go7 go7Var, long j, long j2, boolean z) {
        j13 j13Var = (j13) go7Var;
        this.A0 = null;
        this.G0 = null;
        long j3 = j13Var.a;
        Uri uri = j13Var.t0.c;
        yn7 yn7Var = new yn7(j2);
        this.s0.getClass();
        this.Z.x(yn7Var, j13Var.c, this.a, j13Var.o, j13Var.X, j13Var.Y, j13Var.Z, j13Var.s0);
        if (z) {
            return;
        }
        if (y()) {
            this.x0.y(false);
            for (erc ercVar : this.y0) {
                ercVar.y(false);
            }
        } else if (j13Var instanceof zi0) {
            ArrayList arrayList = this.v0;
            p(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.D0 = this.E0;
            }
        }
        this.Y.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0275  */
    @Override // defpackage.j6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.qo7 r64) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t13.o(qo7):boolean");
    }

    public final zi0 p(int i) {
        ArrayList arrayList = this.v0;
        zi0 zi0Var = (zi0) arrayList.get(i);
        oaf.X(arrayList, i, arrayList.size());
        this.F0 = Math.max(this.F0, arrayList.size());
        int i2 = 0;
        this.x0.j(zi0Var.d(0));
        while (true) {
            erc[] ercVarArr = this.y0;
            if (i2 >= ercVarArr.length) {
                return zi0Var;
            }
            erc ercVar = ercVarArr[i2];
            i2++;
            ercVar.j(zi0Var.d(i2));
        }
    }

    @Override // defpackage.j6d
    public final long r() {
        long j;
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.D0;
        }
        long jMax = this.E0;
        zi0 zi0VarW = w();
        if (!zi0VarW.c()) {
            ArrayList arrayList = this.v0;
            zi0VarW = arrayList.size() > 1 ? (zi0) wg0.f(arrayList, 2) : null;
        }
        if (zi0VarW != null) {
            jMax = Math.max(jMax, zi0VarW.s0);
        }
        erc ercVar = this.x0;
        synchronized (ercVar) {
            j = ercVar.v;
        }
        return Math.max(jMax, j);
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        vq7 vq7Var = this.t0;
        if (vq7Var.n() || y()) {
            return;
        }
        boolean zO = vq7Var.o();
        ArrayList arrayList = this.v0;
        List list = this.w0;
        g94 g94Var = this.X;
        if (zO) {
            j13 j13Var = this.A0;
            j13Var.getClass();
            boolean z = j13Var instanceof zi0;
            if (z && x(arrayList.size() - 1)) {
                return;
            }
            if (g94Var.m == null ? g94Var.j.t(j, j13Var, list) : false) {
                vq7Var.l();
                if (z) {
                    this.G0 = (zi0) j13Var;
                    return;
                }
                return;
            }
            return;
        }
        int size = (g94Var.m != null || g94Var.j.length() < 2) ? list.size() : g94Var.j.g(j, list);
        if (size < arrayList.size()) {
            fm9.k(!vq7Var.o());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!x(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j2 = w().s0;
            zi0 zi0VarP = p(size);
            if (arrayList.isEmpty()) {
                this.D0 = this.E0;
            }
            this.H0 = false;
            jn jnVar = this.Z;
            jnVar.getClass();
            jnVar.P(new pc8(1, this.a, null, 3, null, oaf.h0(zi0VarP.Z), oaf.h0(j2)));
        }
    }

    public final g94 u() {
        return this.X;
    }

    @Override // defpackage.do7
    public final void v(go7 go7Var, long j, long j2) {
        j13 j13Var = (j13) go7Var;
        this.A0 = null;
        g94 g94Var = this.X;
        g94Var.getClass();
        if (j13Var instanceof u07) {
            int iS = g94Var.j.s(((u07) j13Var).o);
            c94[] c94VarArr = g94Var.i;
            c94 c94Var = c94VarArr[iS];
            if (((a24) c94Var.g) == null) {
                k13 k13Var = (k13) c94Var.d;
                fm9.l(k13Var);
                m13 m13VarA = ((xu0) k13Var).a();
                if (m13VarA != null) {
                    lhc lhcVar = (lhc) c94Var.e;
                    g03 g03Var = new g03(m13VarA, lhcVar.c, 3);
                    c94VarArr[iS] = new c94(c94Var.b, lhcVar, (mk0) c94Var.f, (k13) c94Var.d, c94Var.c, g03Var, 1);
                }
            }
        }
        d4b d4bVar = g94Var.h;
        if (d4bVar != null) {
            long j3 = d4bVar.d;
            if (j3 == -9223372036854775807L || j13Var.s0 > j3) {
                d4bVar.d = j13Var.s0;
            }
            d4bVar.e.o = true;
        }
        long j4 = j13Var.a;
        Uri uri = j13Var.t0.c;
        yn7 yn7Var = new yn7(j2);
        this.s0.getClass();
        this.Z.z(yn7Var, j13Var.c, this.a, j13Var.o, j13Var.X, j13Var.Y, j13Var.Z, j13Var.s0);
        this.Y.j(this);
    }

    public final zi0 w() {
        return (zi0) wg0.f(this.v0, 1);
    }

    public final boolean x(int i) {
        int iN;
        zi0 zi0Var = (zi0) this.v0.get(i);
        if (this.x0.n() > zi0Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            erc[] ercVarArr = this.y0;
            if (i2 >= ercVarArr.length) {
                return false;
            }
            iN = ercVarArr[i2].n();
            i2++;
        } while (iN <= zi0Var.d(i2));
        return true;
    }

    public final boolean y() {
        return this.D0 != -9223372036854775807L;
    }

    public final void z() {
        int iA = A(this.x0.n(), this.F0 - 1);
        while (true) {
            int i = this.F0;
            if (i > iA) {
                return;
            }
            this.F0 = i + 1;
            zi0 zi0Var = (zi0) this.v0.get(i);
            qy5 qy5Var = zi0Var.o;
            if (!qy5Var.equals(this.B0)) {
                this.Z.m(this.a, qy5Var, zi0Var.X, zi0Var.Y, zi0Var.Z);
            }
            this.B0 = qy5Var;
        }
    }
}
