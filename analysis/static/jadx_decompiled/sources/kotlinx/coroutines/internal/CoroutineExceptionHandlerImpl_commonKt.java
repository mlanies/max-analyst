package kotlinx.coroutines.internal;

import defpackage.j47;
import defpackage.lx3;
import defpackage.ox3;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx3;", "context", "", "exception", "Le5f;", "handleUncaughtCoroutineException", "(Llx3;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(lx3 lx3Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable runtimeException;
        Iterator<ox3> it = CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().g(lx3Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    j47.e(runtimeException, th);
                }
                CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(runtimeException);
            }
        }
        try {
            j47.e(th, new DiagnosticCoroutineContextException(lx3Var));
        } catch (Throwable unused2) {
        }
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th);
    }
}
