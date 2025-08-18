package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zm7 implements g2a {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final py9 b;
    public final Executor c;

    public zm7(Executor executor, py9 py9Var) {
        this.c = executor;
        this.b = py9Var;
    }

    @Override // defpackage.g2a
    public final void a(Object obj) {
        this.c.execute(new vs5(this, 13, (an7) obj));
    }
}
