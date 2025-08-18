package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.mb0;
import defpackage.yw1;

/* loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean a(yw1 yw1Var, mb0 mb0Var) {
        String str = Build.BRAND;
        return "Samsung".equalsIgnoreCase(str) && "SM-J400G".equalsIgnoreCase(Build.MODEL) ? mb0Var == mb0.f || mb0Var == mb0.g : (("Samsung".equalsIgnoreCase(str) && "SM-J260F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J530F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "sm-j600g".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-J701F".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str) && "SM-G610M".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str) && "SM-J710MN".equalsIgnoreCase(Build.MODEL))))))) && mb0Var == mb0.f;
    }
}
