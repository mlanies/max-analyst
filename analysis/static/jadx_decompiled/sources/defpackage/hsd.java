package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hsd extends AtomicInteger implements zl4 {
    public final erd a;
    public final b66 b;
    public final isd[] c;
    public Object[] o;

    public hsd(int i, b66 b66Var, erd erdVar) {
        super(i);
        this.a = erdVar;
        this.b = b66Var;
        isd[] isdVarArr = new isd[i];
        for (int i2 = 0; i2 < i; i2++) {
            isdVarArr[i2] = new isd(this, i2);
        }
        this.c = isdVarArr;
        this.o = new Object[i];
    }

    public final void a(Throwable th, int i) {
        if (getAndSet(0) <= 0) {
            j47.Z(th);
            return;
        }
        isd[] isdVarArr = this.c;
        int length = isdVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            isd isdVar = isdVarArr[i2];
            isdVar.getClass();
            dm4.a(isdVar);
        }
        while (true) {
            i++;
            if (i >= length) {
                this.o = null;
                this.a.onError(th);
                return;
            } else {
                isd isdVar2 = isdVarArr[i];
                isdVar2.getClass();
                dm4.a(isdVar2);
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        if (getAndSet(0) > 0) {
            for (isd isdVar : this.c) {
                isdVar.getClass();
                dm4.a(isdVar);
            }
            this.o = null;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() <= 0;
    }
}
