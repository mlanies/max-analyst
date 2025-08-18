package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lqd extends iqd implements erd {
    public static final kqd[] Y = new kqd[0];
    public static final kqd[] Z = new kqd[0];
    public Throwable X;
    public final iqd a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicReference c = new AtomicReference(Y);
    public Object o;

    public lqd(drd drdVar) {
        this.a = drdVar;
    }

    @Override // defpackage.erd
    public final void a(Object obj) {
        this.o = obj;
        for (kqd kqdVar : (kqd[]) this.c.getAndSet(Z)) {
            if (!kqdVar.get()) {
                kqdVar.a.a(obj);
            }
        }
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        kqd kqdVar = new kqd(erdVar, this);
        erdVar.c(kqdVar);
        while (true) {
            AtomicReference atomicReference = this.c;
            kqd[] kqdVarArr = (kqd[]) atomicReference.get();
            if (kqdVarArr == Z) {
                Throwable th = this.X;
                if (th != null) {
                    erdVar.onError(th);
                    return;
                } else {
                    erdVar.a(this.o);
                    return;
                }
            }
            int length = kqdVarArr.length;
            kqd[] kqdVarArr2 = new kqd[length + 1];
            System.arraycopy(kqdVarArr, 0, kqdVarArr2, 0, length);
            kqdVarArr2[length] = kqdVar;
            while (!atomicReference.compareAndSet(kqdVarArr, kqdVarArr2)) {
                if (atomicReference.get() != kqdVarArr) {
                    break;
                }
            }
            if (kqdVar.get()) {
                o(kqdVar);
            }
            if (this.b.getAndIncrement() == 0) {
                this.a.k(this);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(kqd kqdVar) {
        kqd[] kqdVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            kqd[] kqdVarArr2 = (kqd[]) atomicReference.get();
            int length = kqdVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (kqdVarArr2[i] == kqdVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                kqdVarArr = Y;
            } else {
                kqd[] kqdVarArr3 = new kqd[length - 1];
                System.arraycopy(kqdVarArr2, 0, kqdVarArr3, 0, i);
                System.arraycopy(kqdVarArr2, i + 1, kqdVarArr3, i, (length - i) - 1);
                kqdVarArr = kqdVarArr3;
            }
            while (!atomicReference.compareAndSet(kqdVarArr2, kqdVarArr)) {
                if (atomicReference.get() != kqdVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        this.X = th;
        for (kqd kqdVar : (kqd[]) this.c.getAndSet(Z)) {
            if (!kqdVar.get()) {
                kqdVar.a.onError(th);
            }
        }
    }
}
