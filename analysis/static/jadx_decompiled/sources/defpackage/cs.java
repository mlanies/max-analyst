package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class cs implements Executor {
    public final /* synthetic */ int a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ds.g0().d.e.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }
}
