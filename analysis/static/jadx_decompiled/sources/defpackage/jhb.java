package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class jhb {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new eg(1, runnable));
    }
}
