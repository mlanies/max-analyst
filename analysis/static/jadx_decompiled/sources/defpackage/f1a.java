package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f1a extends AtomicReference implements c1a {
    public b1a a;
    public int b;
    public final boolean c = false;
    public final int o;

    public f1a() {
        b1a b1aVar = new b1a(null);
        this.a = b1aVar;
        set(b1aVar);
        this.o = 1;
    }

    @Override // defpackage.c1a
    public final void a() {
        b1a b1aVar = new b1a(hv9.a);
        this.a.set(b1aVar);
        this.a = b1aVar;
        this.b++;
        b1a b1aVar2 = (b1a) get();
        if (b1aVar2.a != null) {
            b1a b1aVar3 = new b1a(null);
            b1aVar3.lazySet(b1aVar2.get());
            set(b1aVar3);
        }
    }

    @Override // defpackage.c1a
    public final void b(Object obj) {
        b1a b1aVar = new b1a(obj);
        this.a.set(b1aVar);
        this.a = b1aVar;
        int i = this.b + 1;
        this.b = i;
        if (i > this.o) {
            b1a b1aVar2 = (b1a) ((b1a) get()).get();
            this.b--;
            if (this.c) {
                b1a b1aVar3 = new b1a(null);
                b1aVar3.lazySet(b1aVar2.get());
                b1aVar2 = b1aVar3;
            }
            set(b1aVar2);
        }
    }

    @Override // defpackage.c1a
    public final void c(a1a a1aVar) {
        if (a1aVar.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            b1a b1aVar = (b1a) a1aVar.c;
            if (b1aVar == null) {
                b1aVar = (b1a) get();
                a1aVar.c = b1aVar;
            }
            while (!a1aVar.o) {
                b1a b1aVar2 = (b1a) b1aVar.get();
                if (b1aVar2 != null) {
                    if (hv9.a(a1aVar.b, b1aVar2.a)) {
                        a1aVar.c = null;
                        return;
                    }
                    b1aVar = b1aVar2;
                } else {
                    a1aVar.c = b1aVar;
                    iAddAndGet = a1aVar.addAndGet(-iAddAndGet);
                }
            }
            a1aVar.c = null;
            return;
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.c1a
    public final void d(Throwable th) {
        b1a b1aVar = new b1a(new fv9(th));
        this.a.set(b1aVar);
        this.a = b1aVar;
        this.b++;
        b1a b1aVar2 = (b1a) get();
        if (b1aVar2.a != null) {
            b1a b1aVar3 = new b1a(null);
            b1aVar3.lazySet(b1aVar2.get());
            set(b1aVar3);
        }
    }
}
