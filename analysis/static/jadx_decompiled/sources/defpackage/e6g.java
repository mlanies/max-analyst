package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class e6g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ k6g a;
    public final /* synthetic */ x6g b;
    public final /* synthetic */ x6g c;
    public final /* synthetic */ int o;

    public e6g(k6g k6gVar, x6g x6gVar, x6g x6gVar2, int i, View view) {
        this.a = k6gVar;
        this.b = x6gVar;
        this.c = x6gVar2;
        this.o = i;
        this.X = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        k6g k6gVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        k6g k6gVar2 = this.a;
        k6gVar2.a.d(animatedFraction);
        float fB = k6gVar2.a.b();
        PathInterpolator pathInterpolator = g6g.e;
        int i = Build.VERSION.SDK_INT;
        x6g x6gVar = this.b;
        o6g n6gVar = i >= 30 ? new n6g(x6gVar) : new m6g(x6gVar);
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.o & i2) == 0) {
                n6gVar.c(i2, x6gVar.a.f(i2));
                f = fB;
                k6gVar = k6gVar2;
            } else {
                v27 v27VarF = x6gVar.a.f(i2);
                v27 v27VarF2 = this.c.a.f(i2);
                int i3 = (int) (((v27VarF.a - v27VarF2.a) * r10) + 0.5d);
                int i4 = (int) (((v27VarF.b - v27VarF2.b) * r10) + 0.5d);
                f = fB;
                int i5 = (int) (((v27VarF.c - v27VarF2.c) * r10) + 0.5d);
                float f2 = (v27VarF.d - v27VarF2.d) * (1.0f - fB);
                k6gVar = k6gVar2;
                int i6 = (int) (f2 + 0.5d);
                int iMax = Math.max(0, v27VarF.a - i3);
                int iMax2 = Math.max(0, v27VarF.b - i4);
                int iMax3 = Math.max(0, v27VarF.c - i5);
                int iMax4 = Math.max(0, v27VarF.d - i6);
                if (iMax != i3 || iMax2 != i4 || iMax3 != i5 || iMax4 != i6) {
                    v27VarF = v27.b(iMax, iMax2, iMax3, iMax4);
                }
                n6gVar.c(i2, v27VarF);
            }
            i2 <<= 1;
            fB = f;
            k6gVar2 = k6gVar;
        }
        g6g.g(this.X, n6gVar.b(), Collections.singletonList(k6gVar2));
    }
}
