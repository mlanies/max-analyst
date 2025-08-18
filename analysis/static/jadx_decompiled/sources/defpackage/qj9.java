package defpackage;

import android.view.Surface;
import android.view.View;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qj9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public final ik9 X;
    public wc6 Y;
    public final we8 c;
    public final zi5 o;

    public qj9(fl9 fl9Var, we8 we8Var, zi5 zi5Var, ik9 ik9Var) {
        super(0, fl9Var);
        this.c = we8Var;
        this.o = zi5Var;
        this.X = ik9Var;
        fl9Var.r(this);
        ((bq7) we8Var).e = this;
    }

    @Override // defpackage.ve8
    public final void D1(Throwable th) {
        ik9 ik9Var = this.X;
        if (ik9Var == null) {
            return;
        }
        ik9Var.Y(th);
    }

    @Override // defpackage.slf
    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
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
    public final void T() {
        ik9 ik9Var = this.X;
        if (ik9Var == null) {
            return;
        }
        ik9Var.T();
    }

    @Override // defpackage.ol9
    public final void W() {
        ik9 ik9Var = this.X;
        if (ik9Var == null) {
            return;
        }
        ik9Var.W();
    }

    @Override // defpackage.ve8
    public final void W0() {
        hm9.k("qj9", "onMediaPlayerControllerDetach");
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean b() {
        return ((bq7) this.c).k();
    }

    @Override // defpackage.q3b
    public final long c() {
        return ((bq7) this.c).g();
    }

    @Override // defpackage.jk9
    public final boolean c0() {
        return false;
    }

    @Override // defpackage.ue8
    public final void c1() {
        ik9 ik9Var;
        if (this.Y == null || (ik9Var = this.X) == null) {
            return;
        }
        ik9Var.X();
    }

    @Override // defpackage.slf
    public final void f1() {
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

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        return ((bq7) this.c).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jk9
    public final void l1(boolean z) {
        bq7 bq7Var = (bq7) this.c;
        if (bq7Var.g == this) {
            bq7Var.u();
            bq7Var.e = null;
            bq7Var.r(null);
            bq7Var.g = null;
            this.Y = null;
            pl9 pl9Var = (pl9) ((kk9) this.b);
            ((Set) ((v2) pl9Var).a).remove(this);
            pl9Var.release();
        }
    }

    @Override // defpackage.jk9
    public final View u1() {
        View view = (View) ((v2) ((pl9) ((kk9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }
}
