package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class y14 extends ej0 {
    public vq7 A;
    public z0f B;
    public DashManifestStaleException C;
    public Handler D;
    public hb8 E;
    public Uri F;
    public final Uri G;
    public i14 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public tb8 P;
    public final boolean h;
    public final q24 i;
    public final jn j;
    public final oq9 k;
    public final tr4 l;
    public final huc m;
    public final die n;
    public final long o;
    public final long p;
    public final jn q;
    public final zpa r;
    public final wd6 s;
    public final Object t;
    public final SparseArray u;
    public final s14 v;
    public final s14 w;
    public final ey1 x;
    public final lo7 y;
    public t24 z;

    static {
        nc8.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [s14] */
    /* JADX WARN: Type inference failed for: r2v12, types: [s14] */
    public y14(tb8 tb8Var, q24 q24Var, zpa zpaVar, jn jnVar, oq9 oq9Var, tr4 tr4Var, huc hucVar, long j, long j2) {
        this.P = tb8Var;
        this.E = tb8Var.c;
        ib8 ib8Var = tb8Var.b;
        ib8Var.getClass();
        Uri uri = ib8Var.a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.i = q24Var;
        this.r = zpaVar;
        this.j = jnVar;
        this.l = tr4Var;
        this.m = hucVar;
        this.o = j;
        this.p = j2;
        this.k = oq9Var;
        this.n = new die(3);
        this.h = false;
        this.q = b(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new ey1(11, this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new wd6(11, this);
        this.y = new fd7(this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: s14
            public final /* synthetic */ y14 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.z();
                        break;
                    default:
                        this.b.y(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: s14
            public final /* synthetic */ y14 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.z();
                        break;
                    default:
                        this.b.y(false);
                        break;
                }
            }
        };
    }

    public static boolean u(kta ktaVar) {
        int i = 0;
        while (true) {
            List list = ktaVar.c;
            if (i >= list.size()) {
                return false;
            }
            int i2 = ((u8) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // defpackage.ej0
    public final boolean a(tb8 tb8Var) {
        tb8 tb8VarI = i();
        ib8 ib8Var = tb8VarI.b;
        ib8Var.getClass();
        ib8 ib8Var2 = tb8Var.b;
        return ib8Var2 != null && ib8Var2.a.equals(ib8Var.a) && ib8Var2.e.equals(ib8Var.e) && oaf.a(ib8Var2.c, ib8Var.c) && tb8VarI.c.equals(tb8Var.c);
    }

    @Override // defpackage.ej0
    public final zd8 c(yj8 yj8Var, n64 n64Var, long j) {
        int iIntValue = ((Integer) yj8Var.a).intValue() - this.O;
        jn jnVarB = b(yj8Var);
        lr4 lr4Var = new lr4(this.d.c, 0, yj8Var);
        int i = this.O + iIntValue;
        i14 i14Var = this.H;
        z0f z0fVar = this.B;
        long j2 = this.L;
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        q14 q14Var = new q14(i, i14Var, this.n, iIntValue, this.j, z0fVar, this.l, lr4Var, this.m, jnVarB, j2, this.y, n64Var, this.k, this.x, j4bVar);
        this.u.put(i, q14Var);
        return q14Var;
    }

    @Override // defpackage.ej0
    public final synchronized tb8 i() {
        return this.P;
    }

    @Override // defpackage.ej0
    public final void k() {
        this.y.c();
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.B = z0fVar;
        Looper looperMyLooper = Looper.myLooper();
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        tr4 tr4Var = this.l;
        tr4Var.c(looperMyLooper, j4bVar);
        tr4Var.prepare();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.a();
        this.A = new vq7("DashMediaSource");
        this.D = oaf.o(null);
        z();
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        q14 q14Var = (q14) zd8Var;
        e4b e4bVar = q14Var.x0;
        e4bVar.Y = true;
        e4bVar.b.removeCallbacksAndMessages(null);
        for (t13 t13Var : q14Var.C0) {
            t13Var.B(q14Var);
        }
        q14Var.B0 = null;
        this.u.remove(q14Var.a);
    }

    @Override // defpackage.ej0
    public final void q() {
        this.I = false;
        this.z = null;
        vq7 vq7Var = this.A;
        if (vq7Var != null) {
            vq7Var.s(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
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
        this.u.clear();
        die dieVar = this.n;
        ((HashMap) dieVar.a).clear();
        ((HashMap) dieVar.b).clear();
        ((HashMap) dieVar.c).clear();
        this.l.release();
    }

    @Override // defpackage.ej0
    public final synchronized void t(tb8 tb8Var) {
        this.P = tb8Var;
    }

    public final void v() {
        boolean z;
        vq7 vq7Var = this.A;
        bkg bkgVar = new bkg(10, this);
        synchronized (tu0.i) {
            z = tu0.j;
        }
        if (z) {
            bkgVar.p();
            return;
        }
        if (vq7Var == null) {
            vq7Var = new vq7("SntpClient");
        }
        vq7Var.v(new buc(), new qqd(24, bkgVar), 1);
    }

    public final void w(bqa bqaVar, long j, long j2) {
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        this.m.getClass();
        this.q.x(yn7Var, bqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        z04.v("Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v21, types: [n85] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r41) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y14.y(boolean):void");
    }

    public final void z() {
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
        bqa bqaVar = new bqa(this.z, uri, 4, this.r);
        wd6 wd6Var = this.s;
        this.m.getClass();
        this.q.F(new yn7(bqaVar.a, bqaVar.b, this.A.v(bqaVar, wd6Var, 3)), bqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
