package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i23 {
    public final HashMap a = new HashMap();
    public final Map b;

    public i23(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            eg7 eg7Var = (eg7) entry.getValue();
            List arrayList = (List) this.a.get(eg7Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(eg7Var, arrayList);
            }
            arrayList.add((j23) entry.getKey());
        }
    }

    public static void a(List list, eh7 eh7Var, eg7 eg7Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                j23 j23Var = (j23) list.get(size);
                j23Var.getClass();
                try {
                    int i = j23Var.a;
                    Method method = j23Var.b;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, eh7Var);
                    } else if (i == 2) {
                        method.invoke(obj, eh7Var, eg7Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
