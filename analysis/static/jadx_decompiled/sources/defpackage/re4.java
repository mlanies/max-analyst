package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class re4 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ cf4 a;

    public re4(cf4 cf4Var) {
        this.a = cf4Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        cf4 cf4Var = this.a;
        zma zmaVar = cf4.j;
        cf4Var.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        cf4 cf4Var = this.a;
        zma zmaVar = cf4.j;
        cf4Var.g();
    }
}
