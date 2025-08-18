package defpackage;

import android.animation.ValueAnimator;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes.dex */
public final class njf implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoMessageWidget a;

    public njf(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        xm7 xm7VarR;
        gag gagVar;
        xm7 xm7VarR2;
        gag gagVar2;
        ValueAnimator valueAnimator;
        bc7[] bc7VarArr = VideoMessageWidget.y0;
        ygf ygfVarO0 = this.a.o0();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        ejf ejfVar = (ejf) ygfVarO0;
        ValueAnimator valueAnimator2 = ejfVar.J0;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = ejfVar.J0) != null) {
            valueAnimator.cancel();
        }
        float f = 1;
        float f2 = ejfVar.I0 * z7b.f(scaleFactor, f, 2.0f, f);
        ejfVar.I0 = f2;
        yw1 yw1VarM = ejfVar.m();
        float fB = (yw1VarM == null || (xm7VarR2 = ((fjc) yw1VarM).b.r()) == null || (gagVar2 = (gag) xm7VarR2.d()) == null) ? 1.0f : gagVar2.b();
        yw1 yw1VarM2 = ejfVar.m();
        float fD = ote.d(f2, fB, (yw1VarM2 == null || (xm7VarR = ((fjc) yw1VarM2).b.r()) == null || (gagVar = (gag) xm7VarR.d()) == null) ? 10.0f : gagVar.a());
        hg7 hg7Var = ejfVar.z0;
        ejc ejcVar = hg7Var != null ? hg7Var.c.B0 : null;
        if (ejcVar != null) {
            ejcVar.d(fD);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        bc7[] bc7VarArr = VideoMessageWidget.y0;
        ejf ejfVar = (ejf) this.a.o0();
        ValueAnimator valueAnimator = ejfVar.J0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ejfVar.I0, 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new z00(21, ejfVar));
            valueAnimatorOfFloat.addListener(new mf(10, ejfVar));
            ejfVar.J0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }
}
