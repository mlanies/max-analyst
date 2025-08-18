package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class w12 extends FrameLayout implements yu3 {
    public int a;

    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        this.a++;
    }

    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        this.a--;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
