package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b76 implements bm7 {
    public final bm7 a;
    public lq1 b;

    public b76(bm7 bm7Var) {
        bm7Var.getClass();
        this.a = bm7Var;
    }

    public static b76 a(bm7 bm7Var) {
        return bm7Var instanceof b76 ? (b76) bm7Var : new b76(bm7Var);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public b76() {
        this.a = f8.g(new wd6(16, this));
    }
}
