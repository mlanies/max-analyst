package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class ku4 implements iu4 {
    public static final o9g a = new o9g(14, new ku4());
    public static final Set b = Collections.singleton(eu4.d);

    @Override // defpackage.iu4
    public final Set a() {
        return b;
    }

    @Override // defpackage.iu4
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.iu4
    public final Set c(eu4 eu4Var) {
        c54.j("DynamicRange is not supported: " + eu4Var, eu4.d.equals(eu4Var));
        return b;
    }
}
