package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class unb implements yd8, oa5, co7, ho7, brc {
    public static final Map X0;
    public static final oy5 Y0;
    public wd8 B0;
    public ts6 C0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public die I0;
    public u1d J0;
    public boolean L0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public long R0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public final gk8 X;
    public final kr4 Y;
    public final znb Z;
    public final Uri a;
    public final r24 b;
    public final sr4 c;
    public final buc o;
    public final n64 s0;
    public final long u0;
    public final glc w0;
    public final lnb y0;
    public final lnb z0;
    public final String t0 = null;
    public final jo7 v0 = new jo7("ProgressiveMediaPeriod", 0);
    public final ae3 x0 = new ae3(false, 0);
    public final Handler A0 = maf.m(null);
    public snb[] E0 = new snb[0];
    public drc[] D0 = new drc[0];
    public long S0 = -9223372036854775807L;
    public long Q0 = -1;
    public long K0 = -9223372036854775807L;
    public int M0 = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        X0 = Collections.unmodifiableMap(map);
        my5 my5Var = new my5();
        my5Var.a = "icy";
        my5Var.k = "application/x-icy";
        Y0 = my5Var.a();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [lnb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [lnb] */
    public unb(Uri uri, r24 r24Var, glc glcVar, sr4 sr4Var, kr4 kr4Var, buc bucVar, gk8 gk8Var, znb znbVar, n64 n64Var, int i) {
        this.a = uri;
        this.b = r24Var;
        this.c = sr4Var;
        this.Y = kr4Var;
        this.o = bucVar;
        this.X = gk8Var;
        this.Z = znbVar;
        this.s0 = n64Var;
        this.u0 = i;
        this.w0 = glcVar;
        final int i2 = 0;
        this.y0 = new Runnable(this) { // from class: lnb
            public final /* synthetic */ unb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.i();
                        break;
                    default:
                        unb unbVar = this.b;
                        if (!unbVar.W0) {
                            wd8 wd8Var = unbVar.B0;
                            wd8Var.getClass();
                            wd8Var.c(unbVar);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.z0 = new Runnable(this) { // from class: lnb
            public final /* synthetic */ unb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.i();
                        break;
                    default:
                        unb unbVar = this.b;
                        if (!unbVar.W0) {
                            wd8 wd8Var = unbVar.B0;
                            wd8Var.getClass();
                            wd8Var.c(unbVar);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        d();
        if (!this.J0.c()) {
            return 0L;
        }
        s1d s1dVarE = this.J0.e(j);
        return w1dVar.a(j, s1dVarE.a.a, s1dVarE.b.a);
    }

    @Override // defpackage.oa5
    public final xze B(int i, int i2) {
        return p(new snb(i, false));
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        if (this.V0) {
            return false;
        }
        jo7 jo7Var = this.v0;
        if (jo7Var.n() || this.T0) {
            return false;
        }
        if (this.G0 && this.P0 == 0) {
            return false;
        }
        boolean zG = this.x0.g();
        if (jo7Var.o()) {
            return zG;
        }
        u();
        return true;
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.B0 = wd8Var;
        this.x0.g();
        u();
    }

    @Override // defpackage.yd8
    public final long L(m85[] m85VarArr, boolean[] zArr, frc[] frcVarArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        m85 m85Var;
        d();
        die dieVar = this.I0;
        sze szeVar = (sze) dieVar.a;
        int i = this.P0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = m85VarArr.length;
            zArr3 = (boolean[]) dieVar.c;
            if (i3 >= length) {
                break;
            }
            frc frcVar = frcVarArr[i3];
            if (frcVar != null && (m85VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((qnb) frcVar).a;
                np8.f(zArr3[i4]);
                this.P0--;
                zArr3[i4] = false;
                frcVarArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.N0 ? j == 0 : i != 0;
        for (int i5 = 0; i5 < m85VarArr.length; i5++) {
            if (frcVarArr[i5] == null && (m85Var = m85VarArr[i5]) != null) {
                np8.f(m85Var.length() == 1);
                np8.f(m85Var.f(0) == 0);
                int iB = szeVar.b(m85Var.a());
                np8.f(!zArr3[iB]);
                this.P0++;
                zArr3[iB] = true;
                frcVarArr[i5] = new qnb(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    drc drcVar = this.D0[iB];
                    z = (drcVar.A(j, true) || drcVar.o() == 0) ? false : true;
                }
            }
        }
        if (this.P0 == 0) {
            this.T0 = false;
            this.O0 = false;
            jo7 jo7Var = this.v0;
            if (jo7Var.o()) {
                drc[] drcVarArr = this.D0;
                int length2 = drcVarArr.length;
                while (i2 < length2) {
                    drcVarArr[i2].i();
                    i2++;
                }
                jo7Var.a();
            } else {
                for (drc drcVar2 : this.D0) {
                    drcVar2.z(false);
                }
            }
        } else if (z) {
            j = l(j);
            while (i2 < frcVarArr.length) {
                if (frcVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.N0 = true;
        return j;
    }

    @Override // defpackage.oa5
    public final void M(u1d u1dVar) {
        this.A0.post(new do9(this, 22, u1dVar));
    }

    @Override // defpackage.i6d
    public final boolean a() {
        boolean z;
        if (this.v0.o()) {
            ae3 ae3Var = this.x0;
            synchronized (ae3Var) {
                z = ae3Var.b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ho7
    public final void b() {
        for (drc drcVar : this.D0) {
            drcVar.z(true);
            er4 er4Var = drcVar.h;
            if (er4Var != null) {
                er4Var.f(drcVar.e);
                drcVar.h = null;
                drcVar.g = null;
            }
        }
        glc glcVar = this.w0;
        ka5 ka5Var = (ka5) glcVar.c;
        if (ka5Var != null) {
            ka5Var.release();
            glcVar.c = null;
        }
        glcVar.o = null;
    }

    @Override // defpackage.brc
    public final void c() {
        this.A0.post(this.y0);
    }

    public final void d() {
        np8.f(this.G0);
        this.I0.getClass();
        this.J0.getClass();
    }

    public final int e() {
        int i = 0;
        for (drc drcVar : this.D0) {
            i += drcVar.q + drcVar.p;
        }
        return i;
    }

    @Override // defpackage.i6d
    public final long f() {
        if (this.P0 == 0) {
            return Long.MIN_VALUE;
        }
        return r();
    }

    public final long g() {
        long j;
        long jMax = Long.MIN_VALUE;
        for (drc drcVar : this.D0) {
            synchronized (drcVar) {
                j = drcVar.v;
            }
            jMax = Math.max(jMax, j);
        }
        return jMax;
    }

    public final boolean h() {
        return this.S0 != -9223372036854775807L;
    }

    public final void i() {
        e99 e99Var;
        int i;
        if (this.W0 || this.G0 || !this.F0 || this.J0 == null) {
            return;
        }
        for (drc drcVar : this.D0) {
            if (drcVar.r() == null) {
                return;
            }
        }
        ae3 ae3Var = this.x0;
        synchronized (ae3Var) {
            ae3Var.b = false;
        }
        int length = this.D0.length;
        qze[] qzeVarArr = new qze[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            oy5 oy5VarR = this.D0[i2].r();
            oy5VarR.getClass();
            String str = oy5VarR.w0;
            boolean zH = ha9.h(str);
            boolean z = zH || ha9.j(str);
            zArr[i2] = z;
            this.H0 = z | this.H0;
            ts6 ts6Var = this.C0;
            if (ts6Var != null) {
                if (zH || this.E0[i2].b) {
                    e99 e99Var2 = oy5VarR.u0;
                    if (e99Var2 == null) {
                        e99Var = new e99(ts6Var);
                    } else {
                        int i3 = maf.a;
                        c99[] c99VarArr = e99Var2.a;
                        Object[] objArrCopyOf = Arrays.copyOf(c99VarArr, c99VarArr.length + 1);
                        System.arraycopy(new c99[]{ts6Var}, 0, objArrCopyOf, c99VarArr.length, 1);
                        e99Var = new e99((c99[]) objArrCopyOf);
                    }
                    my5 my5VarA = oy5VarR.a();
                    my5VarA.i = e99Var;
                    oy5VarR = new oy5(my5VarA);
                }
                if (zH && oy5VarR.Y == -1 && oy5VarR.Z == -1 && (i = ts6Var.a) != -1) {
                    my5 my5VarA2 = oy5VarR.a();
                    my5VarA2.f = i;
                    oy5VarR = new oy5(my5VarA2);
                }
            }
            int iB = this.c.b(oy5VarR);
            my5 my5VarA3 = oy5VarR.a();
            my5VarA3.D = iB;
            qzeVarArr[i2] = new qze(Integer.toString(i2), my5VarA3.a());
        }
        sze szeVar = new sze(qzeVarArr);
        die dieVar = new die();
        dieVar.a = szeVar;
        dieVar.b = zArr;
        int i4 = szeVar.a;
        dieVar.c = new boolean[i4];
        dieVar.o = new boolean[i4];
        this.I0 = dieVar;
        this.G0 = true;
        wd8 wd8Var = this.B0;
        wd8Var.getClass();
        wd8Var.d(this);
    }

    public final void j(int i) {
        d();
        die dieVar = this.I0;
        boolean[] zArr = (boolean[]) dieVar.o;
        if (zArr[i]) {
            return;
        }
        oy5 oy5Var = ((sze) dieVar.a).a(i).c[0];
        this.X.b(ha9.g(oy5Var.w0), oy5Var, 0, null, this.R0);
        zArr[i] = true;
    }

    @Override // defpackage.yd8
    public final void k() throws IOException {
        int iV = this.o.v(this.M0);
        jo7 jo7Var = this.v0;
        IOException iOException = (IOException) jo7Var.c;
        if (iOException != null) {
            throw iOException;
        }
        eo7 eo7Var = (eo7) jo7Var.b;
        if (eo7Var != null) {
            if (iV == Integer.MIN_VALUE) {
                iV = eo7Var.b;
            }
            IOException iOException2 = eo7Var.o;
            if (iOException2 != null && eo7Var.X > iV) {
                throw iOException2;
            }
        }
        if (this.V0 && !this.G0) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.yd8
    public final long l(long j) {
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (!this.J0.c()) {
            j = 0;
        }
        this.O0 = false;
        this.R0 = j;
        if (h()) {
            this.S0 = j;
            return j;
        }
        if (this.M0 != 7) {
            int length = this.D0.length;
            for (int i = 0; i < length; i++) {
                if (this.D0[i].A(j, false) || (!zArr[i] && this.H0)) {
                }
            }
            return j;
        }
        this.T0 = false;
        this.S0 = j;
        this.V0 = false;
        jo7 jo7Var = this.v0;
        if (jo7Var.o()) {
            for (drc drcVar : this.D0) {
                drcVar.i();
            }
            jo7Var.a();
        } else {
            jo7Var.c = null;
            for (drc drcVar2 : this.D0) {
                drcVar2.z(false);
            }
        }
        return j;
    }

    public final void m(int i) {
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (this.T0 && zArr[i] && !this.D0[i].t(false)) {
            this.S0 = 0L;
            this.T0 = false;
            this.O0 = true;
            this.R0 = 0L;
            this.U0 = 0;
            for (drc drcVar : this.D0) {
                drcVar.z(false);
            }
            wd8 wd8Var = this.B0;
            wd8Var.getClass();
            wd8Var.c(this);
        }
    }

    @Override // defpackage.yd8
    public final long n() {
        if (!this.O0) {
            return -9223372036854775807L;
        }
        if (!this.V0 && e() <= this.U0) {
            return -9223372036854775807L;
        }
        this.O0 = false;
        return this.R0;
    }

    @Override // defpackage.co7
    public final void o(fo7 fo7Var, long j, long j2, boolean z) {
        onb onbVar = (onb) fo7Var;
        t1e t1eVar = onbVar.c;
        xn7 xn7Var = new xn7(onbVar.a, onbVar.v0, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.o.getClass();
        this.X.d(xn7Var, 1, -1, null, 0, null, onbVar.u0, this.K0);
        if (z) {
            return;
        }
        if (this.Q0 == -1) {
            this.Q0 = onbVar.w0;
        }
        for (drc drcVar : this.D0) {
            drcVar.z(false);
        }
        if (this.P0 > 0) {
            wd8 wd8Var = this.B0;
            wd8Var.getClass();
            wd8Var.c(this);
        }
    }

    public final drc p(snb snbVar) {
        int length = this.D0.length;
        for (int i = 0; i < length; i++) {
            if (snbVar.equals(this.E0[i])) {
                return this.D0[i];
            }
        }
        sr4 sr4Var = this.c;
        sr4Var.getClass();
        kr4 kr4Var = this.Y;
        kr4Var.getClass();
        drc drcVar = new drc(this.s0, sr4Var, kr4Var);
        drcVar.f = this;
        int i2 = length + 1;
        snb[] snbVarArr = (snb[]) Arrays.copyOf(this.E0, i2);
        snbVarArr[length] = snbVar;
        int i3 = maf.a;
        this.E0 = snbVarArr;
        drc[] drcVarArr = (drc[]) Arrays.copyOf(this.D0, i2);
        drcVarArr[length] = drcVar;
        this.D0 = drcVarArr;
        return drcVar;
    }

    @Override // defpackage.yd8
    public final sze q() {
        d();
        return (sze) this.I0.a;
    }

    @Override // defpackage.i6d
    public final long r() {
        long jG;
        boolean z;
        long j;
        d();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (this.V0) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.S0;
        }
        if (this.H0) {
            int length = this.D0.length;
            jG = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    drc drcVar = this.D0[i];
                    synchronized (drcVar) {
                        z = drcVar.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        drc drcVar2 = this.D0[i];
                        synchronized (drcVar2) {
                            j = drcVar2.v;
                        }
                        jG = Math.min(jG, j);
                    }
                }
            }
        } else {
            jG = Long.MAX_VALUE;
        }
        if (jG == Long.MAX_VALUE) {
            jG = g();
        }
        return jG == Long.MIN_VALUE ? this.R0 : jG;
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        d();
        if (h()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.I0.c;
        int length = this.D0.length;
        for (int i = 0; i < length; i++) {
            this.D0[i].h(j, z, zArr[i]);
        }
    }

    @Override // defpackage.i6d
    public final void t(long j) {
    }

    public final void u() {
        onb onbVar = new onb(this, this.a, this.b, this.w0, this, this.x0);
        if (this.G0) {
            np8.f(h());
            long j = this.K0;
            if (j != -9223372036854775807L && this.S0 > j) {
                this.V0 = true;
                this.S0 = -9223372036854775807L;
                return;
            }
            u1d u1dVar = this.J0;
            u1dVar.getClass();
            long j2 = u1dVar.e(this.S0).a.b;
            long j3 = this.S0;
            onbVar.Z.a = j2;
            onbVar.u0 = j3;
            onbVar.t0 = true;
            onbVar.y0 = false;
            for (drc drcVar : this.D0) {
                drcVar.t = this.S0;
            }
            this.S0 = -9223372036854775807L;
        }
        this.U0 = e();
        this.X.k(new xn7(onbVar.a, onbVar.v0, this.v0.w(onbVar, this, this.o.v(this.M0))), 1, -1, null, 0, null, onbVar.u0, this.K0);
    }

    public final boolean v() {
        return this.O0 || h();
    }

    @Override // defpackage.oa5, defpackage.pa5
    public final void w() {
        this.F0 = true;
        this.A0.post(this.y0);
    }

    @Override // defpackage.co7
    public final void y(fo7 fo7Var, long j, long j2) {
        u1d u1dVar;
        onb onbVar = (onb) fo7Var;
        if (this.K0 == -9223372036854775807L && (u1dVar = this.J0) != null) {
            boolean zC = u1dVar.c();
            long jG = g();
            long j3 = jG == Long.MIN_VALUE ? 0L : jG + WorkRequest.MIN_BACKOFF_MILLIS;
            this.K0 = j3;
            this.Z.q(j3, zC, this.L0);
        }
        t1e t1eVar = onbVar.c;
        xn7 xn7Var = new xn7(onbVar.a, onbVar.v0, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.o.getClass();
        this.X.f(xn7Var, 1, -1, null, 0, null, onbVar.u0, this.K0);
        if (this.Q0 == -1) {
            this.Q0 = onbVar.w0;
        }
        this.V0 = true;
        wd8 wd8Var = this.B0;
        wd8Var.getClass();
        wd8Var.c(this);
    }

    @Override // defpackage.co7
    public final b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        b11 b11Var;
        u1d u1dVar;
        onb onbVar = (onb) fo7Var;
        if (this.Q0 == -1) {
            this.Q0 = onbVar.w0;
        }
        t1e t1eVar = onbVar.c;
        xn7 xn7Var = new xn7(onbVar.a, onbVar.v0, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        int i2 = maf.a;
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
            b11Var = jo7.Y;
        } else {
            int iE = e();
            int i4 = iE > this.U0 ? 1 : 0;
            if (this.Q0 != -1 || ((u1dVar = this.J0) != null && u1dVar.f() != -9223372036854775807L)) {
                this.U0 = iE;
            } else if (!this.G0 || v()) {
                this.O0 = this.G0;
                this.R0 = 0L;
                this.U0 = 0;
                for (drc drcVar : this.D0) {
                    drcVar.z(false);
                }
                onbVar.Z.a = 0L;
                onbVar.u0 = 0L;
                onbVar.t0 = true;
                onbVar.y0 = false;
            } else {
                this.T0 = true;
                b11Var = jo7.X;
            }
            b11Var = new b11(jMin, i4, 4, false);
        }
        b11 b11Var2 = b11Var;
        this.X.h(xn7Var, 1, -1, null, 0, null, onbVar.u0, this.K0, iOException, !b11Var2.a());
        return b11Var2;
    }
}
