package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ie6 implements Handler.Callback {
    public static ie6 C0;
    public final Context X;
    public final ee6 Y;
    public final l7b Z;
    public long a;
    public boolean b;
    public moe c;
    public reg o;
    public final AtomicInteger s0;
    public final AtomicInteger t0;
    public final ConcurrentHashMap u0;
    public final xs v0;
    public final xs w0;
    public final fc9 x0;
    public volatile boolean y0;
    public static final Status z0 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status A0 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object B0 = new Object();

    public ie6(Context context, Looper looper) {
        ee6 ee6Var = ee6.d;
        this.a = WorkRequest.MIN_BACKOFF_MILLIS;
        this.b = false;
        this.s0 = new AtomicInteger(1);
        this.t0 = new AtomicInteger(0);
        this.u0 = new ConcurrentHashMap(5, 0.75f, 1);
        this.v0 = new xs(0);
        this.w0 = new xs(0);
        this.y0 = true;
        this.X = context;
        fc9 fc9Var = new fc9(looper, this, 2);
        Looper.getMainLooper();
        this.x0 = fc9Var;
        this.Y = ee6Var;
        this.Z = new l7b(17);
        PackageManager packageManager = context.getPackageManager();
        if (np8.k == null) {
            np8.k = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (np8.k.booleanValue()) {
            this.y0 = false;
        }
        fc9Var.sendMessage(fc9Var.obtainMessage(6));
    }

    public static Status c(zk zkVar, ph3 ph3Var) {
        return new Status(17, rh4.k("API: ", (String) zkVar.b.b, " is not available on this device. Connection failed with: ", String.valueOf(ph3Var)), ph3Var.c, ph3Var);
    }

    public static ie6 f(Context context) {
        ie6 ie6Var;
        HandlerThread handlerThread;
        synchronized (B0) {
            if (C0 == null) {
                synchronized (jkg.h) {
                    try {
                        handlerThread = jkg.j;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            jkg.j = handlerThread2;
                            handlerThread2.start();
                            handlerThread = jkg.j;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ee6.c;
                C0 = new ie6(applicationContext, looper);
            }
            ie6Var = C0;
        }
        return ie6Var;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        xmc xmcVar = (xmc) wmc.h().a;
        if (xmcVar != null && !xmcVar.b) {
            return false;
        }
        int i = ((SparseIntArray) this.Z.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(ph3 ph3Var, int i) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        ee6 ee6Var = this.Y;
        Context context = this.X;
        ee6Var.getClass();
        synchronized (c37.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = c37.a;
            if (context2 == null || (bool = c37.b) == null || context2 != applicationContext) {
                c37.b = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                c37.b = Boolean.valueOf(zIsInstantApp);
                c37.a = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i2 = ph3Var.b;
        if (i2 == 0 || (activity = ph3Var.c) == null) {
            Intent intentA = ee6Var.a(i2, context, null);
            activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = ph3Var.b;
        int i4 = GoogleApiActivity.b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        ee6Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, teg.a | 134217728));
        return true;
    }

    public final kdg d(de6 de6Var) {
        ConcurrentHashMap concurrentHashMap = this.u0;
        zk zkVar = de6Var.X;
        kdg kdgVar = (kdg) concurrentHashMap.get(zkVar);
        if (kdgVar == null) {
            kdgVar = new kdg(this, de6Var);
            concurrentHashMap.put(zkVar, kdgVar);
        }
        if (kdgVar.d.j()) {
            this.w0.add(zkVar);
        }
        kdgVar.j();
        return kdgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.qne r7, int r8, defpackage.de6 r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L7a
            zk r9 = r9.X
            boolean r0 = r6.a()
            if (r0 != 0) goto Lb
            goto L47
        Lb:
            wmc r0 = defpackage.wmc.h()
            java.lang.Object r0 = r0.a
            xmc r0 = (defpackage.xmc) r0
            r1 = 1
            if (r0 == 0) goto L49
            boolean r2 = r0.b
            if (r2 == 0) goto L47
            java.util.concurrent.ConcurrentHashMap r2 = r6.u0
            java.lang.Object r2 = r2.get(r9)
            kdg r2 = (defpackage.kdg) r2
            if (r2 == 0) goto L44
            ok r3 = r2.d
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L47
            com.google.android.gms.common.internal.a r3 = (com.google.android.gms.common.internal.a) r3
            vig r4 = r3.F0
            if (r4 == 0) goto L44
            boolean r4 = r3.c()
            if (r4 != 0) goto L44
            wh3 r0 = defpackage.w82.b(r2, r3, r8)
            if (r0 == 0) goto L47
            int r3 = r2.n
            int r3 = r3 + r1
            r2.n = r3
            boolean r1 = r0.c
            goto L49
        L44:
            boolean r1 = r0.c
            goto L49
        L47:
            r8 = 0
            goto L69
        L49:
            w82 r0 = new w82
            r2 = 0
            if (r1 == 0) goto L54
            long r4 = java.lang.System.currentTimeMillis()
            goto L55
        L54:
            r4 = r2
        L55:
            if (r1 == 0) goto L5b
            long r2 = android.os.SystemClock.elapsedRealtime()
        L5b:
            r0.<init>()
            r0.o = r6
            r0.a = r8
            r0.X = r9
            r0.b = r4
            r0.c = r2
            r8 = r0
        L69:
            if (r8 == 0) goto L7a
            ukg r7 = r7.a
            fc9 r6 = r6.x0
            r6.getClass()
            xm0 r9 = new xm0
            r9.<init>(r6)
            r7.b(r9, r8)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.e(qne, int, de6):void");
    }

    public final void g(ph3 ph3Var, int i) {
        if (b(ph3Var, i)) {
            return;
        }
        fc9 fc9Var = this.x0;
        fc9Var.sendMessage(fc9Var.obtainMessage(5, i, 0, ph3Var));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        kdg kdgVar;
        pe5[] pe5VarArrG;
        int i = message.what;
        fc9 fc9Var = this.x0;
        ConcurrentHashMap concurrentHashMap = this.u0;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? WorkRequest.MIN_BACKOFF_MILLIS : 300000L;
                fc9Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    fc9Var.sendMessageDelayed(fc9Var.obtainMessage(12, (zk) it.next()), this.a);
                }
                return true;
            case 2:
                au1.r(message.obj);
                throw null;
            case 3:
                for (kdg kdgVar2 : concurrentHashMap.values()) {
                    fp3.i(kdgVar2.o.x0);
                    kdgVar2.m = null;
                    kdgVar2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                udg udgVar = (udg) message.obj;
                kdg kdgVarD = (kdg) concurrentHashMap.get(udgVar.c.X);
                if (kdgVarD == null) {
                    kdgVarD = d(udgVar.c);
                }
                boolean zJ = kdgVarD.d.j();
                peg pegVar = udgVar.a;
                if (!zJ || this.t0.get() == udgVar.b) {
                    kdgVarD.l(pegVar);
                } else {
                    pegVar.a(z0);
                    kdgVarD.o();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ph3 ph3Var = (ph3) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        kdgVar = (kdg) it2.next();
                        if (kdgVar.i == i2) {
                        }
                    } else {
                        kdgVar = null;
                    }
                }
                if (kdgVar != null) {
                    int i3 = ph3Var.b;
                    if (i3 == 13) {
                        this.Y.getClass();
                        int i4 = pe6.e;
                        StringBuilder sbM = au1.m("Error resolution was canceled by the user, original error message: ", ph3.b(i3), ": ");
                        sbM.append(ph3Var.o);
                        kdgVar.b(new Status(17, sbM.toString(), null, null));
                    } else {
                        kdgVar.b(c(kdgVar.e, ph3Var));
                    }
                } else {
                    Log.wtf("GoogleApiManager", wg0.g(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                Context context = this.X;
                if (context.getApplicationContext() instanceof Application) {
                    se0.a((Application) context.getApplicationContext());
                    se0 se0Var = se0.X;
                    jdg jdgVar = new jdg(this);
                    se0Var.getClass();
                    synchronized (se0Var) {
                        se0Var.c.add(jdgVar);
                    }
                    AtomicBoolean atomicBoolean = se0Var.b;
                    boolean z = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = se0Var.a;
                    if (!z) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000L;
                    }
                }
                return true;
            case 7:
                d((de6) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdgVar3 = (kdg) concurrentHashMap.get(message.obj);
                    fp3.i(kdgVar3.o.x0);
                    if (kdgVar3.k) {
                        kdgVar3.j();
                    }
                }
                return true;
            case 10:
                xs xsVar = this.w0;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    kdg kdgVar4 = (kdg) concurrentHashMap.remove((zk) qsVar.next());
                    if (kdgVar4 != null) {
                        kdgVar4.o();
                    }
                }
                xsVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdgVar5 = (kdg) concurrentHashMap.get(message.obj);
                    ie6 ie6Var = kdgVar5.o;
                    fp3.i(ie6Var.x0);
                    boolean z2 = kdgVar5.k;
                    if (z2) {
                        if (z2) {
                            ie6 ie6Var2 = kdgVar5.o;
                            fc9 fc9Var2 = ie6Var2.x0;
                            zk zkVar = kdgVar5.e;
                            fc9Var2.removeMessages(11, zkVar);
                            ie6Var2.x0.removeMessages(9, zkVar);
                            kdgVar5.k = false;
                        }
                        kdgVar5.b(ie6Var.Y.b(ie6Var.X, fe6.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        kdgVar5.d.b("Timing out connection while resuming.");
                    }
                }
                return true;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kdg kdgVar6 = (kdg) concurrentHashMap.get(message.obj);
                    fp3.i(kdgVar6.o.x0);
                    ok okVar = kdgVar6.d;
                    if (okVar.isConnected() && kdgVar6.h.isEmpty()) {
                        aab aabVar = kdgVar6.f;
                        if (((Map) aabVar.a).isEmpty() && ((Map) aabVar.b).isEmpty()) {
                            okVar.b("Timing out service connection.");
                        } else {
                            kdgVar6.g();
                        }
                    }
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                au1.r(message.obj);
                throw null;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ldg ldgVar = (ldg) message.obj;
                if (concurrentHashMap.containsKey(ldgVar.a)) {
                    kdg kdgVar7 = (kdg) concurrentHashMap.get(ldgVar.a);
                    if (kdgVar7.l.contains(ldgVar) && !kdgVar7.k) {
                        if (kdgVar7.d.isConnected()) {
                            kdgVar7.d();
                        } else {
                            kdgVar7.j();
                        }
                    }
                }
                return true;
            case 16:
                ldg ldgVar2 = (ldg) message.obj;
                if (concurrentHashMap.containsKey(ldgVar2.a)) {
                    kdg kdgVar8 = (kdg) concurrentHashMap.get(ldgVar2.a);
                    if (kdgVar8.l.remove(ldgVar2)) {
                        ie6 ie6Var3 = kdgVar8.o;
                        ie6Var3.x0.removeMessages(15, ldgVar2);
                        ie6Var3.x0.removeMessages(16, ldgVar2);
                        LinkedList linkedList = kdgVar8.c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            pe5 pe5Var = ldgVar2.b;
                            if (zHasNext) {
                                peg pegVar2 = (peg) it3.next();
                                if ((pegVar2 instanceof odg) && (pe5VarArrG = ((odg) pegVar2).g(kdgVar8)) != null) {
                                    int length = pe5VarArrG.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            break;
                                        }
                                        if (!s36.l(pe5VarArrG[i5], pe5Var)) {
                                            i5++;
                                        } else if (i5 >= 0) {
                                            arrayList.add(pegVar2);
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    peg pegVar3 = (peg) arrayList.get(i6);
                                    linkedList.remove(pegVar3);
                                    pegVar3.b(new UnsupportedApiCallException(pe5Var));
                                }
                            }
                        }
                    }
                }
                return true;
            case LangUtils.HASH_SEED /* 17 */:
                moe moeVar = this.c;
                if (moeVar != null) {
                    if (moeVar.a > 0 || a()) {
                        if (this.o == null) {
                            this.o = new reg(this.X, reg.v0, ooe.b, ce6.c);
                        }
                        this.o.d(moeVar);
                    }
                    this.c = null;
                }
                return true;
            case 18:
                tdg tdgVar = (tdg) message.obj;
                long j = tdgVar.c;
                y99 y99Var = tdgVar.a;
                int i7 = tdgVar.b;
                if (j == 0) {
                    moe moeVar2 = new moe(i7, Arrays.asList(y99Var));
                    if (this.o == null) {
                        this.o = new reg(this.X, reg.v0, ooe.b, ce6.c);
                    }
                    this.o.d(moeVar2);
                } else {
                    moe moeVar3 = this.c;
                    if (moeVar3 != null) {
                        List list = moeVar3.b;
                        if (moeVar3.a != i7 || (list != null && list.size() >= tdgVar.d)) {
                            fc9Var.removeMessages(17);
                            moe moeVar4 = this.c;
                            if (moeVar4 != null) {
                                if (moeVar4.a > 0 || a()) {
                                    if (this.o == null) {
                                        this.o = new reg(this.X, reg.v0, ooe.b, ce6.c);
                                    }
                                    this.o.d(moeVar4);
                                }
                                this.c = null;
                            }
                        } else {
                            moe moeVar5 = this.c;
                            if (moeVar5.b == null) {
                                moeVar5.b = new ArrayList();
                            }
                            moeVar5.b.add(y99Var);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(y99Var);
                        this.c = new moe(i7, arrayList2);
                        fc9Var.sendMessageDelayed(fc9Var.obtainMessage(17), tdgVar.c);
                    }
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                return false;
        }
    }
}
