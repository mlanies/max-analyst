package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xq9 extends e0 implements x77 {
    public static final xq9 a = new xq9(c32.X);

    @Override // defpackage.x77
    public final e03 attachChild(h03 h03Var) {
        return er9.a;
    }

    @Override // defpackage.x77, defpackage.p8c
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // defpackage.x77
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.x77
    public final c6d getChildren() {
        return vz4.a;
    }

    @Override // defpackage.x77
    public final cm4 invokeOnCompletion(m56 m56Var) {
        return er9.a;
    }

    @Override // defpackage.x77
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.x77
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.x77
    public final boolean isCompleted() {
        return false;
    }

    @Override // defpackage.x77
    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.x77
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.x77
    public final cm4 invokeOnCompletion(boolean z, boolean z2, m56 m56Var) {
        return er9.a;
    }
}
