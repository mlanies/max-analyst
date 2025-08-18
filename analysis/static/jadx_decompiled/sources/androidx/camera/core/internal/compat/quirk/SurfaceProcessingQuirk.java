package androidx.camera.core.internal.compat.quirk;

import defpackage.bj6;
import defpackage.vrb;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends vrb {
    static boolean d(bj6 bj6Var) {
        Iterator it = bj6Var.f(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    default boolean b() {
        return true;
    }
}
