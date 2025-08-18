package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class e76 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledFuture b;

    public /* synthetic */ e76(ScheduledFuture scheduledFuture, int i) {
        this.a = i;
        this.b = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel(true);
                break;
            default:
                this.b.cancel(true);
                break;
        }
    }
}
