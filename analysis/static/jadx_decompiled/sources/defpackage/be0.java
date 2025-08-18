package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class be0 extends k87 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(be0.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final ry1 b;
    public cm4 c;
    public final /* synthetic */ de0 o;

    public be0(de0 de0Var, sy1 sy1Var) {
        this.o = de0Var;
        this.b = sy1Var;
    }

    @Override // defpackage.k87
    public final boolean c() {
        return false;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        ry1 ry1Var = this.b;
        if (th != null) {
            Symbol symbolJ = ry1Var.j(th);
            if (symbolJ != null) {
                ry1Var.q(symbolJ);
                ce0 ce0Var = (ce0) X.get(this);
                if (ce0Var != null) {
                    ce0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = de0.b;
        de0 de0Var = this.o;
        if (atomicIntegerFieldUpdater.decrementAndGet(de0Var) == 0) {
            yf4[] yf4VarArr = de0Var.a;
            ArrayList arrayList = new ArrayList(yf4VarArr.length);
            for (yf4 yf4Var : yf4VarArr) {
                arrayList.add(yf4Var.m());
            }
            ry1Var.resumeWith(arrayList);
        }
    }
}
