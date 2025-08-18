package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class qhc implements ThreadFactory {
    public String a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new phc(runnable, this.a, this.b);
    }
}
