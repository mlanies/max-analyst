package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class sq4 implements iqf {
    public final qq4 Y;
    public rq4 o;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public mq4 X = null;

    public sq4(la6 la6Var) {
        this.Y = qq4.c ? new qq4() : qq4.b;
        if (la6Var != null) {
            j(la6Var);
        }
    }

    @Override // defpackage.iqf
    public final void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.Y.a(z ? pq4.B0 : pq4.C0);
        this.c = z;
        c();
    }

    public final void b() {
        if (this.a) {
            return;
        }
        pq4 pq4Var = pq4.Z;
        this.Y.a(pq4Var);
        this.a = true;
        mq4 mq4Var = this.X;
        if (mq4Var != null) {
            k0 k0Var = (k0) mq4Var;
            if (k0Var.h != null) {
                f46.I();
                if (ta5.a.i(2)) {
                    ta5.f(k0.x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, k0Var.m ? "request already submitted" : "request needs submit");
                }
                k0Var.a.a(pq4Var);
                k0Var.h.getClass();
                k0Var.b.g(k0Var);
                k0Var.l = true;
                if (!k0Var.m) {
                    k0Var.r();
                }
                f46.I();
            }
        }
    }

    public final void c() {
        if (this.b && this.c) {
            b();
        } else {
            d();
        }
    }

    public final void d() {
        if (this.a) {
            qq4 qq4Var = this.Y;
            pq4 pq4Var = pq4.s0;
            qq4Var.a(pq4Var);
            this.a = false;
            if (f()) {
                k0 k0Var = (k0) this.X;
                k0Var.getClass();
                f46.I();
                if (ta5.a.i(2)) {
                    ta5.e(k0.x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j);
                }
                k0Var.a.a(pq4Var);
                k0Var.l = false;
                bg4 bg4Var = k0Var.b;
                bg4Var.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (bg4Var.b) {
                        try {
                            if (!((ArrayList) bg4Var.o).contains(k0Var)) {
                                ((ArrayList) bg4Var.o).add(k0Var);
                                boolean z = ((ArrayList) bg4Var.o).size() == 1;
                                if (z) {
                                    ((Handler) bg4Var.c).post((re) bg4Var.Y);
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    k0Var.n();
                }
                f46.I();
            }
        }
    }

    public final umc e() {
        rq4 rq4Var = this.o;
        if (rq4Var == null) {
            return null;
        }
        return ((la6) rq4Var).d;
    }

    public final boolean f() {
        mq4 mq4Var = this.X;
        return mq4Var != null && ((k0) mq4Var).h == this.o;
    }

    public final void g() {
        this.Y.a(pq4.z0);
        this.b = true;
        c();
    }

    public final void h() {
        this.Y.a(pq4.A0);
        this.b = false;
        c();
    }

    public final void i(mq4 mq4Var) {
        boolean z = this.a;
        if (z) {
            d();
        }
        boolean zF = f();
        qq4 qq4Var = this.Y;
        if (zF) {
            qq4Var.a(pq4.o);
            ((d2b) this.X).w(null);
        }
        this.X = mq4Var;
        if (mq4Var != null) {
            qq4Var.a(pq4.c);
            ((d2b) this.X).w(this.o);
        } else {
            qq4Var.a(pq4.X);
        }
        if (z) {
            b();
        }
    }

    public final void j(rq4 rq4Var) {
        this.Y.a(pq4.a);
        boolean zF = f();
        umc umcVarE = e();
        if (umcVarE instanceof hqf) {
            umcVarE.Y = null;
        }
        rq4Var.getClass();
        this.o = rq4Var;
        umc umcVar = ((la6) rq4Var).d;
        a(umcVar == null || umcVar.isVisible());
        umc umcVarE2 = e();
        if (umcVarE2 instanceof hqf) {
            umcVarE2.Y = this;
        }
        if (zF) {
            ((d2b) this.X).w(rq4Var);
        }
    }

    @Override // defpackage.iqf
    public final void onDraw() {
        if (this.a) {
            return;
        }
        ta5.j(qq4.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.X)), toString());
        this.b = true;
        this.c = true;
        c();
    }

    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.d("controllerAttached", this.a);
        nw4VarR0.d("holderAttached", this.b);
        nw4VarR0.d("drawableVisible", this.c);
        nw4VarR0.e(this.Y.a.toString(), "events");
        return nw4VarR0.toString();
    }
}
