package defpackage;

import android.os.Process;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class grf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hrf b;

    public /* synthetic */ grf(hrf hrfVar, int i) {
        this.a = i;
        this.b = hrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(10);
                    synchronized (this.b.b) {
                        hrf hrfVar = this.b;
                        j3g j3gVar = hrfVar.c;
                        if (j3gVar != null) {
                            b9b b9bVar = hrfVar.q;
                            mhc mhcVar = ((m8c) j3gVar).r;
                            b9bVar.getClass();
                            String string = mhcVar.toString();
                            if (((b4c) b9bVar.c).shouldHideSensitiveInformation()) {
                                string = c37.m(string);
                            }
                            ((a4c) b9bVar.b).log("OKWSSignaling", "May be ERROR, socket is already with " + string);
                        }
                        hrf hrfVar2 = this.b;
                        b9b b9bVar2 = hrfVar2.q;
                        String strM = hrfVar2.h;
                        if (((b4c) b9bVar2.c).shouldHideSensitiveInformation()) {
                            strM = c37.m(strM);
                        }
                        ((a4c) b9bVar2.b).log("OKWSSignaling", "Connect to " + strM);
                        l84 l84Var = new l84();
                        l84Var.S(this.b.h);
                        mhc mhcVarR = l84Var.r();
                        hrf hrfVar3 = this.b;
                        hrfVar3.c = hrfVar3.o.c(mhcVarR, new frf(this));
                    }
                    return;
                } finally {
                    Process.setThreadPriority(threadPriority);
                }
            default:
                synchronized (this.b.b) {
                    try {
                        this.b.q.o("transport.DISCONNECT");
                        j3g j3gVar2 = this.b.c;
                        if (j3gVar2 != null) {
                            ((m8c) j3gVar2).b(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "dispose");
                            this.b.c = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
