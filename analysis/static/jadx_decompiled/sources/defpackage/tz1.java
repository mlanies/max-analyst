package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class tz1 {
    public final kz1 a;

    public tz1() {
        HashSet hashSet = new HashSet();
        mi9 mi9VarB = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 ui9VarA = ui9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wma wmaVarA = wma.a(mi9VarB);
        ArrayList arrayList3 = new ArrayList(arrayList);
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = ui9VarA.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        this.a = new kz1(arrayList2, wmaVarA, -1, false, arrayList3, false, new nje(arrayMap), null);
    }
}
