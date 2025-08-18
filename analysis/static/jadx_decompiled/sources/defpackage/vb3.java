package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vb3 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = SystemClock.uptimeMillis() + 10000;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ yb3 o;

    public vb3(b bVar) {
        this.o = bVar;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.o.getWindow().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new cu1(15, this));
        } else if (tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.o.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        j56 j56Var = (j56) this.o.Z.getValue();
        synchronized (j56Var.b) {
            z = j56Var.c;
        }
        if (z) {
            this.c = false;
            this.o.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
