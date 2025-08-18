package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class bs5 extends dg4 implements gs5 {
    public xae X;
    public boolean Y;
    public final Object c;
    public final boolean o;

    public bs5(vae vaeVar, Object obj, boolean z) {
        super(vaeVar);
        this.c = obj;
        this.o = z;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        Object obj = this.b;
        this.b = null;
        if (obj == null) {
            obj = this.c;
        }
        if (obj != null) {
            g(obj);
            return;
        }
        boolean z = this.o;
        vae vaeVar = this.a;
        if (z) {
            vaeVar.onError(new NoSuchElementException());
        } else {
            vaeVar.b();
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        set(4);
        this.b = null;
        this.X.cancel();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.Y) {
            return;
        }
        if (this.b == null) {
            this.b = obj;
            return;
        }
        this.Y = true;
        this.X.cancel();
        this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.X, xaeVar)) {
            this.X = xaeVar;
            this.a.f(this);
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.Y) {
            j47.Z(th);
        } else {
            this.Y = true;
            this.a.onError(th);
        }
    }
}
