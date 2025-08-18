package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i3 {
    public static final i3 d = new i3(null, null);
    public final Runnable a;
    public final Executor b;
    public i3 c;

    public i3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
