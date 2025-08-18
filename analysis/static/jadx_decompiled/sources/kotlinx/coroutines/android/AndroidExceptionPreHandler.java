package kotlinx.coroutines.android;

import defpackage.e0;
import defpackage.lx3;
import defpackage.ox3;
import defpackage.qx7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Le0;", "Lox3;", "<init>", "()V", "Llx3;", "context", "", "exception", "Le5f;", "g", "(Llx3;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends e0 implements ox3 {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(qx7.c);
        this._preHandler = this;
    }

    @Override // defpackage.ox3
    public void g(lx3 context, Throwable exception) {
    }
}
