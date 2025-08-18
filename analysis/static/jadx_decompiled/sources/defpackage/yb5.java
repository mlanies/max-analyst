package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* loaded from: classes.dex */
public final class yb5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        ln lnVar;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                FastScroller fastScroller = (FastScroller) obj;
                fastScroller.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    fastScroller.z0 = false;
                    fastScroller.getClass();
                    return true;
                }
                int i = FastScroller.B0;
                fastScroller.getClass();
                fastScroller.z0 = true;
                if (fastScroller.c()) {
                    float rawY = motionEvent.getRawY();
                    View view2 = fastScroller.o;
                    ((View) view2.getParent()).getLocationInWindow(new int[]{0, (int) view2.getY()});
                    f = rawY - r6[1];
                    width = fastScroller.getHeight();
                    width2 = fastScroller.o.getHeight();
                } else {
                    float rawX = motionEvent.getRawX();
                    View view3 = fastScroller.o;
                    ((View) view3.getParent()).getLocationInWindow(new int[]{(int) view3.getX(), 0});
                    f = rawX - r6[0];
                    width = fastScroller.getWidth();
                    width2 = fastScroller.o.getWidth();
                }
                float f2 = f / (width - width2);
                fastScroller.setScrollerPosition(f2);
                fastScroller.setRecyclerViewPosition(f2);
                return true;
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                wl7 wl7Var = (wl7) obj;
                if (action == 0 && (lnVar = wl7Var.K0) != null && lnVar.isShowing() && x >= 0 && x < wl7Var.K0.getWidth() && y >= 0 && y < wl7Var.K0.getHeight()) {
                    wl7Var.G0.postDelayed(wl7Var.C0, 250L);
                } else if (action == 1) {
                    wl7Var.G0.removeCallbacks(wl7Var.C0);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
