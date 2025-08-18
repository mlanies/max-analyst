package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hg7 implements ah7, fv1 {
    public final eh7 b;
    public final xx1 c;
    public final Object a = new Object();
    public boolean o = false;

    public hg7(eh7 eh7Var, xx1 xx1Var) {
        this.b = eh7Var;
        this.c = xx1Var;
        if (eh7Var.Q().d.a(fg7.o)) {
            xx1Var.e();
        } else {
            xx1Var.s();
        }
        eh7Var.Q().a(this);
    }

    @Override // defpackage.fv1
    public final yw1 a() {
        return this.c.C0;
    }

    public final eh7 c() {
        eh7 eh7Var;
        synchronized (this.a) {
            eh7Var = this.b;
        }
        return eh7Var;
    }

    public final List e() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.w());
        }
        return listUnmodifiableList;
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (this.o) {
                    return;
                }
                onStop(this.b);
                this.o = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p3a(eg7.ON_DESTROY)
    public void onDestroy(eh7 eh7Var) {
        synchronized (this.a) {
            xx1 xx1Var = this.c;
            xx1Var.z((ArrayList) xx1Var.w());
        }
    }

    @p3a(eg7.ON_PAUSE)
    public void onPause(eh7 eh7Var) {
        this.c.a.j(false);
    }

    @p3a(eg7.ON_RESUME)
    public void onResume(eh7 eh7Var) {
        this.c.a.j(true);
    }

    @p3a(eg7.ON_START)
    public void onStart(eh7 eh7Var) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p3a(eg7.ON_STOP)
    public void onStop(eh7 eh7Var) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.o) {
                    this.o = false;
                    if (this.b.Q().d.a(fg7.o)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
