package defpackage;

import android.os.StrictMode;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ConnectException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u9d implements Runnable {
    public int X;
    public final /* synthetic */ x9d Y;
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long o;

    public u9d(x9d x9dVar) {
        this.Y = x9dVar;
        this.a = zr6.h(x9dVar.k, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.o > 0) {
            return this.X;
        }
        return -1;
    }

    public final void b(String str) {
        hm9.m(this.Y.a, "%s: %s", this.a, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        u9d u9dVar = this;
        boolean z3 = true;
        String str2 = "%s: %s";
        u9dVar.b("started ->");
        u9dVar.c = System.currentTimeMillis();
        long j = -1;
        long j2 = -1;
        while (true) {
            if (!u9dVar.Y.l()) {
                break;
            }
            aqb aqbVar = u9dVar.Y.y;
            aqbVar.getClass();
            try {
                aqbVar.b(j2);
                if (!u9dVar.Y.l()) {
                    hm9.k0(u9dVar.Y.a, null, str2, Arrays.copyOf(new Object[]{u9dVar.a, String.format(u9dVar.b, "detect CLOSED session in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - u9dVar.c))}, 2));
                    break;
                }
                int i = u9dVar.Y.c.get();
                if (i != 0) {
                    if (i == z3) {
                        u9dVar.b(String.format(u9dVar.b, "active_conn#%d, detect connected status", Integer.valueOf(a())));
                    } else if (i == 2) {
                        u9dVar.b(String.format(u9dVar.b, "active_conn#%d, detect loggedIn status", Integer.valueOf(a())));
                    }
                    str = str2;
                    str2 = str;
                    z3 = true;
                    j = -1;
                    j2 = -1;
                } else {
                    hm9.k0(u9dVar.Y.a, null, str2, Arrays.copyOf(new Object[]{u9dVar.a, String.format(u9dVar.b, "active_conn#%d, detect disconnected status", Integer.valueOf(a()))}, 2));
                }
                if (u9dVar.Y.e.get()) {
                    u9dVar.b(String.format(u9dVar.b, "active_conn#%d, detect tryToConnect status ...", Integer.valueOf(a())));
                    long j3 = u9dVar.Y.i.get();
                    u9dVar.Y.getClass();
                    long jT = x9d.t();
                    long j4 = j3 - jT;
                    u9dVar.b(String.format(u9dVar.b, "curr_epoch=%dms, next conn_epoch=%dms | in %dms", Long.valueOf(jT), Long.valueOf(j3), Long.valueOf(j4)));
                    if (j3 > 0 && jT < j3) {
                        u9dVar.b(String.format(u9dVar.b, "setup waiting timeout=%dms", Long.valueOf(j4)));
                        j2 = j4;
                    } else if (u9dVar.Y.l()) {
                        if (u9dVar.Y.k()) {
                            if (u9dVar.o > 0) {
                                hm9.k0(u9dVar.Y.a, null, str2, Arrays.copyOf(new Object[]{u9dVar.a, String.format(u9dVar.b, "active_conn#%d, finished in %dms <-", Integer.valueOf(u9dVar.X), Long.valueOf(System.currentTimeMillis() - u9dVar.o))}, 2));
                            }
                            u9dVar.o = j;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        x9d x9dVar = u9dVar.Y;
                        if (x9dVar.k() && !x9dVar.m.get()) {
                            long jT2 = x9d.t();
                            x9dVar.l.set(jT2);
                            try {
                                hm9.n(x9dVar.a, "Connect");
                                x9dVar.g();
                                x9dVar.q = x9dVar.n.connect();
                                x9dVar.l.set(Long.MIN_VALUE);
                                if (x9dVar.m.get()) {
                                    x9dVar.g();
                                    z2 = z3 ? 1 : 0;
                                } else {
                                    z2 = false;
                                }
                            } catch (Exception e) {
                                str = str2;
                                if (x9dVar.m.get()) {
                                    x9dVar.g();
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    hm9.p(x9dVar.a, "connectToSocket failure!", e);
                                    if ((e instanceof ConnectException) && x9dVar.D != null) {
                                        hm9.G("TTSession", "disableConnProblems", null);
                                        int i2 = i9e.a;
                                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                    }
                                    x9dVar.p(0);
                                    x9dVar.g.set(false);
                                    x9dVar.n();
                                    x9dVar.o(e);
                                    x9dVar.s(e);
                                }
                            } finally {
                                x9dVar.l.set(Long.MIN_VALUE);
                            }
                            if (z2) {
                                x9dVar.l.set(Long.MIN_VALUE);
                            } else {
                                x9dVar.r = new DataOutputStream(x9dVar.q.getOutputStream());
                                x9dVar.s = new DataInputStream(x9dVar.q.getInputStream());
                                x9dVar.p(z3 ? 1 : 0);
                                hm9.m(x9dVar.a, "Connect success, time: %s, host: %s, port: %s", Long.valueOf(x9d.t() - jT2), x9dVar.n.i(), Integer.valueOf(x9dVar.n.d()));
                                x9dVar.d.set(System.currentTimeMillis());
                                if (x9dVar.l()) {
                                    jbd jbdVar = (jbd) x9dVar.t;
                                    jbdVar.i = z3 ? 1 : 0;
                                    jbdVar.b();
                                }
                                x9dVar.h.set(0);
                                x9dVar.i.set(0L);
                                x9dVar.l.set(Long.MIN_VALUE);
                                x9d x9dVar2 = u9dVar.Y;
                                if (x9dVar2.j.compareAndSet(false, z3)) {
                                    hm9.n(x9dVar2.a, "tryToCreateOtherThreads");
                                    x9dVar2.r();
                                    String str3 = x9dVar2.a;
                                    ir6 ir6Var = hm9.m;
                                    if (ir6Var != null && ir6Var.c()) {
                                        ir6Var.d(us7.X, str3, "startPacketReader", null);
                                    }
                                    x9dVar2.E.a("session-reader-packet", new v9d(x9dVar2, 0)).start();
                                    String str4 = x9dVar2.a;
                                    ir6 ir6Var2 = hm9.m;
                                    if (ir6Var2 != null && ir6Var2.c()) {
                                        ir6Var2.d(us7.X, str4, "startPacketSender", null);
                                    }
                                    x9dVar2.E.a("session-sender-packet", new v9d(x9dVar2, z3 ? 1 : 0)).start();
                                }
                                u9dVar.X += z3 ? 1 : 0;
                                tg3 tg3VarK = u9dVar.Y.n.k();
                                tg3VarK.c = u9dVar.X;
                                long j5 = tg3VarK.a;
                                long j6 = tg3VarK.b;
                                long j7 = tg3VarK.a;
                                long j8 = (1 > j7 || j7 > j6) ? -1L : tg3VarK.b - tg3VarK.a;
                                long j9 = tg3VarK.d;
                                long j10 = tg3VarK.e;
                                long j11 = tg3VarK.f;
                                str = str2;
                                String str5 = tg3VarK.g;
                                int i3 = tg3VarK.h;
                                ug3 ug3Var = new ug3(j5, j8, j9, j10, j11, str5, i3, tg3VarK.c);
                                wle wleVar = (wle) u9dVar.Y.u;
                                ad adVar = (ad) wleVar.b.getValue();
                                zh3 zh3VarB = ((gh3) wleVar.d.getValue()).b();
                                boolean zD = ((ri4) wleVar.c.getValue()).d();
                                if (!adVar.a().c()) {
                                    e47 e47Var = new e47();
                                    e47Var.a = j5;
                                    e47Var.c = "CONN";
                                    e47Var.b = ((hyc) ((q33) adVar.a.getValue())).t();
                                    e47Var.o = "TOTAL_CONNECT";
                                    us usVar = new us(0);
                                    usVar.put("dns_resolve", Long.valueOf(j9));
                                    usVar.put("tcp_handshake", Long.valueOf(j10));
                                    usVar.put("tls_handshake", Long.valueOf(j11));
                                    usVar.put("total_connect", Long.valueOf(j8));
                                    boolean z4 = !zD;
                                    usVar.put("background", Boolean.valueOf(z4));
                                    usVar.put("conn", zh3VarB.a());
                                    usVar.put("value", String.format(((hyc) ((q33) adVar.a.getValue())).v(), "%s:%d", Arrays.copyOf(new Object[]{str5, Integer.valueOf(i3)}, 2)));
                                    e47Var.b(usVar);
                                    if (adVar.j(e47Var.c())) {
                                        ((op) ((cd) adVar.c.getValue())).getClass();
                                        kpa[] kpaVarArr = {new kpa("in_background", Boolean.valueOf(z4)), new kpa("connection_type", zh3VarB)};
                                        op.a("dns_resolve", j9, kpaVarArr);
                                        op.a("tcp_handshake", j10, kpaVarArr);
                                        op.a("tls_handshake", j11, kpaVarArr);
                                        op.a("total_connect", j8, kpaVarArr);
                                    }
                                    u9dVar = this;
                                }
                                u9dVar.b(String.format(u9dVar.b, "connectToSocket() took %dms, perf_metrics=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), ug3Var.toString()));
                                u9dVar.o = System.currentTimeMillis();
                                u9dVar.b(String.format(u9dVar.b, "active_conn#%d, started ->", Integer.valueOf(u9dVar.X)));
                                str2 = str;
                                z3 = true;
                                j = -1;
                                j2 = -1;
                            }
                        }
                    }
                }
                str = str2;
                str2 = str;
                z3 = true;
                j = -1;
                j2 = -1;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                hm9.q(u9dVar.Y.a, str2, u9dVar.a, String.format(u9dVar.b, "waiting was interrupted in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - u9dVar.c)));
            }
        }
        u9dVar.b(String.format(u9dVar.b, "finished in %dms <-", Long.valueOf(System.currentTimeMillis() - u9dVar.c)));
        x9d.a(u9dVar.Y);
        x9d.d(u9dVar.Y);
    }
}
