package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class f84 {
    public final /* synthetic */ h84 a;

    public final void a(int i) {
        h84 h84Var = this.a;
        synchronized (h84Var) {
            int i2 = h84Var.i;
            if (i2 == 0 || h84Var.e) {
                if (i2 == i) {
                    return;
                }
                h84Var.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    h84Var.l = h84Var.c(i);
                    h84Var.d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    h84Var.d(h84Var.f > 0 ? (int) (jElapsedRealtime - h84Var.g) : 0, h84Var.h, h84Var.l);
                    h84Var.g = jElapsedRealtime;
                    h84Var.h = 0L;
                    h84Var.k = 0L;
                    h84Var.j = 0L;
                    btd btdVar = h84Var.c;
                    btdVar.c.clear();
                    btdVar.d = -1;
                    btdVar.e = 0;
                    btdVar.f = 0;
                }
            }
        }
    }
}
