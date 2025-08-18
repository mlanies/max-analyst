package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gh9 implements n3b {
    public final /* synthetic */ uh9 a;

    public gh9(uh9 uh9Var) {
        this.a = uh9Var;
    }

    @Override // defpackage.n3b
    public final void G(int i, tb8 tb8Var) {
        tb8 tb8VarR0;
        long jL = this.a.l();
        ub8 ub8VarM = this.a.m();
        uh9 uh9Var = this.a;
        uh9Var.B = tb8Var;
        a98 a98Var = uh9Var.m;
        uh9Var.x = a98Var != null ? a98Var.b() : false;
        uh9 uh9Var2 = this.a;
        a98 a98Var2 = uh9Var2.m;
        uh9Var2.D = (a98Var2 == null || (tb8VarR0 = a98Var2.R0()) == null) ? null : tb8VarR0.d;
        uh9 uh9Var3 = this.a;
        a98 a98Var3 = uh9Var3.m;
        uh9Var3.C = uh9.d(uh9Var3, a98Var3 != null ? a98Var3.h() : -1);
        uh9 uh9Var4 = this.a;
        a98 a98Var4 = uh9Var4.m;
        uh9.d(uh9Var4, a98Var4 != null ? a98Var4.i() : -1);
        a98 a98Var5 = this.a.m;
        if (a98Var5 != null) {
            a98Var5.n1();
        }
        uh9 uh9Var5 = this.a;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var5.o) {
            Iterator it = uh9Var5.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).c(jL, ub8VarM, uh9Var5.l(), uh9Var5.m());
            }
        }
    }

    @Override // defpackage.n3b
    public final void Y(q3b q3bVar, l3b l3bVar) {
        float fE = q3bVar.e();
        uh9 uh9Var = this.a;
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            a98Var.g(fE);
        }
        uh9Var.E = q3bVar.c();
        q3bVar.n();
        tm5 tm5Var = l3bVar.a;
        if (tm5Var.a.get(9)) {
            q3bVar.E0();
        }
        if (tm5Var.a.get(8)) {
            q3bVar.getRepeatMode();
        }
    }

    @Override // defpackage.n3b
    public final void b0(gd8 gd8Var) {
        uh9 uh9Var = this.a;
        uh9Var.D = gd8Var;
        int i = uh9.K;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var.o) {
            Iterator it = uh9Var.o.iterator();
            while (it.hasNext()) {
            }
        }
    }

    @Override // defpackage.n3b
    public final void h(int i) {
        tb8 tb8VarR0;
        int i2 = uh9.K;
        hm9.n("uh9", "onPlaybackStateChanged " + i);
        uh9 uh9Var = this.a;
        uh9Var.v = i;
        a98 a98Var = uh9Var.m;
        uh9Var.y = a98Var != null && a98Var.getPlaybackState() == 2;
        uh9 uh9Var2 = this.a;
        a98 a98Var2 = uh9Var2.m;
        uh9Var2.x = a98Var2 != null ? a98Var2.b() : false;
        uh9 uh9Var3 = this.a;
        a98 a98Var3 = uh9Var3.m;
        uh9Var3.A = a98Var3 != null && a98Var3.getPlaybackState() == 4;
        uh9 uh9Var4 = this.a;
        a98 a98Var4 = uh9Var4.m;
        uh9Var4.B = a98Var4 != null ? a98Var4.R0() : null;
        uh9 uh9Var5 = this.a;
        a98 a98Var5 = uh9Var5.m;
        uh9Var5.D = (a98Var5 == null || (tb8VarR0 = a98Var5.R0()) == null) ? null : tb8VarR0.d;
        if (i == 1) {
            this.a.G.m(null, Float.valueOf(0.0f));
            uh9 uh9Var6 = this.a;
            uh9Var6.w = false;
            uh9Var6.f();
            uh9 uh9Var7 = this.a;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var7.o) {
                Iterator it = uh9Var7.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).e(uh9Var7.l(), uh9Var7.m(), uh9Var7.o());
                }
            }
            return;
        }
        if (i == 2) {
            uh9 uh9Var8 = this.a;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var8.o) {
                Iterator it2 = uh9Var8.o.iterator();
                while (it2.hasNext()) {
                    ((fh9) it2.next()).d(uh9Var8.l(), uh9Var8.m());
                }
            }
            return;
        }
        if (i != 4) {
            return;
        }
        this.a.f();
        uh9 uh9Var9 = this.a;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var9.o) {
            Iterator it3 = uh9Var9.o.iterator();
            while (it3.hasNext()) {
                fh9 fh9Var = (fh9) it3.next();
                uh9Var9.G.m(null, Float.valueOf(1.0f));
                fh9Var.f(uh9Var9.l(), uh9Var9.m());
            }
        }
    }

    @Override // defpackage.n3b
    public final void n(boolean z) {
        a98 a98Var;
        int i = uh9.K;
        hm9.n("uh9", "onIsPlayingChanged " + z);
        uh9 uh9Var = this.a;
        uh9Var.w = (z || (a98Var = uh9Var.m) == null || a98Var.getPlaybackState() != 3) ? false : true;
        a98 a98Var2 = this.a.m;
        if (a98Var2 != null) {
            a98Var2.n1();
        }
        uh9 uh9Var2 = this.a;
        uh9Var2.x = z;
        if (z) {
            uh9Var2.u();
            uh9 uh9Var3 = this.a;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var3.o) {
                Iterator it = uh9Var3.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).h(uh9Var3.l(), uh9Var3.m());
                }
            }
            return;
        }
        if (uh9Var2.w) {
            uh9Var2.f();
            uh9 uh9Var4 = this.a;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var4.o) {
                Iterator it2 = uh9Var4.o.iterator();
                while (it2.hasNext()) {
                    ((fh9) it2.next()).i(uh9Var4.l(), uh9Var4.m());
                }
            }
        }
    }

    @Override // defpackage.n3b
    public final void onRepeatModeChanged(int i) {
        uh9 uh9Var = this.a;
        int i2 = uh9.K;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var.o) {
            Iterator it = uh9Var.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).getClass();
            }
        }
    }

    @Override // defpackage.n3b
    public final void p0(c3b c3bVar) {
        float f = c3bVar.a;
        uh9 uh9Var = this.a;
        if (!(f == uh9Var.F)) {
            uh9Var.F = f;
            int i = uh9.K;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var.o) {
                Iterator it = uh9Var.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).j();
                }
            }
        }
    }

    @Override // defpackage.n3b
    public final void q(p3b p3bVar, p3b p3bVar2, int i) {
        gd8 gd8Var;
        Integer num;
        String str;
        Long lF0;
        if (i != 1 || p3bVar.b == p3bVar2.b) {
            return;
        }
        tb8 tb8Var = p3bVar.c;
        long jLongValue = (tb8Var == null || (str = tb8Var.a) == null || (lF0 = dae.f0(str)) == null) ? -1L : lF0.longValue();
        kj6 kj6Var = ub8.a;
        tb8 tb8Var2 = p3bVar.c;
        int iIntValue = (tb8Var2 == null || (gd8Var = tb8Var2.d) == null || (num = gd8Var.H) == null) ? -1 : num.intValue();
        kj6Var.getClass();
        ub8 ub8VarM = kj6.m(iIntValue);
        a98 a98Var = this.a.m;
        if (a98Var != null && p3bVar.b == a98Var.i()) {
            uh9 uh9Var = this.a;
            int i2 = uh9.K;
            hm9.n("uh9", "notifyListeners");
            synchronized (uh9Var.o) {
                Iterator it = uh9Var.o.iterator();
                while (it.hasNext()) {
                    ((fh9) it.next()).k(jLongValue, ub8VarM);
                }
            }
            return;
        }
        a98 a98Var2 = this.a.m;
        if (a98Var2 == null || p3bVar.b != a98Var2.h()) {
            return;
        }
        uh9 uh9Var2 = this.a;
        int i3 = uh9.K;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var2.o) {
            Iterator it2 = uh9Var2.o.iterator();
            while (it2.hasNext()) {
                ((fh9) it2.next()).g(jLongValue, ub8VarM);
            }
        }
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        uh9 uh9Var = this.a;
        int i = uh9.K;
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var.o) {
            Iterator it = uh9Var.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).b(uh9Var.l(), uh9Var.m());
            }
        }
    }
}
