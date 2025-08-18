package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* loaded from: classes.dex */
public abstract class use {
    public static final ThreadLocal a = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    public static a45 a() {
        ThreadLocal threadLocal = a;
        a45 a45Var = (a45) threadLocal.get();
        if (a45Var != null) {
            return a45Var;
        }
        kp0 kp0Var = new kp0(Thread.currentThread());
        threadLocal.set(kp0Var);
        return kp0Var;
    }
}
