package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class prd implements zd8, do7 {
    public final jn X;
    public final tze Y;
    public final a34 a;
    public final q24 b;
    public final z0f c;
    public final huc o;
    public final long s0;
    public final qy5 u0;
    public final boolean v0;
    public boolean w0;
    public byte[] x0;
    public int y0;
    public final ArrayList Z = new ArrayList();
    public final vq7 t0 = new vq7("SingleSampleMediaPeriod");

    public prd(a34 a34Var, q24 q24Var, z0f z0fVar, qy5 qy5Var, long j, huc hucVar, jn jnVar, boolean z) {
        this.a = a34Var;
        this.b = q24Var;
        this.c = z0fVar;
        this.u0 = qy5Var;
        this.s0 = j;
        this.o = hucVar;
        this.X = jnVar;
        this.v0 = z;
        this.Y = new tze(new rze("", qy5Var));
    }

    @Override // defpackage.do7
    public final b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        b11 b11Var;
        Uri uri = ((ord) go7Var).c.c;
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
        boolean z = jMin == -9223372036854775807L || i >= 3;
        if (this.v0 && z) {
            z04.d0("Loading failed, treating as end-of-stream.", iOException);
            this.w0 = true;
            b11Var = vq7.Y;
        } else {
            b11Var = jMin != -9223372036854775807L ? new b11(jMin, 0, 5, false) : vq7.Z;
        }
        b11 b11Var2 = b11Var;
        this.X.B(yn7Var, 1, -1, this.u0, 0, null, 0L, this.s0, iOException, !b11Var2.a());
        return b11Var2;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.t0.o();
    }

    @Override // defpackage.j6d
    public final long f() {
        return (this.w0 || this.t0.o()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < n85VarArr.length; i++) {
            grc grcVar = grcVarArr[i];
            ArrayList arrayList = this.Z;
            if (grcVar != null && (n85VarArr[i] == null || !zArr[i])) {
                arrayList.remove(grcVar);
                grcVarArr[i] = null;
            }
            if (grcVarArr[i] == null && n85VarArr[i] != null) {
                nrd nrdVar = new nrd(this);
                arrayList.add(nrdVar);
                grcVarArr[i] = nrdVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        return j;
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        xd8Var.e(this);
    }

    @Override // defpackage.zd8
    public final void k() {
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i >= arrayList.size()) {
                return j;
            }
            nrd nrdVar = (nrd) arrayList.get(i);
            if (nrdVar.a == 2) {
                nrdVar.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.do7
    public final void m(go7 go7Var, long j, long j2, boolean z) {
        Uri uri = ((ord) go7Var).c.c;
        yn7 yn7Var = new yn7(j2);
        this.o.getClass();
        this.X.x(yn7Var, 1, -1, null, 0, null, 0L, this.s0);
    }

    @Override // defpackage.zd8
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        if (this.w0) {
            return false;
        }
        vq7 vq7Var = this.t0;
        if (vq7Var.o() || vq7Var.n()) {
            return false;
        }
        t24 t24VarA = this.b.a();
        z0f z0fVar = this.c;
        if (z0fVar != null) {
            t24VarA.H(z0fVar);
        }
        ord ordVar = new ord(t24VarA, this.a);
        this.o.getClass();
        this.X.F(new yn7(ordVar.a, this.a, vq7Var.v(ordVar, this, 3)), 1, -1, this.u0, 0, null, 0L, this.s0);
        return true;
    }

    @Override // defpackage.zd8
    public final tze q() {
        return this.Y;
    }

    @Override // defpackage.j6d
    public final long r() {
        return this.w0 ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
    }

    @Override // defpackage.j6d
    public final void t(long j) {
    }

    @Override // defpackage.do7
    public final void v(go7 go7Var, long j, long j2) {
        ord ordVar = (ord) go7Var;
        this.y0 = (int) ordVar.c.b;
        byte[] bArr = ordVar.o;
        bArr.getClass();
        this.x0 = bArr;
        this.w0 = true;
        Uri uri = ordVar.c.c;
        yn7 yn7Var = new yn7(j2);
        this.o.getClass();
        this.X.z(yn7Var, 1, -1, this.u0, 0, null, 0L, this.s0);
    }
}
