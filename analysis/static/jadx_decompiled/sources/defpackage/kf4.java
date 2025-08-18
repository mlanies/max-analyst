package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kf4 implements jd6 {
    public final o9g a;
    public final id6 b;
    public final va8 c;
    public final crd d;
    public final bkb e;
    public final nx0 f;
    public boolean h;
    public i63 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;
    public final SparseArray g = new SparseArray();
    public final er0 i = new er0(false, 1);
    public final uy j = new uy(1);
    public final uy k = new uy(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.ExecutorService] */
    public kf4(Context context, va8 va8Var, crd crdVar, ScheduledExecutorService scheduledExecutorService, o9g o9gVar, sg9 sg9Var) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadExecutor;
        this.a = o9gVar;
        this.b = sg9Var;
        this.c = va8Var;
        this.d = crdVar;
        this.e = new bkb(context);
        int i = 0;
        boolean z = scheduledExecutorService == null;
        if (z) {
            int i2 = oaf.a;
            scheduledExecutorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new pd3(2, "Effect:DefaultVideoCompositor:GlThread"));
        } else {
            scheduledExecutorService.getClass();
            scheduledExecutorServiceNewSingleThreadExecutor = scheduledExecutorService;
        }
        nx0 nx0Var = new nx0(scheduledExecutorServiceNewSingleThreadExecutor, z, new q64(5, o9gVar));
        this.f = nx0Var;
        nx0Var.v(new ff4(this, i));
    }

    public final synchronized ffc a() {
        if (this.i.f() == 0) {
            ls5 ls5Var = zw6.b;
            return ffc.X;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (((jf4) this.g.valueAt(i)).a.isEmpty()) {
                ls5 ls5Var2 = zw6.b;
                return ffc.X;
            }
        }
        ww6 ww6Var = new ww6(4);
        if4 if4Var = (if4) ((jf4) this.g.get(this.o)).a.element();
        ww6Var.a(if4Var);
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (this.g.keyAt(i2) != this.o) {
                jf4 jf4Var = (jf4) this.g.valueAt(i2);
                if (jf4Var.a.size() == 1 && !jf4Var.b) {
                    ls5 ls5Var3 = zw6.b;
                    return ffc.X;
                }
                Iterator it = jf4Var.a.iterator();
                long j = Long.MAX_VALUE;
                if4 if4Var2 = null;
                while (it.hasNext()) {
                    if4 if4Var3 = (if4) it.next();
                    long j2 = if4Var3.c;
                    long jAbs = Math.abs(j2 - if4Var.c);
                    if (jAbs < j) {
                        if4Var2 = if4Var3;
                        j = jAbs;
                    }
                    if (j2 > if4Var.c || (!it.hasNext() && jf4Var.b)) {
                        if4Var2.getClass();
                        ww6Var.a(if4Var2);
                        break;
                    }
                }
            }
        }
        ffc ffcVarJ = ww6Var.j();
        if (ffcVarJ.o == this.g.size()) {
            return ffcVarJ;
        }
        return ffc.X;
    }

    public final synchronized void b() {
        try {
            ffc ffcVarA = a();
            if (ffcVarA.isEmpty()) {
                return;
            }
            if4 if4Var = (if4) ffcVarA.get(this.o);
            ww6 ww6Var = new ww6();
            for (int i = 0; i < ffcVarA.size(); i++) {
                hd6 hd6Var = ((if4) ffcVarA.get(i)).b;
                ww6Var.d(new lsd(hd6Var.c, hd6Var.d));
            }
            lsd lsdVarJ = this.d.j(ww6Var.j());
            this.i.e(this.c, lsdVarJ.b(), lsdVarJ.a());
            hd6 hd6VarH = this.i.h();
            long j = if4Var.c;
            this.j.e(j);
            this.e.q(ffcVarA, hd6VarH);
            this.k.e(mr0.p());
            this.b.a(this, hd6VarH, j);
            jf4 jf4Var = (jf4) this.g.get(this.o);
            f(jf4Var, 1);
            d();
            if (this.h && jf4Var.a.isEmpty()) {
                this.a.z();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.jd6
    public final void c(long j) {
        this.f.v(new gf4(this, j, 0));
    }

    public final synchronized void d() {
        for (int i = 0; i < this.g.size(); i++) {
            if (this.g.keyAt(i) != this.o) {
                e((jf4) this.g.valueAt(i));
            }
        }
    }

    public final synchronized void e(jf4 jf4Var) {
        int iY;
        jf4 jf4Var2 = (jf4) this.g.get(this.o);
        if (jf4Var2.a.isEmpty() && jf4Var2.b) {
            f(jf4Var, jf4Var.a.size());
            return;
        }
        if4 if4Var = (if4) jf4Var2.a.peek();
        final long j = if4Var != null ? if4Var.c : -9223372036854775807L;
        ArrayDeque arrayDeque = jf4Var.a;
        a7b a7bVar = new a7b() { // from class: hf4
            @Override // defpackage.a7b
            public final boolean apply(Object obj) {
                return ((if4) obj).c <= j;
            }
        };
        arrayDeque.getClass();
        Iterable k77Var = new k77(arrayDeque, a7bVar);
        if (k77Var instanceof Collection) {
            iY = ((Collection) k77Var).size();
        } else {
            Iterator it = k77Var.iterator();
            long j2 = 0;
            while (true) {
                p1 p1Var = (p1) it;
                if (!p1Var.hasNext()) {
                    break;
                }
                p1Var.next();
                j2++;
            }
            iY = s5c.Y(j2);
        }
        f(jf4Var, Math.max(iY - 1, 0));
    }

    public final synchronized void f(jf4 jf4Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if4 if4Var = (if4) jf4Var.a.remove();
            if4Var.a.c(if4Var.c);
        }
    }
}
