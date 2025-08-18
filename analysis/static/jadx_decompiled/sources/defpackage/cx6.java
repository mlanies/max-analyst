package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class cx6 implements Map, Serializable {
    public static final Map.Entry[] o = new Map.Entry[0];
    public transient jx6 a;
    public transient jx6 b;
    public transient qw6 c;

    public static jn a() {
        return new jn(4);
    }

    public static cx6 b(Map map) {
        if ((map instanceof cx6) && !(map instanceof SortedMap)) {
            cx6 cx6Var = (cx6) map;
            if (!cx6Var.g()) {
                return cx6Var;
            }
        }
        Set setEntrySet = map.entrySet();
        jn jnVar = new jn(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        jnVar.L(setEntrySet);
        return jnVar.j();
    }

    public abstract jx6 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract jx6 d();

    public abstract qw6 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ngg.q(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public jx6 entrySet() {
        jx6 jx6Var = this.a;
        if (jx6Var != null) {
            return jx6Var;
        }
        jx6 jx6VarC = c();
        this.a = jx6VarC;
        return jx6VarC;
    }

    public abstract boolean g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public jx6 keySet() {
        jx6 jx6Var = this.b;
        if (jx6Var != null) {
            return jx6Var;
        }
        jx6 jx6VarD = d();
        this.b = jx6VarD;
        return jx6VarD;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ngg.v(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public qw6 values() {
        qw6 qw6Var = this.c;
        if (qw6Var != null) {
            return qw6Var;
        }
        qw6 qw6VarE = e();
        this.c = qw6VarE;
        return qw6VarE;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        wmd.i(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
