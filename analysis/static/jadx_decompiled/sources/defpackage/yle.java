package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class yle implements fh3, gbd {
    public static final short[] t0;
    public final je7 X;
    public final AtomicReference Y;
    public final AtomicLong Z;
    public final kad a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final String s0;

    static {
        yb9 yb9Var = sla.c;
        yb9 yb9Var2 = sla.c;
        yb9 yb9Var3 = sla.c;
        yb9 yb9Var4 = sla.c;
        t0 = new short[]{1, 5, 6, 89};
    }

    public yle(kad kadVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, hbd hbdVar) {
        this.a = kadVar;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        AtomicReference atomicReference = new AtomicReference(null);
        this.Y = atomicReference;
        this.Z = new AtomicLong(0L);
        this.s0 = "SessionController";
        ((jbd) hbdVar).a(this);
        ((ch3) je7Var4.getValue()).a().c(this);
        atomicReference.set(g());
    }

    public static x9d d(yle yleVar, x9d x9dVar) {
        x9d x9dVar2;
        se5 se5Var = ((p7b) ((m7b) yleVar.b.getValue())).e;
        se5Var.getClass();
        if (!se5Var.n(PmsKey.f93newsessionlogic, false) || x9dVar == null || x9dVar.l.get() == Long.MIN_VALUE) {
            return x9dVar;
        }
        String str = yleVar.s0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Z, str, "old_session=" + x9dVar + " in connect process", null);
        }
        String str2 = x9dVar.a;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, "fork, " + x9dVar, null);
        }
        if (x9dVar.f.get() != 1 && x9dVar.m.compareAndSet(false, true)) {
            k33 k33Var = x9dVar.n;
            mbd mbdVar = x9dVar.E;
            uxc uxcVar = x9dVar.o;
            bs9 bs9Var = x9dVar.u;
            mh3 mh3Var = x9dVar.t;
            e6a e6aVar = x9dVar.p;
            o6a o6aVar = x9dVar.D;
            int i = x9dVar.B;
            yk8 yk8Var = new yk8(k33Var, mbdVar, uxcVar, bs9Var, mh3Var, e6aVar, o6aVar);
            yk8Var.a = i;
            yk8Var.i = x9dVar;
            x9dVar2 = new x9d(yk8Var);
            x9dVar.y.a();
            x9dVar.z.a();
            if (!x9dVar.j.get()) {
                x9dVar.r();
            }
        } else {
            hm9.p(x9dVar.a, "failed to fork " + x9dVar + " because is ALREADY in an INACTIVE state", null);
            x9dVar2 = null;
        }
        if (x9dVar2 == null) {
            String str3 = yleVar.s0;
            ir6 ir6Var3 = hm9.m;
            if (ir6Var3 == null || !ir6Var3.c()) {
                return x9dVar;
            }
            ir6Var3.d(us7.Z, str3, "seems new session creation was already scheduled", null);
            return x9dVar;
        }
        String str4 = yleVar.s0;
        ir6 ir6Var4 = hm9.m;
        if (ir6Var4 != null && ir6Var4.c()) {
            ir6Var4.d(us7.X, str4, "new_session=" + x9dVar2 + " was created, old_session=" + x9dVar, null);
        }
        return x9dVar2;
    }

    @Override // defpackage.fh3
    public final void a() {
        f(false);
    }

    @Override // defpackage.fh3
    public final void b() {
        x9d x9dVar;
        hm9.n(this.s0, "onConnectionTypeChange");
        AtomicReference atomicReference = this.Y;
        x9d x9dVar2 = (x9d) atomicReference.get();
        if (x9dVar2 == null) {
            return;
        }
        je7 je7Var = this.X;
        if (!((ch3) je7Var.getValue()).a().f()) {
            x9dVar2.q(false);
            x9dVar2.h(true, false);
        } else if (((ch3) je7Var.getValue()).f() && (x9dVar = (x9d) atomicReference.updateAndGet(new xle(this, 1))) != null) {
            x9dVar.q(true);
        }
    }

    @Override // defpackage.gbd
    public final void c(int i) {
        AtomicReference atomicReference = this.Y;
        String str = this.s0;
        if (i == 0) {
            hm9.m0(str, "onNoNet", new Object[0]);
            x9d x9dVar = (x9d) atomicReference.get();
            if (x9dVar != null) {
                j(x9dVar);
                return;
            }
            return;
        }
        if (i == 1) {
            hm9.n(str, "onDisconnected");
            x9d x9dVar2 = (x9d) atomicReference.get();
            if (x9dVar2 == null) {
                hm9.m0(str, "onDisconnected, has NO active session!", new Object[0]);
                return;
            } else {
                j(x9dVar2);
                return;
            }
        }
        if (i == 2) {
            hm9.n(str, "onConnected");
        } else if (i == 3) {
            hm9.n(str, "onLoggedIn");
        } else {
            throw new IllegalStateException(("Unknown session state=" + i).toString());
        }
    }

    public final boolean e(dle dleVar, dke dkeVar) {
        if (!((f5a) this.c.getValue()).e()) {
            return false;
        }
        short sN = dleVar.N();
        short[] sArr = t0;
        if (Arrays.binarySearch(sArr, 0, sArr.length, sN) >= 0) {
            return false;
        }
        dkeVar.g(new pke("session.forbidden.opcode.in.external.auth", "forbidden opcode in external authorization", null));
        return true;
    }

    public final void f(boolean z) {
        if (!z) {
            je7 je7Var = this.X;
            if (!((ch3) je7Var.getValue()).a().f() || !((ch3) je7Var.getValue()).f()) {
                return;
            }
        }
        x9d x9dVar = (x9d) this.Y.updateAndGet(new xle(this, 1));
        if (x9dVar != null) {
            x9dVar.q(true);
        }
    }

    public final x9d g() {
        kad kadVar = this.a;
        mbd mbdVar = (mbd) ((khe) kadVar.Z).getValue();
        uxc uxcVar = (uxc) ((je7) kadVar.o).getValue();
        bs9 bs9Var = (bs9) ((je7) kadVar.c).getValue();
        mh3 mh3Var = (mh3) ((je7) kadVar.b).getValue();
        e6a e6aVar = (e6a) ((je7) kadVar.X).getValue();
        o6a o6aVar = (o6a) ((je7) kadVar.Y).getValue();
        z7d z7dVar = ((p7b) ((m7b) this.b.getValue())).b;
        z7dVar.getClass();
        int iQ = (int) z7dVar.q(PmsKey.f112sendqueuesize, 30);
        yk8 yk8Var = new yk8((jad) kadVar.a, mbdVar, uxcVar, bs9Var, mh3Var, e6aVar, o6aVar);
        yk8Var.a = iQ;
        yk8Var.i = null;
        return new x9d(yk8Var);
    }

    public final void h() {
        int size;
        x9d x9dVar = (x9d) this.Y.get();
        if (x9dVar == null) {
            return;
        }
        z7d z7dVar = ((p7b) ((m7b) this.b.getValue())).b;
        z7dVar.getClass();
        int iQ = (int) z7dVar.q(PmsKey.f30disconnecttimeout, HttpStatus.SC_MULTIPLE_CHOICES);
        if (iQ <= 0 || !((f5a) this.c.getValue()).d() || ((ri4) this.o.getValue()).d() || ((ri4) this.o.getValue()).c()) {
            return;
        }
        long j = this.Z.get();
        int i = ft4.o;
        ((ri4) this.o.getValue()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kt4 kt4Var = kt4.MILLISECONDS;
        boolean z = ft4.c(ft4.g(z7.S(jElapsedRealtime, kt4Var), z7.S(j, kt4Var)), z7.R(iQ, kt4Var)) > 0;
        if (j <= 0 || !z) {
            return;
        }
        synchronized (x9dVar.x) {
            size = x9dVar.w.size();
        }
        if (size != 0) {
            return;
        }
        hm9.n(this.s0, "disconnectIfNeeded: timeout expired, disconnect");
        x9dVar.q(false);
        x9dVar.h(true, false);
    }

    public final void i() {
        this.Y.getAndUpdate(new xle(this, 0));
    }

    public final void j(x9d x9dVar) {
        String str = this.s0;
        hm9.n(str, "updateSession");
        je7 je7Var = this.X;
        if (!((ch3) je7Var.getValue()).a().f()) {
            hm9.m0(str, "updateSession, seems there is NO net", new Object[0]);
            x9dVar.q(false);
        } else if (((ch3) je7Var.getValue()).f()) {
            x9dVar.q(true);
        } else {
            hm9.m0(str, "updateSession, connection is NOT permitted", new Object[0]);
            x9dVar.q(false);
        }
    }
}
