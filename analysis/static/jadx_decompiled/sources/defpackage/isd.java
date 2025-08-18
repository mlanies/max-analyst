package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class isd extends AtomicReference implements erd {
    public final hsd a;
    public final int b;

    public isd(hsd hsdVar, int i) {
        this.a = hsdVar;
        this.b = i;
    }

    @Override // defpackage.erd
    public final void a(Object obj) {
        hsd hsdVar = this.a;
        erd erdVar = hsdVar.a;
        Object[] objArr = hsdVar.o;
        if (objArr != null) {
            objArr[this.b] = obj;
        }
        if (hsdVar.decrementAndGet() == 0) {
            try {
                Object objMo131apply = hsdVar.b.mo131apply(objArr);
                Objects.requireNonNull(objMo131apply, "The zipper returned a null value");
                hsdVar.o = null;
                erdVar.a(objMo131apply);
            } catch (Throwable th) {
                c37.B(th);
                hsdVar.o = null;
                erdVar.onError(th);
            }
        }
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        dm4.e(this, zl4Var);
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        this.a.a(th, this.b);
    }
}
