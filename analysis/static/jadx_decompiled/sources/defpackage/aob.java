package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class aob extends ej0 {
    public final q24 h;
    public final yt8 i;
    public final tr4 j;
    public final huc k;
    public final int l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public z0f q;
    public tb8 r;

    public aob(tb8 tb8Var, q24 q24Var, yt8 yt8Var, tr4 tr4Var, huc hucVar, int i) {
        this.r = tb8Var;
        this.h = q24Var;
        this.i = yt8Var;
        this.j = tr4Var;
        this.k = hucVar;
        this.l = i;
    }

    @Override // defpackage.ej0
    public final boolean a(tb8 tb8Var) {
        ib8 ib8Var = i().b;
        ib8Var.getClass();
        ib8 ib8Var2 = tb8Var.b;
        return ib8Var2 != null && ib8Var2.a.equals(ib8Var.a) && ib8Var2.i == ib8Var.i && oaf.a(ib8Var2.f, ib8Var.f);
    }

    @Override // defpackage.ej0
    public final zd8 c(yj8 yj8Var, n64 n64Var, long j) {
        t24 t24VarA = this.h.a();
        z0f z0fVar = this.q;
        if (z0fVar != null) {
            t24VarA.H(z0fVar);
        }
        ib8 ib8Var = i().b;
        ib8Var.getClass();
        fm9.l(this.g);
        k8g k8gVar = new k8g((ra5) this.i.b);
        lr4 lr4Var = new lr4(this.d.c, 0, yj8Var);
        jn jnVarB = b(yj8Var);
        long jS = oaf.S(ib8Var.i);
        return new vnb(ib8Var.a, t24VarA, k8gVar, this.j, lr4Var, this.k, jnVarB, this, n64Var, ib8Var.f, this.l, jS);
    }

    @Override // defpackage.ej0
    public final synchronized tb8 i() {
        return this.r;
    }

    @Override // defpackage.ej0
    public final void k() {
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.q = z0fVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        tr4 tr4Var = this.j;
        tr4Var.c(looperMyLooper, j4bVar);
        tr4Var.prepare();
        u();
    }

    @Override // defpackage.ej0
    public final void o(zd8 zd8Var) {
        vnb vnbVar = (vnb) zd8Var;
        if (vnbVar.H0) {
            for (erc ercVar : vnbVar.E0) {
                ercVar.h();
                fr4 fr4Var = ercVar.h;
                if (fr4Var != null) {
                    fr4Var.f(ercVar.e);
                    ercVar.h = null;
                    ercVar.g = null;
                }
            }
        }
        vnbVar.w0.s(vnbVar);
        vnbVar.B0.removeCallbacksAndMessages(null);
        vnbVar.C0 = null;
        vnbVar.Y0 = true;
    }

    @Override // defpackage.ej0
    public final void q() {
        this.j.release();
    }

    @Override // defpackage.ej0
    public final synchronized void t(tb8 tb8Var) {
        this.r = tb8Var;
    }

    public final void u() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        tb8 tb8VarI = i();
        ird irdVar = new ird(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, tb8VarI, z2 ? tb8VarI.c : null);
        n(this.m ? new xnb(irdVar) : irdVar);
    }

    public final void v(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (!this.m && this.n == j && this.o == z && this.p == z2) {
            return;
        }
        this.n = j;
        this.o = z;
        this.p = z2;
        this.m = false;
        u();
    }
}
