package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class de0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(de0.class, "notCompletedCount$volatile");
    public final yf4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public de0(yf4[] yf4VarArr) {
        this.a = yf4VarArr;
        this.notCompletedCount$volatile = yf4VarArr.length;
    }

    public final Object a(Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        x77[] x77VarArr = this.a;
        int length = x77VarArr.length;
        be0[] be0VarArr = new be0[length];
        for (int i = 0; i < length; i++) {
            x77 x77Var = x77VarArr[i];
            ((z87) x77Var).start();
            be0 be0Var = new be0(this, sy1Var);
            be0Var.c = pag.q(x77Var, true, be0Var);
            be0VarArr[i] = be0Var;
        }
        ce0 ce0Var = new ce0(be0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            be0 be0Var2 = be0VarArr[i2];
            be0Var2.getClass();
            be0.X.set(be0Var2, ce0Var);
        }
        if (!(sy1.o.get(sy1Var) instanceof ir9)) {
            ce0Var.a();
        } else {
            nu0.w(sy1Var, ce0Var);
        }
        return sy1Var.m();
    }
}
