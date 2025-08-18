package kotlinx.coroutines.internal;

import defpackage.d0;
import defpackage.lx3;
import defpackage.ux3;
import defpackage.v3c;
import defpackage.z7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0019\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Ld0;", "Lux3;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Llx3;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Llx3;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "state", "Le5f;", "afterCompletion", "(Ljava/lang/Object;)V", "afterResume", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lux3;", "callerFrame", "", "isScopedCoroutine", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public class ScopeCoroutine<T> extends d0 implements ux3 {
    public final Continuation<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(lx3 lx3Var, Continuation<? super T> continuation) {
        super(lx3Var, true, true);
        this.uCont = continuation;
    }

    @Override // defpackage.z87
    public void afterCompletion(Object state) {
        DispatchedContinuationKt.resumeCancellableWith$default(v3c.u(this.uCont), z7.M(state), null, 2, null);
    }

    @Override // defpackage.z87
    public void afterResume(Object state) {
        this.uCont.resumeWith(z7.M(state));
    }

    @Override // defpackage.ux3
    public final ux3 getCallerFrame() {
        Continuation<T> continuation = this.uCont;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // defpackage.ux3
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.z87
    public final boolean isScopedCoroutine() {
        return true;
    }
}
