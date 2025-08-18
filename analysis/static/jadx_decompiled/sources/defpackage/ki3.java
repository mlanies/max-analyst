package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ki3 implements ry9 {
    public static final ki3 b = new ki3(null);
    public final dw6 a;

    public ki3(Object obj) {
        this.a = kq0.r(obj);
    }

    @Override // defpackage.ry9
    public final void f(Executor executor, py9 py9Var) {
        this.a.d(new wt1(this, 11, py9Var), executor);
    }

    @Override // defpackage.ry9
    public final bm7 j() {
        return this.a;
    }

    @Override // defpackage.ry9
    public final void l(py9 py9Var) {
    }
}
