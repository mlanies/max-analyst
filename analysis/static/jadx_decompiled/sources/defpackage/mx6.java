package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class mx6 extends jx6 {
    public final /* synthetic */ nx6 o;

    public mx6(nx6 nx6Var) {
        this.o = nx6Var;
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.o.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return this.o.g();
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.jx6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // defpackage.jx6
    public final zw6 k() {
        return new lx6(this);
    }

    @Override // defpackage.jx6
    public final boolean l() {
        this.o.getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.o.Y.size();
    }
}
