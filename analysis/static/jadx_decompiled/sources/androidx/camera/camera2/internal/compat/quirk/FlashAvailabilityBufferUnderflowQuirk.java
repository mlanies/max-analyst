package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import defpackage.vrb;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements vrb {
    public static final HashSet a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
