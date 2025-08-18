package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public abstract class a45 extends nx3 {
    public static final /* synthetic */ int o = 0;
    public long a;
    public boolean b;
    public hs c;

    public final void S(boolean z) {
        this.a = (z ? 4294967296L : 1L) + this.a;
        if (z) {
            return;
        }
        this.b = true;
    }

    public final boolean U() {
        return this.a >= 4294967296L;
    }

    public final void d(boolean z) {
        long j = this.a - (z ? 4294967296L : 1L);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public abstract long e0();

    @Override // defpackage.nx3
    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public final boolean m0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        hs hsVar = this.c;
        if (hsVar == null) {
            return false;
        }
        ol4 ol4Var = (ol4) (hsVar.isEmpty() ? null : hsVar.j());
        if (ol4Var == null) {
            return false;
        }
        ol4Var.run();
        return true;
    }

    public final void n(ol4 ol4Var) {
        hs hsVar = this.c;
        if (hsVar == null) {
            hsVar = new hs();
            this.c = hsVar;
        }
        hsVar.b(ol4Var);
    }

    public void n0(long j, x35 x35Var) {
        pa4.s0.s0(j, x35Var);
    }

    public abstract Thread o();

    public abstract void shutdown();
}
