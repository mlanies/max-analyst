package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class rm6 extends dj0 implements hn6 {
    public final zl6 h;
    public final kb8 i;
    public final gaa j;
    public final mq9 k;
    public final sr4 l;
    public final buc m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final hb4 q;
    public final long r;
    public final rb8 s;
    public gb8 t;
    public y0f u;

    static {
        h85.a("goog.exo.hls");
    }

    public rm6(rb8 rb8Var, gaa gaaVar, oq9 oq9Var, mq9 mq9Var, sr4 sr4Var, buc bucVar, hb4 hb4Var, long j, boolean z, int i) {
        kb8 kb8Var = rb8Var.b;
        kb8Var.getClass();
        this.i = kb8Var;
        this.s = rb8Var;
        this.t = rb8Var.c;
        this.j = gaaVar;
        this.h = oq9Var;
        this.k = mq9Var;
        this.l = sr4Var;
        this.m = bucVar;
        this.q = hb4Var;
        this.r = j;
        this.n = z;
        this.o = i;
        this.p = false;
    }

    public static gm6 p(long j, List list) {
        gm6 gm6Var = null;
        for (int i = 0; i < list.size(); i++) {
            gm6 gm6Var2 = (gm6) list.get(i);
            long j2 = gm6Var2.X;
            if (j2 > j || !gm6Var2.w0) {
                if (j2 > j) {
                    break;
                }
            } else {
                gm6Var = gm6Var2;
            }
        }
        return gm6Var;
    }

    @Override // defpackage.dj0
    public final yd8 a(xj8 xj8Var, n64 n64Var, long j) {
        gk8 gk8Var = new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8Var, 0L);
        kr4 kr4Var = new kr4(this.d.c, 0, xj8Var);
        y0f y0fVar = this.u;
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        return new em6(this.h, this.q, this.j, y0fVar, this.l, kr4Var, this.m, gk8Var, n64Var, this.k, this.n, this.o, this.p, i4bVar);
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        return this.s;
    }

    @Override // defpackage.dj0
    public final void g() throws IOException {
        hb4 hb4Var = this.q;
        jo7 jo7Var = (jo7) hb4Var.w0;
        if (jo7Var != null) {
            jo7Var.c();
        }
        Uri uri = hb4Var.X;
        if (uri != null) {
            fb4 fb4Var = (fb4) hb4Var.b.get(uri);
            fb4Var.b.c();
            IOException iOException = fb4Var.u0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.u = y0fVar;
        sr4 sr4Var = this.l;
        sr4Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        sr4Var.c(looperMyLooper, i4bVar);
        gk8 gk8Var = new gk8((CopyOnWriteArrayList) this.c.d, 0, null, 0L);
        Uri uri = this.i.a;
        hb4 hb4Var = this.q;
        hb4Var.getClass();
        hb4Var.o = maf.m(null);
        hb4Var.v0 = gk8Var;
        hb4Var.x0 = this;
        aqa aqaVar = new aqa(((p24) ((gaa) hb4Var.s0).a).a(), uri, 4, ((dn6) hb4Var.t0).f());
        np8.f(((jo7) hb4Var.w0) == null);
        jo7 jo7Var = new jo7("DefaultHlsPlaylistTracker:MultivariantPlaylist", 0);
        hb4Var.w0 = jo7Var;
        buc bucVar = (buc) hb4Var.u0;
        int i = aqaVar.c;
        gk8Var.k(new xn7(aqaVar.a, aqaVar.b, jo7Var.w(aqaVar, hb4Var, bucVar.v(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        em6 em6Var = (em6) yd8Var;
        em6Var.b.c.remove(em6Var);
        for (sn6 sn6Var : em6Var.E0) {
            if (sn6Var.O0) {
                for (qn6 qn6Var : sn6Var.G0) {
                    qn6Var.i();
                    er4 er4Var = qn6Var.h;
                    if (er4Var != null) {
                        er4Var.f(qn6Var.e);
                        qn6Var.h = null;
                        qn6Var.g = null;
                    }
                }
            }
            sn6Var.u0.p(sn6Var);
            sn6Var.C0.removeCallbacksAndMessages(null);
            sn6Var.S0 = true;
            sn6Var.D0.clear();
        }
        em6Var.B0 = null;
    }

    @Override // defpackage.dj0
    public final void m() {
        hb4 hb4Var = this.q;
        hb4Var.X = null;
        hb4Var.z0 = null;
        hb4Var.y0 = null;
        hb4Var.Z = -9223372036854775807L;
        ((jo7) hb4Var.w0).p(null);
        hb4Var.w0 = null;
        HashMap map = hb4Var.b;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((fb4) it.next()).b.p(null);
        }
        hb4Var.o.removeCallbacksAndMessages(null);
        hb4Var.o = null;
        map.clear();
        this.l.release();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.pm6 r42) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm6.q(pm6):void");
    }
}
