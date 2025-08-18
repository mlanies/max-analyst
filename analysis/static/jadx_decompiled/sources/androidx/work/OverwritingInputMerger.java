package androidx.work;

import defpackage.d24;
import defpackage.n17;
import defpackage.qqd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends n17 {
    @Override // defpackage.n17
    public final d24 a(ArrayList arrayList) {
        qqd qqdVar = new qqd(9, (byte) 0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((d24) it.next()).a));
        }
        qqdVar.B(map);
        return qqdVar.p();
    }
}
