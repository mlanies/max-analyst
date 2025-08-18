package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class q67 implements Executor {
    public static volatile q67 c;
    public final /* synthetic */ int a;
    public final Object b;

    public q67(ExecutorService executorService) {
        this.a = 2;
        this.b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                ((Executor) this.b).execute(new tqc(runnable, 0));
                break;
            default:
                ((fc9) this.b).post(runnable);
                break;
        }
    }

    public q67(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            case 2:
            default:
                this.b = Executors.newFixedThreadPool(2, new j40(3));
                break;
            case 3:
                fc9 fc9Var = new fc9(Looper.getMainLooper(), 3, false);
                Looper.getMainLooper();
                this.b = fc9Var;
                break;
        }
    }
}
