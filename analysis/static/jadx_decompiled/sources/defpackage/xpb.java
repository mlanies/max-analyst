package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xpb extends vg3 {
    public static final wpb[] c = new wpb[0];
    public static final wpb[] o = new wpb[0];
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;

    @Override // defpackage.f2a
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        wpb[] wpbVarArr = (wpb[]) atomicReference.getAndSet(obj2);
        for (wpb wpbVar : wpbVarArr) {
            if (!wpbVar.get()) {
                wpbVar.a.b();
            }
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (this.a.get() == c) {
            zl4Var.g();
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        for (wpb wpbVar : (wpb[]) this.a.get()) {
            if (!wpbVar.get()) {
                wpbVar.a.e(obj);
            }
        }
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            j47.Z(th);
            return;
        }
        this.b = th;
        for (wpb wpbVar : (wpb[]) atomicReference.getAndSet(obj2)) {
            if (wpbVar.get()) {
                j47.Z(th);
            } else {
                wpbVar.a.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        wpb wpbVar = new wpb(f2aVar, this);
        f2aVar.c(wpbVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            wpb[] wpbVarArr = (wpb[]) atomicReference.get();
            if (wpbVarArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    f2aVar.onError(th);
                    return;
                } else {
                    f2aVar.b();
                    return;
                }
            }
            int length = wpbVarArr.length;
            wpb[] wpbVarArr2 = new wpb[length + 1];
            System.arraycopy(wpbVarArr, 0, wpbVarArr2, 0, length);
            wpbVarArr2[length] = wpbVar;
            while (!atomicReference.compareAndSet(wpbVarArr, wpbVarArr2)) {
                if (atomicReference.get() != wpbVarArr) {
                    break;
                }
            }
            if (wpbVar.get()) {
                z(wpbVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(wpb wpbVar) {
        wpb[] wpbVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            wpb[] wpbVarArr2 = (wpb[]) atomicReference.get();
            if (wpbVarArr2 == c || wpbVarArr2 == (wpbVarArr = o)) {
                return;
            }
            int length = wpbVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (wpbVarArr2[i] == wpbVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                wpbVarArr = new wpb[length - 1];
                System.arraycopy(wpbVarArr2, 0, wpbVarArr, 0, i);
                System.arraycopy(wpbVarArr2, i + 1, wpbVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(wpbVarArr2, wpbVarArr)) {
                if (atomicReference.get() != wpbVarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
