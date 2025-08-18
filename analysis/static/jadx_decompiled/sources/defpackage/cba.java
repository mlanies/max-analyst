package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* loaded from: classes.dex */
public final class cba implements o45 {
    public static final AtomicInteger c = new AtomicInteger();
    public final je7 a;
    public final q0e b;

    public cba(je7 je7Var, je7 je7Var2, kke kkeVar) {
        this.a = je7Var2;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b().limitedParallelism(1, "excp"));
        q0e q0eVarA = r0e.a(0);
        this.b = q0eVarA;
        od2.L(new zn5(new jp5(od2.u(q0eVarA, 300L), 0), new bba(je7Var, null), 5), contextScopeA);
    }

    public final void c(Throwable th, boolean z) {
        String str;
        AtomicInteger atomicInteger;
        int i;
        int i2;
        String str2 = null;
        if (z) {
            String name = cba.class.getName();
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            hm9.p(name, "Got exception for handle", cause);
            do {
                atomicInteger = c;
                i = atomicInteger.get();
                i2 = i + 1;
                if (i2 > 2147483645) {
                    i2 = 1;
                }
            } while (!atomicInteger.compareAndSet(i, i2));
            this.b.m(null, Integer.valueOf(i));
        }
        ty3 ty3VarC = ((xie) this.a.getValue()).c();
        Throwable cause2 = th.getCause();
        boolean z2 = th instanceof ExceptionHandler$HandledException;
        if (!z2) {
            cause2 = null;
        }
        if (cause2 == null) {
            cause2 = th;
        }
        ExceptionHandler$HandledException exceptionHandler$HandledException = z2 ? (ExceptionHandler$HandledException) th : null;
        if (exceptionHandler$HandledException == null || (str = exceptionHandler$HandledException.a) == null) {
            Throwable cause3 = th.getCause();
            ExceptionHandler$HandledException exceptionHandler$HandledException2 = cause3 instanceof ExceptionHandler$HandledException ? (ExceptionHandler$HandledException) cause3 : null;
            if (exceptionHandler$HandledException2 != null) {
                str2 = exceptionHandler$HandledException2.a;
            }
        } else {
            str2 = str;
        }
        ty3VarC.a(str2, cause2);
    }
}
