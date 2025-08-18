package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iee {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final vb0 g;
    public int h;
    public int i;
    public see k;
    public hee l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public iee(int i, int i2, vb0 vb0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = vb0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new hee(vb0Var.a, i2);
    }

    public final void a(Runnable runnable) {
        kq0.e();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        c54.p("Edge is already closed.", !this.n);
    }

    public final void c() {
        kq0.e();
        this.l.a();
        this.n = true;
    }

    public final see d(ax1 ax1Var, boolean z) {
        kq0.e();
        b();
        vb0 vb0Var = this.g;
        see seeVar = new see(vb0Var.a, ax1Var, z, vb0Var.b, vb0Var.c, new eee(this, 0));
        try {
            fw6 fw6Var = seeVar.l;
            hee heeVar = this.l;
            Objects.requireNonNull(heeVar);
            if (heeVar.f(fw6Var, new fee(heeVar, 0))) {
                kq0.w(heeVar.e).d(new wf4(fw6Var, 1), ju0.k());
            }
            this.k = seeVar;
            f();
            return seeVar;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            seeVar.d();
            throw e2;
        }
    }

    public final void e() {
        boolean z;
        kq0.e();
        b();
        hee heeVar = this.l;
        heeVar.getClass();
        kq0.e();
        if (heeVar.p == null) {
            synchronized (heeVar.a) {
                z = heeVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new hee(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        ree reeVar;
        Executor executor;
        kq0.e();
        cc0 cc0Var = new cc0(this.d, this.i, this.h, this.c, this.b, this.e);
        see seeVar = this.k;
        if (seeVar != null) {
            synchronized (seeVar.a) {
                seeVar.m = cc0Var;
                reeVar = seeVar.n;
                executor = seeVar.o;
            }
            if (reeVar != null && executor != null) {
                executor.execute(new nee(reeVar, cc0Var, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(cc0Var);
        }
    }
}
