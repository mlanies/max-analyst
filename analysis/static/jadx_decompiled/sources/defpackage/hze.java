package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class hze {
    public static final khe a = new khe(h8.Z);
    public static final khe b = new khe(h8.Y);

    public static void a(Runnable runnable) {
        ((Executor) b.getValue()).execute(runnable);
    }

    public static void b(Runnable runnable) {
        ((Executor) a.getValue()).execute(runnable);
    }
}
