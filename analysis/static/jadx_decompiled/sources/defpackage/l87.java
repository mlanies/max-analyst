package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class l87 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n87 b;

    public /* synthetic */ l87(n87 n87Var, int i) {
        this.a = i;
        this.b = n87Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g05 g05Var;
        int i;
        switch (this.a) {
            case 0:
                n87 n87Var = this.b;
                n87Var.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (n87Var) {
                    g05Var = n87Var.e;
                    i = n87Var.f;
                    n87Var.e = null;
                    n87Var.f = 0;
                    n87Var.g = 3;
                    n87Var.i = jUptimeMillis;
                }
                try {
                    if (n87.d(g05Var, i)) {
                        n87Var.b.e(g05Var, i);
                    }
                    return;
                } finally {
                    g05.d(g05Var);
                    n87Var.b();
                }
            default:
                n87 n87Var2 = this.b;
                n87Var2.a.execute(n87Var2.c);
                return;
        }
    }
}
