package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pu1 implements ov1 {
    public final Executor a;
    public final su1 b;
    public final int c;

    public pu1(su1 su1Var, Executor executor, int i) {
        this.b = su1Var;
        this.a = executor;
        this.c = i;
    }

    @Override // defpackage.ov1
    public final bm7 a() {
        b76 b76VarA = b76.a(this.b.a(this.c));
        mu1 mu1Var = new mu1(1);
        b76VarA.getClass();
        return kq0.K(b76VarA, new re6(15, mu1Var), this.a);
    }

    @Override // defpackage.ov1
    public final bm7 b() {
        return f8.g(new ync(25, this));
    }
}
