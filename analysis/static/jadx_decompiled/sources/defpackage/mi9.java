package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class mi9 extends wma implements vh9 {
    public static mi9 b() {
        return new mi9(new TreeMap(wma.b));
    }

    public static mi9 c(ce3 ce3Var) {
        TreeMap treeMap = new TreeMap(wma.b);
        for (aa0 aa0Var : ce3Var.g()) {
            Set<be3> setI = ce3Var.i(aa0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (be3 be3Var : setI) {
                arrayMap.put(be3Var, ce3Var.l(aa0Var, be3Var));
            }
            treeMap.put(aa0Var, arrayMap);
        }
        return new mi9(treeMap);
    }

    public final void d(aa0 aa0Var, be3 be3Var, Object obj) {
        be3 be3Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(aa0Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(aa0Var, arrayMap);
            arrayMap.put(be3Var, obj);
            return;
        }
        be3 be3Var3 = (be3) Collections.min(map.keySet());
        if (Objects.equals(map.get(be3Var3), obj) || be3Var3 != (be3Var2 = be3.c) || be3Var != be3Var2) {
            map.put(be3Var, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aa0Var.a + ", existing value (" + be3Var3 + ")=" + map.get(be3Var3) + ", conflicting (" + be3Var + ")=" + obj);
    }

    public final void j(aa0 aa0Var, Object obj) {
        d(aa0Var, be3.o, obj);
    }
}
