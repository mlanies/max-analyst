package defpackage;

import android.opengl.GLES30;
import android.util.Pair;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final /* synthetic */ class gf4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.xff
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                kf4 kf4Var = (kf4) this.c;
                long j = this.b;
                synchronized (kf4Var) {
                    while (kf4Var.i.f() < kf4Var.i.b && kf4Var.j.f() <= j) {
                        try {
                            er0 er0Var = kf4Var.i;
                            ArrayDeque arrayDeque = (ArrayDeque) er0Var.e;
                            fm9.k(!arrayDeque.isEmpty());
                            ((ArrayDeque) er0Var.d).add((hd6) arrayDeque.remove());
                            kf4Var.j.h();
                            GLES30.glDeleteSync(kf4Var.k.h());
                            mr0.f();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    kf4Var.b();
                }
                return;
            case 1:
                rf4 rf4Var = (rf4) this.c;
                rk5 rk5Var = rf4Var.i;
                if (rk5Var.p != null) {
                    return;
                }
                fm9.k(!rk5Var.r);
                ConcurrentLinkedQueue concurrentLinkedQueue = rk5Var.l;
                Pair pair = (Pair) concurrentLinkedQueue.remove();
                rk5Var.k(rf4Var.b, (hd6) pair.first, ((Long) pair.second).longValue(), this.b);
                if (concurrentLinkedQueue.isEmpty() && rk5Var.x) {
                    of4 of4Var = rk5Var.A;
                    of4Var.getClass();
                    of4Var.a();
                    rk5Var.x = false;
                    return;
                }
                return;
            default:
                rk5 rk5Var2 = (rk5) this.c;
                fm9.k(rk5Var2.p != null);
                while (true) {
                    er0 er0Var2 = rk5Var2.m;
                    if (er0Var2.f() >= er0Var2.b) {
                        return;
                    }
                    uy uyVar = rk5Var2.n;
                    if (uyVar.f() > this.b) {
                        return;
                    }
                    ArrayDeque arrayDeque2 = (ArrayDeque) er0Var2.e;
                    fm9.k(!arrayDeque2.isEmpty());
                    ((ArrayDeque) er0Var2.d).add((hd6) arrayDeque2.remove());
                    uyVar.h();
                    GLES30.glDeleteSync(rk5Var2.o.h());
                    mr0.f();
                    rk5Var2.y.h();
                }
        }
    }
}
