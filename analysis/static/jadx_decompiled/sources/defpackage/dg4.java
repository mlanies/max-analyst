package defpackage;

/* loaded from: classes.dex */
public abstract class dg4 extends wk0 {
    public final vae a;
    public Object b;

    public dg4(vae vaeVar) {
        this.a = vaeVar;
    }

    public void a(Object obj) {
        g(obj);
    }

    @Override // defpackage.dqd
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void g(Object obj) {
        int i = get();
        do {
            vae vaeVar = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                vaeVar.e(null);
                if (get() != 4) {
                    vaeVar.b();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                vaeVar.e(obj);
                if (get() != 4) {
                    vaeVar.b();
                    return;
                }
                return;
            }
            this.b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.b = null;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        Object obj;
        if (zae.d(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    vae vaeVar = this.a;
                    vaeVar.e(obj);
                    if (get() != 4) {
                        vaeVar.b();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
