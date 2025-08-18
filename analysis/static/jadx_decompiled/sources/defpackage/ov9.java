package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ov9 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet o = new HashSet();

    public ov9(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(nv9 nv9Var) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = nv9Var.a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            nv9Var.d.size();
        }
        if (nv9Var.d.isEmpty()) {
            return;
        }
        if (nv9Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            nv9Var.b = zBindService;
            if (zBindService) {
                nv9Var.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = nv9Var.b;
        }
        if (!z || nv9Var.c == null) {
            b(nv9Var);
            return;
        }
        while (true) {
            arrayDeque = nv9Var.d;
            lv9 lv9Var = (lv9) arrayDeque.peek();
            if (lv9Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    lv9Var.toString();
                }
                lv9Var.a(nv9Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(nv9Var);
    }

    public final void b(nv9 nv9Var) {
        Handler handler = this.b;
        ComponentName componentName = nv9Var.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = nv9Var.e + 1;
        nv9Var.e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r2) * 1000);
            return;
        }
        ArrayDeque arrayDeque = nv9Var.d;
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                mv9 mv9Var = (mv9) message.obj;
                ComponentName componentName = mv9Var.a;
                IBinder iBinder = mv9Var.b;
                nv9 nv9Var = (nv9) this.c.get(componentName);
                if (nv9Var != null) {
                    nv9Var.c = INotificationSideChannel.Stub.asInterface(iBinder);
                    nv9Var.e = 0;
                    a(nv9Var);
                }
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                nv9 nv9Var2 = (nv9) this.c.get((ComponentName) message.obj);
                if (nv9Var2 != null) {
                    a(nv9Var2);
                }
                return true;
            }
            nv9 nv9Var3 = (nv9) this.c.get((ComponentName) message.obj);
            if (nv9Var3 != null) {
                if (nv9Var3.b) {
                    this.a.unbindService(this);
                    nv9Var3.b = false;
                }
                nv9Var3.c = null;
            }
            return true;
        }
        lv9 lv9Var = (lv9) message.obj;
        String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
        synchronized (pv9.c) {
            if (string != null) {
                try {
                    if (!string.equals(pv9.d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        pv9.e = hashSet2;
                        pv9.d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = pv9.e;
        }
        if (!hashSet.equals(this.o)) {
            this.o = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName2.toString();
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName3);
                    }
                    this.c.put(componentName3, new nv9(componentName3));
                }
            }
            Iterator it2 = this.c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(entry.getKey());
                    }
                    nv9 nv9Var4 = (nv9) entry.getValue();
                    if (nv9Var4.b) {
                        this.a.unbindService(this);
                        nv9Var4.b = false;
                    }
                    nv9Var4.c = null;
                    it2.remove();
                }
            }
        }
        for (nv9 nv9Var5 : this.c.values()) {
            nv9Var5.d.add(lv9Var);
            a(nv9Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new mv9(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
