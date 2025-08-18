package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* loaded from: classes2.dex */
public final class koc {
    public final noc a;
    public final HandlerThread e;
    public final Handler f;
    public final k8g n;
    public final a4c o;
    public final AtomicReference b = new AtomicReference(null);
    public final pbg c = new pbg(this);
    public final vag d = new vag(2, this);
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final xjc i = new xjc();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();

    public koc(aab aabVar) {
        noc nocVar = (noc) aabVar.b;
        if (nocVar == null) {
            throw new IllegalArgumentException("Illegal 'serializer' value: null");
        }
        this.a = nocVar;
        a4c a4cVar = (a4c) aabVar.a;
        this.o = a4cVar;
        this.n = new k8g(a4cVar);
        HandlerThread handlerThread = new HandlerThread("RtcCommExec");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.g.removeCallbacksAndMessages(null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i >= longSparseArray.size()) {
                return;
            }
            long jKeyAt = longSparseArray.keyAt(i);
            uag uagVar = (uag) longSparseArray.valueAt(i);
            uagVar.e = 0L;
            uagVar.f = 0L;
            linkedList.offer(Long.valueOf(jKeyAt));
            i++;
        }
    }

    public final void b() {
        Handler handler = this.h;
        k8g k8gVar = this.n;
        e24 e24Var = (e24) this.b.get();
        if (e24Var == null || !e24Var.b()) {
            return;
        }
        LinkedList linkedList = this.m;
        for (Long l = (Long) linkedList.poll(); l != null; l = (Long) linkedList.poll()) {
            LongSparseArray longSparseArray = this.l;
            uag uagVar = (uag) longSparseArray.get(l.longValue());
            if (uagVar != null) {
                try {
                    sh0 sh0VarW = this.a.W(uagVar.b, uagVar.c);
                    byte[] bArr = (byte[]) sh0VarW.c;
                    int i = sh0VarW.b;
                    boolean zE = e24Var.e(i, bArr);
                    if (zE) {
                        hoc hocVar = uagVar.c;
                        k8gVar.getClass();
                        gbg gbgVar = new gbg(k8gVar, hocVar, 2);
                        Handler handler2 = (Handler) k8gVar.c;
                        handler2.post(gbgVar);
                        handler2.post(new hbg(k8gVar, bArr, i, 1));
                    }
                    if (zE) {
                        if (uagVar.c.a()) {
                            k8gVar.e(uagVar.c);
                            longSparseArray.remove(uagVar.b);
                        }
                        handler.post(new ule(20, uagVar));
                    } else {
                        c(uagVar.b);
                    }
                } catch (Throwable th) {
                    hoc hocVar2 = uagVar.c;
                    k8gVar.getClass();
                    ((Handler) k8gVar.c).post(new ewc(k8gVar, hocVar2, th, 17));
                    k8gVar.e(uagVar.c);
                    handler.post(new fre(uagVar, 27, th));
                    longSparseArray.remove(uagVar.b);
                }
            }
        }
    }

    public final void c(long j) {
        LongSparseArray longSparseArray = this.l;
        uag uagVar = (uag) longSparseArray.get(j);
        if (uagVar == null || this.j.get()) {
            return;
        }
        ioc iocVar = uagVar.d;
        long j2 = iocVar.e;
        xjc xjcVar = this.i;
        if (j2 < 0) {
            xjcVar.getClass();
            throw new IllegalArgumentException(ey8.h(j2, "Illegal 'minRetryTimeoutMs' value: "));
        }
        xjcVar.getClass();
        long j3 = iocVar.f;
        if (j3 < 0) {
            throw new IllegalArgumentException(ey8.h(j3, "Illegal 'maxRetryTimeoutMs' value: "));
        }
        float f = iocVar.g;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f);
        }
        float f2 = iocVar.h;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f2);
        }
        xjcVar.a = f2;
        long j4 = uagVar.f;
        if (j4 < 0) {
            throw new IllegalArgumentException(ey8.h(j4, "Illegal 'latestRetryTimeout' value: "));
        }
        uagVar.e++;
        float fMax = Math.max(j2, Math.min((long) (j4 * f), j3));
        long jNextGaussian = (long) (fMax + ((float) (((Random) xjcVar.b).nextGaussian() * fMax * xjcVar.a)));
        uagVar.f = jNextGaussian;
        if (uagVar.e < 0) {
            this.g.postDelayed(new joc(this, j, 1), jNextGaussian);
            return;
        }
        RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
        k8g k8gVar = this.n;
        k8gVar.getClass();
        hoc hocVar = iocVar.b;
        ((Handler) k8gVar.c).post(new ewc(k8gVar, hocVar, rtcRetryLimitExceedException, 17));
        k8gVar.e(hocVar);
        this.h.post(new fre(uagVar, 27, rtcRetryLimitExceedException));
        longSparseArray.remove(j);
    }

    public final void d(ioc iocVar) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new flc(this, 4, iocVar));
    }
}
