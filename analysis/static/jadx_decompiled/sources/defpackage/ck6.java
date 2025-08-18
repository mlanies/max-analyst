package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ck6 implements Executor {
    public static volatile ck6 c;
    public final /* synthetic */ int a;
    public final Object b;

    public ck6(Looper looper) {
        this.a = 1;
        this.b = new fc9(looper, 5);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            default:
                ((fc9) this.b).post(runnable);
                break;
        }
    }

    public ck6() {
        this.a = 0;
        this.b = Executors.newSingleThreadExecutor(new bk6());
    }
}
