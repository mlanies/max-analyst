package defpackage;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hs5 extends AtomicReference implements xae, Runnable {
    public final vae a;
    public volatile boolean b;

    public hs5(vae vaeVar) {
        this.a = vaeVar;
    }

    @Override // defpackage.xae
    public final void cancel() {
        dm4.a(this);
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            this.b = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != dm4.a) {
            boolean z = this.b;
            iz4 iz4Var = iz4.a;
            if (!z) {
                lazySet(iz4Var);
                this.a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            } else {
                this.a.e(0L);
                lazySet(iz4Var);
                this.a.b();
            }
        }
    }
}
