package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class g84 {
    public final /* synthetic */ i84 a;

    public final void a(int i) {
        i84 i84Var = this.a;
        synchronized (i84Var) {
            int i2 = i84Var.m;
            if (i2 == 0 || i84Var.d) {
                if (i2 == i) {
                    return;
                }
                i84Var.m = i;
                if (i != 1 && i != 0 && i != 8) {
                    i84Var.k = i84Var.b(i);
                    i84Var.c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    i84Var.c(i84Var.f > 0 ? (int) (jElapsedRealtime - i84Var.g) : 0, i84Var.h, i84Var.k);
                    i84Var.g = jElapsedRealtime;
                    i84Var.h = 0L;
                    i84Var.j = 0L;
                    i84Var.i = 0L;
                    btd btdVar = i84Var.e;
                    btdVar.c.clear();
                    btdVar.d = -1;
                    btdVar.e = 0;
                    btdVar.f = 0;
                }
            }
        }
    }
}
