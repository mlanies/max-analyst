package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class yg3 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ yg3(av6 av6Var, String str, zu6 zu6Var) {
        this.a = 6;
        this.b = av6Var;
        this.c = str;
        this.o = null;
        this.X = zu6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg3.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        Bundle bundleB;
        rq6 rq6VarB;
        byte[] bArr;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                m5d m5dVar = (m5d) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ah3 ah3Var = (ah3) this.X;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.o;
                synchronized (m5dVar.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            m5dVar.v(ah3Var);
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                hc0 hc0Var = (hc0) this.c;
                av1 av1Var = (av1) this.o;
                ja0 ja0Var = (ja0) this.X;
                kd4 kd4Var = (kd4) this.b;
                kd4Var.getClass();
                Logger logger = kd4.f;
                try {
                    k2f k2fVarA = kd4Var.c.a(hc0Var.a);
                    if (k2fVarA == null) {
                        String str = "Transport backend '" + hc0Var.a + "' is not registered";
                        logger.warning(str);
                        new IllegalArgumentException(str);
                        av1Var.getClass();
                    } else {
                        ((gqc) kd4Var.e).e0(new u00(kd4Var, hc0Var, ((h02) k2fVarA).a(ja0Var), 4));
                        av1Var.getClass();
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    av1Var.getClass();
                    return;
                }
            case 2:
                eu4 eu4Var = (eu4) this.c;
                Map map = (Map) this.o;
                lq1 lq1Var = (lq1) this.X;
                ce4 ce4Var = (ce4) this.b;
                ce4Var.getClass();
                try {
                    ce4Var.a.n(eu4Var, map);
                    lq1Var.b(null);
                    return;
                } catch (RuntimeException e2) {
                    lq1Var.d(e2);
                    return;
                }
            case 3:
                View view = (View) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                if (view != null) {
                    viewGroup.removeView(view);
                }
                View view2 = (View) this.o;
                if (view2 != null && view2.getParent() == null) {
                    viewGroup.addView(view2);
                }
                if (viewGroup.getWindowToken() != null) {
                    ((xu3) this.X).q();
                    return;
                }
                return;
            case 4:
                eu4 eu4Var2 = (eu4) this.c;
                Map map2 = (Map) this.o;
                lq1 lq1Var2 = (lq1) this.X;
                vs4 vs4Var = (vs4) this.b;
                vs4Var.getClass();
                try {
                    vs4Var.a.n(eu4Var2, map2);
                    lq1Var2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    lq1Var2.d(e3);
                    return;
                }
            case 5:
                long jNanoTime = System.nanoTime();
                Iterable iterable = (Iterable) this.b;
                ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((iy5) it.next()).b);
                }
                ForkJoinTask.invokeAll(arrayList);
                long jNanoTime2 = System.nanoTime();
                ((k56) this.c).invoke();
                ((ly5) this.o).a.add(new l38((String) this.X, jNanoTime2 - jNanoTime, System.nanoTime() - jNanoTime2, TimeUnit.NANOSECONDS, Thread.currentThread().getName(), jNanoTime));
                return;
            case 6:
                String str2 = (String) this.c;
                String str3 = (String) this.o;
                zu6 zu6Var = (zu6) this.X;
                av6 av6Var = (av6) this.b;
                av6Var.getClass();
                try {
                    if (pag.l(str3)) {
                        if (zu6Var != null) {
                            av6Var.c(new vs5(zu6Var, 6, str3));
                            return;
                        }
                        return;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            av6Var.b(zu6Var);
                            return;
                        }
                        if (zu6Var != null) {
                            av6Var.c(new wu6(zu6Var, 1));
                        }
                        wv6 wv6VarB = wv6.b(str2);
                        s36.o().c(wv6VarB).m(new xu6(av6Var, zu6Var, wv6VarB), qq1.a);
                        return;
                    }
                } catch (Throwable unused) {
                    av6Var.b(zu6Var);
                    return;
                }
            case 7:
                bm7 bm7Var = (bm7) this.c;
                pd8 pd8Var = (pd8) this.o;
                qh8 qh8Var = (qh8) this.X;
                ue ueVar = (ue) this.b;
                ueVar.getClass();
                try {
                    a98 a98Var = (a98) bm7Var.get(0L, TimeUnit.MILLISECONDS);
                    a98 a98VarB = ueVar.b(qh8Var);
                    if (a98VarB != null && !a98VarB.x0().q() && a98VarB.getPlaybackState() != 1) {
                        z2 = true;
                    }
                    pd8Var.s(z2);
                    a98Var.z(pd8Var);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused2) {
                    ((bj8) ueVar.c).h(qh8Var);
                    return;
                }
            case 8:
                ((AtomicReference) this.c).set(((cj8) this.b).u0.l((oh8) this.o));
                ((ae3) this.X).g();
                return;
            case 9:
                oh8 oh8Var = (oh8) this.c;
                ii8 ii8Var = (ii8) this.o;
                kr6 kr6Var = (kr6) this.X;
                sj8 sj8Var = (sj8) this.b;
                m5d m5dVar2 = sj8Var.e;
                try {
                    sj8Var.f.remove(oh8Var);
                    if (!ii8Var.i()) {
                        oj8 oj8Var = (oj8) oh8Var.d;
                        fm9.l(oj8Var);
                        IBinder iBinderAsBinder = oj8Var.a.asBinder();
                        mh8 mh8VarL = ii8Var.l(oh8Var);
                        if (m5dVar2.E(oh8Var)) {
                            z04.c0("Controller " + oh8Var + " has sent connection request multiple times");
                        }
                        m5dVar2.p(iBinderAsBinder, oh8Var, mh8VarL.a, mh8VarL.b);
                        cd6 cd6VarB = m5dVar2.B(oh8Var);
                        if (cd6VarB == null) {
                            z04.c0("Ignoring connection request from unknown controller info");
                        } else {
                            x4b x4bVar = ii8Var.s;
                            m4b m4bVarG0 = sj8Var.G0(x4bVar.o());
                            PendingIntent pendingIntent = ii8Var.t;
                            zw6 zw6Var = mh8VarL.c;
                            if (zw6Var == null) {
                                zw6Var = ii8Var.A;
                            }
                            uh3 uh3Var = new uh3(1004001300, 4, sj8Var, pendingIntent, zw6Var, mh8VarL.a, mh8VarL.b, x4bVar.s(), ii8Var.j.a.getExtras(), ii8Var.B, m4bVarG0);
                            if (!ii8Var.i()) {
                                try {
                                    int i = cd6VarB.i();
                                    if (kr6Var instanceof ga8) {
                                        bundleB = new Bundle();
                                        bundleB.putBinder(uh3.w, new th3(uh3Var));
                                    } else {
                                        bundleB = uh3Var.b(oh8Var.c);
                                    }
                                    kr6Var.r(i, bundleB);
                                    z = true;
                                } catch (RemoteException unused3) {
                                    z = false;
                                }
                                if (z) {
                                    try {
                                        if (!ii8Var.z || !ii8.j(oh8Var)) {
                                            ii8Var.e.getClass();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (!z) {
                                            try {
                                                kr6Var.c(0);
                                            } catch (RemoteException unused4) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                if (z) {
                                    return;
                                }
                            }
                        }
                    }
                    try {
                        kr6Var.c(0);
                        return;
                    } catch (RemoteException unused5) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                break;
            case 10:
                pj3 pj3Var = (pj3) this.o;
                bm7 bm7Var2 = (bm7) this.X;
                boolean zI = ((ii8) this.b).i();
                ccd ccdVar = (ccd) this.c;
                if (zI) {
                    ccdVar.l(null);
                    return;
                }
                try {
                    pj3Var.accept(bm7Var2);
                    ccdVar.l(null);
                    return;
                } catch (Throwable th3) {
                    ccdVar.m(th3);
                    return;
                }
            case 11:
                ii8 ii8Var2 = (ii8) this.b;
                if (ii8Var2.i()) {
                    return;
                }
                ((qj8) this.c).b(ii8Var2.s, (oh8) this.o, (List) this.X);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((hk8) this.c).F(((gk8) this.b).b, (xj8) this.o, (pc8) this.X);
                return;
            case 13:
                ((ik8) this.c).A(((jn) this.b).b, (yj8) this.o, (pc8) this.X);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bkb bkbVar = (bkb) this.b;
                Collection collection = (Collection) this.c;
                ConditionVariable conditionVariable = (ConditionVariable) this.o;
                kbd kbdVar = (kbd) this.X;
                try {
                    try {
                        kye kyeVar = kye.a;
                        rq6VarB = ((wq6) kye.h.getValue()).b(bkbVar);
                    } catch (Exception unused6) {
                        kye kyeVar2 = kye.a;
                        kye.b().a((List) collection);
                    }
                    try {
                        int i2 = rq6VarB.b;
                        rh5 rh5Var = (rh5) rq6VarB.o;
                        oz7.l((rh5Var == null || (bArr = (byte[]) rh5Var.c) == null) ? null : eae.j0(bArr), "CRASH_FREE", null);
                        if (i2 == 200) {
                            kbdVar.a();
                        }
                        v3c.i(rq6VarB, null);
                        return;
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            v3c.i(rq6VarB, th);
                        }
                    }
                } finally {
                    conditionVariable.open();
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$10((StereoRoomManagerImpl) this.b, (ArrayList) ((List) this.c), (List) this.o, (k56) this.X);
                return;
            case 16:
                hre hreVar = (hre) this.b;
                u00 u00Var = hreVar.l;
                if (u00Var != null) {
                    u00Var.f();
                    hreVar.l = null;
                }
                ((Surface) this.c).release();
                if (hreVar.g == ((bm7) this.o)) {
                    hreVar.g = null;
                }
                if (hreVar.h == ((see) this.X)) {
                    hreVar.h = null;
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                a();
                return;
            default:
                ((Handler) this.b).removeCallbacksAndMessages(null);
                View view3 = (View) this.c;
                view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.o);
                ((m56) this.X).invoke(view3);
                return;
        }
    }

    public /* synthetic */ yg3(bkb bkbVar, lbd lbdVar, List list, ConditionVariable conditionVariable, kbd kbdVar) {
        this.a = 14;
        this.b = bkbVar;
        this.c = list;
        this.o = conditionVariable;
        this.X = kbdVar;
    }

    public /* synthetic */ yg3(m5d m5dVar, AtomicBoolean atomicBoolean, ah3 ah3Var, AtomicBoolean atomicBoolean2) {
        this.a = 0;
        this.b = m5dVar;
        this.c = atomicBoolean;
        this.X = ah3Var;
        this.o = atomicBoolean2;
    }

    public /* synthetic */ yg3(qye qyeVar, Throwable th, String str) {
        this.a = 17;
        this.b = qyeVar;
        this.c = "NON_FATAL";
        this.o = th;
        this.X = str;
    }

    public /* synthetic */ yg3(View view, boolean z, og4 og4Var, ViewGroup viewGroup, View view2, xu3 xu3Var) {
        this.a = 3;
        this.b = view;
        this.c = viewGroup;
        this.o = view2;
        this.X = xu3Var;
    }

    public /* synthetic */ yg3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }
}
