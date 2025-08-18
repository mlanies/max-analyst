package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class kme {
    public static final jme b = new jme();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
