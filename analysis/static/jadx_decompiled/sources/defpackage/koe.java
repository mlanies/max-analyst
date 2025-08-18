package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class koe implements r24 {
    public final r24 a;
    public final kw0 b;
    public boolean c;
    public long o;

    public koe(r24 r24Var, kw0 kw0Var) {
        r24Var.getClass();
        this.a = r24Var;
        kw0Var.getClass();
        this.b = kw0Var;
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws CacheDataSink$CacheDataSinkException {
        long jL = this.a.L(z24Var);
        this.o = jL;
        if (jL == 0) {
            return 0L;
        }
        if (z24Var.g == -1 && jL != -1) {
            z24Var = z24Var.c(0L, jL);
        }
        this.c = true;
        kw0 kw0Var = this.b;
        kw0Var.getClass();
        z24Var.h.getClass();
        long j = z24Var.g;
        int i = z24Var.i;
        if (j == -1 && (i & 2) == 2) {
            kw0Var.j = null;
        } else {
            kw0Var.j = z24Var;
            kw0Var.d = (i & 4) == 4 ? kw0Var.b : Long.MAX_VALUE;
            kw0Var.h = 0L;
            try {
                kw0Var.b(z24Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.o;
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.a.N(y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.r24
    public final void close() throws CacheDataSink$CacheDataSinkException {
        kw0 kw0Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (((z24) kw0Var.j) == null) {
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
                if (((z24) kw0Var.j) != null) {
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

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.o == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            kw0 kw0Var = this.b;
            z24 z24Var = (z24) kw0Var.j;
            if (z24Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (kw0Var.g == kw0Var.d) {
                            kw0Var.a();
                            kw0Var.b(z24Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, kw0Var.d - kw0Var.g);
                        OutputStream outputStream = kw0Var.f;
                        int i5 = maf.a;
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
