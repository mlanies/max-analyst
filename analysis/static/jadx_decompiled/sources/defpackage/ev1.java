package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class ev1 implements r9f {
    public final ul4 b;

    public ev1(Context context) {
        this.b = ul4.b(context);
    }

    @Override // defpackage.r9f
    public final ce3 a(q9f q9fVar, int i) {
        mi9 mi9VarB = mi9.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        mi9 mi9VarB2 = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 ui9VarA = ui9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = q9fVar.ordinal();
        int i2 = iOrdinal != 0 ? iOrdinal != 3 ? 1 : 3 : i == 2 ? 5 : 1;
        aa0 aa0Var = o9f.g0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        wma wmaVarA = wma.a(mi9VarB2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = ui9VarA.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        mi9VarB.j(aa0Var, new fad(arrayList5, arrayList6, arrayList7, arrayList8, new kz1(arrayList9, wmaVarA, i2, false, arrayList10, false, new nje(arrayMap), null), null, null, 0, null));
        mi9VarB.j(o9f.i0, dv1.a);
        HashSet hashSet2 = new HashSet();
        mi9 mi9VarB3 = mi9.b();
        ArrayList arrayList11 = new ArrayList();
        ui9 ui9VarA2 = ui9.a();
        int iOrdinal2 = q9fVar.ordinal();
        int i3 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i == 2 ? 5 : 2;
        aa0 aa0Var2 = o9f.h0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        wma wmaVarA2 = wma.a(mi9VarB3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        nje njeVar2 = nje.b;
        ArrayMap arrayMap2 = new ArrayMap();
        Map map2 = ui9VarA2.a;
        for (String str2 : map2.keySet()) {
            arrayMap2.put(str2, map2.get(str2));
        }
        mi9VarB.j(aa0Var2, new kz1(arrayList12, wmaVarA2, i3, false, arrayList13, false, new nje(arrayMap2), null));
        mi9VarB.j(o9f.j0, q9fVar == q9f.a ? hu6.c : lu1.a);
        q9f q9fVar2 = q9f.b;
        ul4 ul4Var = this.b;
        if (q9fVar == q9fVar2) {
            mi9VarB.j(ev6.H, ul4Var.e());
        }
        mi9VarB.j(ev6.C, Integer.valueOf(ul4Var.c(true).getRotation()));
        if (q9fVar == q9f.o || q9fVar == q9f.X) {
            mi9VarB.j(o9f.m0, Boolean.TRUE);
        }
        return wma.a(mi9VarB);
    }
}
