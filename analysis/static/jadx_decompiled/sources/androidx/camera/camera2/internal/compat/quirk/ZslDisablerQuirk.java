package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.vrb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ZslDisablerQuirk implements vrb {
    public static final List a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");
    public static final List b = Arrays.asList("MI 8");

    public static boolean e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
