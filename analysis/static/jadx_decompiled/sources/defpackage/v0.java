package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v0 {
    public static final v0 d = new v0();
    public final Runnable a;
    public final Executor b;
    public v0 c;

    public v0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public v0() {
        this.a = null;
        this.b = null;
    }
}
