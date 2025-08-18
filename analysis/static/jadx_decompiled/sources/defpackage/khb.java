package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class khb {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
