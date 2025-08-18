package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;

/* loaded from: classes.dex */
public final class fab extends d0 implements iab, e32 {
    public final e32 a;

    public fab(lx3 lx3Var, zt0 zt0Var) {
        super(lx3Var, true, true);
        this.a = zt0Var;
    }

    @Override // defpackage.p8c
    public final v3d c() {
        return this.a.c();
    }

    @Override // defpackage.z87, defpackage.x77, defpackage.p8c
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // defpackage.z87
    public final void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = z87.toCancellationException$default(this, th, null, 1, null);
        this.a.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // defpackage.p8c
    public final Object f() {
        return this.a.f();
    }

    @Override // defpackage.p8c
    public final Object h(Continuation continuation) {
        return this.a.h(continuation);
    }

    @Override // defpackage.j5d
    public final boolean i(Throwable th) {
        return this.a.i(th);
    }

    @Override // defpackage.p8c
    public final tt0 iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.j5d
    public final void k(c01 c01Var) {
        this.a.k(c01Var);
    }

    @Override // defpackage.j5d
    public final Object n(Object obj) {
        return this.a.n(obj);
    }

    @Override // defpackage.j5d
    public final Object o(Object obj, Continuation continuation) {
        return this.a.o(obj, continuation);
    }

    @Override // defpackage.d0
    public final void onCancelled(Throwable th, boolean z) {
        if (this.a.i(th) || z) {
            return;
        }
        wmd.v(getContext(), th);
    }

    @Override // defpackage.d0
    public final void onCompleted(Object obj) {
        this.a.i(null);
    }

    @Override // defpackage.j5d
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.z87
    public final /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
    }

    @Override // defpackage.z87
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
        return true;
    }
}
