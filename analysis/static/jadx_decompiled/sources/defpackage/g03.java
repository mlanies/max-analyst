package defpackage;

import android.util.SparseLongArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class g03 implements z14, a24, abe, agf, ma5, na5, oa5, pa5, m78 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ g03(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.z14, defpackage.a24
    public boolean A() {
        switch (this.a) {
        }
        return true;
    }

    @Override // defpackage.oa5
    public xze B(int i, int i2) {
        return ((oa5) this.c).B(i, i2);
    }

    @Override // defpackage.z14, defpackage.a24
    public long C() {
        switch (this.a) {
        }
        return 0L;
    }

    @Override // defpackage.z14, defpackage.a24
    public long D(long j) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).a;
            default:
                return ((m13) this.c).a;
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long E(long j, long j2) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).a;
            default:
                return ((m13) this.c).a;
        }
    }

    @Override // defpackage.agf
    public void F(long j) {
        ard ardVar = (ard) this.c;
        if (ardVar.w0) {
            c(new VideoFrameProcessingException("onOutputFrameAvailableForRendering() received after onEnded()"));
            return;
        }
        if (j == 0) {
            ardVar.y0 = true;
        }
        this.b = j;
        ((ard) this.c).Y.execute(new r60(this, j, 7));
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
        ((pa5) this.c).J(new wzd(this, v1dVar, v1dVar));
    }

    @Override // defpackage.agf
    public void K() {
    }

    @Override // defpackage.oa5
    public void M(u1d u1dVar) {
        ((oa5) this.c).M(new vzd(this, u1dVar));
    }

    @Override // defpackage.agf
    public void O() {
        ard ardVar = (ard) this.c;
        if (ardVar.w0) {
            c(new VideoFrameProcessingException("onEnded() received multiple times"));
            return;
        }
        ardVar.w0 = true;
        ardVar.Y.execute(new u3c(19, this));
    }

    public void P(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        g03 g03Var = (g03) this.c;
        if (g03Var != null) {
            g03Var.P(i - 64);
        }
    }

    public int Q(int i) {
        g03 g03Var = (g03) this.c;
        if (g03Var == null) {
            if (i >= 64) {
                return Long.bitCount(this.b);
            }
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + g03Var.Q(i - 64);
    }

    public void R() {
        if (((g03) this.c) == null) {
            this.c = new g03(0);
        }
    }

    public boolean S(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        R();
        return ((g03) this.c).S(i - 64);
    }

    public int T(long j) {
        long jU = U();
        long jM = 0;
        int i = 0;
        gg ggVar = (gg) this.c;
        if (jU == 0) {
            long jM2 = 0;
            while (true) {
                jM2 += ggVar.M(i);
                int i2 = i + 1;
                if (0 < jM2) {
                    return i;
                }
                i = i2;
            }
        } else {
            if (ggVar.g0() != 0 && j / jU >= ggVar.g0()) {
                return -1;
            }
            long j2 = j % jU;
            while (true) {
                jM += ggVar.M(i);
                int i3 = i + 1;
                if (j2 < jM) {
                    return i;
                }
                i = i3;
            }
        }
    }

    public long U() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0L;
        int iX = ((gg) this.c).x();
        for (int i = 0; i < iX; i++) {
            this.b += r0.M(i);
        }
        return this.b;
    }

    public long V(long j) {
        long jU = U();
        long jM = 0;
        if (jU == 0) {
            return -1L;
        }
        gg ggVar = (gg) this.c;
        if (!(ggVar.g0() == 0) && j / jU >= ggVar.g0()) {
            return -1L;
        }
        long j2 = j % jU;
        int iX = ggVar.x();
        for (int i = 0; i < iX && jM <= j2; i++) {
            jM += ggVar.M(i);
        }
        return (jM - j2) + j;
    }

    public void W(int i, boolean z) {
        if (i >= 64) {
            R();
            ((g03) this.c).W(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            b0(i);
        } else {
            P(i);
        }
        if (z2 || ((g03) this.c) != null) {
            R();
            ((g03) this.c).W(0, z2);
        }
    }

    public void X(String str) {
        long seconds = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - this.b);
        float nanos = (r0 - TimeUnit.SECONDS.toNanos(seconds)) / TimeUnit.MILLISECONDS.toNanos(1L);
        ((a4c) this.c).log("OKRTCCall", rh4.j(str, " completed in ", seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", Float.valueOf(nanos)) : String.format(Locale.ROOT, "%d seconds and %.1f ms", Long.valueOf(seconds), Float.valueOf(nanos))));
    }

    public cj6 Y() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strG = ((fu0) this.c).G(this.b);
            this.b -= strG.length();
            if (strG.length() == 0) {
                break;
            }
            int iZ0 = w9e.z0(strG, ':', 1, false, 4);
            if (iZ0 != -1) {
                String strSubstring = strG.substring(0, iZ0);
                String strSubstring2 = strG.substring(iZ0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(w9e.b1(strSubstring2).toString());
            } else if (strG.charAt(0) == ':') {
                String strSubstring3 = strG.substring(1);
                arrayList.add("");
                arrayList.add(w9e.b1(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(w9e.b1(strG).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new cj6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean Z(int i) {
        if (i >= 64) {
            R();
            return ((g03) this.c).Z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        g03 g03Var = (g03) this.c;
        if (g03Var != null) {
            if (g03Var.S(0)) {
                b0(63);
            }
            ((g03) this.c).Z(0);
        }
        return z;
    }

    public void a0() {
        this.b = 0L;
        g03 g03Var = (g03) this.c;
        if (g03Var != null) {
            g03Var.a0();
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long b(long j) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).e[(int) j] - this.b;
            default:
                return ((m13) this.c).X[(int) j] - this.b;
        }
    }

    public void b0(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            R();
            ((g03) this.c).b0(i - 64);
        }
    }

    @Override // defpackage.agf
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((ard) this.c).Y.execute(new flc(this, 19, videoFrameProcessingException));
    }

    public void c0(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                int i2 = oaf.a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long jMin = Long.MAX_VALUE;
                for (int i3 = 0; i3 < sparseLongArray.size(); i3++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i3));
                }
                this.b = jMin;
            }
        }
    }

    @Override // defpackage.m78
    /* renamed from: d */
    public c3b mo1d() {
        return c3b.d;
    }

    @Override // defpackage.ma5, defpackage.na5
    public long e() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).e() - this.b;
            default:
                return ((na5) this.c).e() - this.b;
        }
    }

    @Override // defpackage.m78
    public void f(c3b c3bVar) {
    }

    @Override // defpackage.abe
    public int g(long j) {
        return this.b > j ? 0 : -1;
    }

    @Override // defpackage.ma5, defpackage.na5
    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).h(bArr, i, i2, z);
            default:
                return ((na5) this.c).h(bArr, i, i2, z);
        }
    }

    @Override // defpackage.abe
    public long i(int i) {
        np8.d(i == 0);
        return this.b;
    }

    @Override // defpackage.z14, defpackage.a24
    public long j(long j, long j2) {
        switch (this.a) {
            case 2:
                return ((l13) this.c).d[(int) j];
            default:
                return ((m13) this.c).o[(int) j];
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long k(long j, long j2) {
        switch (this.a) {
        }
        return 0L;
    }

    @Override // defpackage.ma5, defpackage.na5
    public void l(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).l(i, bArr, i2);
                break;
            default:
                ((na5) this.c).l(i, bArr, i2);
                break;
        }
    }

    @Override // defpackage.z14, defpackage.a24
    public long m(long j, long j2) {
        switch (this.a) {
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.z14
    public q4c n(long j) {
        return new q4c(((l13) this.c).c[(int) j], null, r7.b[r8]);
    }

    @Override // defpackage.agf
    public void o(int i, int i2) {
        ((ard) this.c).Y.execute(new ft0(this, i, i2, 4));
    }

    @Override // defpackage.abe
    public List p(long j) {
        if (j >= this.b) {
            return (zw6) this.c;
        }
        ls5 ls5Var = zw6.b;
        return ffc.X;
    }

    @Override // defpackage.ma5, defpackage.na5
    public boolean q(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).q(bArr, i, i2, z);
            default:
                return ((na5) this.c).q(bArr, i, i2, z);
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public long r() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).r() - this.b;
            default:
                return ((na5) this.c).r() - this.b;
        }
    }

    @Override // defpackage.l24
    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).read(bArr, i, i2);
            default:
                return ((na5) this.c).read(bArr, i, i2);
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).readFully(bArr, i, i2);
                break;
            default:
                ((na5) this.c).readFully(bArr, i, i2);
                break;
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public void s(int i) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).s(i);
                break;
            default:
                ((na5) this.c).s(i);
                break;
        }
    }

    @Override // defpackage.m78
    public long t() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((g03) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((g03) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.abe
    public int u() {
        return 1;
    }

    @Override // defpackage.z14, defpackage.a24
    public long v(long j, long j2) {
        switch (this.a) {
            case 2:
                return maf.f(((l13) this.c).e, j + this.b, true);
            default:
                return oaf.f(((m13) this.c).X, j + this.b, true);
        }
    }

    @Override // defpackage.oa5, defpackage.pa5
    public void w() {
        switch (this.a) {
            case 13:
                ((oa5) this.c).w();
                break;
            default:
                ((pa5) this.c).w();
                break;
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public long x() {
        switch (this.a) {
            case 11:
                return ((ma5) this.c).x() - this.b;
            default:
                return ((na5) this.c).x() - this.b;
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public void y() {
        switch (this.a) {
            case 11:
                ((ma5) this.c).y();
                break;
            default:
                ((na5) this.c).y();
                break;
        }
    }

    @Override // defpackage.ma5, defpackage.na5
    public void z(int i) {
        switch (this.a) {
            case 11:
                ((ma5) this.c).z(i);
                break;
            default:
                ((na5) this.c).z(i);
                break;
        }
    }

    public /* synthetic */ g03(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.pa5
    /* renamed from: B, reason: collision with other method in class */
    public yze mo6B(int i, int i2) {
        return ((pa5) this.c).mo6B(i, i2);
    }

    @Override // defpackage.a24
    /* renamed from: n, reason: collision with other method in class */
    public r4c mo7n(long j) {
        return new r4c(((m13) this.c).c[(int) j], null, r7.b[r8]);
    }

    public /* synthetic */ g03(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public g03(gyc gycVar, bqc bqcVar) {
        this.a = 9;
        this.c = new AtomicInteger(0);
        int iIntValue = ((Number) gycVar.invoke()).intValue() + 1;
        ((hyc) bqcVar.b).k(iIntValue, "request_id");
        this.b = iIntValue << 32;
    }

    public g03(wf wfVar) {
        this.a = 4;
        this.c = wfVar;
        this.b = -1L;
    }

    public g03(fu0 fu0Var) {
        this.a = 7;
        this.c = fu0Var;
        this.b = 262144;
    }

    public g03(ra4 ra4Var, long j) {
        this.a = 11;
        this.c = ra4Var;
        np8.d(ra4Var.o >= j);
        this.b = j;
    }

    public g03(sa4 sa4Var, long j) {
        this.a = 12;
        this.c = sa4Var;
        fm9.f(sa4Var.o >= j);
        this.b = j;
    }

    public g03(int i) {
        this.a = i;
        switch (i) {
            case 6:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.c = new SparseLongArray();
                break;
            default:
                this.b = 0L;
                break;
        }
    }
}
