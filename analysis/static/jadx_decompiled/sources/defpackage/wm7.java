package defpackage;

/* loaded from: classes.dex */
public abstract class wm7 {
    public final g2a a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ xm7 o;

    public wm7(xm7 xm7Var, g2a g2aVar) {
        this.o = xm7Var;
        this.a = g2aVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        xm7 xm7Var = this.o;
        int i2 = xm7Var.c;
        xm7Var.c = i + i2;
        if (!xm7Var.d) {
            xm7Var.d = true;
            while (true) {
                try {
                    int i3 = xm7Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        xm7Var.g();
                    } else if (z3) {
                        xm7Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    xm7Var.d = false;
                    throw th;
                }
            }
            xm7Var.d = false;
        }
        if (this.b) {
            xm7Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(eh7 eh7Var) {
        return false;
    }

    public abstract boolean d();
}
