package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class q63 extends dec implements View.OnTouchListener {
    public static final OvershootInterpolator H0 = new OvershootInterpolator();
    public final n63 F0;
    public final GestureDetector G0;

    public q63(FrameLayout frameLayout, n63 n63Var, o63 o63Var) {
        super(frameLayout);
        this.F0 = n63Var;
        frameLayout.setOnTouchListener(this);
        this.G0 = new GestureDetector(frameLayout.getContext(), new p63(o63Var, 0, n63Var));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.G0.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        OvershootInterpolator overshootInterpolator = H0;
        View view2 = this.a;
        if (action == 0 || motionEvent.getActionMasked() == 5) {
            view2.animate().scaleX(1.2f).scaleY(1.2f).setDuration(125L).setInterpolator(overshootInterpolator);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 6) {
            view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125L).setInterpolator(overshootInterpolator);
        }
        return true;
    }
}
