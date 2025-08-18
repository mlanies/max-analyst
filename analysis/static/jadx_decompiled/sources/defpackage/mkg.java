package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mkg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final qm4 b;
    public boolean g;
    public final Intent h;
    public hkg l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ajg j = new ajg(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public mkg(Context context, qm4 qm4Var, Intent intent) {
        this.a = context;
        this.b = qm4Var;
        this.h = intent;
    }

    public static void b(mkg mkgVar, sig sigVar) {
        IInterface iInterface = mkgVar.m;
        ArrayList arrayList = mkgVar.d;
        qm4 qm4Var = mkgVar.b;
        if (iInterface != null || mkgVar.g) {
            if (!mkgVar.g) {
                sigVar.run();
                return;
            } else {
                qm4Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(sigVar);
                return;
            }
        }
        qm4Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(sigVar);
        hkg hkgVar = new hkg(0, mkgVar);
        mkgVar.l = hkgVar;
        mkgVar.g = true;
        if (mkgVar.a.bindService(mkgVar.h, hkgVar, 1)) {
            return;
        }
        qm4Var.b("Failed to bind to the service.", new Object[0]);
        mkgVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sig sigVar2 = (sig) it.next();
            zzu zzuVar = new zzu();
            qne qneVar = sigVar2.a;
            if (qneVar != null) {
                qneVar.c(zzuVar);
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

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qne) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
