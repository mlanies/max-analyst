package defpackage;

import android.animation.ValueAnimator;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class v58 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarWidget Y;
    public final /* synthetic */ f6b Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v58(MediaBarWidget mediaBarWidget, f6b f6bVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarWidget;
        this.Z = f6bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((v58) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        v58 v58Var = new v58(this.Y, this.Z, continuation);
        v58Var.X = ((Boolean) obj).booleanValue();
        return v58Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7VarArr = MediaBarWidget.d1;
        final MediaBarWidget mediaBarWidget = this.Y;
        Object value = mediaBarWidget.B0().A0.a.getValue();
        v8b v8bVar = v8b.b;
        e5f e5fVar = e5f.a;
        if (value == v8bVar) {
            return e5fVar;
        }
        if (this.Z.getScrollState() == d6b.b && mediaBarWidget.x0().s0 == null) {
            mediaBarWidget.x0().k();
        }
        ValueAnimator valueAnimator = mediaBarWidget.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int alpha = mediaBarWidget.M0.getAlpha();
        final int i = z ? (qp4.u0.j(mediaBarWidget.t0()).b().e >> 24) & 255 : 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r58
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MediaBarWidget mediaBarWidget2 = mediaBarWidget;
                Integer numEvaluate = mediaBarWidget2.Y.evaluate(valueAnimator2.getAnimatedFraction(), Integer.valueOf(alpha), Integer.valueOf(i));
                mediaBarWidget2.M0.setAlpha(numEvaluate.intValue());
                mediaBarWidget2.C0.setAlpha(numEvaluate.intValue());
            }
        });
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        mediaBarWidget.N0 = valueAnimatorOfFloat;
        return e5fVar;
    }
}
