package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class goc {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final l2a c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public sgg g;
    public final qpd a = new qpd(0);
    public final Messenger e = new Messenger(new hfg(this, Looper.getMainLooper()));

    public goc(Context context) {
        this.b = context;
        this.c = new l2a(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final ukg a(Bundle bundle) throws RemoteException {
        String string;
        synchronized (goc.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        qne qneVar = new qne();
        synchronized (this.a) {
            this.a.put(string, qneVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (goc.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, cfg.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
            }
        } else if (this.c.h() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        qneVar.a.b(ok4.o, new cjg(this, string, this.d.schedule(new gwe(14, qneVar), 30L, TimeUnit.SECONDS)));
        return qneVar.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                qne qneVar = (qne) this.a.remove(str);
                if (qneVar == null) {
                    return;
                }
                qneVar.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
