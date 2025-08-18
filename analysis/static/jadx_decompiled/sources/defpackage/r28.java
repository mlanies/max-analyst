package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r28 extends AtomicReference implements b38, zl4, erd {
    public final /* synthetic */ int a;
    public final b38 b;
    public final b66 c;

    public /* synthetic */ r28(b38 b38Var, b66 b66Var, int i) {
        this.a = i;
        this.b = b38Var;
        this.c = b66Var;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objMo131apply = this.c.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null SingleSource");
                    iqd iqdVar = (iqd) objMo131apply;
                    if (!h()) {
                        iqdVar.k(new va8(this, 23, this.b));
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    onError(th);
                    return;
                }
                break;
            default:
                try {
                    Object objMo131apply2 = this.c.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply2, "The mapper returned a null MaybeSource");
                    f38 f38Var = (f38) objMo131apply2;
                    if (!h()) {
                        f38Var.a(new g38(this, this.b));
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    onError(th2);
                }
                break;
        }
    }

    @Override // defpackage.b38, defpackage.ab3
    public void b() {
        this.b.b();
    }

    @Override // defpackage.b38, defpackage.erd
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

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                break;
            default:
                this.b.onError(th);
                break;
        }
    }
}
