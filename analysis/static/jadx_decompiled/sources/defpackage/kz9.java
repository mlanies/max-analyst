package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kz9 extends uk0 {
    public final Collection Y;
    public final b66 Z;

    public kz9(f2a f2aVar, b66 b66Var, Collection collection) {
        super(f2aVar);
        this.Z = b66Var;
        this.Y = collection;
    }

    @Override // defpackage.uk0, defpackage.f2a
    public final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.b();
    }

    @Override // defpackage.uk0, defpackage.dqd
    public final void clear() {
        this.Y.clear();
        super.clear();
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.o) {
            return;
        }
        int i = this.X;
        f2a f2aVar = this.a;
        if (i != 0) {
            f2aVar.e(null);
            return;
        }
        try {
            Object objMo131apply = this.Z.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The keySelector returned a null key");
            if (this.Y.add(objMo131apply)) {
                f2aVar.e(obj);
            }
        } catch (Throwable th) {
            c37.B(th);
            this.b.g();
            this.onError(th);
        }
    }

    @Override // defpackage.uk0, defpackage.f2a
    public final void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.onError(th);
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Object objPoll;
        Object objMo131apply;
        do {
            objPoll = this.c.poll();
            if (objPoll == null) {
                break;
            }
            objMo131apply = this.Z.mo131apply(objPoll);
            Objects.requireNonNull(objMo131apply, "The keySelector returned a null key");
        } while (!this.Y.add(objMo131apply));
        return objPoll;
    }
}
