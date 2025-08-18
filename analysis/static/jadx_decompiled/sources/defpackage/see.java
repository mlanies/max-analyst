package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class see {
    public static final Range p = vb0.f;
    public final Object a = new Object();
    public final Size b;
    public final eu4 c;
    public final Range d;
    public final ax1 e;
    public final boolean f;
    public final oq1 g;
    public final lq1 h;
    public final oq1 i;
    public final lq1 j;
    public final lq1 k;
    public final fw6 l;
    public cc0 m;
    public ree n;
    public Executor o;

    public see(Size size, ax1 ax1Var, boolean z, eu4 eu4Var, Range range, eee eeeVar) {
        this.b = size;
        this.e = ax1Var;
        this.f = z;
        this.c = eu4Var;
        this.d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        oq1 oq1VarG = f8.g(new mq1() { // from class: oee
            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                switch (i) {
                    case 0:
                        atomicReference.set(lq1Var);
                        return zr6.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(lq1Var);
                        return zr6.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(lq1Var);
                        return zr6.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        lq1 lq1Var = (lq1) atomicReference.get();
        lq1Var.getClass();
        this.k = lq1Var;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i2 = 1;
        oq1 oq1VarG2 = f8.g(new mq1() { // from class: oee
            @Override // defpackage.mq1
            public final String q(lq1 lq1Var2) {
                switch (i2) {
                    case 0:
                        atomicReference2.set(lq1Var2);
                        return zr6.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(lq1Var2);
                        return zr6.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(lq1Var2);
                        return zr6.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.i = oq1VarG2;
        kq0.a(oq1VarG2, new djb(lq1Var, oq1VarG, false, 8), ju0.k());
        lq1 lq1Var2 = (lq1) atomicReference2.get();
        lq1Var2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i3 = 2;
        oq1 oq1VarG3 = f8.g(new mq1() { // from class: oee
            @Override // defpackage.mq1
            public final String q(lq1 lq1Var22) {
                switch (i3) {
                    case 0:
                        atomicReference3.set(lq1Var22);
                        return zr6.l(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(lq1Var22);
                        return zr6.l(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(lq1Var22);
                        return zr6.l(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.g = oq1VarG3;
        lq1 lq1Var3 = (lq1) atomicReference3.get();
        lq1Var3.getClass();
        this.h = lq1Var3;
        fw6 fw6Var = new fw6(this, size);
        this.l = fw6Var;
        bm7 bm7VarW = kq0.w(fw6Var.e);
        kq0.a(oq1VarG3, new vq7(bm7VarW, lq1Var2, str), ju0.k());
        bm7VarW.d(new ae4(this, 1), ju0.k());
        ok4 ok4VarK = ju0.k();
        AtomicReference atomicReference4 = new AtomicReference(null);
        kq0.a(f8.g(new ypc(this, 7, atomicReference4)), new o9g(27, eeeVar), ok4VarK);
        lq1 lq1Var4 = (lq1) atomicReference4.get();
        lq1Var4.getClass();
        this.j = lq1Var4;
    }

    public final boolean a() {
        return this.g.b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final tj3 tj3Var) {
        if (!this.h.b(surface)) {
            oq1 oq1Var = this.g;
            if (!oq1Var.isCancelled()) {
                c54.p(null, oq1Var.b.isDone());
                try {
                    oq1Var.get();
                    final int i = 0;
                    executor.execute(new Runnable() { // from class: pee
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    tj3Var.accept(new bc0(3, surface));
                                    break;
                                default:
                                    tj3Var.accept(new bc0(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: pee
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    tj3Var.accept(new bc0(3, surface));
                                    break;
                                default:
                                    tj3Var.accept(new bc0(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        kq0.a(this.i, new b9b(tj3Var, 8, surface), executor);
    }

    public final void c(Executor executor, ree reeVar) {
        cc0 cc0Var;
        synchronized (this.a) {
            this.n = reeVar;
            this.o = executor;
            cc0Var = this.m;
        }
        if (cc0Var != null) {
            executor.execute(new nee(reeVar, cc0Var, 1));
        }
    }

    public final void d() {
        this.h.d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
