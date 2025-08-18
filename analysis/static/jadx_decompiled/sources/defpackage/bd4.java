package defpackage;

import android.net.TrafficStats;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class bd4 implements k33 {
    public final cjg a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final LinkedHashMap c;
    public final LinkedHashSet d;
    public final ai3 e;
    public final ztc f;
    public final zwd g;
    public volatile Iterator h;
    public volatile mpb i;
    public final eh3 j;
    public tg3 k;

    public bd4(cjg cjgVar, String str, String str2, zwd zwdVar, xxc xxcVar, ai3 ai3Var, ztc ztcVar) {
        new AtomicBoolean();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        this.k = new tg3(false);
        this.a = cjgVar;
        this.e = ai3Var;
        this.f = ztcVar;
        this.g = zwdVar;
        this.j = new eh3(str, str2, true);
    }

    @Override // defpackage.k33
    public final ai3 a() {
        return this.e;
    }

    @Override // defpackage.k33
    public final void c(Socket socket) throws SocketException {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    @Override // defpackage.k33
    public final void close() {
        hm9.k("bd4", "close request");
        l(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #1 {all -> 0x0056, blocks: (B:14:0x0043, B:16:0x0050, B:19:0x0059, B:21:0x0081, B:25:0x008e, B:26:0x0093, B:28:0x00a2, B:30:0x00a8, B:31:0x00ad, B:32:0x00d3), top: B:114:0x0043, outer: #3 }] */
    @Override // defpackage.k33
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.Socket connect() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd4.connect():java.net.Socket");
    }

    @Override // defpackage.k33
    public final int d() {
        if (this.i != null) {
            return ((Number) this.i.f.d.getValue()).intValue();
        }
        return -1;
    }

    @Override // defpackage.k33
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k33
    public final void g(boolean z) {
        this.b.set(z);
    }

    @Override // defpackage.k33
    public final long h(int i) {
        return di0.o(i, ((ri4) this.a.a).d());
    }

    @Override // defpackage.k33
    public final String i() {
        return this.i != null ? this.i.f.a : "unresolved";
    }

    @Override // defpackage.k33
    public final tg3 k() {
        return this.k;
    }

    public final void l(mpb mpbVar) {
        hm9.n("bd4", "cancel tasks".concat(mpbVar != null ? wg0.i(", except ", mpbVar.f.toString()) : ""));
        synchronized (this.d) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    if (mpbVar == null) {
                        ((Future) entry.getValue()).cancel(true);
                    } else if (!((eh3) entry.getKey()).equals(mpbVar.f)) {
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final mpb m() {
        mpb mpbVar;
        mpb mpbVar2;
        Iterator it = this.c.values().iterator();
        while (true) {
            mpbVar = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                mpbVar2 = (mpb) ((Future) it.next()).get();
            } catch (CancellationException e) {
                hm9.n("bd4", "skip cancelled task, error: " + e.toString());
            } catch (Exception e2) {
                hm9.p("bd4", "execution error: " + e2.toString(), null);
                hm9.n("bd4", "connection error");
            }
            if (mpbVar2 != null && mpbVar2.d != null) {
                mpbVar = mpbVar2;
                break;
            }
        }
        synchronized (this.d) {
            this.c.clear();
        }
        return mpbVar;
    }

    public final void n(eh3 eh3Var, int i, int i2, TimeUnit timeUnit) {
        hm9.m("bd4", "schedule connection: delay = %d host = %s", Integer.valueOf(i2), eh3Var.toString());
        mpb mpbVar = new mpb(this.a, eh3Var, this.g, this.e, i);
        int i3 = 4;
        q1a q1aVar = new q1a(1, new d74(this, i3, mpbVar));
        ztc ztcVar = this.f;
        ib3 ib3Var = new ib3(new rqd(q1aVar.m(ztcVar), new q64(3, this), 2), i3, new p00(this, 1, mpbVar));
        d2a d2aVarU = qy9.u(i2, timeUnit, ztcVar);
        c76 c76Var = new c76();
        Objects.requireNonNull(c76Var, "observer is null");
        try {
            d2aVarU.a(new pqd(c76Var, ib3Var));
            this.c.put(eh3Var, c76Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
