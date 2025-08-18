package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class be {
    public static final ci6 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        ztc ztcVar = ce.a;
        a = new ci6(new Handler(mainLooper));
    }
}
