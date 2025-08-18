package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sm6 extends ej0 implements in6 {
    public final am6 h;
    public final w4d i;
    public final oq9 j;
    public final tr4 k;
    public final huc l;
    public final boolean m;
    public final int n;
    public final hb4 p;
    public final long q;
    public hb8 s;
    public z0f t;
    public tb8 u;
    public final boolean o = false;
    public final long r = 0;

    static {
        nc8.a("media3.exoplayer.hls");
    }

    public sm6(tb8 tb8Var, w4d w4dVar, am6 am6Var, oq9 oq9Var, tr4 tr4Var, huc hucVar, hb4 hb4Var, long j, boolean z, int i) {
        this.u = tb8Var;
        this.s = tb8Var.c;
        this.i = w4dVar;
        this.h = am6Var;
        this.j = oq9Var;
        this.k = tr4Var;
        this.l = hucVar;
        this.p = hb4Var;
        this.q = j;
        this.m = z;
        this.n = i;
    }

    public static hm6 u(long j, List list) {
        hm6 hm6Var = null;
        for (int i = 0; i < list.size(); i++) {
            hm6 hm6Var2 = (hm6) list.get(i);
            long j2 = hm6Var2.X;
            if (j2 > j || !hm6Var2.w0) {
                if (j2 > j) {
                    break;
                }
            } else {
                hm6Var = hm6Var2;
            }
        }
        return hm6Var;
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
        jn jnVarB = b(yj8Var);
        lr4 lr4Var = new lr4(this.d.c, 0, yj8Var);
        z0f z0fVar = this.t;
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        return new fm6(this.h, this.p, this.i, z0fVar, this.k, lr4Var, this.l, jnVarB, n64Var, this.j, this.m, this.n, this.o, j4bVar, this.r);
    }

    @Override // defpackage.ej0
    public final synchronized tb8 i() {
        return this.u;
    }

    @Override // defpackage.ej0
    public final void k() throws IOException {
        hb4 hb4Var = this.p;
        vq7 vq7Var = (vq7) hb4Var.w0;
        if (vq7Var != null) {
            vq7Var.c();
        }
        Uri uri = hb4Var.X;
        if (uri != null) {
            gb4 gb4Var = (gb4) hb4Var.b.get(uri);
            gb4Var.b.c();
            IOException iOException = gb4Var.u0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.t = z0fVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        tr4 tr4Var = this.k;
        tr4Var.c(looperMyLooper, j4bVar);
        tr4Var.prepare();
        jn jnVarB = b(null);
        ib8 ib8Var = i().b;
        ib8Var.getClass();
        hb4 hb4Var = this.p;
        hb4Var.getClass();
        hb4Var.o = oaf.o(null);
        hb4Var.v0 = jnVarB;
        hb4Var.x0 = this;
        bqa bqaVar = new bqa(((q24) ((w4d) hb4Var.s0).b).a(), ib8Var.a, 4, ((en6) hb4Var.t0).f());
        fm9.k(((vq7) hb4Var.w0) == null);
        vq7 vq7Var = new vq7("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        hb4Var.w0 = vq7Var;
        huc hucVar = (huc) hb4Var.u0;
        int i = bqaVar.c;
        jnVarB.F(new yn7(bqaVar.a, bqaVar.b, vq7Var.v(bqaVar, hb4Var, hucVar.p(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        fm6 fm6Var = (fm6) zd8Var;
        fm6Var.b.c.remove(fm6Var);
        for (tn6 tn6Var : fm6Var.G0) {
            if (tn6Var.O0) {
                for (rn6 rn6Var : tn6Var.G0) {
                    rn6Var.h();
                    fr4 fr4Var = rn6Var.h;
                    if (fr4Var != null) {
                        fr4Var.f(rn6Var.e);
                        rn6Var.h = null;
                        rn6Var.g = null;
                    }
                }
            }
            xl6 xl6Var = tn6Var.o;
            gb4 gb4Var = (gb4) xl6Var.g.b.get(xl6Var.e[xl6Var.r.i()]);
            if (gb4Var != null) {
                gb4Var.v0 = false;
            }
            xl6Var.o = null;
            tn6Var.u0.s(tn6Var);
            tn6Var.C0.removeCallbacksAndMessages(null);
            tn6Var.S0 = true;
            tn6Var.D0.clear();
        }
        fm6Var.D0 = null;
    }

    @Override // defpackage.ej0
    public final void q() {
        hb4 hb4Var = this.p;
        hb4Var.X = null;
        hb4Var.z0 = null;
        hb4Var.y0 = null;
        hb4Var.Z = -9223372036854775807L;
        ((vq7) hb4Var.w0).s(null);
        hb4Var.w0 = null;
        HashMap map = hb4Var.b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((gb4) it.next()).b.s(null);
        }
        hb4Var.o.removeCallbacksAndMessages(null);
        hb4Var.o = null;
        map.clear();
        this.k.release();
    }

    @Override // defpackage.ej0
    public final synchronized void t(tb8 tb8Var) {
        this.u = tb8Var;
    }

    public final void v(qm6 qm6Var) {
        ird irdVar;
        long j;
        long jS;
        long j2;
        int i;
        boolean z = qm6Var.p;
        long j3 = qm6Var.h;
        long jH0 = z ? oaf.h0(j3) : -9223372036854775807L;
        int i2 = qm6Var.d;
        long j4 = (i2 == 2 || i2 == 1) ? jH0 : -9223372036854775807L;
        hb4 hb4Var = this.p;
        ((ym6) hb4Var.y0).getClass();
        qq9 qq9Var = new qq9();
        boolean z2 = hb4Var.Y;
        long j5 = qm6Var.u;
        zw6 zw6Var = qm6Var.r;
        boolean z3 = qm6Var.g;
        long jS2 = qm6Var.e;
        if (z2) {
            long j6 = jH0;
            long j7 = j3 - hb4Var.Z;
            boolean z4 = qm6Var.o;
            long j8 = z4 ? j7 + j5 : -9223372036854775807L;
            long jS3 = qm6Var.p ? oaf.S(oaf.B(this.q)) - (j3 + j5) : 0L;
            long j9 = this.s.a;
            om6 om6Var = qm6Var.v;
            if (j9 != -9223372036854775807L) {
                jS = oaf.S(j9);
            } else {
                if (jS2 != -9223372036854775807L) {
                    j = j5 - jS2;
                } else {
                    long j10 = om6Var.d;
                    if (j10 == -9223372036854775807L || qm6Var.n == -9223372036854775807L) {
                        j = om6Var.c;
                        if (j == -9223372036854775807L) {
                            j = qm6Var.m * 3;
                        }
                    } else {
                        j = j10;
                    }
                }
                jS = j + jS3;
            }
            long j11 = j5 + jS3;
            long jK = oaf.k(jS, jS3, j11);
            hb8 hb8Var = i().c;
            boolean z5 = false;
            boolean z6 = hb8Var.d == -3.4028235E38f && hb8Var.e == -3.4028235E38f && om6Var.c == -9223372036854775807L && om6Var.d == -9223372036854775807L;
            fb8 fb8Var = new fb8();
            fb8Var.a = oaf.h0(jK);
            fb8Var.d = z6 ? 1.0f : this.s.d;
            fb8Var.e = z6 ? 1.0f : this.s.e;
            hb8 hb8Var2 = new hb8(fb8Var);
            this.s = hb8Var2;
            if (jS2 == -9223372036854775807L) {
                jS2 = j11 - oaf.S(hb8Var2.a);
            }
            if (z3) {
                j2 = jS2;
            } else {
                hm6 hm6VarU = u(jS2, qm6Var.s);
                if (hm6VarU != null) {
                    j2 = hm6VarU.X;
                } else if (zw6Var.isEmpty()) {
                    i = i2;
                    j2 = 0;
                    if (i == 2 && qm6Var.f) {
                        z5 = true;
                    }
                    irdVar = new ird(j4, j6, j8, qm6Var.u, j7, j2, true, !z4, z5, qq9Var, i(), this.s);
                } else {
                    lm6 lm6Var = (lm6) zw6Var.get(oaf.d(Long.valueOf(jS2), zw6Var, true));
                    hm6 hm6VarU2 = u(jS2, lm6Var.x0);
                    j2 = hm6VarU2 != null ? hm6VarU2.X : lm6Var.X;
                }
            }
            i = i2;
            if (i == 2) {
                z5 = true;
            }
            irdVar = new ird(j4, j6, j8, qm6Var.u, j7, j2, true, !z4, z5, qq9Var, i(), this.s);
        } else {
            long j12 = jH0;
            long j13 = (jS2 == -9223372036854775807L || zw6Var.isEmpty()) ? 0L : (z3 || jS2 == j5) ? jS2 : ((lm6) zw6Var.get(oaf.d(Long.valueOf(jS2), zw6Var, true))).X;
            tb8 tb8VarI = i();
            long j14 = qm6Var.u;
            irdVar = new ird(j4, j12, j14, j14, 0L, j13, true, false, true, qq9Var, tb8VarI, null);
        }
        n(irdVar);
    }
}
