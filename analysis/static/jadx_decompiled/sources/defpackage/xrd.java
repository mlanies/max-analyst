package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xrd extends iqd implements erd {
    public static final wrd[] X = new wrd[0];
    public static final wrd[] Y = new wrd[0];
    public Object c;
    public Throwable o;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference a = new AtomicReference(X);

    @Override // defpackage.erd
    public final void a(Object obj) {
        q45.c(obj, "onSuccess called with a null value.");
        if (this.b.compareAndSet(false, true)) {
            this.c = obj;
            for (wrd wrdVar : (wrd[]) this.a.getAndSet(Y)) {
                wrdVar.a.a(obj);
            }
        }
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        if (this.a.get() == Y) {
            zl4Var.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        wrd wrdVar = new wrd(erdVar, this);
        erdVar.c(wrdVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            wrd[] wrdVarArr = (wrd[]) atomicReference.get();
            if (wrdVarArr == Y) {
                Throwable th = this.o;
                if (th != null) {
                    erdVar.onError(th);
                    return;
                } else {
                    erdVar.a(this.c);
                    return;
                }
            }
            int length = wrdVarArr.length;
            wrd[] wrdVarArr2 = new wrd[length + 1];
            System.arraycopy(wrdVarArr, 0, wrdVarArr2, 0, length);
            wrdVarArr2[length] = wrdVar;
            while (!atomicReference.compareAndSet(wrdVarArr, wrdVarArr2)) {
                if (atomicReference.get() != wrdVarArr) {
                    break;
                }
            }
            if (wrdVar.h()) {
                o(wrdVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(wrd wrdVar) {
        wrd[] wrdVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            wrd[] wrdVarArr2 = (wrd[]) atomicReference.get();
            int length = wrdVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (wrdVarArr2[i] == wrdVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                wrdVarArr = X;
            } else {
                wrd[] wrdVarArr3 = new wrd[length - 1];
                System.arraycopy(wrdVarArr2, 0, wrdVarArr3, 0, i);
                System.arraycopy(wrdVarArr2, i + 1, wrdVarArr3, i, (length - i) - 1);
                wrdVarArr = wrdVarArr3;
            }
            while (!atomicReference.compareAndSet(wrdVarArr2, wrdVarArr)) {
                if (atomicReference.get() != wrdVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        if (!this.b.compareAndSet(false, true)) {
            j47.Z(th);
            return;
        }
        this.o = th;
        for (wrd wrdVar : (wrd[]) this.a.getAndSet(Y)) {
            wrdVar.a.onError(th);
        }
    }
}
