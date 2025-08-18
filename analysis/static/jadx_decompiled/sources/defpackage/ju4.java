package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ju4 implements iu4 {
    public final DynamicRangeProfiles a;

    public ju4(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            eu4 eu4Var = (eu4) fu4.a.get(l);
            c54.o(eu4Var, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(eu4Var);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.iu4
    public final Set a() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // defpackage.iu4
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.iu4
    public final Set c(eu4 eu4Var) {
        Long lA = fu4.a(eu4Var, this.a);
        c54.j("DynamicRange is not supported: " + eu4Var, lA != null);
        return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}
