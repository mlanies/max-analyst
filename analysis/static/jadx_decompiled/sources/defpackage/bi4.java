package defpackage;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class bi4 {
    public static final khe c = new khe(new zf3(14));
    public final ThreadLocal a;
    public final Looper b;

    public bi4(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
        this.b = Looper.myLooper();
    }
}
