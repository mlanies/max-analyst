package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class kj {
    public final bg4 a;
    public final kad b;
    public volatile Integer c;
    public volatile e24 d;
    public volatile g24 e;
    public final jj f = new toc() { // from class: jj
        @Override // defpackage.toc
        public final void a(e24 e24Var, boolean z) {
            rw4 rw4Var = this.a.g;
            if (rw4Var != null) {
                rw4Var.a();
            }
        }
    };
    public volatile rw4 g;
    public volatile long h;

    /* JADX WARN: Type inference failed for: r2v1, types: [jj] */
    public kj(bg4 bg4Var, kad kadVar, Integer num) {
        this.a = bg4Var;
        this.b = kadVar;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new rw4(this);
        bg4Var.getClass();
    }

    public final void a(int i, tu0 tu0Var) {
        String strI;
        g24 g24Var;
        Boolean boolValueOf = null;
        boolean z = true;
        ij ijVar = (i == 1 && (tu0Var instanceof zh)) ? null : new ij(i, (int) (SystemClock.elapsedRealtime() - this.h), tu0Var);
        if (ijVar != null && (g24Var = this.e) != null) {
            AtomicInteger atomicInteger = g24Var.X;
            int i2 = atomicInteger.get();
            int i3 = g24Var.b;
            kad kadVar = g24Var.a;
            if (i2 > i3) {
                ((AtomicInteger) kadVar.c).incrementAndGet();
                z = false;
            } else {
                g24Var.o.add(ijVar);
                ((AtomicInteger) kadVar.o).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = g24Var.s0;
                reentrantLock.lock();
                try {
                    g24Var.t0.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (tpa.f(boolValueOf, Boolean.TRUE)) {
            return;
        }
        if (tu0Var instanceof yh) {
            ((yh) tu0Var).getClass();
            throw null;
        }
        if (tu0Var instanceof zh) {
            nd7.e(16);
            String string = Long.toString(((zh) tu0Var).n & 4294967295L, 16);
            strI = wg0.i("bgColor: 0x", w9e.H0(string, string.length() > 6 ? 8 : 6, '0'));
        } else {
            if (!(tu0Var instanceof ai)) {
                throw new NoWhenBranchMatchedException();
            }
            strI = "EOS";
        }
        ((a4c) this.a.b).log("AniSend", "package was not sent: " + strI);
    }

    public final void b() {
        e24 e24Var = this.d;
        if (e24Var != null) {
            jj jjVar = this.f;
            if (jjVar == null) {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
            e24Var.c.remove(jjVar);
        }
        this.d = null;
        g24 g24Var = this.e;
        if (g24Var != null) {
            if (!g24Var.v0) {
                g24Var.v0 = true;
                g24Var.interrupt();
            }
            ReentrantLock reentrantLock = g24Var.u0;
            reentrantLock.lock();
            try {
                g24Var.c = null;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.e = null;
    }

    public final void c(int i) {
        rw4 rw4Var = this.g;
        Integer num = this.c;
        if (rw4Var != null) {
            rw4Var.b = Integer.valueOf(i);
            rw4Var.a();
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 2) {
                a(iIntValue, new zh(i));
                return;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        a4c a4cVar = (a4c) this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        a4cVar.reportException("AniSend", message, illegalStateException);
        rw4 rw4Var2 = new rw4(this);
        rw4Var2.b = Integer.valueOf(i);
        rw4Var2.a();
        this.g = rw4Var2;
    }

    public final void d(e24 e24Var) {
        b();
        this.d = e24Var;
        jj jjVar = this.f;
        if (jjVar == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        e24Var.c.add(jjVar);
        this.h = SystemClock.elapsedRealtime();
        kad kadVar = this.b;
        ((AtomicInteger) kadVar.a).set(0);
        ((AtomicInteger) kadVar.b).set(0);
        ((AtomicInteger) kadVar.c).set(0);
        ((AtomicInteger) kadVar.o).set(0);
        this.e = new g24(e24Var, this.b);
        g24 g24Var = this.e;
        if (g24Var != null) {
            g24Var.start();
        }
        rw4 rw4Var = this.g;
        if (rw4Var != null) {
            rw4Var.a();
        }
    }
}
