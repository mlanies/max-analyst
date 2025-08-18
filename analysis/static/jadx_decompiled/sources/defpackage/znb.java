package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class znb extends dj0 {
    public final rb8 h;
    public final kb8 i;
    public final p24 j;
    public final yt8 k;
    public final sr4 l;
    public final buc m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public y0f s;

    public znb(rb8 rb8Var, p24 p24Var, yt8 yt8Var, sr4 sr4Var, buc bucVar) {
        kb8 kb8Var = rb8Var.b;
        kb8Var.getClass();
        this.i = kb8Var;
        this.h = rb8Var;
        this.j = p24Var;
        this.k = yt8Var;
        this.l = sr4Var;
        this.m = bucVar;
        this.n = 1048576;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // defpackage.dj0
    public final yd8 a(xj8 xj8Var, n64 n64Var, long j) {
        r24 r24VarA = this.j.a();
        y0f y0fVar = this.s;
        if (y0fVar != null) {
            r24VarA.N(y0fVar);
        }
        Uri uri = this.i.a;
        np8.g(this.g);
        return new unb(uri, r24VarA, new glc(2, (ua4) ((qa5) this.k.b)), this.l, new kr4(this.d.c, 0, xj8Var), this.m, new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8Var, 0L), this, n64Var, this.n);
    }

    @Override // defpackage.dj0
    public final rb8 f() {
        return this.h;
    }

    @Override // defpackage.dj0
    public final void g() {
    }

    @Override // defpackage.dj0
    public final void i(y0f y0fVar) {
        this.s = y0fVar;
        sr4 sr4Var = this.l;
        sr4Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        sr4Var.c(looperMyLooper, i4bVar);
        p();
    }

    @Override // defpackage.dj0
    public final void k(yd8 yd8Var) {
        unb unbVar = (unb) yd8Var;
        if (unbVar.G0) {
            for (drc drcVar : unbVar.D0) {
                drcVar.i();
                er4 er4Var = drcVar.h;
                if (er4Var != null) {
                    er4Var.f(drcVar.e);
                    drcVar.h = null;
                    drcVar.g = null;
                }
            }
        }
        unbVar.v0.p(unbVar);
        unbVar.A0.removeCallbacksAndMessages(null);
        unbVar.B0 = null;
        unbVar.W0 = true;
    }

    @Override // defpackage.dj0
    public final void m() {
        this.l.release();
    }

    public final void p() {
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        rb8 rb8Var = this.h;
        hrd hrdVar = new hrd(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, rb8Var, z2 ? rb8Var.c : null);
        j(this.o ? new wnb(hrdVar) : hrdVar);
    }

    public final void q(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.p;
        }
        if (!this.o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.o = false;
        p();
    }
}
