package defpackage;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 implements ev3 {
    public final ArrayList a = new ArrayList(2);

    @Override // defpackage.ev3
    public final synchronized void a(String str, ru6 ru6Var, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.a(str, ru6Var, animatable);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    public final synchronized void b(ev3 ev3Var) {
        this.a.add(ev3Var);
    }

    @Override // defpackage.ev3
    public final synchronized void d(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.d(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // defpackage.ev3
    public final synchronized void e(Object obj, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.e(obj, str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // defpackage.ev3
    public final synchronized void g(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.g(str);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // defpackage.ev3
    public final void h(String str, ru6 ru6Var) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.h(str, ru6Var);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    @Override // defpackage.ev3
    public final void k(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                ev3 ev3Var = (ev3) this.a.get(i);
                if (ev3Var != null) {
                    ev3Var.k(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }
}
