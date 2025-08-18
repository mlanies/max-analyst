package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ki0 implements t24 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public a34 o;

    public ki0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(z0fVar)) {
            return;
        }
        arrayList.add(z0fVar);
        this.c++;
    }

    public final void b(int i) {
        a34 a34Var = this.o;
        int i2 = oaf.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            z0f z0fVar = (z0f) this.b.get(i3);
            boolean z = this.a;
            i84 i84Var = (i84) z0fVar;
            synchronized (i84Var) {
                ffc ffcVar = i84.n;
                if (z && (a34Var.i & 8) != 8) {
                    i84Var.h += i;
                }
            }
        }
    }

    public final void c() {
        a34 a34Var = this.o;
        int i = oaf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            z0f z0fVar = (z0f) this.b.get(i2);
            boolean z = this.a;
            i84 i84Var = (i84) z0fVar;
            synchronized (i84Var) {
                try {
                    ffc ffcVar = i84.n;
                    if (z && (a34Var.i & 8) != 8) {
                        fm9.k(i84Var.f > 0);
                        i84Var.c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - i84Var.g);
                        i84Var.i += i3;
                        long j = i84Var.j;
                        long j2 = i84Var.h;
                        i84Var.j = j + j2;
                        if (i3 > 0) {
                            i84Var.e.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (i84Var.i >= 2000 || i84Var.j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                i84Var.k = (long) i84Var.e.b();
                            }
                            i84Var.c(i3, i84Var.h, i84Var.k);
                            i84Var.g = jElapsedRealtime;
                            i84Var.h = 0L;
                        }
                        i84Var.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((z0f) this.b.get(i)).getClass();
        }
    }

    public final void f(a34 a34Var) {
        this.o = a34Var;
        for (int i = 0; i < this.c; i++) {
            z0f z0fVar = (z0f) this.b.get(i);
            boolean z = this.a;
            i84 i84Var = (i84) z0fVar;
            synchronized (i84Var) {
                try {
                    ffc ffcVar = i84.n;
                    if (z && (a34Var.i & 8) != 8) {
                        if (i84Var.f == 0) {
                            i84Var.c.getClass();
                            i84Var.g = SystemClock.elapsedRealtime();
                        }
                        i84Var.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
