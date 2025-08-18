package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class tqd extends AtomicReference implements erd, zl4 {
    public final /* synthetic */ int a;
    public final erd b;
    public final b66 c;

    public /* synthetic */ tqd(int i, b66 b66Var, erd erdVar) {
        this.a = i;
        this.b = erdVar;
        this.c = b66Var;
    }

    @Override // defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                erd erdVar = this.b;
                try {
                    Object objMo131apply = this.c.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The single returned by the mapper is null");
                    iqd iqdVar = (iqd) objMo131apply;
                    if (!h()) {
                        iqdVar.k(new aab(this, erdVar));
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    erdVar.onError(th);
                    return;
                }
                break;
            default:
                this.b.a(obj);
                break;
        }
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4Var)) {
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.e(this, zl4Var)) {
                    this.b.c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                break;
            default:
                erd erdVar = this.b;
                try {
                    Object objMo131apply = this.c.mo131apply(th);
                    Objects.requireNonNull(objMo131apply, "The nextFunction returned a null SingleSource.");
                    ((iqd) objMo131apply).k(new wva(this, 4, erdVar));
                    break;
                } catch (Throwable th2) {
                    c37.B(th2);
                    erdVar.onError(new CompositeException(th, th2));
                }
        }
    }
}
