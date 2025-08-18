package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rk5 implements gd6, jd6 {
    public of4 A;
    public boolean B;
    public boolean C;
    public jee D;
    public EGLSurface E;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final xw0 g;
    public final i63 h;
    public final nx0 i;
    public final Executor j;
    public final agf k;
    public final er0 m;
    public final uy n;
    public final uy o;
    public final id6 p;
    public final int q;
    public final boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public od4 w;
    public boolean x;
    public lsd z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ed6 y = new xxc();
    public final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();

    public rk5(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, xw0 xw0Var, i63 i63Var, nx0 nx0Var, Executor executor, agf agfVar, id6 id6Var, int i, int i2, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = xw0Var;
        this.h = i63Var;
        this.i = nx0Var;
        this.j = executor;
        this.k = agfVar;
        this.p = id6Var;
        this.q = i2;
        this.r = z;
        this.m = new er0(i63.g(i63Var), i);
        this.n = new uy(i);
        this.o = new uy(i);
    }

    @Override // defpackage.gd6
    public final void a(hd6 hd6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gd6
    public final void b() {
        if (!this.l.isEmpty()) {
            fm9.k(!this.r);
            this.x = true;
        } else {
            of4 of4Var = this.A;
            of4Var.getClass();
            of4Var.a();
            this.x = false;
        }
    }

    @Override // defpackage.jd6
    public final void c(long j) {
        this.i.v(new gf4(this, j, 2));
    }

    @Override // defpackage.gd6
    public final void d(Executor executor, lf4 lf4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gd6
    public final void e(va8 va8Var, hd6 hd6Var, long j) {
        this.j.execute(new r60(this, j, 5));
        if (this.p != null) {
            fm9.k(this.m.f() > 0);
            k(va8Var, hd6Var, j, j * 1000);
        } else {
            if (this.r) {
                k(va8Var, hd6Var, j, j * 1000);
            } else {
                this.l.add(Pair.create(hd6Var, Long.valueOf(j)));
            }
            this.y.h();
        }
    }

    @Override // defpackage.gd6
    public final void f(jo7 jo7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gd6
    public final void flush() {
        er0 er0Var = this.m;
        int i = 0;
        id6 id6Var = this.p;
        if (id6Var != null) {
            ArrayDeque arrayDeque = (ArrayDeque) er0Var.d;
            ArrayDeque arrayDeque2 = (ArrayDeque) er0Var.e;
            arrayDeque.addAll(arrayDeque2);
            arrayDeque2.clear();
            uy uyVar = this.n;
            uyVar.b = 0;
            uyVar.c = -1;
            uyVar.o = 0;
            uy uyVar2 = this.o;
            uyVar2.b = 0;
            uyVar2.c = -1;
            uyVar2.o = 0;
        }
        this.l.clear();
        this.x = false;
        od4 od4Var = this.w;
        if (od4Var != null) {
            od4Var.flush();
        }
        this.y.v();
        while (true) {
            if (i >= (id6Var == null ? 1 : er0Var.f())) {
                return;
            }
            this.y.h();
            i++;
        }
    }

    @Override // defpackage.gd6
    public final void g(ed6 ed6Var) {
        this.y = ed6Var;
        int i = 0;
        while (true) {
            if (i >= (this.p == null ? 1 : this.m.f())) {
                return;
            }
            ed6Var.h();
            i++;
        }
    }

    public final synchronized od4 h(int i, int i2, int i3) {
        od4 od4VarI;
        try {
            ww6 ww6Var = new ww6(4);
            ww6Var.e(this.b);
            if (i != 0) {
                nsc nscVar = new nsc();
                float f = i % 360.0f;
                nscVar.a = f;
                if (f < 0.0f) {
                    nscVar.a = f + 360.0f;
                }
                ww6Var.a(new osc(nscVar.a));
            }
            ww6Var.a(b8b.e(i2, i3));
            od4VarI = od4.i(this.a, ww6Var.j(), this.c, this.h, this.q);
            lsd lsdVarG = c37.g(od4VarI.i, this.s, this.t);
            jee jeeVar = this.D;
            if (jeeVar != null) {
                fm9.k(lsdVarG.a == jeeVar.b);
                fm9.k(lsdVarG.b == jeeVar.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return od4VarI;
    }

    public final synchronized void i() {
        if (this.E == null) {
            return;
        }
        try {
            try {
                EGLDisplay eGLDisplay = this.d;
                EGLContext eGLContext = this.e;
                EGLSurface eGLSurface = this.f;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                mr0.e("Error making context current");
                mr0.u(0, 1, 1);
                EGLDisplay eGLDisplay2 = this.d;
                EGLSurface eGLSurface2 = this.E;
                if (eGLDisplay2 != null && eGLSurface2 != null) {
                    EGL14.eglDestroySurface(eGLDisplay2, eGLSurface2);
                    mr0.e("Error destroying surface");
                }
            } catch (GlUtil$GlException e) {
                this.j.execute(new kl4(this, 27, e));
            }
        } finally {
            this.E = null;
        }
    }

    public final synchronized boolean j(va8 va8Var, int i, int i2) {
        try {
            boolean z = true;
            boolean z2 = (this.s == i && this.t == i2 && this.z != null) ? false : true;
            if (z2) {
                this.s = i;
                this.t = i2;
                lsd lsdVarG = c37.g(this.b, i, i2);
                if (!oaf.a(this.z, lsdVarG)) {
                    this.z = lsdVarG;
                    this.j.execute(new kl4(this, 28, lsdVarG));
                }
            }
            this.z.getClass();
            jee jeeVar = this.D;
            if (jeeVar == null && this.p == null) {
                if (this.E != null) {
                    z = false;
                }
                fm9.k(z);
                od4 od4Var = this.w;
                if (od4Var != null) {
                    od4Var.release();
                    this.w = null;
                }
                z04.c0("Output surface and size not set, dropping frame.");
                return false;
            }
            this.u = jeeVar == null ? this.z.a : jeeVar.b;
            this.v = jeeVar == null ? this.z.b : jeeVar.c;
            if (jeeVar != null && this.E == null) {
                this.E = va8Var.s(this.d, jeeVar.a, this.h.c, this.r);
            }
            if (this.p != null) {
                this.m.e(va8Var, this.u, this.v);
            }
            this.g.getClass();
            od4 od4Var2 = this.w;
            if (od4Var2 != null && (this.C || z2 || this.B)) {
                od4Var2.release();
                this.w = null;
                this.C = false;
                this.B = false;
            }
            if (this.w == null) {
                jee jeeVar2 = this.D;
                this.w = h(jeeVar2 == null ? 0 : jeeVar2.d, this.u, this.v);
                this.C = false;
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(va8 va8Var, hd6 hd6Var, long j, long j2) {
        try {
            if (j2 != -2) {
                try {
                } catch (VideoFrameProcessingException | GlUtil$GlException e) {
                    this.j.execute(new kl4(this, e, j));
                }
                if (j(va8Var, hd6Var.c, hd6Var.d)) {
                    if (this.D != null) {
                        l(hd6Var, j, j2);
                    } else if (this.p != null) {
                        m(hd6Var, j);
                    }
                    this.y.s(hd6Var);
                    return;
                }
            }
            this.y.s(hd6Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l(hd6 hd6Var, long j, long j2) {
        try {
            EGLSurface eGLSurface = this.E;
            eGLSurface.getClass();
            jee jeeVar = this.D;
            jeeVar.getClass();
            od4 od4Var = this.w;
            od4Var.getClass();
            EGLDisplay eGLDisplay = this.d;
            EGLContext eGLContext = this.e;
            int i = jeeVar.b;
            int i2 = jeeVar.c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            mr0.e("Error making context current");
            mr0.u(0, i, i2);
            mr0.h();
            od4Var.c(hd6Var.a, j);
            EGLDisplay eGLDisplay2 = this.d;
            if (j2 == -1) {
                j2 = System.nanoTime();
            }
            EGLExt.eglPresentationTimeANDROID(eGLDisplay2, eGLSurface, j2);
            EGL14.eglSwapBuffers(this.d, eGLSurface);
            d54.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(hd6 hd6Var, long j) throws VideoFrameProcessingException, GlUtil$GlException {
        hd6 hd6VarH = this.m.h();
        this.n.e(j);
        mr0.u(hd6VarH.b, hd6VarH.c, hd6VarH.d);
        mr0.h();
        od4 od4Var = this.w;
        od4Var.getClass();
        od4Var.c(hd6Var.a, j);
        this.o.e(mr0.p());
        id6 id6Var = this.p;
        id6Var.getClass();
        id6Var.a(this, hd6VarH, j);
    }

    @Override // defpackage.gd6
    public final synchronized void release() {
        od4 od4Var = this.w;
        if (od4Var != null) {
            od4Var.release();
        }
        try {
            this.m.d();
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = this.E;
            if (eGLDisplay != null && eGLSurface != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                mr0.e("Error destroying surface");
            }
            mr0.f();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
