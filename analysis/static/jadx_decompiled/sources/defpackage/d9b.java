package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d9b {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(z8b.a, 0);
        map.put(z8b.b, 1);
        map.put(z8b.c, 2);
        for (z8b z8bVar : map.keySet()) {
            a.append(((Integer) b.get(z8bVar)).intValue(), z8bVar);
        }
    }

    public static int a(z8b z8bVar) {
        Integer num = (Integer) b.get(z8bVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + z8bVar);
    }

    public static z8b b(int i) {
        z8b z8bVar = (z8b) a.get(i);
        if (z8bVar != null) {
            return z8bVar;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unknown Priority for value "));
    }
}
