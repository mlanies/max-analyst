package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fb3 extends pa3 implements ab3 {
    public Throwable c;
    public static final eb3[] o = new eb3[0];
    public static final eb3[] X = new eb3[0];
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference a = new AtomicReference(o);

    @Override // defpackage.ab3
    public final void b() {
        if (this.b.compareAndSet(false, true)) {
            for (eb3 eb3Var : (eb3[]) this.a.getAndSet(X)) {
                eb3Var.a.b();
            }
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        if (this.a.get() == X) {
            zl4Var.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        eb3 eb3Var = new eb3(ab3Var, this);
        ab3Var.c(eb3Var);
        while (true) {
            AtomicReference atomicReference = this.a;
            eb3[] eb3VarArr = (eb3[]) atomicReference.get();
            if (eb3VarArr == X) {
                Throwable th = this.c;
                if (th != null) {
                    ab3Var.onError(th);
                    return;
                } else {
                    ab3Var.b();
                    return;
                }
            }
            int length = eb3VarArr.length;
            eb3[] eb3VarArr2 = new eb3[length + 1];
            System.arraycopy(eb3VarArr, 0, eb3VarArr2, 0, length);
            eb3VarArr2[length] = eb3Var;
            while (!atomicReference.compareAndSet(eb3VarArr, eb3VarArr2)) {
                if (atomicReference.get() != eb3VarArr) {
                    break;
                }
            }
            if (eb3Var.h()) {
                m(eb3Var);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(eb3 eb3Var) {
        eb3[] eb3VarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            eb3[] eb3VarArr2 = (eb3[]) atomicReference.get();
            int length = eb3VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (eb3VarArr2[i] == eb3Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                eb3VarArr = o;
            } else {
                eb3[] eb3VarArr3 = new eb3[length - 1];
                System.arraycopy(eb3VarArr2, 0, eb3VarArr3, 0, i);
                System.arraycopy(eb3VarArr2, i + 1, eb3VarArr3, i, (length - i) - 1);
                eb3VarArr = eb3VarArr3;
            }
            while (!atomicReference.compareAndSet(eb3VarArr2, eb3VarArr)) {
                if (atomicReference.get() != eb3VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        if (!this.b.compareAndSet(false, true)) {
            j47.Z(th);
            return;
        }
        this.c = th;
        for (eb3 eb3Var : (eb3[]) this.a.getAndSet(X)) {
            eb3Var.a.onError(th);
        }
    }
}
