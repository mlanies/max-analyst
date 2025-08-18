package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r35 implements wae, zpb {
    public final HashMap a;
    public ArrayDeque b;
    public final Executor c;

    public r35() {
        s4f s4fVar = s4f.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = s4fVar;
    }

    public final void a(av1 av1Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(i24.class)) {
                    this.a.put(i24.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(i24.class)).put(av1Var, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
