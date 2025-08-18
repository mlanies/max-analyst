package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ykg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final o97 b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final ajg j;
    public final AtomicInteger k;
    public hkg l;
    public IInterface m;

    public ykg(Context context, o97 o97Var) {
        Intent intent = fkg.f;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.j = new ajg(1, this);
        this.k = new AtomicInteger(0);
        this.a = context;
        this.b = o97Var;
        this.c = "AppUpdateService";
        this.h = intent;
        this.i = new WeakReference(null);
    }

    public static void b(ykg ykgVar, pjg pjgVar) {
        IInterface iInterface = ykgVar.m;
        ArrayList arrayList = ykgVar.d;
        o97 o97Var = ykgVar.b;
        if (iInterface != null || ykgVar.g) {
            if (!ykgVar.g) {
                pjgVar.run();
                return;
            } else {
                o97Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(pjgVar);
                return;
            }
        }
        o97Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(pjgVar);
        hkg hkgVar = new hkg(1, ykgVar);
        ykgVar.l = hkgVar;
        ykgVar.g = true;
        if (ykgVar.a.bindService(ykgVar.h, hkgVar, 1)) {
            return;
        }
        o97Var.b("Failed to bind to the service.", new Object[0]);
        ykgVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pjg pjgVar2 = (pjg) it.next();
            zzy zzyVar = new zzy();
            qne qneVar = pjgVar2.a;
            if (qneVar != null) {
                qneVar.c(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(qne qneVar) {
        synchronized (this.f) {
            this.e.remove(qneVar);
        }
        a().post(new gkg(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qne) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
