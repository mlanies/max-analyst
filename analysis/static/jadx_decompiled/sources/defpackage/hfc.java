package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class hfc extends jx6 {
    public final transient Object[] X;
    public final transient int Y;
    public final transient int Z;
    public final transient cx6 o;

    public hfc(cx6 cx6Var, Object[] objArr, int i, int i2) {
        this.o = cx6Var;
        this.X = objArr;
        this.Y = i;
        this.Z = i2;
    }

    @Override // defpackage.qw6
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.o.get(key));
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.jx6
    public final zw6 k() {
        return new gfc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Z;
    }
}
