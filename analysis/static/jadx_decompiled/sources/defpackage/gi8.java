package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gi8 implements n3b {
    public final WeakReference a;
    public final WeakReference b;

    public gi8(ii8 ii8Var, x4b x4bVar) {
        this.a = new WeakReference(ii8Var);
        this.b = new WeakReference(x4bVar);
    }

    @Override // defpackage.n3b
    public final void G(int i, tb8 tb8Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, i, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.s(tb8Var);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void O(boolean z) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.k(z);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.C(z);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void S(zz3 zz3Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        PlaybackException playbackException = m4bVar.a;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(playbackException, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, zz3Var, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
    }

    @Override // defpackage.n3b
    public final void X(p0f p0fVar) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.b(p0fVar);
        ii8VarB.c.a(true, false);
        ii8VarB.c(new wa8(7));
    }

    @Override // defpackage.n3b
    public final void a(int i) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        ii8VarB.r = m4bVar.d(m4bVar.u, i, m4bVar.t);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.w();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void a0(long j) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, j, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.getClass();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    public final ii8 b() {
        return (ii8) this.a.get();
    }

    @Override // defpackage.n3b
    public final void b0(gd8 gd8Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, gd8Var, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.E();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void c(boolean z) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, z, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.getClass();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
        ii8VarB.t();
    }

    @Override // defpackage.n3b
    public final void c0(gd8 gd8Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        ii8VarB.r = ii8VarB.r.g(gd8Var);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.z(gd8Var);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void d(int i, boolean z) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        ii8VarB.r = m4bVar.d(i, m4bVar.x, z);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.t();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void d0(long j) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, j, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.getClass();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void f(float f) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        ii8VarB.r = ii8VarB.r.p(f);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.getClass();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void f0(mue mueVar, int i) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        x4b x4bVar = (x4b) this.b.get();
        if (x4bVar == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.n(mueVar, x4bVar.K(), i);
        ii8VarB.c.a(false, true);
        try {
            ii8VarB.h.h.D(mueVar);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void h(int i) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        x4b x4bVar = (x4b) this.b.get();
        if (x4bVar == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.f(i, x4bVar.X());
        ii8VarB.c.a(true, true);
        try {
            qi8 qi8Var = ii8VarB.h.h;
            x4bVar.X();
            qi8Var.v();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void i(int i, boolean z) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.c(i, z);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.q(i, z);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void i0() {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        ii8VarB.c(new wa8(9));
    }

    @Override // defpackage.n3b
    public final void n(boolean z) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, z, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.r();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
        ii8VarB.t();
    }

    @Override // defpackage.n3b
    public final void onRepeatModeChanged(int i) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.i(i);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.B(i);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void p0(c3b c3bVar) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.e(c3bVar);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.u();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void q(p3b p3bVar, p3b p3bVar2, int i) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.h(p3bVar, p3bVar2, i);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.A();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void q0(k3b k3bVar) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.f(k3bVar);
    }

    @Override // defpackage.n3b
    public final void t0(ui4 ui4Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, ui4Var, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.p();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void u(h30 h30Var) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.a(h30Var);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.o(h30Var);
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void u0(long j) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, j, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
    }

    @Override // defpackage.n3b
    public final void v(jlf jlfVar) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(m4bVar.a, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, jlfVar, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.getClass();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        m4b m4bVar = ii8VarB.r;
        mue mueVar = m4bVar.j;
        boolean zQ = mueVar.q();
        qad qadVar = m4bVar.c;
        fm9.k(zQ || qadVar.a.b < mueVar.p());
        ii8VarB.r = new m4b(playbackException, m4bVar.b, qadVar, m4bVar.d, m4bVar.e, m4bVar.f, m4bVar.g, m4bVar.h, m4bVar.i, m4bVar.l, mueVar, m4bVar.k, m4bVar.m, m4bVar.n, m4bVar.o, m4bVar.p, m4bVar.q, m4bVar.r, m4bVar.s, m4bVar.t, m4bVar.u, m4bVar.x, m4bVar.y, m4bVar.v, m4bVar.w, m4bVar.z, m4bVar.A, m4bVar.B, m4bVar.C, m4bVar.D, m4bVar.E);
        ii8VarB.c.a(true, true);
        try {
            ii8VarB.h.h.y();
        } catch (RemoteException e) {
            z04.v("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.n3b
    public final void y(j0f j0fVar) {
        ii8 ii8VarB = b();
        if (ii8VarB == null) {
            return;
        }
        ii8VarB.u();
        if (((x4b) this.b.get()) == null) {
            return;
        }
        ii8VarB.r = ii8VarB.r.o(j0fVar);
        ii8VarB.c.a(true, true);
        ii8VarB.c(new wa8(8));
    }
}
