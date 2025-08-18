package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final class bk9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public final p4d X;
    public final hle Y;
    public final FrgLocalVideo Z;
    public final we8 c;
    public final Context o;
    public final dlf s0;
    public hkf t0;
    public iq1 u0;
    public sd7 v0;
    public sd7 w0;
    public final y38 x0;

    /* JADX WARN: Multi-variable type inference failed */
    public bk9(pl9 pl9Var, we8 we8Var, Context context, p4d p4dVar, hle hleVar, FrgLocalVideo frgLocalVideo, dlf dlfVar, y38 y38Var) {
        super(0, pl9Var);
        this.c = we8Var;
        this.o = context;
        this.X = p4dVar;
        this.Y = hleVar;
        this.Z = frgLocalVideo;
        this.s0 = dlfVar;
        this.x0 = y38Var;
        hkf hkfVar = new hkf();
        hkfVar.a = true;
        this.t0 = new hkf(hkfVar);
        ((v2) pl9Var).r(this);
        ((bq7) we8Var).e = this;
    }

    @Override // defpackage.ve8
    public final void D1(Throwable th) {
        hm9.k("bk9", "onPlaybackError");
        hkf hkfVarA = this.t0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null) {
            return;
        }
        frgLocalVideo.Y(th);
    }

    @Override // defpackage.slf
    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
    }

    @Override // defpackage.ol9
    public final void H1() {
        b56 b56VarR1;
        ((bq7) this.c).n();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null || (b56VarR1 = frgLocalVideo.r1()) == null) {
            return;
        }
        b56VarR1.c(true, true, false);
    }

    @Override // defpackage.ve8
    public final void K() {
        hm9.k("bk9", "onTrackChanged");
    }

    @Override // defpackage.slf
    public final int M0() {
        return ((bq7) this.c).h();
    }

    @Override // defpackage.ve8
    public final void P(int i, int i2, int i3) {
        ((pl9) ((kk9) this.b)).a(i, i2);
    }

    @Override // defpackage.slf
    public final int R() {
        return ((bq7) this.c).j();
    }

    @Override // defpackage.ol9
    public final void S0() {
        b56 b56VarR1;
        hm9.n("bk9", "onPlayClick");
        ((bq7) this.c).o();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null && (b56VarR1 = frgLocalVideo.r1()) != null) {
            b56VarR1.c(true, true, false);
        }
        if (b()) {
            a2();
            Z1();
        }
    }

    @Override // defpackage.ol9
    public final void T() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null) {
            return;
        }
        frgLocalVideo.T();
    }

    @Override // defpackage.ol9
    public final void W() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null) {
            return;
        }
        frgLocalVideo.getClass();
    }

    @Override // defpackage.ve8
    public final void W0() {
        hm9.k("bk9", "onMediaPlayerControllerDetach");
    }

    @Override // defpackage.ol9
    public final void Y0(long j) {
        ((bq7) this.c).q(j);
    }

    @Override // defpackage.ol9
    public final void Z0() {
        c2();
        b2();
    }

    public final void Z1() {
        b2();
        if (this.t0.a) {
            r0a r0aVarN = qy9.l(2L, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7Var = new sd7(new ak9(this, 2), new jj9(4), ft.d);
            r0aVarN.a(sd7Var);
            this.w0 = sd7Var;
        }
    }

    public final void a2() {
        c2();
        r0a r0aVarN = qy9.l(100L, TimeUnit.MILLISECONDS).n(ce.a());
        sd7 sd7Var = new sd7(new ak9(this, 3), new jj9(5), ft.d);
        r0aVarN.a(sd7Var);
        this.v0 = sd7Var;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean b() {
        return ((bq7) this.c).k();
    }

    public final void b2() {
        cqc.b(this.w0);
    }

    @Override // defpackage.q3b
    public final long c() {
        return ((bq7) this.c).g();
    }

    @Override // defpackage.jk9
    public final boolean c0() {
        bq7 bq7Var = (bq7) this.c;
        if (bq7Var.f == null) {
            return false;
        }
        u65 u65Var = bq7Var.b;
        zpd zpdVar = u65Var.a;
        lue lueVarO1 = zpdVar.O1();
        return (!lueVarO1.q() && lueVarO1.n(zpdVar.p0(), (jue) zpdVar.b, 0L).t0) || u65Var.v() == -9223372036854775807L;
    }

    @Override // defpackage.ue8
    public final void c1() {
    }

    public final void c2() {
        cqc.b(this.v0);
    }

    @Override // defpackage.slf
    public final void f1() {
    }

    @Override // defpackage.ve8
    public final void h() {
        b56 b56VarR1;
        c2();
        b2();
        hkf hkfVarA = this.t0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkfVarA.a = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null || (b56VarR1 = frgLocalVideo.r1()) == null) {
            return;
        }
        b56VarR1.c(true, true, false);
    }

    @Override // defpackage.ve8
    public final void i() {
        hkf hkfVarA = this.t0.a();
        hkfVarA.b = ((bq7) this.c).k();
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
    }

    @Override // defpackage.ve8
    public final void i0() {
        hm9.k("bk9", "onRenderedFirstFrame");
        j1();
    }

    @Override // defpackage.slf
    public final int i1() {
        return ((bq7) this.c).i();
    }

    @Override // defpackage.slf
    public final int j() {
        fef fefVar = ((bq7) this.c).f;
        if (fefVar == null) {
            return 0;
        }
        return fefVar.j();
    }

    @Override // defpackage.ve8
    public final void j1() {
        hm9.k("bk9", "onPlaybackPrepared");
        boolean zK = ((bq7) this.c).k();
        hkf hkfVarA = this.t0.a();
        hkfVarA.b = zK;
        hkfVarA.c = false;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (zK) {
            a2();
            Z1();
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        return ((bq7) this.c).f();
    }

    @Override // defpackage.jk9
    public final void k1(boolean z) {
        hkf hkfVarA = this.t0.a();
        hkfVarA.a = z;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (!z) {
            b2();
        } else if (this.t0.b) {
            Z1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jk9
    public final void l1(boolean z) {
        hm9.n("bk9", "Release");
        cqc.b(this.u0);
        c2();
        b2();
        bq7 bq7Var = (bq7) this.c;
        if (bq7Var.g == this) {
            bq7Var.u();
            bq7Var.e = null;
            bq7Var.r(null);
            bq7Var.g = null;
        }
        pl9 pl9Var = (pl9) ((kk9) this.b);
        ((Set) ((v2) pl9Var).a).remove(this);
        pl9Var.release();
    }

    @Override // defpackage.ol9
    public final void m1(int i) {
        long j = i;
        we8 we8Var = this.c;
        bq7 bq7Var = (bq7) we8Var;
        bq7Var.q(j);
        hkf hkfVarA = this.t0.a();
        bq7 bq7Var2 = (bq7) we8Var;
        hkfVarA.k = bq7Var2.f();
        hkfVarA.l = bq7Var2.d();
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        if (bq7Var.k()) {
            a2();
            Z1();
        }
    }

    @Override // defpackage.ve8
    public final void o() {
        hm9.k("bk9", "onPlaybackEnded");
        c2();
        b2();
        hkf hkfVarA = this.t0.a();
        hkfVarA.b = false;
        hkfVarA.c = false;
        hkfVarA.a = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo == null) {
            return;
        }
        frgLocalVideo.X();
    }

    @Override // defpackage.jk9
    public final View u1() {
        View view = (View) ((v2) ((pl9) ((kk9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    @Override // defpackage.ve8
    public final void y0() {
        hm9.k("bk9", "onPlaybackBuffering");
        hkf hkfVarA = this.t0.a();
        hkfVarA.c = true;
        hkf hkfVar = new hkf(hkfVarA);
        this.t0 = hkfVar;
        ((pl9) ((kk9) this.b)).d(hkfVar);
    }
}
