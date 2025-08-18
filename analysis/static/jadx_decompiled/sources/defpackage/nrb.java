package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class nrb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public /* synthetic */ nrb(View view, float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.Y = view;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.X = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rrb.b((rrb) this.Y, this.b, this.c, this.o, this.X, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = this.c;
                float f2 = this.b;
                float f3 = z7b.f(f, f2, animatedFraction, f2);
                ohf ohfVar = (ohf) this.Y;
                ohfVar.G0 = f3;
                float f4 = this.X;
                float f5 = this.o;
                float f6 = z7b.f(f4, f5, animatedFraction, f5);
                ohfVar.F0 = f6;
                ohfVar.v0.setStrokeWidth(f6);
                ohfVar.o.setStrokeWidth(ohfVar.F0);
                ohfVar.invalidate();
                break;
        }
    }
}
