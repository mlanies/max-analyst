package defpackage;

import android.view.VelocityTracker;

/* loaded from: classes.dex */
public abstract class vbf {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    public static boolean c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
