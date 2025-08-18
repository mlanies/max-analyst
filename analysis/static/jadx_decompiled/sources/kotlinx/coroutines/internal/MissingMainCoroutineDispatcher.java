package kotlinx.coroutines.internal;

import defpackage.c37;
import defpackage.cm4;
import defpackage.cx7;
import defpackage.e5f;
import defpackage.hg4;
import defpackage.lx3;
import defpackage.nx3;
import defpackage.rh4;
import defpackage.ry1;
import defpackage.z84;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010,\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lcx7;", "Lhg4;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "missing", "()Ljava/lang/Void;", "Llx3;", "context", "", "isDispatchNeeded", "(Llx3;)Z", "", "parallelism", "name", "Lnx3;", "limitedParallelism", "(ILjava/lang/String;)Lnx3;", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcm4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Llx3;)Lcm4;", "dispatch", "(Llx3;Ljava/lang/Runnable;)Ljava/lang/Void;", "Lry1;", "Le5f;", "continuation", "scheduleResumeAfterDelay", "(JLry1;)Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "Ljava/lang/String;", "getImmediate", "()Lcx7;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class MissingMainCoroutineDispatcher extends cx7 implements hg4 {
    private final Throwable cause;
    private final String errorHint;

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    private final Void missing() {
        String strConcat;
        if (this.cause == null) {
            MainDispatchersKt.throwMissingMainDispatcherException();
            throw new KotlinNothingValueException();
        }
        String str = this.errorHint;
        if (str == null || (strConcat = ". ".concat(str)) == null) {
            strConcat = "";
        }
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(strConcat), this.cause);
    }

    @Override // defpackage.hg4
    public Object delay(long j, Continuation<? super e5f> continuation) {
        return c37.j(this, j, continuation);
    }

    @Override // defpackage.cx7
    public cx7 getImmediate() {
        return this;
    }

    @Override // defpackage.hg4
    public cm4 invokeOnTimeout(long timeMillis, Runnable block, lx3 context) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.nx3
    public boolean isDispatchNeeded(lx3 context) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.cx7, defpackage.nx3
    public nx3 limitedParallelism(int parallelism, String name) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.cx7, defpackage.nx3
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        return rh4.m(sb, str, ']');
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo20dispatch(lx3 context, Runnable block) {
        missing();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay, reason: merged with bridge method [inline-methods] */
    public Void mo21scheduleResumeAfterDelay(long timeMillis, ry1 continuation) {
        missing();
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i, z84 z84Var) {
        this(th, (i & 2) != 0 ? null : str);
    }
}
