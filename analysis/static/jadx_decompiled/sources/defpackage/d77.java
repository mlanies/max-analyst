package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d77 extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    public final /* synthetic */ f77 b;

    public d77(f77 f77Var) {
        this.b = f77Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        f77 f77Var;
        View viewN;
        if (!this.a || (viewN = (f77Var = this.b).n(motionEvent)) == null || f77Var.C0.T(viewN) == null) {
            return;
        }
        e77 e77Var = f77Var.x0;
        RecyclerView recyclerView = f77Var.C0;
        int i = e77Var.b;
        int i2 = e77Var.c;
        int i3 = (i2 << 16) | (i << 8) | i | i2;
        WeakHashMap weakHashMap = zmf.a;
        if ((e77.b(i3, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i4 = f77Var.w0;
            if (pointerId == i4) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                f77Var.o = x;
                f77Var.X = y;
                f77Var.t0 = 0.0f;
                f77Var.s0 = 0.0f;
                f77Var.x0.getClass();
            }
        }
    }
}
