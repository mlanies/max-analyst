package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ni3 implements c6d {
    public final AtomicReference a;

    public ni3(c6d c6dVar) {
        this.a = new AtomicReference(c6dVar);
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        c6d c6dVar = (c6d) this.a.getAndSet(null);
        if (c6dVar != null) {
            return c6dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
