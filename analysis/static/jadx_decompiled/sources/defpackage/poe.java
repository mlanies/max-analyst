package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class poe {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(poe.class, Object.class, "reader$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(poe.class, "readers$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(poe.class, Object.class, "writer$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(poe.class, Object.class, "exceptionWhenReading$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(poe.class, Object.class, "_value$volatile");
    private volatile /* synthetic */ Object _value$volatile;
    public final String a = "Dispatchers.Main";
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    public poe(cx7 cx7Var) {
        this._value$volatile = cx7Var;
    }

    public final Object a() {
        b.set(this, new Throwable("reader location"));
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        atomicIntegerFieldUpdater.incrementAndGet(this);
        Throwable th = (Throwable) d.get(this);
        if (th != null) {
            e.set(this, new IllegalStateException(zr6.l(new StringBuilder(), this.a, " is used concurrently with setting it"), th));
        }
        Object obj = f.get(this);
        atomicIntegerFieldUpdater.decrementAndGet(this);
        return obj;
    }
}
