package defpackage;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class tr5 extends AtomicLong implements gs5, xae {
    public final vae a;
    public xae b;
    public boolean c;

    public tr5(vae vaeVar) {
        this.a = vaeVar;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.b();
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.c) {
            return;
        }
        if (get() != 0) {
            this.a.e(obj);
            ngg.D(this, 1L);
        } else {
            this.b.cancel();
            onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.b, xaeVar)) {
            this.b = xaeVar;
            this.a.f(this);
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this, j);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.c) {
            j47.Z(th);
        } else {
            this.c = true;
            this.a.onError(th);
        }
    }
}
