package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ok4 implements Executor {
    public static volatile ok4 b;
    public final /* synthetic */ int a;
    public static final /* synthetic */ ok4 c = new ok4(1);
    public static final /* synthetic */ ok4 o = new ok4(2);
    public static final /* synthetic */ ok4 X = new ok4(6);

    public /* synthetic */ ok4(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 4:
                new Thread(runnable).start();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
