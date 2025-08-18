package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class wc3 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ di6 b;

    public /* synthetic */ wc3(di6 di6Var, int i) {
        this.a = i;
        this.b = di6Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        ((bie) this.b).d(runnable);
    }
}
