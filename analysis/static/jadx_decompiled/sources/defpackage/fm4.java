package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fm4 implements Future {
    public final zl4 a;

    public fm4(zl4 zl4Var) {
        this.a = zl4Var;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.g();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
