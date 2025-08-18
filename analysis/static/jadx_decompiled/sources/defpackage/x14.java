package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class x14 extends dj0 {
    public jo7 A;
    public y0f B;
    public DashManifestStaleException C;
    public Handler D;
    public gb8 E;
    public Uri F;
    public final Uri G;
    public h14 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final rb8 h;
    public final boolean i;
    public final p24 j;
    public final ey1 k;
    public final mq9 l;
    public final sr4 m;
    public final buc n;
    public final c8d o;
    public final long p;
    public final gk8 q;
    public final ypa r;
    public final sy4 s;
    public final Object t;
    public final SparseArray u;
    public final r14 v;
    public final r14 w;
    public final wmc x;
    public final ko7 y;
    public r24 z;

    static {
        h85.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [r14] */
    /* JADX WARN: Type inference failed for: r2v14, types: [r14] */
    public x14(rb8 rb8Var, p24 p24Var, ypa ypaVar, ey1 ey1Var, mq9 mq9Var, sr4 sr4Var, buc bucVar, long j) {
        this.h = rb8Var;
        this.E = rb8Var.c;
        kb8 kb8Var = rb8Var.b;
        kb8Var.getClass();
        Uri uri = kb8Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.j = p24Var;
        this.r = ypaVar;
        this.k = ey1Var;
        this.m = sr4Var;
        this.n = bucVar;
        this.p = j;
        this.l = mq9Var;
        this.o = new c8d(3);
        this.i = false;
        this.q = new gk8((CopyOnWriteArrayList) this.c.d, 0, null, 0L);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new wmc(this, false);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new sy4(11, this);
        this.y = new re6(11, this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: r14
            public final /* synthetic */ x14 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        this.b.s(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: r14
            public final /* synthetic */ x14 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.t();
                        break;
                    default:
                        this.b.s(false);
                        break;
                }
            }
        };
    }

    public static boolean p(jta jtaVar) {
        int i = 0;
        while (true) {
            List list = jtaVar.c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((t8) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // defpackage.dj0
    public final yd8 a(xj8 xj8Var, n64 n64Var, long j) {
        int iIntValue = ((Integer) xj8Var.a).intValue() - this.O;
        gk8 gk8Var = new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8Var, this.H.b(iIntValue).b);
        kr4 kr4Var = new kr4(this.d.c, 0, xj8Var);
        int i = this.O + iIntValue;
        h14 h14Var = this.H;
        y0f y0fVar = this.B;
        long j2 = this.L;
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        p14 p14Var = new p14(i, h14Var, this.o, iIntValue, this.k, y0fVar, this.m, kr4Var, this.n, gk8Var, j2, this.y, n64Var, this.l, this.x, i4bVar);
        this.u.put(i, p14Var);
        return p14Var;
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        return this.h;
    }

    @Override // defpackage.dj0
    public final void g() {
        this.y.c();
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.B = y0fVar;
        sr4 sr4Var = this.m;
        sr4Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        sr4Var.c(looperMyLooper, i4bVar);
        if (this.i) {
            s(false);
            return;
        }
        this.z = this.j.a();
        this.A = new jo7("DashMediaSource", 0);
        this.D = maf.m(null);
        t();
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        p14 p14Var = (p14) yd8Var;
        e4b e4bVar = p14Var.x0;
        e4bVar.Y = true;
        e4bVar.b.removeCallbacksAndMessages(null);
        for (s13 s13Var : p14Var.C0) {
            s13Var.v(p14Var);
        }
        p14Var.B0 = null;
        this.u.remove(p14Var.a);
    }

    @Override // defpackage.dj0
    public final void m() {
        this.I = false;
        this.z = null;
        jo7 jo7Var = this.A;
        if (jo7Var != null) {
            jo7Var.p(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        c8d c8dVar = this.o;
        ((HashMap) c8dVar.a).clear();
        ((HashMap) c8dVar.b).clear();
        ((HashMap) c8dVar.c).clear();
        this.m.release();
    }

    public final void q() {
        boolean z;
        jo7 jo7Var = this.A;
        y8 y8Var = new y8(this);
        synchronized (nu0.A0) {
            z = nu0.B0;
        }
        if (z) {
            y8Var.y();
            return;
        }
        if (jo7Var == null) {
            jo7Var = new jo7("SntpClient", 0);
        }
        jo7Var.w(new hx9(), new w4d(25, y8Var), 1);
    }

    public final void r(aqa aqaVar, long j, long j2) {
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.n.getClass();
        this.q.d(xn7Var, aqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b6, code lost:
    
        r2 = r42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6 A[PHI: r17
      0x01a6: PHI (r17v9 boolean) = (r17v7 boolean), (r17v10 boolean) binds: [B:71:0x01a4, B:67:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [int] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r2v29, types: [m85] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r43) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x14.s(boolean):void");
    }

    public final void t() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.n()) {
            return;
        }
        if (this.A.o()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        aqa aqaVar = new aqa(this.z, uri, 4, this.r);
        sy4 sy4Var = this.s;
        this.n.getClass();
        this.q.k(new xn7(aqaVar.a, aqaVar.b, this.A.w(aqaVar, sy4Var, 3)), aqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
