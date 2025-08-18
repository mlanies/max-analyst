package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class nw0 implements r24 {
    public upd A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public final xw0 X;
    public final boolean Y;
    public final boolean Z;
    public final hw0 a;
    public final r24 b;
    public final koe c;
    public final r24 o;
    public final boolean s0;
    public Uri t0;
    public z24 u0;
    public z24 v0;
    public r24 w0;
    public long x0;
    public long y0;
    public long z0;

    public nw0(hw0 hw0Var, r24 r24Var, r24 r24Var2, kw0 kw0Var, int i) {
        xw0 xw0Var = xw0.b;
        this.a = hw0Var;
        this.b = r24Var2;
        this.X = xw0Var;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.s0 = (i & 4) != 0;
        if (r24Var != null) {
            this.o = r24Var;
            this.c = kw0Var != null ? new koe(r24Var, kw0Var) : null;
        } else {
            this.o = at4.a;
            this.c = null;
        }
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) {
        hw0 hw0Var = this.a;
        try {
            this.X.getClass();
            String string = z24Var.h;
            if (string == null) {
                string = z24Var.a.toString();
            }
            long j = z24Var.f;
            y24 y24VarA = z24Var.a();
            y24VarA.i = string;
            z24 z24VarA = y24VarA.a();
            this.u0 = z24VarA;
            Uri uri = z24VarA.a;
            byte[] bArr = (byte[]) ((rpd) hw0Var).g(string).b.get("exo_redir");
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
            long j2 = z24Var.g;
            boolean z2 = (z && this.B0) || (this.s0 && j2 == -1);
            this.C0 = z2;
            if (z2) {
                this.z0 = -1L;
            } else {
                long jA = ct3.a(((rpd) hw0Var).g(string));
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
                c(z24VarA, false);
            }
            return j2 != -1 ? j2 : this.z0;
        } catch (Throwable th) {
            if (this.w0 == this.b || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.b.N(y0fVar);
        this.o.N(y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        return (this.w0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        hw0 hw0Var = this.a;
        r24 r24Var = this.w0;
        if (r24Var == null) {
            return;
        }
        try {
            r24Var.close();
        } finally {
            this.v0 = null;
            this.w0 = null;
            upd updVar = this.A0;
            if (updVar != null) {
                ((rpd) hw0Var).i(updVar);
                this.A0 = null;
            }
        }
    }

    public final void c(z24 z24Var, boolean z) throws InterruptedIOException {
        upd updVarL;
        z24 z24VarA;
        r24 r24Var;
        String str = z24Var.h;
        int i = maf.a;
        if (this.C0) {
            updVarL = null;
        } else if (this.Y) {
            try {
                hw0 hw0Var = this.a;
                long j = this.y0;
                long j2 = this.z0;
                rpd rpdVar = (rpd) hw0Var;
                synchronized (rpdVar) {
                    rpdVar.d();
                    while (true) {
                        updVarL = rpdVar.l(j, str, j2);
                        if (updVarL != null) {
                            break;
                        } else {
                            rpdVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            updVarL = ((rpd) this.a).l(this.y0, str, this.z0);
        }
        if (updVarL == null) {
            r24Var = this.o;
            y24 y24VarA = z24Var.a();
            y24VarA.g = this.y0;
            y24VarA.h = this.z0;
            z24VarA = y24VarA.a();
        } else if (updVarL.o) {
            Uri uriFromFile = Uri.fromFile(updVarL.X);
            long j3 = updVarL.b;
            long j4 = this.y0 - j3;
            long jMin = updVarL.c - j4;
            long j5 = this.z0;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            y24 y24VarA2 = z24Var.a();
            y24VarA2.b = uriFromFile;
            y24VarA2.c = j3;
            y24VarA2.g = j4;
            y24VarA2.h = jMin;
            z24VarA = y24VarA2.a();
            r24Var = this.b;
        } else {
            long jMin2 = updVarL.c;
            if (jMin2 == -1) {
                jMin2 = this.z0;
            } else {
                long j6 = this.z0;
                if (j6 != -1) {
                    jMin2 = Math.min(jMin2, j6);
                }
            }
            y24 y24VarA3 = z24Var.a();
            y24VarA3.g = this.y0;
            y24VarA3.h = jMin2;
            z24VarA = y24VarA3.a();
            r24Var = this.c;
            if (r24Var == null) {
                r24Var = this.o;
                ((rpd) this.a).i(updVarL);
                updVarL = null;
            }
        }
        this.D0 = (this.C0 || r24Var != this.o) ? Long.MAX_VALUE : this.y0 + 102400;
        if (z) {
            np8.f(this.w0 == this.o);
            if (r24Var == this.o) {
                return;
            }
            try {
                b();
            } finally {
            }
        }
        if (updVarL != null && (!updVarL.o)) {
            this.A0 = updVarL;
        }
        this.w0 = r24Var;
        this.v0 = z24VarA;
        this.x0 = 0L;
        long jL = r24Var.L(z24VarA);
        h7b h7bVar = new h7b(13);
        if (z24VarA.g == -1 && jL != -1) {
            this.z0 = jL;
            h7bVar.e(Long.valueOf(this.y0 + jL), "exo_len");
        }
        if (!(this.w0 == this.b)) {
            Uri uri = r24Var.getUri();
            this.t0 = uri;
            Uri uri2 = z24Var.a.equals(uri) ^ true ? this.t0 : null;
            if (uri2 == null) {
                ((ArrayList) h7bVar.c).add("exo_redir");
                ((HashMap) h7bVar.b).remove("exo_redir");
            } else {
                h7bVar.e(uri2.toString(), "exo_redir");
            }
        }
        if (this.w0 == this.c) {
            ((rpd) this.a).c(str, h7bVar);
        }
    }

    @Override // defpackage.r24
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

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.t0;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        r24 r24Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.z0 == 0) {
            return -1;
        }
        z24 z24Var = this.u0;
        z24Var.getClass();
        z24 z24Var2 = this.v0;
        z24Var2.getClass();
        try {
            if (this.y0 >= this.D0) {
                c(z24Var, true);
            }
            r24 r24Var2 = this.w0;
            r24Var2.getClass();
            int i4 = r24Var2.read(bArr, i, i2);
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
            r24 r24Var3 = this.w0;
            if (!(r24Var3 == r24Var)) {
                i3 = i4;
                long j3 = z24Var2.g;
                if (j3 == -1 || this.x0 < j3) {
                    String str = z24Var.h;
                    int i5 = maf.a;
                    this.z0 = 0L;
                    if (!(r24Var3 == this.c)) {
                        return i3;
                    }
                    h7b h7bVar = new h7b(13);
                    h7bVar.e(Long.valueOf(this.y0), "exo_len");
                    ((rpd) this.a).c(str, h7bVar);
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
            c(z24Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.w0 == r24Var || (th instanceof Cache$CacheException)) {
                this.B0 = true;
            }
            throw th;
        }
    }
}
