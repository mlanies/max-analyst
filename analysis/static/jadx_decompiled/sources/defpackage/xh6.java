package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class xh6 {
    private static volatile Choreographer choreographer;

    static {
        Object njcVar;
        try {
            njcVar = new wh6(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
    }

    public static final Handler a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
    }
}
