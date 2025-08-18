package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ow0 implements t24 {
    public vpd A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public final xw0 X;
    public final boolean Y;
    public final boolean Z;
    public final gw0 a;
    public final t24 b;
    public final loe c;
    public final t24 o;
    public final boolean s0;
    public Uri t0;
    public a34 u0;
    public a34 v0;
    public t24 w0;
    public long x0;
    public long y0;
    public long z0;

    public ow0(gw0 gw0Var, t24 t24Var, t24 t24Var2, kw0 kw0Var, int i) {
        xw0 xw0Var = xw0.c;
        this.a = gw0Var;
        this.b = t24Var2;
        this.X = xw0Var;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.s0 = (i & 4) != 0;
        if (t24Var != null) {
            this.o = t24Var;
            this.c = kw0Var != null ? new loe(t24Var, kw0Var) : null;
        } else {
            this.o = m2b.a;
            this.c = null;
        }
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) {
        gw0 gw0Var = this.a;
        try {
            String strE = this.X.e(a34Var);
            long j = a34Var.f;
            y24 y24VarA = a34Var.a();
            y24VarA.i = strE;
            a34 a34VarB = y24VarA.b();
            this.u0 = a34VarB;
            Uri uri = a34VarB.a;
            byte[] bArr = (byte[]) ((spd) gw0Var).i(strE).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, b52.c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.t0 = uri;
            this.y0 = j;
            boolean z = this.Z;
            long j2 = a34Var.g;
            boolean z2 = (z && this.B0) || (this.s0 && j2 == -1);
            this.C0 = z2;
            if (z2) {
                this.z0 = -1L;
            } else {
                long jA = dt3.a(((spd) gw0Var).i(strE));
                this.z0 = jA;
                if (jA != -1) {
                    long j3 = jA - j;
                    this.z0 = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.z0;
                this.z0 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.z0;
            if (j5 > 0 || j5 == -1) {
                c(a34VarB, false);
            }
            return j2 != -1 ? j2 : this.z0;
        } catch (Throwable th) {
            if (this.w0 == this.b || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.b.H(z0fVar);
        this.o.H(z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        return (this.w0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        gw0 gw0Var = this.a;
        t24 t24Var = this.w0;
        if (t24Var == null) {
            return;
        }
        try {
            t24Var.close();
        } finally {
            this.v0 = null;
            this.w0 = null;
            vpd vpdVar = this.A0;
            if (vpdVar != null) {
                ((spd) gw0Var).k(vpdVar);
                this.A0 = null;
            }
        }
    }

    public final void c(a34 a34Var, boolean z) throws InterruptedIOException {
        vpd vpdVarO;
        a34 a34VarB;
        t24 t24Var;
        String str = a34Var.h;
        int i = oaf.a;
        if (this.C0) {
            vpdVarO = null;
        } else if (this.Y) {
            try {
                gw0 gw0Var = this.a;
                long j = this.y0;
                long j2 = this.z0;
                spd spdVar = (spd) gw0Var;
                synchronized (spdVar) {
                    spdVar.d();
                    while (true) {
                        vpdVarO = spdVar.o(j, str, j2);
                        if (vpdVarO != null) {
                            break;
                        } else {
                            spdVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            vpdVarO = ((spd) this.a).o(this.y0, str, this.z0);
        }
        if (vpdVarO == null) {
            t24Var = this.o;
            y24 y24VarA = a34Var.a();
            y24VarA.g = this.y0;
            y24VarA.h = this.z0;
            a34VarB = y24VarA.b();
        } else if (vpdVarO.o) {
            Uri uriFromFile = Uri.fromFile(vpdVarO.X);
            long j3 = vpdVarO.b;
            long j4 = this.y0 - j3;
            long jMin = vpdVarO.c - j4;
            long j5 = this.z0;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            y24 y24VarA2 = a34Var.a();
            y24VarA2.b = uriFromFile;
            y24VarA2.c = j3;
            y24VarA2.g = j4;
            y24VarA2.h = jMin;
            a34VarB = y24VarA2.b();
            t24Var = this.b;
        } else {
            long jMin2 = vpdVarO.c;
            if (jMin2 == -1) {
                jMin2 = this.z0;
            } else {
                long j6 = this.z0;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            y24 y24VarA3 = a34Var.a();
            y24VarA3.g = this.y0;
            y24VarA3.h = jMin2;
            a34VarB = y24VarA3.b();
            t24Var = this.c;
            if (t24Var == null) {
                t24Var = this.o;
                ((spd) this.a).k(vpdVarO);
                vpdVarO = null;
            }
        }
        this.D0 = (this.C0 || t24Var != this.o) ? Long.MAX_VALUE : this.y0 + 102400;
        if (z) {
            fm9.k(this.w0 == this.o);
            if (t24Var == this.o) {
                return;
            }
            try {
                b();
            } finally {
            }
        }
        if (vpdVarO != null && (!vpdVarO.o)) {
            this.A0 = vpdVarO;
        }
        this.w0 = t24Var;
        this.v0 = a34VarB;
        this.x0 = 0L;
        long jG = t24Var.G(a34VarB);
        imc imcVar = new imc(13);
        if (a34VarB.g == -1 && jG != -1) {
            this.z0 = jG;
            imcVar.M(Long.valueOf(this.y0 + jG), "exo_len");
        }
        if (!(this.w0 == this.b)) {
            Uri uri = t24Var.getUri();
            this.t0 = uri;
            Uri uri2 = a34Var.a.equals(uri) ^ true ? this.t0 : null;
            if (uri2 == null) {
                ((ArrayList) imcVar.c).add("exo_redir");
                ((HashMap) imcVar.b).remove("exo_redir");
            } else {
                imcVar.M(uri2.toString(), "exo_redir");
            }
        }
        if (this.w0 == this.c) {
            ((spd) this.a).c(str, imcVar);
        }
    }

    @Override // defpackage.t24
    public final void close() {
        this.u0 = null;
        this.t0 = null;
        this.y0 = 0L;
        try {
            b();
        } catch (Throwable th) {
            if (this.w0 == this.b || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.t0;
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        t24 t24Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.z0 == 0) {
            return -1;
        }
        a34 a34Var = this.u0;
        a34Var.getClass();
        a34 a34Var2 = this.v0;
        a34Var2.getClass();
        try {
            if (this.y0 >= this.D0) {
                c(a34Var, true);
            }
            t24 t24Var2 = this.w0;
            t24Var2.getClass();
            int i4 = t24Var2.read(bArr, i, i2);
            if (i4 != -1) {
                long j = i4;
                this.y0 += j;
                this.x0 += j;
                long j2 = this.z0;
                if (j2 != -1) {
                    this.z0 = j2 - j;
                }
                return i4;
            }
            t24 t24Var3 = this.w0;
            if (!(t24Var3 == t24Var)) {
                i3 = i4;
                long j3 = a34Var2.g;
                if (j3 == -1 || this.x0 < j3) {
                    String str = a34Var.h;
                    int i5 = oaf.a;
                    this.z0 = 0L;
                    if (!(t24Var3 == this.c)) {
                        return i3;
                    }
                    imc imcVar = new imc(13);
                    imcVar.M(Long.valueOf(this.y0), "exo_len");
                    ((spd) this.a).c(str, imcVar);
                    return i3;
                }
            } else {
                i3 = i4;
            }
            long j4 = this.z0;
            if (j4 <= 0 && j4 != -1) {
                return i3;
            }
            b();
            c(a34Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.w0 == t24Var || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }
}
