package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class a84 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ a84(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                break;
            default:
                oaf.W(this.b, runnable);
                break;
        }
    }
}
