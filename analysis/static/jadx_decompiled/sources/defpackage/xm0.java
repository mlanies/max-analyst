package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xm0 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public /* synthetic */ xm0(Handler handler) {
        this.a = 1;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                break;
            default:
                this.b.post(runnable);
                break;
        }
    }

    public xm0() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }
}
