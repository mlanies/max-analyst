package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class k6g {
    public j6g a;

    public k6g(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new i6g(voa.k(i, interpolator, j));
        } else {
            this.a = new g6g(i, interpolator, j);
        }
    }
}
