package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class ea5 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ ea5(fa5 fa5Var, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = fa5Var;
        this.c = countDownLatch;
    }

    @Override // defpackage.xff
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C(this.c);
                break;
            default:
                this.b.C(this.c);
                break;
        }
    }
}
