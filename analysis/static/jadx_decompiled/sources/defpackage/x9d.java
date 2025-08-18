package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import one.me.net.client.api.AddressUnreachableException;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.api.SessionSendLimitException;

/* loaded from: classes2.dex */
public final class x9d {
    public static final AtomicInteger F = new AtomicInteger(0);
    public static final AtomicInteger G = new AtomicInteger(0);
    public final int B;
    public boolean C;
    public final o6a D;
    public final mbd E;
    public final String a;
    public final int k;
    public final k33 n;
    public final uxc o;
    public final e6a p;
    public Socket q;
    public DataOutputStream r;
    public DataInputStream s;
    public final mh3 t;
    public final bs9 u;
    public final List w;
    public final aqb y;
    public final aqb z;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicLong i = new AtomicLong(0);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final ConcurrentHashMap v = new ConcurrentHashMap();
    public final Object x = new Object();
    public final AtomicInteger A = new AtomicInteger();

    public x9d(yk8 yk8Var) {
        G.incrementAndGet();
        int iIncrementAndGet = F.incrementAndGet();
        this.k = iIncrementAndGet;
        this.o = (uxc) yk8Var.d;
        this.p = (e6a) yk8Var.g;
        String strH = zr6.h(iIncrementAndGet, "TTSession#");
        this.a = strH;
        this.n = (k33) yk8Var.b;
        this.t = (mh3) yk8Var.f;
        this.u = (bs9) yk8Var.e;
        this.D = (o6a) yk8Var.h;
        int iMax = Math.max(0, yk8Var.a);
        this.B = iMax;
        hm9.m(strH, "init, sendLimitIfNoSession=%d", Integer.valueOf(iMax));
        this.y = new aqb();
        this.z = new aqb();
        mbd mbdVar = (mbd) yk8Var.c;
        this.E = mbdVar;
        x9d x9dVar = (x9d) yk8Var.i;
        if (x9dVar != null) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, strH, "init, has parent_session=" + x9dVar + ", take its sender_tasks ...", null);
            }
            synchronized (x9dVar.x) {
                this.w = x9dVar.w;
                x9dVar.w = new ArrayList();
            }
        } else {
            this.w = new ArrayList();
        }
        mbdVar.a("session-conn-handler", new u9d(this)).start();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, strH, "init, completed=" + this, null);
        }
    }

    public static void a(x9d x9dVar) {
        if (!x9dVar.m.get() || x9dVar.f.get() == 1) {
            return;
        }
        hm9.k0(x9dVar.a, null, "closeSessionIfMarkedToDestroy, closing " + x9dVar, Arrays.copyOf(new Object[0], 0));
        x9dVar.f(true);
    }

    public static boolean b(x9d x9dVar, bpa bpaVar, Class cls) {
        x9dVar.getClass();
        apa apaVar = bpaVar.b;
        if (apaVar == null || !cls.isInstance(apaVar.a)) {
            throw new IllegalStateException("wrong usage of method 'containsInPacketReader'");
        }
        Iterator it = x9dVar.v.entrySet().iterator();
        while (it.hasNext()) {
            apa apaVar2 = ((zoa) ((Map.Entry) it.next()).getValue()).b.b;
            if (apaVar2 != null && cls.isInstance(apaVar2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void c(x9d x9dVar, yoa yoaVar) {
        synchronized (x9dVar.x) {
            List list = x9dVar.w;
            int i = dc7.a;
            int i2 = ft4.o;
            list.add(new bpa(2, null, z7.S(System.currentTimeMillis(), kt4.MILLISECONDS), yoaVar));
        }
        x9dVar.z.a();
    }

    public static void d(x9d x9dVar) {
        x9dVar.getClass();
        hm9.k(x9dVar.a, x9dVar + ", " + Thread.currentThread().getName() + " finished");
    }

    public static String j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "<UNKNOWN>" : "LOGGED_IN" : "CONNECTED" : "DISCONNECTED";
    }

    public static long t() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public final void e(long j) {
        hm9.m(this.a, "cancel: %d", Long.valueOf(j));
        synchronized (this.x) {
            try {
                Iterator it = this.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bpa bpaVar = (bpa) it.next();
                    apa apaVar = bpaVar.b;
                    if (apaVar != null && apaVar.c.i() == j) {
                        this.w.remove(bpaVar);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Map.Entry entry : this.v.entrySet()) {
            if (((zoa) entry.getValue()).a.i() == j) {
                this.v.remove(entry.getKey());
                return;
            }
        }
    }

    public final void f(boolean z) {
        if (!this.f.compareAndSet(0, 1)) {
            hm9.k0(this.a, null, "close, " + this + " has ALREADY been CLOSED, skip re-closing", Arrays.copyOf(new Object[0], 0));
            return;
        }
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "close, closing the " + this, null);
        }
        q(false);
        this.y.a();
        this.z.a();
        if (g()) {
            h(true, z);
        }
        this.n.close();
        G.decrementAndGet();
        hm9.n(this.a, "close, " + this + " closed");
    }

    public final boolean g() throws IOException {
        Socket socket = this.q;
        if (socket == null || socket.isClosed()) {
            return false;
        }
        String str = this.a;
        hm9.n(str, "closeSocket");
        try {
            this.q.close();
        } catch (Exception e) {
            hm9.p(str, "failed to close socket", e);
            o(e);
        }
        try {
            this.n.c(this.q);
        } catch (Exception e2) {
            hm9.p(str, "failed to remove traffic stat from closed socket", e2);
        }
        DataInputStream dataInputStream = this.s;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (SocketException unused) {
            } catch (Throwable th) {
                hm9.l0(str, "fail to close " + dataInputStream, th);
            }
        }
        DataOutputStream dataOutputStream = this.r;
        if (dataOutputStream == null) {
            return true;
        }
        try {
            dataOutputStream.close();
            return true;
        } catch (SocketException unused2) {
            return true;
        } catch (Throwable th2) {
            hm9.l0(str, "fail to close " + dataOutputStream, th2);
            return true;
        }
    }

    public final void h(boolean z, boolean z2) {
        ArrayList arrayList;
        hm9.m(this.a, "disconnect: clearSenderTasks %b", Boolean.valueOf(z));
        p(0);
        this.g.set(false);
        if (!this.m.get()) {
            n();
        }
        gke gkeVar = new gke();
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            ((zoa) ((Map.Entry) it.next()).getValue()).a.g(gkeVar);
        }
        this.v.clear();
        if (z) {
            if (z2) {
                synchronized (this.x) {
                    this.w.clear();
                }
                return;
            }
            synchronized (this.x) {
                try {
                    arrayList = null;
                    for (bpa bpaVar : this.w) {
                        if (bpaVar.b != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(1);
                            }
                            arrayList.add(bpaVar);
                        }
                    }
                    this.w.clear();
                } finally {
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((bpa) it2.next()).b.c.g(gkeVar);
                }
            }
        }
    }

    public final void i(dle dleVar, boolean z, long j, dke dkeVar) {
        dle dleVar2;
        m(ds7.Y, dkeVar.i(), (short) 0, dleVar.N(), true, s5c.T((HashMap) dleVar.b));
        if (dleVar instanceof lu7) {
            this.v.clear();
            synchronized (this.x) {
                this.w.clear();
            }
        }
        if (dleVar.w()) {
            synchronized (this.x) {
                try {
                    ArrayList arrayList = null;
                    for (bpa bpaVar : this.w) {
                        apa apaVar = bpaVar.b;
                        if (apaVar != null && (dleVar2 = apaVar.a) != null && dleVar2.N() == dleVar.N() && bpaVar.b.a.O() == dleVar.O()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Long.valueOf(bpaVar.b.c.i()));
                            hm9.m(this.a, "cancel duplicated task: %s", sla.b(bpaVar.b.a.N()));
                        }
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            e(((Long) it.next()).longValue());
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.x) {
            List list = this.w;
            apa apaVar2 = new apa(dleVar, z, dkeVar);
            int i = ft4.o;
            list.add(new bpa(1, apaVar2, z7.S(j, kt4.MILLISECONDS), null));
        }
        this.z.a();
    }

    public final boolean k() {
        return this.c.get() == 0;
    }

    public final boolean l() {
        return this.f.get() == 0 && !this.m.get();
    }

    public final void m(ds7 ds7Var, long j, short s, short s2, boolean z, String str) {
        sla.c.getClass();
        String strC = yb9.c(s2);
        String str2 = sla.b(s2) + "(" + strC + ")";
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "->" : "<-");
        sb.append(' ');
        sb.append(ds7Var.b);
        sb.append(" [");
        sb.append(j);
        sb.append(',');
        sb.append((int) s);
        sb.append("] ");
        sb.append(str2);
        sb.append(' ');
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        hm9.N(ds7Var.a, this.a, string, new Object[0]);
        if (ds7Var == ds7.Z) {
            o(new IllegalStateException(rh4.j(str2, ": ", string)));
        }
    }

    public final void n() {
        if (l()) {
            jbd jbdVar = (jbd) this.t;
            jbdVar.i = 0;
            jbdVar.b();
        }
    }

    public final void o(Exception exc) {
        String message;
        if (l()) {
            jbd jbdVar = (jbd) this.t;
            jbdVar.getClass();
            boolean z = exc instanceof SessionSendLimitException;
            o45 o45Var = jbdVar.b;
            if (z) {
                o45Var.a(new ExceptionHandler$HandledException(null, ((SessionSendLimitException) exc).c, exc));
                return;
            }
            if (exc instanceof AddressUnreachableException) {
                o45Var.a(new ExceptionHandler$HandledException(null, ((AddressUnreachableException) exc).c, exc));
                return;
            }
            boolean z2 = exc instanceof IOException;
            je7 je7Var = jbdVar.c;
            if (!z2 && !(exc instanceof SecurityException)) {
                ((cba) o45Var).c(exc, true);
                ((ri4) je7Var.getValue()).getClass();
            }
            if ((exc instanceof SSLHandshakeException) && ((ri4) je7Var.getValue()).d() && (message = exc.getMessage()) != null) {
                if ((message.contains("current time") && message.contains("validation time")) || message.contains("not valid until")) {
                    ((ri4) je7Var.getValue()).getClass();
                }
            }
        }
    }

    public final void p(int i) {
        int andSet = this.c.getAndSet(i);
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, rh4.k("setConnectionsStatus, status=", j(i), ", old=", j(andSet)), null);
        }
        this.y.a();
        if (andSet == i || k()) {
            return;
        }
        this.z.a();
    }

    public final void q(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        String str = this.a;
        hm9.m(str, "setTryToConnect, tryToConnect=%b", objArr);
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.compareAndSet(!z, z) && z) {
            this.A.set(0);
            hm9.n(str, "setTryToConnect, reset counter of failed attempts to connect");
        }
        atomicBoolean.set(z);
        this.n.g(z);
        this.y.a();
    }

    public final void r() {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "startTimeoutHandler", null);
        }
        this.E.a("session-timeout-handler", new v9d(this, 2)).start();
    }

    public final void s(Exception exc) {
        long jH;
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            Locale locale = Locale.US;
            ir6Var.d(us7Var, str, "updateConnTimeoutAfterFail, curr_conn_errors=" + this.h.get() + ", curr_next_conn_epoch=" + this.i.get() + "ms", null);
        }
        AtomicInteger atomicInteger = this.A;
        atomicInteger.incrementAndGet();
        AtomicBoolean atomicBoolean = this.e;
        boolean z = atomicBoolean.get();
        AtomicInteger atomicInteger2 = this.h;
        if (!z || atomicInteger.get() >= 10) {
            atomicInteger2.incrementAndGet();
            jH = this.n.h(atomicInteger2.get());
        } else {
            jH = 1000;
        }
        AtomicLong atomicLong = this.i;
        atomicLong.set(t() + jH);
        hm9.r(str, exc, "updateConnTimeoutAfterFail, try_to_connect=%b, fa=%d, conn_errors=%d, next_conn_epoch=%d, delay=%dms", Boolean.valueOf(atomicBoolean.get()), Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), Long.valueOf(atomicLong.get()), Long.valueOf(jH));
    }

    public final String toString() {
        int size = this.w.size();
        StringBuilder sb = new StringBuilder(96);
        sb.append("Session@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(");
        sb.append(G.get());
        sb.append('|');
        int i = this.f.get();
        sb.append(i != 0 ? i != 1 ? "<UNKNOWN>" : "CLOSED" : "OPEN");
        sb.append('|');
        sb.append(j(this.c.get()));
        long j = this.l.get();
        long jMax = j != Long.MIN_VALUE ? Math.max(t() - j, 0L) : Long.MIN_VALUE;
        if (jMax != Long.MIN_VALUE) {
            au1.q(jMax, "|connecting~", "ms", sb);
        }
        sb.append("|destroy=");
        sb.append(this.m.get());
        sb.append("|send_tasks=");
        sb.append(size);
        sb.append(')');
        return sb.toString();
    }
}
