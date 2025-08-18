package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ra3 extends AtomicReference implements va3, zl4, f2a, ab3 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ra3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(Throwable th) {
        zl4 zl4Var;
        if (th == null) {
            th = q45.b("onError called with a null Throwable.");
        }
        Object obj = get();
        dm4 dm4Var = dm4.a;
        if (obj == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
            return false;
        }
        try {
            ((ab3) this.b).onError(th);
        } finally {
            if (zl4Var != null) {
                zl4Var.g();
            }
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        zl4 zl4Var;
        switch (this.a) {
            case 0:
                Object obj = get();
                dm4 dm4Var = dm4.a;
                if (obj == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
                    return;
                }
                try {
                    ((ab3) this.b).b();
                    if (zl4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (zl4Var != null) {
                        zl4Var.g();
                    }
                }
            case 1:
                ((Queue) this.b).offer(hv9.a);
                return;
            default:
                b0a b0aVar = (b0a) this.b;
                b0aVar.X.c(this);
                b0aVar.b();
                return;
        }
    }

    @Override // defpackage.f2a
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 1:
                dm4.e(this, zl4Var);
                break;
            default:
                dm4.e(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        ((Queue) this.b).offer(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            case 1:
                if (dm4.a(this)) {
                    ((Queue) this.b).offer(c);
                    break;
                }
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
            case 1:
                if (get() == dm4.a) {
                }
                break;
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.f2a
    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                ((Queue) this.b).offer(new fv9(th));
                break;
            default:
                b0a b0aVar = (b0a) this.b;
                b0aVar.X.c(this);
                b0aVar.onError(th);
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return ra3.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public ra3(b0a b0aVar) {
        this.a = 2;
        this.b = b0aVar;
    }
}
