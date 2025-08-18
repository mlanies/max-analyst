package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class tx extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ tx(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        wx wxVarE;
        switch (this.a) {
            case 0:
                break;
            case 1:
            default:
                super.run();
                return;
            case 2:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                synchronized (wx.class) {
                    wx wxVar = wx.j;
                    wxVarE = hm9.e();
                    if (wxVarE == wx.j) {
                        wx.j = null;
                        return;
                    }
                }
                if (wxVarE != null) {
                    wxVarE.l();
                }
            } catch (InterruptedException unused2) {
                continue;
            }
        }
    }

    public /* synthetic */ tx(String str, Runnable runnable) {
        super(runnable, str);
    }

    public /* synthetic */ tx(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
