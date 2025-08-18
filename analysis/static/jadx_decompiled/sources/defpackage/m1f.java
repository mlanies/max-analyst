package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m1f implements p1f, qgf {
    public kf4 A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public long F0;
    public volatile boolean G0;
    public final pgf X;
    public final Executor Y;
    public final crd Z;
    public final Context a;
    public final i63 b;
    public final va8 c;
    public final xw0 o;
    public final ArrayList s0;
    public final SparseArray t0;
    public final ScheduledExecutorService u0;
    public final qf4 v0;
    public final ArrayDeque w0;
    public final SparseArray x0;
    public final long y0;
    public rf4 z0;

    public m1f(Context context, i63 i63Var, xw0 xw0Var, pgf pgfVar, crd crdVar, List list, long j) {
        nk4 nk4Var = nk4.a;
        this.a = context;
        this.b = i63Var;
        this.o = xw0Var;
        this.X = pgfVar;
        this.Y = nk4Var;
        this.Z = crdVar;
        this.s0 = new ArrayList(list);
        this.y0 = j;
        this.F0 = -9223372036854775807L;
        this.t0 = new SparseArray();
        int i = oaf.a;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new pd3(3, "Effect:MultipleInputVideoGraph:Thread"));
        this.u0 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        va8 va8Var = new va8(26, (byte) 0);
        this.c = va8Var;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = 2;
        defaultVideoFrameProcessor$Factory$Builder.c = va8Var;
        defaultVideoFrameProcessor$Factory$Builder.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.v0 = defaultVideoFrameProcessor$Factory$Builder.build();
        this.w0 = new ArrayDeque();
        this.x0 = new SparseArray();
    }

    @Override // defpackage.qgf
    public final void a() {
        fm9.k(this.t0.size() == 0 && this.A0 == null && this.z0 == null && !this.E0);
        rf4 rf4VarB = this.v0.b(this.a, this.o, this.b, true, nk4.a, new rxd(23, this));
        this.z0 = rf4VarB;
        sg9 sg9Var = new sg9(this);
        SparseArray sparseArray = rf4VarB.d.g;
        fm9.k(oaf.l(sparseArray, 3));
        ((r27) sparseArray.get(3)).a.x(sg9Var);
        this.A0 = new kf4(this.a, this.c, this.Z, this.u0, new o9g(22, this), new sg9(this));
    }

    public final void b() {
        boolean z;
        fm9.l(this.z0);
        if (this.C0) {
            ArrayDeque arrayDeque = this.w0;
            tg9 tg9Var = (tg9) arrayDeque.peek();
            if (tg9Var == null) {
                return;
            }
            rf4 rf4Var = this.z0;
            rf4Var.getClass();
            int i = tg9Var.a.a;
            if (rf4Var.k.e()) {
                v2 v2Var = rf4Var.d.k;
                fm9.l(v2Var);
                v2Var.p(i, tg9Var.b);
                z = true;
            } else {
                z = false;
            }
            fm9.k(z);
            arrayDeque.remove();
            if (this.D0 && arrayDeque.isEmpty()) {
                rf4 rf4Var2 = this.z0;
                rf4Var2.getClass();
                rf4Var2.f();
            }
        }
    }

    @Override // defpackage.p1f
    public final sf6 f(int i) {
        fm9.k(!oaf.l(this.t0, i));
        kf4 kf4Var = this.A0;
        kf4Var.getClass();
        synchronized (kf4Var) {
            fm9.k(!oaf.l(kf4Var.g, i));
            kf4Var.g.put(i, new jf4());
            if (kf4Var.o == -1) {
                kf4Var.o = i;
            }
        }
        qf4 qf4Var = this.v0;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = qf4Var.a;
        defaultVideoFrameProcessor$Factory$Builder.b = qf4Var.d;
        defaultVideoFrameProcessor$Factory$Builder.c = qf4Var.c;
        defaultVideoFrameProcessor$Factory$Builder.f = !qf4Var.b;
        boolean z = qf4Var.g;
        boolean z2 = qf4Var.h;
        defaultVideoFrameProcessor$Factory$Builder.d = new hd0(i, 8, this);
        defaultVideoFrameProcessor$Factory$Builder.e = 2;
        this.t0.put(i, defaultVideoFrameProcessor$Factory$Builder.build().b(this.a, xw0.o, this.b, true, this.Y, new sh0(i, 13, this)));
        SparseArray sparseArray = this.t0;
        fm9.k(oaf.l(sparseArray, i));
        return new yff((bgf) sparseArray.get(i), null, this.y0);
    }

    @Override // defpackage.qgf
    public final boolean k() {
        return this.G0;
    }

    @Override // defpackage.qgf
    public final void m(jee jeeVar) {
        rf4 rf4Var = this.z0;
        rf4Var.getClass();
        rf4Var.e(jeeVar);
    }

    @Override // defpackage.qgf
    public final void release() throws InterruptedException {
        if (this.E0) {
            return;
        }
        for (int i = 0; i < this.t0.size(); i++) {
            SparseArray sparseArray = this.t0;
            ((rf4) ((bgf) sparseArray.get(sparseArray.keyAt(i)))).d();
        }
        this.t0.clear();
        kf4 kf4Var = this.A0;
        if (kf4Var != null) {
            synchronized (kf4Var) {
                fm9.k(kf4Var.h);
                try {
                    kf4Var.f.t(new ff4(kf4Var, 1));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.A0 = null;
        }
        rf4 rf4Var = this.z0;
        if (rf4Var != null) {
            rf4Var.d();
            this.z0 = null;
        }
        try {
            if (((EGLContext) this.c.c) != null) {
                mr0.s((EGLContext) this.c.c, mr0.A());
            }
        } catch (GlUtil$GlException e2) {
            z04.v("Error releasing GL context", e2);
        }
        this.u0.shutdown();
        try {
            this.u0.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            this.Y.execute(new vs5(this, 27, e3));
        }
        this.E0 = true;
    }
}
