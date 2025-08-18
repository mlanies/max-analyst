package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wh6 extends cx7 implements hg4 {
    public final Handler a;
    public final String b;
    public final boolean c;
    public final wh6 o;

    public wh6(Handler handler, String str, boolean z) {
        this.a = handler;
        this.b = str;
        this.c = z;
        this.o = z ? this : new wh6(handler, str, true);
    }

    public final void d(lx3 lx3Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        x77 x77Var = (x77) lx3Var.get(c32.X);
        if (x77Var != null) {
            x77Var.cancel(cancellationException);
        }
        ql4.c.mo20dispatch(lx3Var, runnable);
    }

    @Override // defpackage.hg4
    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        d(lx3Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wh6) {
            wh6 wh6Var = (wh6) obj;
            if (wh6Var.a == this.a && wh6Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cx7
    public final cx7 getImmediate() {
        return this.o;
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.hg4
    public final cm4 invokeOnTimeout(long j, final Runnable runnable, lx3 lx3Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new cm4() { // from class: vh6
                @Override // defpackage.cm4
                public final void dispose() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        d(lx3Var, runnable);
        return er9.a;
    }

    @Override // defpackage.nx3
    public final boolean isDispatchNeeded(lx3 lx3Var) {
        return (this.c && tpa.f(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo21scheduleResumeAfterDelay(long j, ry1 ry1Var) {
        h76 h76Var = new h76(ry1Var, 8, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(h76Var, j)) {
            ry1Var.d(new ga(this, 15, h76Var));
        } else {
            d(ry1Var.getContext(), h76Var);
        }
    }

    @Override // defpackage.cx7, defpackage.nx3
    public final String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.b;
        if (string == null) {
            string = this.a.toString();
        }
        return this.c ? au1.g(string, ".immediate") : string;
    }

    public wh6(Handler handler) {
        this(handler, null, false);
    }
}
