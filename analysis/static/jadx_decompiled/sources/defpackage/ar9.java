package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ar9 extends cr9 {
    public static final /* synthetic */ bc7[] i;
    public final gi9 e;
    public final ReentrantLock f;
    public final w4d g;
    public long h;

    static {
        oi9 oi9Var = new oi9(ar9.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public ar9(sx3 sx3Var, je7 je7Var) {
        super(sx3Var, je7Var);
        this.e = new gi9((Object) null);
        this.f = new ReentrantLock();
        this.g = mqd.D();
        int i2 = ft4.o;
        this.h = 0L;
        a();
        this.c = j47.T(sx3Var, null, null, new zq9(this, null), 3);
    }

    public final void d() {
        gi9 gi9Var = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int i2 = gi9Var.d;
                z7d z7dVar = ((p7b) ((m7b) this.b.getValue())).b;
                z7dVar.getClass();
                if (i2 < ((int) z7dVar.q(PmsKey.f97noncontactmaxchunksize, 10))) {
                    return;
                }
                int i3 = ft4.o;
                long jS = z7.S(System.nanoTime(), kt4.NANOSECONDS);
                if (ft4.c(ft4.g(jS, this.h), b()) <= 0) {
                    return;
                }
                this.h = jS;
                gi9 gi9VarJ = oag.j(gi9Var);
                gi9Var.c();
                this.g.o1(this, i[0], j47.T(this.a, null, vx3.b, new yq9(this, gi9VarJ, null), 1));
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean e() {
        if (ft4.c(b(), 0L) > 0) {
            z7d z7dVar = ((p7b) ((m7b) this.b.getValue())).b;
            z7dVar.getClass();
            if (((int) z7dVar.q(PmsKey.f97noncontactmaxchunksize, 10)) > 0) {
                return true;
            }
        }
        return false;
    }
}
