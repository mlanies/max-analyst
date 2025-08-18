package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t66 implements Callable, kde, b66 {
    public final Object a;

    public t66(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.kde
    public final Object get() {
        return this.a;
    }
}
