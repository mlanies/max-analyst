package defpackage;

import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class zba implements ir6 {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    @Override // defpackage.ir6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ir6
    public final void d(us7 us7Var, String str, String str2, Throwable th) {
        String strValueOf;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
        Thread threadCurrentThread = Thread.currentThread();
        if (((Looper) rse.a.getValue()).isCurrentThread()) {
            strValueOf = "ui";
        } else {
            String name = threadCurrentThread.getName();
            strValueOf = (name == null || name.length() == 0) ? String.valueOf(threadCurrentThread.getId()) : threadCurrentThread.getName();
        }
        concurrentLinkedQueue.add(new os7(us7Var, str, str2, strValueOf, th));
    }
}
