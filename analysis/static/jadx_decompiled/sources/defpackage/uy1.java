package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class uy1 extends AtomicReference implements zl4, ab3 {
    public final /* synthetic */ int a;

    public /* synthetic */ uy1(int i) {
        this.a = i;
    }

    @Override // defpackage.ab3
    public void b() {
        lazySet(dm4.a);
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        dm4.e(this, zl4Var);
    }

    @Override // defpackage.zl4
    public final void g() {
        tpc tpcVar;
        switch (this.a) {
            case 0:
                if (get() != null && (tpcVar = (tpc) getAndSet(null)) != null) {
                    try {
                        tpcVar.a.cancel(null);
                        break;
                    } catch (Throwable th) {
                        c37.B(th);
                        j47.Z(th);
                        return;
                    }
                }
                break;
            case 1:
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
            case 0:
                return get() == null;
            case 1:
                return get() == dm4.a;
            default:
                return dm4.b((zl4) get());
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void onError(Throwable th) {
        lazySet(dm4.a);
        j47.Z(new OnErrorNotImplementedException(th));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy1(Object obj) {
        super(obj);
        this.a = 0;
    }

    public uy1(uy1 uy1Var) {
        this.a = 2;
        lazySet(uy1Var);
    }
}
