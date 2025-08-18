package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class fad {
    public static final List j = Arrays.asList(1, 5, 3);
    public final List a;
    public final rb0 b;
    public final List c;
    public final List d;
    public final List e;
    public final dad f;
    public final kz1 g;
    public final int h;
    public final InputConfiguration i;

    public fad(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, kz1 kz1Var, dad dadVar, InputConfiguration inputConfiguration, int i, rb0 rb0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = dadVar;
        this.g = kz1Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = rb0Var;
    }

    public static fad a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        mi9 mi9VarB = mi9.b();
        ArrayList arrayList5 = new ArrayList();
        ui9 ui9VarA = ui9.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        wma wmaVarA = wma.a(mi9VarB);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = ui9VarA.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        return new fad(arrayList, arrayList2, arrayList3, arrayList4, new kz1(arrayList6, wmaVarA, -1, false, arrayList7, false, new nje(arrayMap), null), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (rb0 rb0Var : this.a) {
            arrayList.add(rb0Var.a);
            Iterator it = rb0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((xf4) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
