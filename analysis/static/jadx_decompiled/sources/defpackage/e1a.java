package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e1a implements r1a {
    public final AtomicReference a;
    public final z0a b;

    public e1a(AtomicReference atomicReference, z0a z0aVar) {
        this.a = atomicReference;
        this.b = z0aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r1a
    public final void a(f2a f2aVar) {
        d1a d1aVar;
        loop0: while (true) {
            d1aVar = (d1a) this.a.get();
            if (d1aVar != null) {
                break;
            }
            d1a d1aVar2 = new d1a(this.b.call(), this.a);
            AtomicReference atomicReference = this.a;
            while (!atomicReference.compareAndSet(null, d1aVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            d1aVar = d1aVar2;
            break loop0;
        }
        a1a a1aVar = new a1a(d1aVar, f2aVar);
        f2aVar.c(a1aVar);
        loop2: while (true) {
            AtomicReference atomicReference2 = d1aVar.c;
            a1a[] a1aVarArr = (a1a[]) atomicReference2.get();
            if (a1aVarArr != d1a.Z) {
                int length = a1aVarArr.length;
                a1a[] a1aVarArr2 = new a1a[length + 1];
                System.arraycopy(a1aVarArr, 0, a1aVarArr2, 0, length);
                a1aVarArr2[length] = a1aVar;
                while (!atomicReference2.compareAndSet(a1aVarArr, a1aVarArr2)) {
                    if (atomicReference2.get() != a1aVarArr) {
                        break;
                    }
                }
                break loop2;
            }
            break;
        }
        if (a1aVar.o) {
            d1aVar.a(a1aVar);
        } else {
            d1aVar.a.c(a1aVar);
        }
    }
}
