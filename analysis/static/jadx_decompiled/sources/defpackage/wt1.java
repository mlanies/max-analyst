package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.view.Surface;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class wt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wt1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        cu8 cu8Var;
        av1 av1Var;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 1:
                fu1 fu1Var = (fu1) this.b;
                x99 x99Var = fu1Var.H0;
                lq1 lq1Var = (lq1) this.c;
                if (x99Var == null) {
                    lq1Var.b(Boolean.FALSE);
                    return;
                } else {
                    lq1Var.b(Boolean.valueOf(fu1Var.a.C(fu1.w(x99Var))));
                    return;
                }
            case 2:
                fu1 fu1Var2 = (fu1) this.b;
                fu1Var2.getClass();
                fu1Var2.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fu1Var2.a.a;
                String str = (String) this.c;
                if (linkedHashMap.containsKey(str)) {
                    m9f m9fVar = (m9f) linkedHashMap.get(str);
                    m9fVar.f = false;
                    if (!m9fVar.e) {
                        linkedHashMap.remove(str);
                    }
                }
                fu1Var2.K();
                return;
            case 3:
                ((dad) this.b).a((fad) this.c);
                return;
            case 4:
                ((HashSet) ((st1) this.b).b.b).remove((uu1) this.c);
                return;
            case 5:
                ((lw1) this.b).a = (px1) this.c;
                return;
            case 6:
                List<l92> list = (List) this.c;
                p82 p82Var = (p82) this.b;
                rm4 rm4Var = p82Var.l;
                rm4 rm4Var2 = p82Var.A;
                ((iye) rm4Var2.get()).getClass();
                iye.a("ChatController.load().nonParticipantChats");
                try {
                    ((k24) ((c34) rm4Var.get())).a();
                    for (l92 l92Var : list) {
                        ((k24) ((c34) rm4Var.get())).c.a(l92Var.b, Long.MAX_VALUE, mg4.REGULAR);
                        elc elcVar = ((k24) ((c34) rm4Var.get())).b;
                        long j = l92Var.b;
                        elcVar.getClass();
                        ((OneMeRoomDatabase) elcVar.a.m()).p(new dlc(0, new clc(elcVar, j, i)));
                        ((k4a) ((pk) p82Var.p.get())).k(l92Var.c.a, true);
                    }
                    ((k24) ((c34) rm4Var.get())).c();
                    ((k24) ((c34) rm4Var.get())).b();
                    ((iye) rm4Var2.get()).getClass();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    ((k24) ((c34) rm4Var.get())).b();
                    throw th;
                }
            case 7:
                p82 p82Var2 = (p82) this.b;
                p82Var2.getClass();
                StringBuilder sb = new StringBuilder("syncPins, pins size = ");
                Map map = (Map) this.c;
                sb.append(map.size());
                hm9.n("p82", sb.toString());
                Iterator it = ((ps) ((au8) p82Var2.s.get()).l(new ArrayList(map.keySet())).entrySet()).iterator();
                while (true) {
                    ss ssVar = (ss) it;
                    if (!ssVar.hasNext()) {
                        return;
                    }
                    ssVar.next();
                    Long l = (Long) map.get(ssVar.getKey());
                    if (l != null && (cu8Var = (cu8) ssVar.getValue()) != null) {
                        ((k4a) ((pk) p82Var2.p.get())).D(l.longValue(), Collections.singletonList(Long.valueOf(cu8Var.c)));
                        hm9.n("p82", "syncPin, chatId = " + l);
                    }
                }
                break;
            case 8:
                b bVar = (b) ((yb3) this.b);
                int i3 = yb3.D0;
                bVar.a.a(new sb3((i3a) this.c, i2, bVar));
                return;
            case 9:
                uma umaVar = (uma) this.b;
                gpb gpbVar = (gpb) this.c;
                if (umaVar.b != uma.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (umaVar) {
                    av1Var = umaVar.a;
                    umaVar.a = null;
                    umaVar.b = gpbVar;
                }
                av1Var.getClass();
                return;
            case 10:
                pe7 pe7Var = (pe7) this.b;
                gpb gpbVar2 = (gpb) this.c;
                synchronized (pe7Var) {
                    try {
                        if (pe7Var.b == null) {
                            pe7Var.a.add(gpbVar2);
                        } else {
                            pe7Var.b.add(gpbVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                py9 py9Var = (py9) this.c;
                ki3 ki3Var = (ki3) this.b;
                ki3Var.getClass();
                try {
                    py9Var.a(ki3Var.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    py9Var.onError(e);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                for (qi3 qi3Var : (List) this.b) {
                    Object obj = ((ej3) this.c).o;
                    qi3Var.d = obj;
                    qi3Var.d(qi3Var.e, obj);
                }
                return;
            case 13:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                bm7 bm7Var = (bm7) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            dcd dcdVar = constraintTrackingWorker.o;
                            String str2 = gj3.a;
                            dcdVar.j(new dm7());
                        } else {
                            constraintTrackingWorker.o.l(bm7Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                mu3 mu3Var = (mu3) this.b;
                mu3Var.getClass();
                ((Runnable) this.c).run();
                ((CountDownLatch) mu3Var.d).countDown();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                List listSingletonList = Collections.singletonList((qy3) this.c);
                ((o84) ((ty2) this.b).Y).getClass();
                o84.o(listSingletonList);
                return;
            case 16:
                t04 t04Var = (t04) this.b;
                t04Var.getClass();
                try {
                    Process.setThreadPriority(t04Var.b);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                u04 u04Var = (u04) this.b;
                Process.setThreadPriority(u04Var.c);
                StrictMode.ThreadPolicy threadPolicy = u04Var.o;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 18:
                qz7 qz7Var = ((v78) ((qqd) this.b).b).R1;
                Handler handler = (Handler) qz7Var.b;
                if (handler != null) {
                    handler.post(new s60(qz7Var, (a70) this.c, i2));
                    return;
                }
                return;
            case 19:
                y94 y94Var = (y94) this.b;
                aa4 aa4Var = y94Var.o;
                if (aa4Var.p == 0 || y94Var.c) {
                    return;
                }
                Looper looper = aa4Var.t;
                looper.getClass();
                y94Var.b = aa4Var.e(looper, y94Var.a, (oy5) this.c, false);
                aa4Var.n.add(y94Var);
                return;
            case 20:
                z94 z94Var = (z94) this.b;
                ba4 ba4Var = z94Var.o;
                if (ba4Var.p == 0 || z94Var.c) {
                    return;
                }
                Looper looper2 = ba4Var.t;
                looper2.getClass();
                z94Var.b = ba4Var.e(looper2, z94Var.a, (qy5) this.c, false);
                ba4Var.n.add(z94Var);
                return;
            case 21:
                fb4 fb4Var = (fb4) this.b;
                fb4Var.t0 = false;
                fb4Var.b((Uri) this.c);
                return;
            case 22:
                gb4 gb4Var = (gb4) this.b;
                gb4Var.t0 = false;
                gb4Var.d((Uri) this.c);
                return;
            case 23:
                ((ce4) this.b).v0.add((ca0) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ce4 ce4Var = (ce4) this.b;
                zh6 zh6Var = ce4Var.c;
                kee keeVar = (kee) this.c;
                Surface surfaceD = keeVar.d(zh6Var, new vx1(ce4Var, i, keeVar));
                ce4Var.a.p(surfaceD);
                ce4Var.s0.put(keeVar, surfaceD);
                return;
            case 25:
                final ce4 ce4Var2 = (ce4) this.b;
                ce4Var2.t0++;
                zm4 zm4Var = ce4Var2.a;
                o76.d((AtomicBoolean) zm4Var.c, true);
                o76.c((Thread) zm4Var.e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(zm4Var.b);
                final see seeVar = (see) this.c;
                surfaceTexture.setDefaultBufferSize(seeVar.b.getWidth(), seeVar.b.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                d74 d74Var = new d74(ce4Var2, 5, seeVar);
                zh6 zh6Var2 = ce4Var2.c;
                seeVar.c(zh6Var2, d74Var);
                seeVar.b(surface, zh6Var2, new tj3() { // from class: be4
                    @Override // defpackage.tj3
                    public final void accept(Object obj2) {
                        ce4 ce4Var3 = ce4Var2;
                        ce4Var3.getClass();
                        see seeVar2 = seeVar;
                        synchronized (seeVar2.a) {
                            seeVar2.n = null;
                            seeVar2.o = null;
                        }
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        ce4Var3.t0--;
                        ce4Var3.d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(ce4Var2, ce4Var2.o);
                return;
            case 26:
                rf4 rf4Var = (rf4) this.b;
                rf4Var.getClass();
                int i4 = ((jn) this.c).b;
                rf4Var.f.K();
                return;
            case 27:
                rf4 rf4Var2 = (rf4) this.b;
                rf4Var2.getClass();
                rf4Var2.f.c(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
            case 28:
                Callable callable = (Callable) this.b;
                bkg bkgVar = (bkg) this.c;
                try {
                    ((ch4) bkgVar.b).i(callable.call());
                    return;
                } catch (Exception e2) {
                    ((ch4) bkgVar.b).j(e2);
                    return;
                }
            default:
                jl4 jl4Var = (jl4) this.b;
                if (!jl4Var.d.offer((Runnable) this.c)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                jl4Var.a();
                return;
        }
    }
}
