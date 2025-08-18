package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class vnb implements zd8, pa5, do7, io7, crc {
    public static final Map Z0;
    public static final qy5 a1;
    public xd8 C0;
    public us6 D0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public a8g K0;
    public v1d L0;
    public long M0;
    public boolean N0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public long T0;
    public boolean V0;
    public int W0;
    public final jn X;
    public boolean X0;
    public final lr4 Y;
    public boolean Y0;
    public final aob Z;
    public final Uri a;
    public final t24 b;
    public final tr4 c;
    public final huc o;
    public final n64 s0;
    public final String t0;
    public final long u0;
    public final long v0;
    public final k8g x0;
    public final vq7 w0 = new vq7("ProgressiveMediaPeriod");
    public final ae3 y0 = new ae3(false, 1);
    public final mnb z0 = new mnb(this, 1);
    public final mnb A0 = new mnb(this, 2);
    public final Handler B0 = oaf.o(null);
    public tnb[] F0 = new tnb[0];
    public erc[] E0 = new erc[0];
    public long U0 = -9223372036854775807L;
    public int O0 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        Z0 = Collections.unmodifiableMap(map);
        ny5 ny5Var = new ny5();
        ny5Var.a = "icy";
        ny5Var.m = ia9.l("application/x-icy");
        a1 = ny5Var.a();
    }

    public vnb(Uri uri, t24 t24Var, k8g k8gVar, tr4 tr4Var, lr4 lr4Var, huc hucVar, jn jnVar, aob aobVar, n64 n64Var, String str, int i, long j) {
        this.a = uri;
        this.b = t24Var;
        this.c = tr4Var;
        this.Y = lr4Var;
        this.o = hucVar;
        this.X = jnVar;
        this.Z = aobVar;
        this.s0 = n64Var;
        this.t0 = str;
        this.u0 = i;
        this.x0 = k8gVar;
        this.v0 = j;
    }

    public final void A() {
        pnb pnbVar = new pnb(this, this.a, this.b, this.x0, this, this.y0);
        if (this.H0) {
            fm9.k(p());
            long j = this.M0;
            if (j != -9223372036854775807L && this.U0 > j) {
                this.X0 = true;
                this.U0 = -9223372036854775807L;
                return;
            }
            v1d v1dVar = this.L0;
            v1dVar.getClass();
            long j2 = v1dVar.e(this.U0).a.b;
            long j3 = this.U0;
            pnbVar.Z.a = j2;
            pnbVar.u0 = j3;
            pnbVar.t0 = true;
            pnbVar.x0 = false;
            for (erc ercVar : this.E0) {
                ercVar.t = this.U0;
            }
            this.U0 = -9223372036854775807L;
        }
        this.W0 = e();
        this.X.F(new yn7(pnbVar.a, pnbVar.v0, this.w0.v(pnbVar, this, this.o.p(this.O0))), 1, -1, null, 0, null, pnbVar.u0, this.M0);
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public final yze mo6B(int i, int i2) {
        return z(new tnb(i, false));
    }

    @Override // defpackage.do7
    public final b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        b11 b11Var;
        v1d v1dVar;
        pnb pnbVar = (pnb) go7Var;
        Uri uri = pnbVar.c.c;
        yn7 yn7Var = new yn7(j2);
        int i2 = oaf.a;
        this.o.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            b11Var = vq7.Z;
        } else {
            int iE = e();
            int i4 = iE > this.W0 ? 1 : 0;
            if (this.S0 || !((v1dVar = this.L0) == null || v1dVar.f() == -9223372036854775807L)) {
                this.W0 = iE;
            } else if (!this.H0 || D()) {
                this.Q0 = this.H0;
                this.T0 = 0L;
                this.W0 = 0;
                for (erc ercVar : this.E0) {
                    ercVar.y(false);
                }
                pnbVar.Z.a = 0L;
                pnbVar.u0 = 0L;
                pnbVar.t0 = true;
                pnbVar.x0 = false;
            } else {
                this.V0 = true;
                b11Var = vq7.Y;
            }
            b11Var = new b11(jMin, i4, 5, false);
        }
        b11 b11Var2 = b11Var;
        this.X.B(yn7Var, 1, -1, null, 0, null, pnbVar.u0, this.M0, iOException, !b11Var2.a());
        return b11Var2;
    }

    public final boolean D() {
        return this.Q0 || p();
    }

    @Override // defpackage.pa5
    public final void J(v1d v1dVar) {
        this.B0.post(new do9(this, 23, v1dVar));
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.w0.o() && this.y0.e();
    }

    @Override // defpackage.io7
    public final void b() {
        for (erc ercVar : this.E0) {
            ercVar.y(true);
            fr4 fr4Var = ercVar.h;
            if (fr4Var != null) {
                fr4Var.f(ercVar.e);
                ercVar.h = null;
                ercVar.g = null;
            }
        }
        k8g k8gVar = this.x0;
        la5 la5Var = (la5) k8gVar.b;
        if (la5Var != null) {
            la5Var.release();
            k8gVar.b = null;
        }
        k8gVar.c = null;
    }

    @Override // defpackage.crc
    public final void c() {
        this.B0.post(this.z0);
    }

    public final void d() {
        fm9.k(this.H0);
        this.K0.getClass();
        this.L0.getClass();
    }

    public final int e() {
        int i = 0;
        for (erc ercVar : this.E0) {
            i += ercVar.q + ercVar.p;
        }
        return i;
    }

    @Override // defpackage.j6d
    public final long f() {
        return r();
    }

    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        n85 n85Var;
        d();
        a8g a8gVar = this.K0;
        tze tzeVar = (tze) a8gVar.a;
        int i = this.R0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = n85VarArr.length;
            zArr3 = (boolean[]) a8gVar.c;
            if (i3 >= length) {
                break;
            }
            grc grcVar = grcVarArr[i3];
            if (grcVar != null && (n85VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((rnb) grcVar).a;
                fm9.k(zArr3[i4]);
                this.R0--;
                zArr3[i4] = false;
                grcVarArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.P0 ? j == 0 || this.J0 : i != 0;
        for (int i5 = 0; i5 < n85VarArr.length; i5++) {
            if (grcVarArr[i5] == null && (n85Var = n85VarArr[i5]) != null) {
                fm9.k(n85Var.length() == 1);
                fm9.k(n85Var.f(0) == 0);
                int iB = tzeVar.b(n85Var.a());
                fm9.k(!zArr3[iB]);
                this.R0++;
                zArr3[iB] = true;
                grcVarArr[i5] = new rnb(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    erc ercVar = this.E0[iB];
                    z = (ercVar.n() == 0 || ercVar.A(j, true)) ? false : true;
                }
            }
        }
        if (this.R0 == 0) {
            this.V0 = false;
            this.Q0 = false;
            vq7 vq7Var = this.w0;
            if (vq7Var.o()) {
                erc[] ercVarArr = this.E0;
                int length2 = ercVarArr.length;
                while (i2 < length2) {
                    ercVarArr[i2].h();
                    i2++;
                }
                vq7Var.l();
            } else {
                this.X0 = false;
                for (erc ercVar2 : this.E0) {
                    ercVar2.y(false);
                }
            }
        } else if (z) {
            j = l(j);
            while (i2 < grcVarArr.length) {
                if (grcVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.P0 = true;
        return j;
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        d();
        if (!this.L0.c()) {
            return 0L;
        }
        t1d t1dVarE = this.L0.e(j);
        return x1dVar.a(j, t1dVarE.a.a, t1dVarE.b.a);
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.C0 = xd8Var;
        this.y0.g();
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            erc[] r3 = r6.E0
            int r3 = r3.length
            if (r2 >= r3) goto L29
            if (r7 != 0) goto L17
            a8g r3 = r6.K0
            r3.getClass()
            java.lang.Object r3 = r3.c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            erc[] r3 = r6.E0
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.v     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r6
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnb.j(boolean):long");
    }

    @Override // defpackage.zd8
    public final void k() throws IOException {
        int iP = this.o.p(this.O0);
        vq7 vq7Var = this.w0;
        IOException iOException = (IOException) vq7Var.o;
        if (iOException != null) {
            throw iOException;
        }
        eo7 eo7Var = (eo7) vq7Var.c;
        if (eo7Var != null) {
            if (iP == Integer.MIN_VALUE) {
                iP = eo7Var.b;
            }
            IOException iOException2 = eo7Var.o;
            if (iOException2 != null && eo7Var.X > iP) {
                throw iOException2;
            }
        }
        if (this.X0 && !this.H0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        boolean z;
        d();
        boolean[] zArr = (boolean[]) this.K0.b;
        if (!this.L0.c()) {
            j = 0;
        }
        this.Q0 = false;
        this.T0 = j;
        if (p()) {
            this.U0 = j;
            return j;
        }
        int i = this.O0;
        vq7 vq7Var = this.w0;
        if (i != 7 && (this.X0 || vq7Var.o())) {
            int length = this.E0.length;
            for (int i2 = 0; i2 < length; i2++) {
                erc ercVar = this.E0[i2];
                if (!(this.J0 ? ercVar.z(ercVar.q) : ercVar.A(j, false)) && (zArr[i2] || !this.I0)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.V0 = false;
        this.U0 = j;
        this.X0 = false;
        if (vq7Var.o()) {
            for (erc ercVar2 : this.E0) {
                ercVar2.h();
            }
            vq7Var.l();
        } else {
            vq7Var.o = null;
            for (erc ercVar3 : this.E0) {
                ercVar3.y(false);
            }
        }
        return j;
    }

    @Override // defpackage.do7
    public final void m(go7 go7Var, long j, long j2, boolean z) {
        pnb pnbVar = (pnb) go7Var;
        Uri uri = pnbVar.c.c;
        yn7 yn7Var = new yn7(j2);
        this.o.getClass();
        this.X.x(yn7Var, 1, -1, null, 0, null, pnbVar.u0, this.M0);
        if (z) {
            return;
        }
        for (erc ercVar : this.E0) {
            ercVar.y(false);
        }
        if (this.R0 > 0) {
            xd8 xd8Var = this.C0;
            xd8Var.getClass();
            xd8Var.j(this);
        }
    }

    @Override // defpackage.zd8
    public final long n() {
        if (!this.Q0) {
            return -9223372036854775807L;
        }
        if (!this.X0 && e() <= this.W0) {
            return -9223372036854775807L;
        }
        this.Q0 = false;
        return this.T0;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        if (this.X0) {
            return false;
        }
        vq7 vq7Var = this.w0;
        if (vq7Var.n() || this.V0) {
            return false;
        }
        if (this.H0 && this.R0 == 0) {
            return false;
        }
        boolean zG = this.y0.g();
        if (vq7Var.o()) {
            return zG;
        }
        A();
        return true;
    }

    public final boolean p() {
        return this.U0 != -9223372036854775807L;
    }

    @Override // defpackage.zd8
    public final tze q() {
        d();
        return (tze) this.K0.a;
    }

    @Override // defpackage.j6d
    public final long r() {
        long j;
        boolean z;
        long j2;
        d();
        if (this.X0 || this.R0 == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.U0;
        }
        if (this.I0) {
            int length = this.E0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                a8g a8gVar = this.K0;
                if (((boolean[]) a8gVar.b)[i] && ((boolean[]) a8gVar.c)[i]) {
                    erc ercVar = this.E0[i];
                    synchronized (ercVar) {
                        z = ercVar.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        erc ercVar2 = this.E0[i];
                        synchronized (ercVar2) {
                            j2 = ercVar2.v;
                        }
                        j = Math.min(j, j2);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        return j == Long.MIN_VALUE ? this.T0 : j;
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        if (this.J0) {
            return;
        }
        d();
        if (p()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.K0.c;
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            this.E0[i].g(j, z, zArr[i]);
        }
    }

    @Override // defpackage.j6d
    public final void t(long j) {
    }

    public final void u() {
        long j;
        int i;
        if (this.Y0 || this.H0 || !this.G0 || this.L0 == null) {
            return;
        }
        for (erc ercVar : this.E0) {
            if (ercVar.q() == null) {
                return;
            }
        }
        this.y0.c();
        int length = this.E0.length;
        rze[] rzeVarArr = new rze[length];
        boolean[] zArr = new boolean[length];
        int i2 = 0;
        while (true) {
            j = this.v0;
            if (i2 >= length) {
                break;
            }
            qy5 qy5VarQ = this.E0[i2].q();
            qy5VarQ.getClass();
            String str = qy5VarQ.n;
            boolean zH = ia9.h(str);
            boolean z = zH || ia9.k(str);
            zArr[i2] = z;
            this.I0 = z | this.I0;
            this.J0 = j != -9223372036854775807L && length == 1 && ia9.i(str);
            us6 us6Var = this.D0;
            if (us6Var != null) {
                if (zH || this.F0[i2].b) {
                    f99 f99Var = qy5VarQ.k;
                    f99 f99Var2 = f99Var == null ? new f99(us6Var) : f99Var.a(us6Var);
                    ny5 ny5VarA = qy5VarQ.a();
                    ny5VarA.j = f99Var2;
                    qy5VarQ = new qy5(ny5VarA);
                }
                if (zH && qy5VarQ.g == -1 && qy5VarQ.h == -1 && (i = us6Var.a) != -1) {
                    ny5 ny5VarA2 = qy5VarQ.a();
                    ny5VarA2.g = i;
                    qy5VarQ = new qy5(ny5VarA2);
                }
            }
            int iD = this.c.d(qy5VarQ);
            ny5 ny5VarA3 = qy5VarQ.a();
            ny5VarA3.J = iD;
            rzeVarArr[i2] = new rze(Integer.toString(i2), ny5VarA3.a());
            i2++;
        }
        tze tzeVar = new tze(rzeVarArr);
        a8g a8gVar = new a8g();
        a8gVar.a = tzeVar;
        a8gVar.b = zArr;
        int i3 = tzeVar.a;
        a8gVar.c = new boolean[i3];
        a8gVar.o = new boolean[i3];
        this.K0 = a8gVar;
        if (this.J0 && this.M0 == -9223372036854775807L) {
            this.M0 = j;
            this.L0 = new nnb(this, this.L0);
        }
        this.Z.v(this.M0, this.L0.c(), this.N0);
        this.H0 = true;
        xd8 xd8Var = this.C0;
        xd8Var.getClass();
        xd8Var.e(this);
    }

    @Override // defpackage.do7
    public final void v(go7 go7Var, long j, long j2) {
        v1d v1dVar;
        pnb pnbVar = (pnb) go7Var;
        if (this.M0 == -9223372036854775807L && (v1dVar = this.L0) != null) {
            boolean zC = v1dVar.c();
            long j3 = j(true);
            long j4 = j3 == Long.MIN_VALUE ? 0L : j3 + WorkRequest.MIN_BACKOFF_MILLIS;
            this.M0 = j4;
            this.Z.v(j4, zC, this.N0);
        }
        Uri uri = pnbVar.c.c;
        yn7 yn7Var = new yn7(j2);
        this.o.getClass();
        this.X.z(yn7Var, 1, -1, null, 0, null, pnbVar.u0, this.M0);
        this.X0 = true;
        xd8 xd8Var = this.C0;
        xd8Var.getClass();
        xd8Var.j(this);
    }

    @Override // defpackage.pa5
    public final void w() {
        this.G0 = true;
        this.B0.post(this.z0);
    }

    public final void x(int i) {
        d();
        a8g a8gVar = this.K0;
        boolean[] zArr = (boolean[]) a8gVar.o;
        if (zArr[i]) {
            return;
        }
        qy5 qy5Var = ((tze) a8gVar.a).a(i).d[0];
        this.X.m(ia9.g(qy5Var.n), qy5Var, 0, null, this.T0);
        zArr[i] = true;
    }

    public final void y(int i) {
        d();
        boolean[] zArr = (boolean[]) this.K0.b;
        if (this.V0 && zArr[i] && !this.E0[i].s(false)) {
            this.U0 = 0L;
            this.V0 = false;
            this.Q0 = true;
            this.T0 = 0L;
            this.W0 = 0;
            for (erc ercVar : this.E0) {
                ercVar.y(false);
            }
            xd8 xd8Var = this.C0;
            xd8Var.getClass();
            xd8Var.j(this);
        }
    }

    public final yze z(tnb tnbVar) {
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            if (tnbVar.equals(this.F0[i])) {
                return this.E0[i];
            }
        }
        if (this.G0) {
            z04.c0("Extractor added new track (id=" + tnbVar.a + ") after finishing tracks.");
            return new sk4();
        }
        tr4 tr4Var = this.c;
        tr4Var.getClass();
        lr4 lr4Var = this.Y;
        lr4Var.getClass();
        erc ercVar = new erc(this.s0, tr4Var, lr4Var);
        ercVar.f = this;
        int i2 = length + 1;
        tnb[] tnbVarArr = (tnb[]) Arrays.copyOf(this.F0, i2);
        tnbVarArr[length] = tnbVar;
        int i3 = oaf.a;
        this.F0 = tnbVarArr;
        erc[] ercVarArr = (erc[]) Arrays.copyOf(this.E0, i2);
        ercVarArr[length] = ercVar;
        this.E0 = ercVarArr;
        return ercVar;
    }
}
