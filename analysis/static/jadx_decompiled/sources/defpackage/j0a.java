package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j0a extends yk0 {
    public boolean X;
    public boolean Y;
    public final f2a a;
    public final Iterator b;
    public volatile boolean c;
    public boolean o;

    public j0a(f2a f2aVar, Iterator it) {
        this.a = f2aVar;
        this.b = it;
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.X = true;
    }

    @Override // defpackage.zl4
    public final void g() {
        this.c = true;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.c;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.X;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        this.o = true;
        return 1;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        if (this.X) {
            return null;
        }
        boolean z = this.Y;
        Iterator it = this.b;
        if (!z) {
            this.Y = true;
        } else if (!it.hasNext()) {
            this.X = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
