package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hqc implements qv6 {
    public final Surface X;
    public h06 Y;
    public final qv6 o;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final tt6 Z = new tt6(1, this);

    public hqc(qv6 qv6Var) {
        this.o = qv6Var;
        this.X = qv6Var.getSurface();
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.o.k();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qv6
    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.X;
                if (surface != null) {
                    surface.release();
                }
                this.o.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qv6
    public final ov6 g() {
        ut6 ut6Var;
        synchronized (this.a) {
            ov6 ov6VarG = this.o.g();
            if (ov6VarG != null) {
                this.b++;
                ut6Var = new ut6(ov6VarG);
                ut6Var.a(this.Z);
            } else {
                ut6Var = null;
            }
        }
        return ut6Var;
    }

    @Override // defpackage.qv6
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.o.getHeight();
        }
        return height;
    }

    @Override // defpackage.qv6
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.o.getSurface();
        }
        return surface;
    }

    @Override // defpackage.qv6
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.o.getWidth();
        }
        return width;
    }

    @Override // defpackage.qv6
    public final int j() {
        int iJ;
        synchronized (this.a) {
            iJ = this.o.j();
        }
        return iJ;
    }

    @Override // defpackage.qv6
    public final void k() {
        synchronized (this.a) {
            this.o.k();
        }
    }

    @Override // defpackage.qv6
    public final void l(pv6 pv6Var, Executor executor) {
        synchronized (this.a) {
            this.o.l(new ypc(this, 2, pv6Var), executor);
        }
    }

    @Override // defpackage.qv6
    public final int m() {
        int iM;
        synchronized (this.a) {
            iM = this.o.m();
        }
        return iM;
    }

    @Override // defpackage.qv6
    public final ov6 o() {
        ut6 ut6Var;
        synchronized (this.a) {
            ov6 ov6VarO = this.o.o();
            if (ov6VarO != null) {
                this.b++;
                ut6Var = new ut6(ov6VarO);
                ut6Var.a(this.Z);
            } else {
                ut6Var = null;
            }
        }
        return ut6Var;
    }
}
