package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class zi9 implements ry1, irf {
    public final sy1 a;
    public final Object b = null;
    public final /* synthetic */ aj9 c;

    public zi9(aj9 aj9Var, sy1 sy1Var) {
        this.c = aj9Var;
        this.a = sy1Var;
    }

    @Override // defpackage.irf
    public final void a(Segment segment, int i) {
        this.a.a(segment, i);
    }

    @Override // defpackage.ry1
    public final void b(nx3 nx3Var) {
        this.a.b(nx3Var);
    }

    @Override // defpackage.ry1
    public final boolean cancel(Throwable th) {
        return this.a.cancel(th);
    }

    @Override // defpackage.ry1
    public final void d(m56 m56Var) {
        this.a.d(m56Var);
    }

    @Override // defpackage.ry1
    public final void e(Object obj, c66 c66Var) {
        e5f e5fVar = e5f.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = aj9.h;
        Object obj2 = this.b;
        aj9 aj9Var = this.c;
        atomicReferenceFieldUpdater.set(aj9Var, obj2);
        ga gaVar = new ga(aj9Var, 21, this);
        sy1 sy1Var = this.a;
        sy1Var.v(e5fVar, sy1Var.resumeMode, new vq0(2, gaVar));
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return this.a.b;
    }

    @Override // defpackage.ry1
    public final boolean isActive() {
        return this.a.isActive();
    }

    @Override // defpackage.ry1
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.ry1
    public final Symbol j(Throwable th) {
        return this.a.j(th);
    }

    @Override // defpackage.ry1
    public final Symbol l(Object obj, c66 c66Var) {
        aj9 aj9Var = this.c;
        rt0 rt0Var = new rt0(aj9Var, 1, this);
        Symbol symbolX = this.a.x((e5f) obj, rt0Var);
        if (symbolX != null) {
            aj9.h.set(aj9Var, this.b);
        }
        return symbolX;
    }

    @Override // defpackage.ry1
    public final void q(Object obj) {
        this.a.q(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
