package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s13 implements frc, i6d, co7, ho7 {
    public h13 A0;
    public oy5 B0;
    public q13 C0;
    public long D0;
    public long E0;
    public int F0;
    public yi0 G0;
    public boolean H0;
    public final f94 X;
    public final g6d Y;
    public final gk8 Z;
    public final int a;
    public final int[] b;
    public final oy5[] c;
    public final boolean[] o;
    public final buc s0;
    public final jo7 t0 = new jo7("ChunkSampleStream", 0);
    public final ar0 u0 = new ar0();
    public final ArrayList v0;
    public final List w0;
    public final drc x0;
    public final drc[] y0;
    public final ph4 z0;

    public s13(int i, int[] iArr, oy5[] oy5VarArr, f94 f94Var, g6d g6dVar, n64 n64Var, long j, sr4 sr4Var, kr4 kr4Var, buc bucVar, gk8 gk8Var) {
        this.a = i;
        this.b = iArr;
        this.c = oy5VarArr;
        this.X = f94Var;
        this.Y = g6dVar;
        this.Z = gk8Var;
        this.s0 = bucVar;
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        this.w0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y0 = new drc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        drc[] drcVarArr = new drc[i2];
        sr4Var.getClass();
        drc drcVar = new drc(n64Var, sr4Var, kr4Var);
        this.x0 = drcVar;
        int i3 = 0;
        iArr2[0] = i;
        drcVarArr[0] = drcVar;
        while (i3 < length) {
            drc drcVar2 = new drc(n64Var, null, null);
            this.y0[i3] = drcVar2;
            int i4 = i3 + 1;
            drcVarArr[i4] = drcVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.z0 = new ph4(iArr2, drcVarArr);
        this.D0 = j;
        this.E0 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    @Override // defpackage.i6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r60) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s13.C(long):boolean");
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.t0.o();
    }

    @Override // defpackage.ho7
    public final void b() {
        drc drcVar = this.x0;
        drcVar.z(true);
        er4 er4Var = drcVar.h;
        if (er4Var != null) {
            er4Var.f(drcVar.e);
            drcVar.h = null;
            drcVar.g = null;
        }
        for (drc drcVar2 : this.y0) {
            drcVar2.z(true);
            er4 er4Var2 = drcVar2.h;
            if (er4Var2 != null) {
                er4Var2.f(drcVar2.e);
                drcVar2.h = null;
                drcVar2.g = null;
            }
        }
        for (c94 c94Var : this.X.h) {
            wu0 wu0Var = (wu0) c94Var.d;
            if (wu0Var != null) {
                wu0Var.c();
            }
        }
        q13 q13Var = this.C0;
        if (q13Var != null) {
            p14 p14Var = (p14) q13Var;
            synchronized (p14Var) {
                c4b c4bVar = (c4b) p14Var.y0.remove(this);
                if (c4bVar != null) {
                    drc drcVar3 = c4bVar.a;
                    drcVar3.z(true);
                    er4 er4Var3 = drcVar3.h;
                    if (er4Var3 != null) {
                        er4Var3.f(drcVar3.e);
                        drcVar3.h = null;
                        drcVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.frc
    public final void c() throws IOException {
        jo7 jo7Var = this.t0;
        jo7Var.c();
        this.x0.v();
        if (jo7Var.o()) {
            return;
        }
        f94 f94Var = this.X;
        BehindLiveWindowException behindLiveWindowException = f94Var.l;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        f94Var.a.c();
    }

    @Override // defpackage.frc
    public final boolean d() {
        return !m() && this.x0.t(this.H0);
    }

    @Override // defpackage.frc
    public final int e(long j) {
        if (m()) {
            return 0;
        }
        drc drcVar = this.x0;
        int iQ = drcVar.q(j, this.H0);
        yi0 yi0Var = this.G0;
        if (yi0Var != null) {
            iQ = Math.min(iQ, yi0Var.d(0) - drcVar.o());
        }
        drcVar.B(iQ);
        p();
        return iQ;
    }

    @Override // defpackage.i6d
    public final long f() {
        if (m()) {
            return this.D0;
        }
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        return i().s0;
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        if (m()) {
            return -3;
        }
        yi0 yi0Var = this.G0;
        drc drcVar = this.x0;
        if (yi0Var != null && yi0Var.d(0) <= drcVar.o()) {
            return -3;
        }
        p();
        return drcVar.y(imcVar, o54Var, i, this.H0);
    }

    public final yi0 h(int i) {
        ArrayList arrayList = this.v0;
        yi0 yi0Var = (yi0) arrayList.get(i);
        maf.I(arrayList, i, arrayList.size());
        this.F0 = Math.max(this.F0, arrayList.size());
        int i2 = 0;
        this.x0.k(yi0Var.d(0));
        while (true) {
            drc[] drcVarArr = this.y0;
            if (i2 >= drcVarArr.length) {
                return yi0Var;
            }
            drc drcVar = drcVarArr[i2];
            i2++;
            drcVar.k(yi0Var.d(i2));
        }
    }

    public final yi0 i() {
        return (yi0) wg0.f(this.v0, 1);
    }

    public final boolean j(int i) {
        int iO;
        yi0 yi0Var = (yi0) this.v0.get(i);
        if (this.x0.o() > yi0Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            drc[] drcVarArr = this.y0;
            if (i2 >= drcVarArr.length) {
                return false;
            }
            iO = drcVarArr[i2].o();
            i2++;
        } while (iO <= yi0Var.d(i2));
        return true;
    }

    public final boolean m() {
        return this.D0 != -9223372036854775807L;
    }

    @Override // defpackage.co7
    public final void o(fo7 fo7Var, long j, long j2, boolean z) {
        h13 h13Var = (h13) fo7Var;
        this.A0 = null;
        this.G0 = null;
        long j3 = h13Var.a;
        t1e t1eVar = h13Var.t0;
        xn7 xn7Var = new xn7(j3, h13Var.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.s0.getClass();
        this.Z.d(xn7Var, h13Var.c, this.a, h13Var.o, h13Var.X, h13Var.Y, h13Var.Z, h13Var.s0);
        if (z) {
            return;
        }
        if (m()) {
            this.x0.z(false);
            for (drc drcVar : this.y0) {
                drcVar.z(false);
            }
        } else if (h13Var instanceof yi0) {
            ArrayList arrayList = this.v0;
            h(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.D0 = this.E0;
            }
        }
        this.Y.c(this);
    }

    public final void p() {
        int iU = u(this.x0.o(), this.F0 - 1);
        while (true) {
            int i = this.F0;
            if (i > iU) {
                return;
            }
            this.F0 = i + 1;
            yi0 yi0Var = (yi0) this.v0.get(i);
            oy5 oy5Var = yi0Var.o;
            if (!oy5Var.equals(this.B0)) {
                this.Z.b(this.a, oy5Var, yi0Var.X, yi0Var.Y, yi0Var.Z);
            }
            this.B0 = oy5Var;
        }
    }

    @Override // defpackage.i6d
    public final long r() {
        long j;
        if (this.H0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.D0;
        }
        long jMax = this.E0;
        yi0 yi0VarI = i();
        if (!yi0VarI.c()) {
            ArrayList arrayList = this.v0;
            yi0VarI = arrayList.size() > 1 ? (yi0) wg0.f(arrayList, 2) : null;
        }
        if (yi0VarI != null) {
            jMax = Math.max(jMax, yi0VarI.s0);
        }
        drc drcVar = this.x0;
        synchronized (drcVar) {
            j = drcVar.v;
        }
        return Math.max(jMax, j);
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        jo7 jo7Var = this.t0;
        if (jo7Var.n() || m()) {
            return;
        }
        boolean zO = jo7Var.o();
        ArrayList arrayList = this.v0;
        List list = this.w0;
        f94 f94Var = this.X;
        if (zO) {
            h13 h13Var = this.A0;
            h13Var.getClass();
            boolean z = h13Var instanceof yi0;
            if (z && j(arrayList.size() - 1)) {
                return;
            }
            if (f94Var.l == null ? f94Var.i.u(j, h13Var, list) : false) {
                jo7Var.a();
                if (z) {
                    this.G0 = (yi0) h13Var;
                    return;
                }
                return;
            }
            return;
        }
        int size = (f94Var.l != null || f94Var.i.length() < 2) ? list.size() : f94Var.i.g(j, list);
        if (size < arrayList.size()) {
            np8.f(!jo7Var.o());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!j(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j2 = i().s0;
            yi0 yi0VarH = h(size);
            if (arrayList.isEmpty()) {
                this.D0 = this.E0;
            }
            this.H0 = false;
            gk8 gk8Var = this.Z;
            gk8Var.m(new pc8(1, this.a, null, 3, null, gk8Var.a(yi0VarH.Z), gk8Var.a(j2)));
        }
    }

    public final int u(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.v0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((yi0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void v(q13 q13Var) {
        this.C0 = q13Var;
        drc drcVar = this.x0;
        drcVar.i();
        er4 er4Var = drcVar.h;
        if (er4Var != null) {
            er4Var.f(drcVar.e);
            drcVar.h = null;
            drcVar.g = null;
        }
        for (drc drcVar2 : this.y0) {
            drcVar2.i();
            er4 er4Var2 = drcVar2.h;
            if (er4Var2 != null) {
                er4Var2.f(drcVar2.e);
                drcVar2.h = null;
                drcVar2.g = null;
            }
        }
        this.t0.p(this);
    }

    @Override // defpackage.co7
    public final void y(fo7 fo7Var, long j, long j2) {
        l13 l13VarA;
        h13 h13Var = (h13) fo7Var;
        this.A0 = null;
        f94 f94Var = this.X;
        f94Var.getClass();
        if (h13Var instanceof t07) {
            int iQ = f94Var.i.q(((t07) h13Var).o);
            c94[] c94VarArr = f94Var.h;
            c94 c94Var = c94VarArr[iQ];
            if (((z14) c94Var.g) == null && (l13VarA = ((wu0) c94Var.d).a()) != null) {
                khc khcVar = (khc) c94Var.e;
                c94VarArr[iQ] = new c94(c94Var.b, khcVar, (lk0) c94Var.f, (wu0) c94Var.d, c94Var.c, new g03(l13VarA, khcVar.c, 2), 0);
            }
        }
        c4b c4bVar = f94Var.g;
        if (c4bVar != null) {
            long j3 = c4bVar.d;
            if (j3 == -9223372036854775807L || h13Var.s0 > j3) {
                c4bVar.d = h13Var.s0;
            }
            c4bVar.e.o = true;
        }
        long j4 = h13Var.a;
        t1e t1eVar = h13Var.t0;
        xn7 xn7Var = new xn7(j4, h13Var.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.s0.getClass();
        this.Z.f(xn7Var, h13Var.c, this.a, h13Var.o, h13Var.X, h13Var.Y, h13Var.Z, h13Var.s0);
        this.Y.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    @Override // defpackage.co7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b11 z(defpackage.fo7 r33, long r34, long r36, java.io.IOException r38, int r39) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s13.z(fo7, long, long, java.io.IOException, int):b11");
    }
}
