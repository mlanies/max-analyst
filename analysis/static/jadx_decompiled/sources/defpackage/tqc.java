package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class tqc implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ tqc(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    break;
                } catch (Exception unused) {
                    j1e.u("Executor");
                    return;
                }
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
