package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class uke implements yp6 {
    public static final AtomicReference x0 = new AtomicReference();
    public z24 X;
    public yic Y;
    public mhc Z;
    public final String a;
    public final HashMap b;
    public final ny0 c;
    public final y0f o;
    public boolean s0;
    public long t0;
    public long u0;
    public long v0;
    public long w0;

    public uke(ny0 ny0Var, String str, y0f y0fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        this.o = y0fVar;
        this.b = new HashMap();
        this.c = ny0Var;
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws IOException {
        vq6 vq6VarB;
        this.X = z24Var;
        long j = 0;
        this.w0 = 0L;
        this.v0 = 0L;
        long j2 = z24Var.f;
        long j3 = z24Var.g;
        boolean z = (z24Var.i & 1) != 0;
        String string = z24Var.a.toString();
        try {
            od3 od3Var = new od3();
            od3Var.j(null, string);
            vq6VarB = od3Var.b();
        } catch (IllegalArgumentException unused) {
            vq6VarB = null;
        }
        l84 l84Var = new l84();
        l84Var.a = vq6VarB;
        l84Var.Q(UUID.randomUUID().toString());
        synchronized (this.b) {
            try {
                for (Map.Entry entry : this.b.entrySet()) {
                    l84Var.q((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long j4 = -1;
        if (j2 != 0 || j3 != -1) {
            long jMax = Math.max(0L, j2);
            long j5 = j3 != -1 ? (j3 + jMax) - 1 : jMax;
            if (jMax < j5) {
                StringBuilder sbK = au1.k(jMax, "bytes=", "-");
                sbK.append(j5);
                ((bj6) l84Var.c).a("Range", sbK.toString());
            }
        }
        ((bj6) l84Var.c).a(HTTP.USER_AGENT, this.a);
        if (!z) {
            ((bj6) l84Var.c).a("Accept-Encoding", HTTP.IDENTITY_CODING);
        }
        mhc mhcVarR = l84Var.r();
        this.Z = mhcVarR;
        try {
            yic yicVarF = ((u2a) this.c).b(mhcVarR).f();
            this.Y = yicVarF;
            int i = yicVarF.o;
            if (!yicVarF.m()) {
                cj6 cj6Var = this.Z.d;
                cj6Var.getClass();
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                int size = cj6Var.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strB = cj6Var.b(i2);
                    Locale locale = Locale.US;
                    if (strB == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strB.toLowerCase(locale);
                    List arrayList = (List) treeMap.get(lowerCase);
                    if (arrayList == null) {
                        arrayList = new ArrayList(2);
                        treeMap.put(lowerCase, arrayList);
                    }
                    arrayList.add(cj6Var.d(i2));
                }
                naf.c(this.Y.Z);
                this.Y = null;
                int i3 = maf.a;
                throw new HttpDataSource$InvalidResponseCodeException(i, null, null, treeMap, z24Var);
            }
            String str = this.Y.Z.o().a;
            if (str.isEmpty()) {
                naf.c(this.Y.Z);
                this.Y = null;
                throw new HttpDataSource$InvalidContentTypeException(str, z24Var);
            }
            if (i == 200) {
                long j6 = z24Var.f;
                if (j6 != 0) {
                    j = j6;
                }
            }
            this.t0 = j;
            if ((z24Var.i & 1) == 0) {
                long jN = this.Y.Z.n();
                long j7 = z24Var.g;
                if (j7 != -1) {
                    j4 = j7;
                } else if (jN != -1) {
                    j4 = jN - this.t0;
                }
                this.u0 = j4;
            } else {
                this.u0 = z24Var.g;
            }
            this.s0 = true;
            y0f y0fVar = this.o;
            if (y0fVar != null) {
                ((h84) y0fVar).g(z24Var, true);
            }
            return this.u0;
        } catch (IOException e) {
            throw new HttpDataSource$HttpDataSourceException("Unable to connect to " + z24Var.a.toString(), e, z24Var, 2000);
        }
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
    }

    @Override // defpackage.r24
    public final Map a() {
        return Collections.emptyMap();
    }

    public final int b(int i, byte[] bArr, int i2) throws IOException {
        long j = this.u0;
        if (j != -1) {
            i2 = (int) Math.min(i2, j - this.w0);
        }
        if (i2 == 0) {
            return -1;
        }
        int i3 = this.Y.Z.m().read(bArr, i, i2);
        if (i3 == -1) {
            long j2 = this.u0;
            if (j2 == -1 || j2 == this.w0) {
                return -1;
            }
            throw new EOFException();
        }
        this.w0 += i3;
        y0f y0fVar = this.o;
        if (y0fVar != null) {
            ((h84) y0fVar).e(this.X, true, i3);
        }
        return i3;
    }

    public final void c() throws IOException {
        if (this.v0 == this.t0) {
            return;
        }
        AtomicReference atomicReference = x0;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.v0;
            long j2 = this.t0;
            if (j == j2) {
                atomicReference.set(bArr);
                return;
            }
            int i = this.Y.Z.m().read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            this.v0 += i;
            y0f y0fVar = this.o;
            if (y0fVar != null) {
                ((h84) y0fVar).e(this.X, true, i);
            }
        }
    }

    @Override // defpackage.r24
    public final void close() throws IOException {
        if (this.s0) {
            this.s0 = false;
            y0f y0fVar = this.o;
            if (y0fVar != null) {
                ((h84) y0fVar).f(this.X, true);
            }
            naf.c(this.Y.Z);
            this.Y = null;
        }
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        mhc mhcVar = this.Z;
        if (mhcVar == null) {
            return null;
        }
        return Uri.parse(mhcVar.b.i);
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            c();
            return b(i, bArr, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.b(e, this.X, 2);
        }
    }
}
