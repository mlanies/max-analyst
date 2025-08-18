package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.mb0;
import defpackage.yw1;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean a(yw1 yw1Var, mb0 mb0Var) {
        return ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) && yw1Var.g() == 0 && mb0Var == mb0.d;
    }
}
