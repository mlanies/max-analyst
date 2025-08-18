package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class phc extends Thread {
    public final int a;

    public phc(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
