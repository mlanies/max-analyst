package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ard implements qgf {
    public final xw0 X;
    public final Executor Y;
    public final boolean Z;
    public final Context a;
    public final zff b;
    public final i63 c;
    public final pgf o;
    public final long s0;
    public final b8b t0;
    public bgf u0;
    public jee v0;
    public boolean w0;
    public boolean x0;
    public volatile boolean y0;
    public int z0;

    public ard(Context context, zff zffVar, i63 i63Var, pgf pgfVar, xw0 xw0Var, Executor executor, crd crdVar, boolean z, b8b b8bVar, long j) {
        fm9.j("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", crd.u0.equals(crdVar));
        this.a = context;
        this.b = zffVar;
        this.c = i63Var;
        this.o = pgfVar;
        this.X = xw0Var;
        this.Y = executor;
        this.Z = z;
        this.t0 = b8bVar;
        this.s0 = j;
        this.z0 = -1;
    }

    @Override // defpackage.qgf
    public final void a() {
    }

    public final bgf b(int i) {
        int i2 = this.z0;
        fm9.f(i2 != -1 && i2 == i);
        bgf bgfVar = this.u0;
        fm9.l(bgfVar);
        return bgfVar;
    }

    public final void c(int i) {
        if (this.u0 == null) {
            boolean z = this.x0;
        }
        fm9.k(this.z0 == -1);
        this.z0 = i;
        bgf bgfVarA = this.b.a(this.a, this.X, this.c, this.Z, new g03(10, this));
        this.u0 = bgfVarA;
        jee jeeVar = this.v0;
        if (jeeVar != null) {
            ((rf4) bgfVarA).e(jeeVar);
        }
    }

    @Override // defpackage.qgf
    public final boolean k() {
        return this.y0;
    }

    @Override // defpackage.qgf
    public final void m(jee jeeVar) {
        this.v0 = jeeVar;
        bgf bgfVar = this.u0;
        if (bgfVar != null) {
            ((rf4) bgfVar).e(jeeVar);
        }
    }

    @Override // defpackage.qgf
    public final void release() {
        if (this.x0) {
            return;
        }
        bgf bgfVar = this.u0;
        if (bgfVar != null) {
            ((rf4) bgfVar).d();
            this.u0 = null;
        }
        this.x0 = true;
    }
}
