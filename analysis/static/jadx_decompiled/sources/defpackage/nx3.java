package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public abstract class nx3 extends e0 implements iu3 {
    public static final mx3 Key = new mx3(vu4.b, new pz2(12));

    public nx3() {
        super(vu4.b);
    }

    public static /* synthetic */ nx3 limitedParallelism$default(nx3 nx3Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return nx3Var.limitedParallelism(i, str);
    }

    /* renamed from: dispatch */
    public abstract void mo20dispatch(lx3 lx3Var, Runnable runnable);

    public void dispatchYield(lx3 lx3Var, Runnable runnable) {
        mo20dispatch(lx3Var, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.e0, defpackage.lx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <E extends defpackage.jx3> E get(defpackage.kx3 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.mx3
            r1 = 0
            if (r0 == 0) goto L27
            mx3 r4 = (defpackage.mx3) r4
            kx3 r0 = r3.getKey()
            if (r0 == r4) goto L14
            kx3 r2 = r4.b
            if (r2 != r0) goto L12
            goto L17
        L12:
            r0 = 0
            goto L18
        L14:
            r4.getClass()
        L17:
            r0 = 1
        L18:
            if (r0 == 0) goto L2e
            m56 r4 = r4.a
            java.lang.Object r3 = r4.invoke(r3)
            jx3 r3 = (defpackage.jx3) r3
            boolean r4 = r3 instanceof defpackage.jx3
            if (r4 == 0) goto L2e
            goto L2d
        L27:
            vu4 r0 = defpackage.vu4.b
            if (r0 != r4) goto L2c
            goto L2d
        L2c:
            r3 = r1
        L2d:
            r1 = r3
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx3.get(kx3):jx3");
    }

    @Override // defpackage.iu3
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(lx3 lx3Var) {
        return true;
    }

    public nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    @Override // defpackage.e0, defpackage.lx3
    public lx3 minusKey(kx3 kx3Var) {
        boolean z;
        boolean z2 = kx3Var instanceof mx3;
        hz4 hz4Var = hz4.a;
        if (z2) {
            mx3 mx3Var = (mx3) kx3Var;
            kx3 key = getKey();
            if (key != mx3Var) {
                if (mx3Var.b != key) {
                    z = false;
                }
                if (z || ((jx3) mx3Var.a.invoke(this)) == null) {
                }
            } else {
                mx3Var.getClass();
            }
            z = true;
            return z ? this : this;
        }
        if (vu4.b != kx3Var) {
            return this;
        }
        return hz4Var;
    }

    public final nx3 plus(nx3 nx3Var) {
        return nx3Var;
    }

    @Override // defpackage.iu3
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c54.u(this);
    }

    public /* synthetic */ nx3 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
