package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class loe implements t24 {
    public final t24 a;
    public final kw0 b;
    public boolean c;
    public long o;

    public loe(t24 t24Var, kw0 kw0Var) {
        t24Var.getClass();
        this.a = t24Var;
        kw0Var.getClass();
        this.b = kw0Var;
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) throws CacheDataSink$CacheDataSinkException {
        long jG = this.a.G(a34Var);
        this.o = jG;
        if (jG == 0) {
            return 0L;
        }
        if (a34Var.g == -1 && jG != -1) {
            a34Var = a34Var.c(0L, jG);
        }
        this.c = true;
        kw0 kw0Var = this.b;
        kw0Var.getClass();
        a34Var.h.getClass();
        long j = a34Var.g;
        int i = a34Var.i;
        if (j == -1 && (i & 2) == 2) {
            kw0Var.j = null;
        } else {
            kw0Var.j = a34Var;
            kw0Var.d = (i & 4) == 4 ? kw0Var.b : Long.MAX_VALUE;
            kw0Var.h = 0L;
            try {
                kw0Var.c(a34Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.o;
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.a.H(z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.t24
    public final void close() throws CacheDataSink$CacheDataSinkException {
        kw0 kw0Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (((a34) kw0Var.j) == null) {
                    return;
                }
                try {
                    kw0Var.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (((a34) kw0Var.j) != null) {
                    try {
                        kw0Var.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.o == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            kw0 kw0Var = this.b;
            a34 a34Var = (a34) kw0Var.j;
            if (a34Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (kw0Var.g == kw0Var.d) {
                            kw0Var.a();
                            kw0Var.c(a34Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, kw0Var.d - kw0Var.g);
                        OutputStream outputStream = kw0Var.f;
                        int i5 = oaf.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        kw0Var.g += j;
                        kw0Var.h += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.o;
            if (j2 != -1) {
                this.o = j2 - i3;
            }
        }
        return i3;
    }
}
