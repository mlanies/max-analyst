package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class voa {
    public static /* synthetic */ WindowInsetsAnimation.Bounds j(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation k(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation l(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void p() {
    }
}
