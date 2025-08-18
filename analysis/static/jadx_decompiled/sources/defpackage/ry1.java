package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public interface ry1 extends Continuation {
    void b(nx3 nx3Var);

    boolean cancel(Throwable th);

    void d(m56 m56Var);

    void e(Object obj, c66 c66Var);

    boolean isActive();

    boolean isCancelled();

    Symbol j(Throwable th);

    Symbol l(Object obj, c66 c66Var);

    void q(Object obj);
}
