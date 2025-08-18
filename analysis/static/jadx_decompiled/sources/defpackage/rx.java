package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rx extends vg3 {
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;
    public Object c;
    public static final qx[] o = new qx[0];
    public static final qx[] X = new qx[0];

    @Override // defpackage.f2a
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = X;
        if (obj == obj2) {
            return;
        }
        Object obj3 = this.c;
        qx[] qxVarArr = (qx[]) atomicReference.getAndSet(obj2);
        int i = 0;
        if (obj3 != null) {
            int length = qxVarArr.length;
            while (i < length) {
                qxVarArr[i].f(obj3);
                i++;
            }
            return;
        }
        int length2 = qxVarArr.length;
        while (i < length2) {
            qx qxVar = qxVarArr[i];
            if (!qxVar.h()) {
                qxVar.a.b();
            }
            i++;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (this.a.get() == X) {
            zl4Var.g();
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        if (this.a.get() == X) {
            return;
        }
        this.c = obj;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = X;
        if (obj == obj2) {
            j47.Z(th);
            return;
        }
        this.c = null;
        this.b = th;
        for (qx qxVar : (qx[]) atomicReference.getAndSet(obj2)) {
            if (qxVar.h()) {
                j47.Z(th);
            } else {
                qxVar.a.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        qx qxVar = new qx(f2aVar, this);
        f2aVar.c(qxVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            qx[] qxVarArr = (qx[]) atomicReference.get();
            if (qxVarArr != X) {
                int length = qxVarArr.length;
                qx[] qxVarArr2 = new qx[length + 1];
                System.arraycopy(qxVarArr, 0, qxVarArr2, 0, length);
                qxVarArr2[length] = qxVar;
                while (!atomicReference.compareAndSet(qxVarArr, qxVarArr2)) {
                    if (atomicReference.get() != qxVarArr) {
                        break;
                    }
                }
                if (qxVar.h()) {
                    z(qxVar);
                    return;
                }
                return;
            }
            Throwable th = this.b;
            if (th != null) {
                f2aVar.onError(th);
                return;
            }
            Object obj = this.c;
            if (obj != null) {
                qxVar.f(obj);
                return;
            } else {
                if (qxVar.h()) {
                    return;
                }
                qxVar.a.b();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(qx qxVar) {
        qx[] qxVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            qx[] qxVarArr2 = (qx[]) atomicReference.get();
            int length = qxVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qxVarArr2[i] == qxVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qxVarArr = o;
            } else {
                qx[] qxVarArr3 = new qx[length - 1];
                System.arraycopy(qxVarArr2, 0, qxVarArr3, 0, i);
                System.arraycopy(qxVarArr2, i + 1, qxVarArr3, i, (length - i) - 1);
                qxVarArr = qxVarArr3;
            }
            while (!atomicReference.compareAndSet(qxVarArr2, qxVarArr)) {
                if (atomicReference.get() != qxVarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
