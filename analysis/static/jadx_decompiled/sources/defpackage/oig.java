package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class oig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vjg b;

    public /* synthetic */ oig(vjg vjgVar, int i) {
        this.a = i;
        this.b = vjgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                vjg vjgVar = this.b;
                synchronized (vjgVar) {
                    if (vjgVar.a == 1) {
                        vjgVar.a(1, "Timed out while binding");
                    }
                }
                return;
            default:
                this.b.a(2, "Service disconnected");
                return;
        }
        while (true) {
            vjg vjgVar2 = this.b;
            synchronized (vjgVar2) {
                try {
                    if (vjgVar2.a != 2) {
                        return;
                    }
                    if (vjgVar2.o.isEmpty()) {
                        vjgVar2.c();
                        return;
                    }
                    ckg ckgVar = (ckg) vjgVar2.o.poll();
                    vjgVar2.X.put(ckgVar.a, ckgVar);
                    ((ScheduledExecutorService) vjgVar2.Y.c).schedule(new ihg(vjgVar2, 3, ckgVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(ckgVar));
                    }
                    pkg pkgVar = vjgVar2.Y;
                    Messenger messenger = vjgVar2.b;
                    int i = ckgVar.c;
                    Context context = (Context) pkgVar.a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = ckgVar.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", ckgVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", ckgVar.d);
                    messageObtain.setData(bundle);
                    try {
                        djb djbVar = vjgVar2.c;
                        Messenger messenger2 = (Messenger) djbVar.b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            sgg sggVar = (sgg) djbVar.c;
                            if (sggVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = sggVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        vjgVar2.a(2, e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
