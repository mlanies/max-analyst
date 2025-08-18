package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class rhe {
    public static final rhe a = new rhe();

    public final aie a(Looper looper, Handler.Callback callback) {
        return new aie(new Handler(looper, callback));
    }
}
