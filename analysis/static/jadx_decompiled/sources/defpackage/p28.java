package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p28 extends AtomicReference implements f2a, b38, zl4, erd {
    public final /* synthetic */ int a;
    public final f2a b;
    public final b66 c;

    public /* synthetic */ p28(f2a f2aVar, b66 b66Var, int i) {
        this.a = i;
        this.b = f2aVar;
        this.c = b66Var;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objMo131apply = this.c.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null Publisher");
                    r1a r1aVar = (r1a) objMo131apply;
                    if (!h()) {
                        r1aVar.a(this);
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    this.b.onError(th);
                    return;
                }
                break;
            default:
                try {
                    Object objMo131apply2 = this.c.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply2, "The mapper returned a null Publisher");
                    r1a r1aVar2 = (r1a) objMo131apply2;
                    if (!h()) {
                        r1aVar2.a(this);
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    this.b.onError(th2);
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4Var);
                break;
            default:
                dm4.c(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e(obj);
                break;
            default:
                this.b.e(obj);
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

    @Override // defpackage.f2a
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
