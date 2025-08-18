package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class k40 implements Executor {
    public static volatile k40 c;
    public final /* synthetic */ int a;
    public Object b;

    public k40(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            case 2:
                break;
            default:
                this.b = Executors.newFixedThreadPool(2, new j40(0));
                break;
        }
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                return;
            case 1:
                ((Handler) this.b).post(runnable);
                return;
            case 2:
                ThreadLocal threadLocal = (ThreadLocal) this.b;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        xp0.d.a.execute(runnable);
                    }
                    a();
                    return;
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            default:
                ((Handler) ((bkb) this.b).b).post(runnable);
                return;
        }
    }

    public k40(bkb bkbVar) {
        this.a = 3;
        this.b = bkbVar;
    }
}
