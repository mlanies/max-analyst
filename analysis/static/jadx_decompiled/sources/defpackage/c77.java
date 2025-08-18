package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c77 implements Interpolator {
    public final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
                return f * f * f * f * f;
            case 1:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 2:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            case 3:
                float f4 = f - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            default:
                float f5 = f - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }
}
