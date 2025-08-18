package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class mz7 extends z7 {
    public static Object X(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap Y(kpa... kpaVarArr) {
        HashMap map = new HashMap(Z(kpaVarArr.length));
        for (kpa kpaVar : kpaVarArr) {
            map.put(kpaVar.a, kpaVar.b);
        }
        return map;
    }

    public static int Z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map a0(kpa... kpaVarArr) {
        if (kpaVarArr.length <= 0) {
            return oz4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(kpaVarArr.length));
        for (kpa kpaVar : kpaVarArr) {
            linkedHashMap.put(kpaVar.a, kpaVar.b);
        }
        return linkedHashMap;
    }

    public static void b0(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kpa kpaVar = (kpa) it.next();
            map.put(kpaVar.a, kpaVar.b);
        }
    }

    public static Map c0(ArrayList arrayList) {
        oz4 oz4Var = oz4.a;
        int size = arrayList.size();
        if (size == 0) {
            return oz4Var;
        }
        if (size == 1) {
            kpa kpaVar = (kpa) arrayList.get(0);
            return Collections.singletonMap(kpaVar.a, kpaVar.b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(arrayList.size()));
        b0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static Map d0(Map map) {
        int size = map.size();
        if (size == 0) {
            return oz4.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
