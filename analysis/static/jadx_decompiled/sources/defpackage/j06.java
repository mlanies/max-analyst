package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class j06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k06 b;

    public /* synthetic */ j06(k06 k06Var, int i) {
        this.a = i;
        this.b = k06Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                k06 k06Var = this.b;
                k06Var.a();
                View view = k06Var.o;
                if (view.isEnabled() && !view.isLongClickable() && k06Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    k06Var.Z = true;
                    break;
                }
                break;
        }
    }
}
