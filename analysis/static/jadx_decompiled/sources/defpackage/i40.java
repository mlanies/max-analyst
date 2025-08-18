package defpackage;

import android.os.Process;
import com.google.gson.Gson;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes.dex */
public final /* synthetic */ class i40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ i40(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                return;
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e) {
                    hm9.l0("Fresco", "failed to execute fresco task", e);
                    return;
                } catch (InterruptedException e2) {
                    throw e2;
                }
            case 2:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e3) {
                    hm9.l0("Fresco", "failed to execute fresco task", e3);
                    return;
                } catch (InterruptedException e4) {
                    throw e4;
                }
            case 3:
                try {
                    runnable.run();
                    return;
                } catch (IllegalStateException e5) {
                    hm9.l0("Fresco", "failed to execute fresco task", e5);
                    return;
                } catch (InterruptedException e6) {
                    throw e6;
                }
            case 4:
                Gson gson = RLottieDrawable.gson;
                he.d(runnable);
                return;
            case 5:
                Gson gson2 = RLottieDrawable.gson;
                he.d(runnable);
                return;
            default:
                khe kheVar = hze.a;
                hze.a(runnable);
                return;
        }
    }
}
