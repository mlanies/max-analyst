package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m06 extends j47 implements Map {
    @Override // java.util.Map
    public final void clear() {
        u0().clear();
    }

    public boolean containsKey(Object obj) {
        return u0().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v0(obj);
    }

    public Set entrySet() {
        return u0().entrySet();
    }

    public Object get(Object obj) {
        return u0().get(obj);
    }

    public boolean isEmpty() {
        return u0().isEmpty();
    }

    public Set keySet() {
        return u0().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return u0().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        u0().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return u0().remove(obj);
    }

    public int size() {
        return u0().size();
    }

    public abstract Map u0();

    public final boolean v0(Object obj) {
        kz7 kz7Var = new kz7(entrySet().iterator());
        if (obj == null) {
            while (kz7Var.hasNext()) {
                if (kz7Var.next() == null) {
                    return true;
                }
            }
        } else {
            while (kz7Var.hasNext()) {
                if (obj.equals(kz7Var.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Collection values() {
        return u0().values();
    }
}
