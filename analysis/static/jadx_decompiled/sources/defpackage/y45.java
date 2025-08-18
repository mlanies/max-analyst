package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class y45 extends nx3 implements Closeable, AutoCloseable {
    static {
        mx3 mx3Var = nx3.Key;
        if (mx3Var instanceof mx3) {
            kx3 kx3Var = mx3Var.b;
        }
    }

    public abstract Executor n();
}
