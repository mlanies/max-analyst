package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.cee;
import defpackage.dee;
import defpackage.k7d;
import defpackage.vrb;
import defpackage.xb0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements vrb {
    public static final cee a;
    public static final cee b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        cee ceeVar = new cee();
        dee deeVar = dee.VGA;
        k7d.m(2, deeVar, 0L, ceeVar);
        dee deeVar2 = dee.PREVIEW;
        k7d.m(1, deeVar2, 0L, ceeVar);
        dee deeVar3 = dee.MAXIMUM;
        k7d.m(2, deeVar3, 0L, ceeVar);
        a = ceeVar;
        cee ceeVar2 = new cee();
        ceeVar2.a(new xb0(1, deeVar2, 0L));
        ceeVar2.a(new xb0(1, deeVar, 0L));
        k7d.m(2, deeVar3, 0L, ceeVar2);
        b = ceeVar2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
