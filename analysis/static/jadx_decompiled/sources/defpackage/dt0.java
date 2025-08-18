package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class dt0 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ dt0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.mq1
    public final String q(lq1 lq1Var) {
        switch (this.a) {
            case 0:
                this.b.set(lq1Var);
                return "Data closed";
            case 1:
                this.b.set(new wu1(0, lq1Var));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(lq1Var);
                return "Data closed";
            case 3:
                this.b.set(lq1Var);
                return "acquireInputBuffer";
            case 4:
                this.b.set(lq1Var);
                return "mReleasedFuture";
            default:
                this.b.set(lq1Var);
                return "Terminate InputBuffer";
        }
    }
}
